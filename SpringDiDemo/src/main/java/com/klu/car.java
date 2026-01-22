package com.klu;

public class car {
	private Engine engine;
	
	public car(Engine engine) {

		this.engine=engine;
	}
	public void drive() {
		engine.start();
		System.out.println("na priyathi priyam aina uday..");
		
	}

}
