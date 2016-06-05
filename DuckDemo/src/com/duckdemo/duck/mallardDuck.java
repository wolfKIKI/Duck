package com.duckdemo.duck;

import com.duckdemo.inf.*;

public class mallardDuck extends Duck {
	 public mallardDuck(){
		flybehavior=new FlyWithRocket();
		quackbehavior=new MuteQuack();
	 }

}
