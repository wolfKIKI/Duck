package com.duckdemo.duck;

import com.duckdemo.inf.*;

public class RubberDuck extends Duck {
	public RubberDuck(){
		flybehavior=new FlyNoWay();
		quackbehavior=new Squack();
	}
}
