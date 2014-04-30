package com.thoughtworks.puzzle;


public class WhizzHandler extends BaseHandler {

	private int num;
	
	public WhizzHandler(int num, BaseHandler nextHandler) {
		super(nextHandler);
		this.num = num;
	}

	@Override
	public String handle(int index) {
		if (0 == index % num) {
			return "Whizz";
		}
		return getNextHandler().handle(index);
	}

}
