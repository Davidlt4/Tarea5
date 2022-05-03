package tarea;

/**
 * 
 * @author David
 * @version 2.0
 *
 */

public class Tarea {
	
	
		/**
		 * contador de intentos hasta encontrar el valor
		 */
		public static int contador;
	
		/**
		 * Método main de la clase donde utilizamos datos reales para
		 * probar que nuestra función esta hecha correctamente
		 * 
		 * @param args
		 * @throws Exceptionq
		 */
		
		public static void main(String[] args) throws Exception {

			int[] v = new int[5];

			for(int j=0;j<v.length; j++) {

				v[j] = j;

			}

			int busca = 1;

			System.out.print("Valor: " + buscab(v,busca) + " encontrado en el intento " + contador);

		}
		
		
		/**
		 * Método que realiza una búsqueda binaria sobre el vector
		 * pasado como parámetro.
		 * 
		 * @param vector --> vector de enteros donde se realizará la busqueda
		 * @param valorabuscar --> valor entero a buscar en el vector
		 * @return --> de tipo int o -1 en caso de que no se encuentre valorabuscar
		 */
		
		public static int buscab(int[] vector, int valorabuscar) {
			
			System.out.print("\n nodo 1\n");

			int mitad, inferior = 0;

			int superior = vector.length - 1;		

			contador = 0;

			do {      
				System.out.print("\n nodo 2\n");
				contador++;

				mitad = (inferior + superior) >>> 1;
				
				System.out.print("\n nodo 3\n");
				if(valorabuscar > vector[mitad]) { 
					System.out.print("\n nodo 4 \n");
					inferior = mitad + 1;

				} else {    
					System.out.print("\n nodo 5 \n");
					superior = mitad - 1;

				}
				System.out.print("\n nodo 6 \n");
			} while(vector[mitad] != valorabuscar && inferior <= superior);
			
			System.out.print("\n nodo 7 \n");

			if(vector[mitad] == valorabuscar) {
				System.out.print("\n nodo 8 \n");
				return mitad;

			} else {
				System.out.print("\n nodo 9 \n");
				return -1;

			}

		}

}
