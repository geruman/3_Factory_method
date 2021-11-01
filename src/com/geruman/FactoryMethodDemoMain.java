package com.geruman;

import com.geruman.alienigenas.Alienigena;
import com.geruman.alienigenas.Alienigenas;
import com.geruman.alienigenas.Klingon;

public class FactoryMethodDemoMain {
	public static void main(String[] args) {
		Alienigena klingon = Alienigena.crearAlienigena(Alienigenas.KLINGON);
		System.out.println(klingon.hablar());
		System.out.println(klingon instanceof Klingon);
	}
}
