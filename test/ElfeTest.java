package jeu.test;

import jeu.guerrierChild.Elfe;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ElfeTest {

	@Test
	void getForce() {
		final Elfe elfe = new Elfe();
		assertEquals(20, elfe.getForce(), "La force de l'elfe doit être de 20");
	}
}