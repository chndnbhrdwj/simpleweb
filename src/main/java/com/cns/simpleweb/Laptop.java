package com.cns.simpleweb;

import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Component;

@Component
@Primary
public class Laptop implements Computer {

	@Override
	public void print() {
		System.out.println("Using the Laptop");

	}

}
