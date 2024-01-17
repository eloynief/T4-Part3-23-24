package ej2;

public class Main {

	public static void main(String[] args) {
		
		//
		int[] tabla = {2,3,4,5,6,7};
		//
		int numMax=0;
		//
		numMax=sumaTabla(tabla);
		
		
		
	}

	//
	public static int sumaTabla(int[] tablaEnteros) {
		
		//
		int max=0;
		
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
