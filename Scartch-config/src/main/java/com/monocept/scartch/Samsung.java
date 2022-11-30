package com.monocept.scartch;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

//import org.springframework.stereotype.Component;
//@Component

@Component
public class Samsung {
	@Autowired
	Processor cpu;

	public Processor getCpu() {
		return cpu;
	}

	public void setCpu(Processor cpu) {
		this.cpu = cpu;
	}

	public void config() {
		System.out.println("Octa Core, 4 ram, 12 mp ");
		cpu.process();
	}
}
