package com.duckdemo.duck;

import com.duckdemo.inf.FlyBehavior;
import com.duckdemo.inf.QuackBehavior;

public abstract class Duck {
	  QuackBehavior quackbehavior;
	  FlyBehavior flybehavior;
	
	public void swim(){
		System.out.println("Œ“ª·”Œ”æ");
	}
	
	public void display(){
		
	}
	public void performQuack(){
		
		quackbehavior.quack();
	}
	public void performFly(){
		flybehavior.fly();
	}
	public QuackBehavior getQuackbehavior() {
		return quackbehavior;
	}
	public void setQuackbehavior(QuackBehavior quackbehavior) {
		this.quackbehavior = quackbehavior;
	}
	public FlyBehavior getFlybehavior() {
		return flybehavior;
	}
	public void setFlybehavior(FlyBehavior flybehavior) {
		this.flybehavior = flybehavior;
	}
	

}
