package com.duckdemo.duck;

import com.duckdemo.inf.FlyBehavior;
import com.duckdemo.inf.QuackBehavior;

public class Duck {
	private static QuackBehavior quackbehavior;
	private static   FlyBehavior flybehavior;
	
	public void swim(){
		System.out.println("Œ“ª·”Œ”æ");
	}
	
	public void display(){
		
	}
	public void performQuack(){
		//FlyBehavior.fly();
	}
	public void performFly(){
		//QuackBehavior.fly();
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
