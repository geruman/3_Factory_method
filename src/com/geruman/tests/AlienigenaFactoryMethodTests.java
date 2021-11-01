package com.geruman.tests;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

import com.geruman.alienigenas.Alienigena;
import com.geruman.alienigenas.AlienigenaFactory;
import com.geruman.alienigenas.Alienigenas;

class AlienigenaFactoryMethodTests {

	@Test
	void test() {
		Alienigena marciano = AlienigenaFactory.crearAlienigena(Alienigenas.MARCIANO);
		Alienigena neptunenao = AlienigenaFactory.crearAlienigena(Alienigenas.NEPTUNEANO);
		Alienigena klingon = AlienigenaFactory.crearAlienigena(Alienigenas.KLINGON);
		Alienigena alienigenaNulo = AlienigenaFactory.crearAlienigena(null);
		assertTrue("Soy un marciano".equals(marciano.hablar()));
		assertTrue("Soy un neptuneano".equals(neptunenao.hablar()));
		assertTrue("Soy un klingon".equals(klingon.hablar()));
		assertTrue(alienigenaNulo == null);
	}

}
