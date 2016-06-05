package com.duckdemo.test;

import com.duckdemo.duck.*;
import com.duckdemo.inf.*;



public class Test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//测试mallardDuck的行为
		Duck mallardduck=new mallardDuck();
		System.out.println("我是mallardDuck:");
		mallardduck.performFly();
		mallardduck.performQuack();
		//测试RubberDuckd的行为
		Duck rubberduck=new RubberDuck();
		System.out.println("我是RubberDuck:");
		rubberduck.performFly();
		rubberduck.performQuack();
		//测试RedheadDuck的行为
		Duck redhead=new RedheadDuck();
		System.out.println("我是RedheadDuck:");
		redhead.performFly();
		redhead.performQuack();
		
	}

}
