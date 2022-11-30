package com.monocept.Scratch;

import org.springframework.stereotype.Component;

@Component
public class Bike implements Vehical{
public void drive() {
	System.out.println("Roaring");
}
}
