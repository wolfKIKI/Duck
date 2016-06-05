package com.duckdemo.test;

import com.duckdemo.duck.*;
import com.duckdemo.inf.*;



public class BehaviorTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//利用FlyBehavior的各个接口实现来测试
		FlyBehavior fwr=new FlyWithRocket();
		fwr.fly();
		FlyBehavior fww=new FlyWithWings();
		fww.fly();
		FlyBehavior fnw=new FlyNoWay();
		fnw.fly();
		//利用QuackBehavior的各个接口来实现测试
		QuackBehavior mq=new MuteQuack();
		mq.quack();
		QuackBehavior sq=new Squack();
		sq.quack();
		QuackBehavior qu=new Quack();
		qu.quack();
		
	}

}
