package com.geruman;

import com.geruman.alienigenas.Alienigena;
import com.geruman.alienigenas.Alienigenas;
import com.geruman.alienigenas.Klingon;

public class FactoryMethodDemoMain {
	public static void main(String[] args) {
		Alienigena alienigena = Alienigena.crearAlienigena(Alienigenas.KLINGON);
		System.out.println(alienigena.hablar());
		alienigena = Alienigena.crearAlienigena(Alienigenas.NEPTUNEANO);
		System.out.println(alienigena.hablar());
		alienigena = Alienigena.crearAlienigena(Alienigenas.MARCIANO);
		System.out.println(alienigena.hablar());

	}
}
