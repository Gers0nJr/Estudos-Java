package com.estudo.java;

public class ProvaUOL {

	public static void main(String[] args) {
		
		double d = 10.0 / -0;
		
		if(d == Double.POSITIVE_INFINITY) {
			System.out.println("Positivy Infinity");
		}
		else{
			System.out.println("Negative Infinitity");
		}

	}

}
