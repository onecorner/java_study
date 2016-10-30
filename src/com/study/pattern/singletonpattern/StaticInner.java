package com.study.pattern.singletonpattern;

public class StaticInner {
	  private static class WifeHolder {
	        private static final StaticInner wife = new StaticInner();
	    }

	    private StaticInner() { }

	    public static StaticInner getWife() {
	        return WifeHolder.wife;
	    }
}
