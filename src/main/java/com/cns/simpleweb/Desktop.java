package com.cns.simpleweb;

import org.springframework.stereotype.Component;

@Component
public class Desktop implements Computer {

	@Override
	public void print() {
		System.out.println("Using the Desktop");

	}

}
