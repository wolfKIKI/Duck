package com.duckdemo.test;

import com.duckdemo.duck.*;
import com.duckdemo.inf.*;



public class Test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//����mallardDuck����Ϊ
		Duck mallardduck=new mallardDuck();
		System.out.println("����mallardDuck:");
		mallardduck.performFly();
		mallardduck.performQuack();
		//����RubberDuckd����Ϊ
		Duck rubberduck=new RubberDuck();
		System.out.println("����RubberDuck:");
		rubberduck.performFly();
		rubberduck.performQuack();
		//����RedheadDuck����Ϊ
		Duck redhead=new RedheadDuck();
		System.out.println("����RedheadDuck:");
		redhead.performFly();
		redhead.performQuack();
		
	}

}
