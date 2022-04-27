package tarea;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class TareaTest {

	@Test
	void testEncontrado() {
		
		int[] v = new int[5];
		
		for(int j=0;j<v.length; j++) {

			v[j] = j;

		}
		
		int resultado=Tarea.buscab(v,2);
		int esperado=2;
		
		assertEquals(esperado,resultado);
		
	}
	
	@Test
	void testNoEncontrado() {
		
		int[] v = new int[5];
		for(int j=0;j<v.length; j++) {

			v[j] = j;

		}
		int resultado=Tarea.buscab(v,6);
		int esperado=-1;
		
		assertEquals(esperado,resultado);
		
	}

}
