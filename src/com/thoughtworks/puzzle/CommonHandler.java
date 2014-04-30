package com.thoughtworks.puzzle;


public class CommonHandler extends BaseHandler {

	private int num;
	
	public CommonHandler() {
	}

	@Override
	public String handle(int index) {
		return String.valueOf(index);
	}

}
