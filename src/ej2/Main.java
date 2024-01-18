package ej2;

public class Main {

	public static void main(String[] args) {
		
		//
		int[] tabla = {2,3,4,50,6,7};
		//
		int numMax=0;
		//
		numMax=sumaTabla(tabla);
		
		System.out.println(numMax);
		
	}

	//
	public static int sumaTabla(int[] tablaEnteros) {
		
		//
		int max=Integer.MIN_VALUE;
		
		//
		for(int i=0;i<tablaEnteros.length;i++) {
			
			//
			if(max<tablaEnteros[i]) {
				
				//
				max=tablaEnteros[i];
				
			}
			
		}
		
		
		
		return max;
	}
	
	
}
