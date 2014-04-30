package com.thoughtworks.puzzle;


public class BuzzHandler extends BaseHandler {

	private int num;
	
	public BuzzHandler(int num, BaseHandler nextHandler) {
		super(nextHandler);
		this.num = num;
	}

	@Override
	public String handle(int index) {
		if (0 == index % num) {
			return "Buzz";
		}
		return getNextHandler().handle(index);
	}

}
