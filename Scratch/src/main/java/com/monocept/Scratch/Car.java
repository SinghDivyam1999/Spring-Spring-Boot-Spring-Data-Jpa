package com.monocept.Scratch;



import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class Car implements Vehical{
	
	@Autowired
	private Tier tyre;
	
	
public Tier getTyre() {
		return tyre;
	}


	public void setTyre(Tier tyre) {
		this.tyre = tyre;
	}


public void drive() {
	System.out.println( "car " +tyre);
}
}
