package com.study.pattern.observationpattern;

public interface Subject {
	public void registerObserver(Observer o);
    public void removeObserver(Observer o);
    public void notifyAllObservers();
}
