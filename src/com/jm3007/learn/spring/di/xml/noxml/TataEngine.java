package com.jm3007.learn.spring.di.xml.noxml;

import org.springframework.stereotype.Component;

@Component
public class TataEngine implements Engine {

	public TataEngine() {
		System.out.println(this.getClass().getSimpleName() + " is constructed");
	}

	@Override
	public void run() {
		System.out.println("Running " + this.getClass().getSimpleName());
	}

}
