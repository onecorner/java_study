package com.study.pattern.singletonpattern;

//懒汉模式
public class Wife {

 //一开始没有新建实例
 private static Wife wife;

 private Wife() { }

 // 需要时再新建
 public static Wife getWife() {
     if (wife == null) {
         wife = new Wife();
     }
     return wife;
 }
}