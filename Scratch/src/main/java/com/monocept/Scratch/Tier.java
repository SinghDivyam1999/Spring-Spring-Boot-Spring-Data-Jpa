package com.monocept.Scratch;

import org.springframework.stereotype.Component;

@Component
public class Tier {
	private String brand;

//public Tier(String brand) {
//	super();
//	this.brand = brand;
//}

	public String getBrand() {
		return brand;
	}

	public void setBrand(String brand) {
		this.brand = brand;
	}

//@Override
//public String toString() {
//	return "Tier [brand=" + brand + "]";
//}
	@Override
	public String toString() {
		return "Its working";
	}

}
