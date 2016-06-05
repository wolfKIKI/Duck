package com.duckdemo.duck;

import com.duckdemo.inf.FlyWithWings;
import com.duckdemo.inf.Quack;

public class RedheadDuck extends Duck {
	public RedheadDuck(){
		flybehavior=new FlyWithWings();
		quackbehavior=new Quack();
		
	}
}
