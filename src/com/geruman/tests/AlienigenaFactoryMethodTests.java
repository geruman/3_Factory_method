package com.geruman.tests;

import static org.junit.jupiter.api.Assertions.assertTrue;

import org.junit.jupiter.api.Test;

import com.geruman.alienigenas.Alienigena;
import com.geruman.alienigenas.Alienigenas;

class AlienigenaFactoryMethodTests {

	@Test
	void test() {
		Alienigena marciano = Alienigena.crearAlienigena(Alienigenas.MARCIANO);
		Alienigena neptunenao = Alienigena.crearAlienigena(Alienigenas.NEPTUNEANO);
		Alienigena klingon = Alienigena.crearAlienigena(Alienigenas.KLINGON);
		Alienigena alienigenaNulo = Alienigena.crearAlienigena(null);
		assertTrue("Soy un marciano".equals(marciano.hablar()));
		assertTrue("Soy un neptuneano".equals(neptunenao.hablar()));
		assertTrue("Soy un klingon".equals(klingon.hablar()));
		assertTrue(alienigenaNulo == null);
	}

}
