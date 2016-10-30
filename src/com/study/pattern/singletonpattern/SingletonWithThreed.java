package com.study.pattern.singletonpattern;

public class SingletonWithThreed {
	 private static SingletonWithThreed wife;

	    private SingletonWithThreed() { }

	    // 添加了 synchronized 关键字
	    public static synchronized SingletonWithThreed getWife() {
	        if (wife == null) {
	            wife = new SingletonWithThreed();
	        }
	        return wife;
	    }
}
