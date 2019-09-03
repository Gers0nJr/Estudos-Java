package com.estudo.java;

import java.util.ArrayList;

public class RemoverNumerosImparesLista {

	public static void main(String[] args) {
		
		ArrayList<Integer> lista = new ArrayList<>();

        for (int i = 0; i < 100; i++) {
        	
            lista.add(i);
            
        }

        for (int i = 0; i < lista.size(); i++) {
            
        	if (lista.get(i) % 2 != 0) {
        		
                lista.remove(i);
                
            }
        }
       
        System.out.println(lista.toString());
        
	}

}
