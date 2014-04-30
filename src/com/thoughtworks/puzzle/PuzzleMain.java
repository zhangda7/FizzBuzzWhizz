package com.thoughtworks.puzzle;


/**
 * Main function of FizzBuzzWhizz
 * @author zhangda
 *
 */
public class PuzzleMain {
	
	private final String FIZZ = "Fizz";
	
	private final String BUZZ = "Buzz";
	
	private final String WHIZZ = "Whizz";
	
	public BaseHandler constuctChain(int n1, int n2, int n3) {
		BaseHandler common = new CommonHandler();
		BaseHandler fizz = new FizzHandler(n1, common);
		BaseHandler buzz = new BuzzHandler(n2, fizz);
		BaseHandler whizz = new WhizzHandler(n3, buzz);
		FizzBuzzHandler fizzBuzz = new FizzBuzzHandler(n1, n2, n3, whizz);
		SpecialHandler special = new SpecialHandler(n1, fizzBuzz);
		return special;
	}

	public static void main(String[] args) {
		PuzzleMain main = new PuzzleMain();
		BaseHandler handler = main.constuctChain(3, 5, 7);
		System.out.println(handler.handle(7));
	}

}
