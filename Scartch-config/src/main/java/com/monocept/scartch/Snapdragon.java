package com.monocept.scartch;

import org.springframework.stereotype.Component;

@Component
public class Snapdragon implements Processor {

	@Override
	public void process() {
		System.out.println("World's best CPU");
	}

}
