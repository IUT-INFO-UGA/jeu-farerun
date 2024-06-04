package jeu.test;

import jeu.Guerrier;

import static org.junit.jupiter.api.Assertions.*;

class GuerrierTest {

	@org.junit.jupiter.api.Test
	void getForce() {
		final Guerrier guerrier = new Guerrier();
		assertEquals(10, guerrier.getForce(), "La force du guerrier doit être de 10");
	}

	@org.junit.jupiter.api.Test
	void getPointDeVie() {
		final Guerrier guerrier = new Guerrier();
		assertEquals(100, guerrier.getPointDeVie(), "Les points de vie du guerrier doivent être de 100");
	}

	@org.junit.jupiter.api.Test
	void setPointDeVie() {
		final Guerrier guerrier = new Guerrier();
		guerrier.setPointDeVie(50);
		assertEquals(50, guerrier.getPointDeVie(), "Les points de vie du guerrier doivent être de 50");
	}

	@org.junit.jupiter.api.Test
	void estVivant() {
		final Guerrier guerrier = new Guerrier();
		assertTrue(guerrier.estVivant(), "Le guerrier doit être vivant");
		guerrier.setPointDeVie(0);
		assertFalse(guerrier.estVivant(), "Le guerrier doit être mort");
	}

	@org.junit.jupiter.api.Test
	void attaquer() {
		final Guerrier guerrier = new Guerrier();
		final Guerrier guerrier2 = new Guerrier();
		guerrier.attaquer(guerrier2);
		assertNotEquals(100, guerrier2.getPointDeVie(), "Les points de vie du guerrier2 doivent être de 90");
	}
}