package com.estudo.java;

public class OrdenarArray {

	public static void main(String[] args) {
		
		int[] numero = {8, 9, 3, 5, 1};
	    int aux = 0;
	    int i = 0;
	     
	    System.out.println("Vetor desordenado: ");
	    
	    for(i = 0; i < numero.length; i++){
	    	
	        System.out.println("["+i+"] = " + numero [i]);
	        
	    }
	    
	    System.out.println("-------------------------------------------------------");
	    System.out.println("Vetor em ordem crescente:");
	     
	    for(i = 0; i < numero.length ; i++){
	    	
	        for(int j = 0; j < numero.length - 1; j++){
	        	
	            if(numero[j] > numero[j + 1]){
	                aux = numero[j];
	                numero[j] = numero[j + 1];
	                numero[j + 1] = aux;
	            }
	            
	        }
	        
	    }
	    
	    for(i = 0; i < numero.length; i++){
	    	
	        System.out.println("["+i+"] = " + numero [i]);
	        
	    }
	    
	    System.out.println("-------------------------------------------------------");
	    System.out.println("Vetor em ordem decrescente:");
	     
	    for(i = 0; i < numero.length ; i++){
	    	
	        for(int j = 0; j < numero.length - 1; j++){
	        	
	            if(numero[j] < numero[j + 1]){
	                aux = numero[j];
	                numero[j] = numero[j + 1];
	                numero[j + 1] = aux;
	            }
	            
	        }
	        
	    }
	    
	    for(i = 0; i < numero.length; i++){
	    	
	        System.out.println("["+i+"] = " + numero [i]);
	        
	    }
	    
	}
	
}
