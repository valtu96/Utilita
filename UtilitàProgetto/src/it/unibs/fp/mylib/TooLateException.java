package it.unibs.fp.mylib;

public class TooLateException extends IllegalStateException {
	private static final long serialVersionUID = 2060920985129912500L;
	
	public TooLateException() {}
	
	public TooLateException(String message){
		super(message);
	}
}
