package com.thoughtworks.puzzle;


public class FizzBuzzHandler extends BaseHandler{
	
	private int n1;
	
	private int n2;

	private int n3;
	
	public FizzBuzzHandler(int n1, int n2, int n3, BaseHandler nextHandler) {
		super(nextHandler);
		this.n1 = n1;
		this.n2 = n2;
		this.n3 = n3;
	}
	
	@Override
	public String handle(int index) {
		if(index % n1 == 0 && index % n2 == 0 && index % n3 == 0) {
			return Constants.FIZZ + Constants.BUZZ + Constants.WHIZZ;
		} else if (index % n1 == 0 && index % n2 == 0) {
			return Constants.FIZZ + Constants.BUZZ;
		} else if (index % n2 == 0 && index % n3 == 0) {
			return Constants.BUZZ + Constants.WHIZZ;
		} else if (index % n1 == 0 && index % n3 == 0) {
			return Constants.FIZZ + Constants.WHIZZ;
		}
		return this.getNextHandler().handle(index);
	}

}
