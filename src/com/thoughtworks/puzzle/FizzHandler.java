package com.thoughtworks.puzzle;


public class FizzHandler extends BaseHandler {

	private int num;
	
	public FizzHandler(int num, BaseHandler nextHandler) {
		super(nextHandler);
		this.num = num;
	}

	@Override
	public String handle(int index) {
		if (0 == index % num) {
			return "Fizz";
		}
		return getNextHandler().handle(index);
	}

}
