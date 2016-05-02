package it.unibs.fp.mylib;

public class MyTime {
	public static String secondsToString(int seconds) {
	    return String.format("%02d:%02d", seconds / 60, seconds % 60);
	}
}
