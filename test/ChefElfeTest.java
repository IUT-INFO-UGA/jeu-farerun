package jeu.test;

import jeu.guerrierChild.ChefElfe;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ChefElfeTest {

	@Test
	void getForce() {
		final ChefElfe chefElfe = new ChefElfe();
		assertEquals(40, chefElfe.getForce(), "La force du chefElfe doit être de 40");
	}
}