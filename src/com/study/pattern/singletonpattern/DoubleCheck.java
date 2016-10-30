package com.study.pattern.singletonpattern;

public class DoubleCheck { 
	
	 private static DoubleCheck wife;

	    private DoubleCheck() { }
	    
	    public static DoubleCheck getWife() {

	        // 第一个检验锁，如果不为空直接返回实例对象，为空才进入下一步
	        if (wife == null) {
	            synchronized (DoubleCheck.class) {

	                //第二个检验锁，因为可能有多个线程进入到 if 语句内
	                if (wife == null) {
	                    wife = new DoubleCheck();
	                }
	            }
	        }
	        return wife ;
	    }
}
