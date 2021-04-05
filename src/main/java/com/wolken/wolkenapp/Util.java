package com.wolken.wolkenapp;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.wolken.wolkenapp.bean.SuperHeroBean;
import com.wolken.wolkenapp.bean.SuperPowerBean;

public class Util {
	public static void main(String[] args) {
		ApplicationContext applicationContext=new ClassPathXmlApplicationContext("context.xml");
		SuperHeroBean superHeroBean=applicationContext.getBean(SuperHeroBean.class);
		System.out.println(superHeroBean.getSuperHeroName()+" "+superHeroBean.getWhichRanger());
		superHeroBean.rescue();
		SuperPowerBean superPowerBean=applicationContext.getBean(SuperPowerBean.class);
		System.out.println(superPowerBean.getPowerName()+" "+superPowerBean.getStrength());
		superPowerBean.power();
		
	}

}
