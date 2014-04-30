package com.thoughtworks.puzzle;


public class SpecialHandler extends BaseHandler {

	private String num;
	
	public SpecialHandler(int num, BaseHandler nextHandler) {
		super(nextHandler);
		this.num = String.valueOf(num);
	}

	@Override
	public String handle(int index) {
		if (String.valueOf(index).contains(num)) {
			return Constants.FIZZ;
		}
		return getNextHandler().handle(index);
	}

}
