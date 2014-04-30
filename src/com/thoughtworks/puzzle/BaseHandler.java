package com.thoughtworks.puzzle;


/**
 * Base Handler
 * @author zhangda
 *
 */
public abstract class BaseHandler {
	
	private BaseHandler nextHandler = null;
	
	public BaseHandler(BaseHandler nextHandler) {
		this.nextHandler = nextHandler;
	}
	
	public BaseHandler() { }

	/**
	 * base handle method
	 */
	public abstract String handle(int num);
	
	protected BaseHandler getNextHandler() {
		return this.nextHandler;
	}
}
