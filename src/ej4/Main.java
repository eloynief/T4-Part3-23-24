package ej4;

import java.util.Arrays;
import java.util.Scanner;

public class Main {
	
	public static void main(String[] args) {
		

		//generacion de scanner
		Scanner sc= new Scanner(System.in);
		
		
		//
		int num,busqueda;
		
		//
		int t[]= {5,4,6,7,8};
		
		
		System.out.println("");
		
		num=sc.nextInt();
		
		busqueda=buscar(t, num);
		
		System.out.println(busqueda);
		
		//cierre de scanner
		sc.close();
		
	}
	
	public static int buscar(int t[], int clave) {
		int num=-1;
		
		//s
		for(int i=0;i<t.length;i++) {
			//
			if (t[i]==clave) {
				
				//le asignamos el valor a la posicion en donde está
				num=i+1;
				
			}
			
		}
		
		return num;
	}
	
}
