package com.wolken.wolkenapp.bean;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Setter
@Getter
@NoArgsConstructor
public class SuperPowerBean {
	public SuperPowerBean(String powerName, String strength) {
		super();
		this.powerName = powerName;
		Strength = strength;
	}
	private String powerName;
	private String Strength;
	public void power() {
		System.out.println("spd emergency");
	}

}
