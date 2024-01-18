package ej3;

import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		
		//generacion de scanner
		Scanner sc= new Scanner(System.in);
		
		int []tabla;
		
		//variables para la longitud y el fin de la tabla
		int longitud,fin;
		
		//
		System.out.println("Introduce la longitud y el fin de la tabla");
		
		longitud=sc.nextInt();
		
		fin=sc.nextInt();
		
		//asignamos el valor a la tabla
		tabla=rellenaPares(longitud, fin);
		
		System.out.println(Arrays.toString(tabla));
		
		//cierre de scanner
		sc.close();
		
	}
	public static int[] rellenaPares(int longitud, int fin) {
		//tabla con el tamaño de la longitud
		int[] tabla=new int[longitud];
		
		Random random=new Random();
		
		int numRandom=0;
		
		//
		for (int i=0;i<tabla.length;i++) {
			
			
			//generará numeros random hasta que se genere uno par
			do {
				

//				//con math random
//				//genera un numero aleatorio para el valor del numero random
//				numRandom=(int)(Math.random()*fin+1);

				//sin math random
				numRandom=random.nextInt(2,fin+1);
				
			}while(numRandom%2!=0);
			
			
			
			//le asignamos el valor a la posicion de la tabla
			tabla[i]=numRandom;
				
				
		}//fin for
		//numTabla*=10 numTabla+=numRandom
		
		//devolvemos el int[] tabla
		return tabla;
	}
	
}
