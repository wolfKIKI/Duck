package com.duckdemo.test;

import com.duckdemo.duck.*;
import com.duckdemo.inf.*;



public class BehaviorTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//����FlyBehavior�ĸ����ӿ�ʵ��������
		FlyBehavior fwr=new FlyWithRocket();
		fwr.fly();
		FlyBehavior fww=new FlyWithWings();
		fww.fly();
		FlyBehavior fnw=new FlyNoWay();
		fnw.fly();
		//����QuackBehavior�ĸ����ӿ���ʵ�ֲ���
		QuackBehavior mq=new MuteQuack();
		mq.quack();
		QuackBehavior sq=new Squack();
		sq.quack();
		QuackBehavior qu=new Quack();
		qu.quack();
		
	}

}
