package rellenarCaracol;

public class Start {

	public static void main(String[] args) {
			
		
		/*
		 * RELLENO UNA MATRIZ CUADRADA EMPEZANDO POR EL VAMOS MAS ALTO EN EL CENTRO, 
		 * QUE SE CORRESPONDE CON EL N�MERO DE CASILLAS TOTALES DE LA MATRIZ
		 * 
		 * COMO SI FUERA UNA ESPIRAL O CARACOL VOY RODEANDO AL N�MERO POR CADA VEZ MENORES
		 * N�MEROS
		 * 
		 */
		
		// Inicializo los valores que me interesan
		// Tama�o de la matriz
		int FILAS_COLUMNAS = 9;
		// creo la matriz cuadrada
		int datos[][] = new int[FILAS_COLUMNAS][FILAS_COLUMNAS];
		// doy valor al primer n�mero que voy a crear
		int numero = 1;
		
		//punto de coiendo, el centro de la matriz
		int ultimaI=FILAS_COLUMNAS / 2, ultimaJ=FILAS_COLUMNAS / 2;
		// las colocaciones de n�meros que voy a hacer cada una de las veces
		int avances = 2;

		// coloco el primer n�mero y aprovecho para decrementarlo
		datos[ultimaI][ultimaJ] = numero++;
		
		// me voy una fila mas arriba
		ultimaI--;
		
		// y empiezo a colocar "envolturas"
		while(avances<FILAS_COLUMNAS) {
			
			//primero coloco dos hacia la derecha
			for(int a=1;a<=avances;a++) {
				datos[ultimaI][ultimaJ] = numero++;
				ultimaJ++;
			}
			
			// me recoloco porque del for anterior salgo un "poco desviado"
			ultimaI++;
			ultimaJ--;
			// ahora coloco hacia abajo
			for(int a=1;a<=avances;a++) {
				datos[ultimaI][ultimaJ] = numero++;
				ultimaI++;
			}
			
			// me recoloco porque del for anterior salgo un "poco desviado"
			ultimaI--;
			ultimaJ--;
			// ahora coloco hacia la izquierda
			for(int a=1;a<=avances;a++) {
				datos[ultimaI][ultimaJ] = numero++;
				ultimaJ--;
			}		
			
			
			// me recoloco porque del for anterior salgo un "poco desviado"
			ultimaI--;
			ultimaJ++;
			// ahora coloco hacia arriba
			for(int a=1;a<=avances;a++) {
				datos[ultimaI][ultimaJ] = numero++;
				ultimaI--;
			}	
			
			// si hay que seguir poniendo numero en el siguiente acance tendr� que ir colocando 2 n�meros
			// mas cada vez
			avances+=2;
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


