package com.wolken.wolkenapp.bean;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@NoArgsConstructor
public class SuperHeroBean {
	public SuperHeroBean(String superHeroName, String whichRanger, SuperPowerBean superPowerBean) {
		super();
		this.superHeroName = superHeroName;
		this.whichRanger = whichRanger;
		this.superPowerBean = superPowerBean;
	}
	private String superHeroName;
	private String whichRanger;
	private SuperPowerBean superPowerBean;
	public void rescue() {
		System.out.println(superHeroName+" for rescue");
	}

}
