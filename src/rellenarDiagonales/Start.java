package rellenarDiagonales;

public class Start {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		int FILAS_COLUMNAS =11;
		int datos[][] = new int[FILAS_COLUMNAS][FILAS_COLUMNAS];
		
		// hasta que me cruce con la diagonal principal ir� "creciendo"
		// mis diagonales cada vez son mayores
		// luego ir� decreciendo
		boolean creciendo = true;
		
		// soy colocar tantos elementos como haya en la matriz
		// empezar� en la fila 0 y columna 0
		int i = 0, j=0;
		for(int n=1;n<=FILAS_COLUMNAS*FILAS_COLUMNAS;n++) {
			
			// donde me marque la i y la j colocar� el n�mero que corresponda
			datos[i][j] = n;
			
			
			/*
			 * TODO ESTO SIRVE PARA CALCULAR EL SIGUIENTE i Y LA SIGUIENTE j
			 */
			if(creciendo) {
				
				// si voy creciendo y mi columna es la 0 ya no puedo seguir yendo a la izquierda
				if(j==0) {
					// recoloco la columna y reseteo la fila
					j =i+1;
					i=0;
				}
				else {
					// si todav�a no llegu� a la columna 0 para seguir la diagonal subo una fila 
					// y bajo una columna
					i++;
					j--;
				}
			}
			// si mis diagonales ya no crecen mas
			else {
				
				// relleno en la diagonal menguante hasta que la i se topa con la parte 
				// de abajo de la matriz
				if(i==FILAS_COLUMNAS-1) {
					// recoloco la i y la j
					i=j+1;
					j=FILAS_COLUMNAS-1;
				}
				else {
					// sino voy descendiendo por la diagonal
					// aumenta la i y disminuye la j
					i++;
					j--;
				}
			}
			
			// detecto que dejo que decrer cuando la i est� abajo del todo y la j est� en la primera columna
			if ((i==FILAS_COLUMNAS-1)&(j==0)) {
				creciendo=false;
			}			
		}
		
		Imprimir.imprimir(datos,FILAS_COLUMNAS);
		

	}

}
	
	




		
		/*
		 * ESTA CLASE ME PERMITE IMPRIMIR Y TENER LA OPERACI�N SEPARADA POR SI NECESITO USARLA VARIAS VECES
		 * ESTO NO SER�A NECESARIO CON UN OBJETO PORQUE ESTO SER�A UN METODO
		 * PERO YO NO HE CREADO UN CLASE FUERA DEL START ASI QUE HE PUESTO ESTA DENTRO. JAVA DEJA ESTAS COSAS
		 * AUNQUE EN EL FONDO ES UN POCO CHAPUZAS
		 * 
		 * para usar la operaci�n deber� nombrar a la clase, Imprimir, y a su operaci�n imprimir
		 * deber� pasarle como par�metros la matriz[][] y las filas y columnas
		 * 
		 */
		class Imprimir {
		
			public static void imprimir(int datos[][], int FILAS_COLUMNAS) {
				for(int i=0;i<FILAS_COLUMNAS;i++) {
				
					for(int j=0;j<FILAS_COLUMNAS;j++) {
					
						if(datos[i][j]<10) {
						
							System.out.print(datos[i][j]+"   ");
						}
						else if((datos[i][j]<100)&(datos[i][j]>9)) {
							System.out.print(datos[i][j]+"  ");
						}
						else System.out.print(datos[i][j]+" ");
					}
					System.out.println();
			}	
		
		}
			
			
	
	
}

