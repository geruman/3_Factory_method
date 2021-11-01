package com.geruman.alienigenas;

public abstract class Alienigena {
	public abstract String hablar();

	public static Alienigena crearAlienigena(Alienigenas tipoAlienigena) {
		if(tipoAlienigena == Alienigenas.MARCIANO) {
			return new Marciano();
		}else if(tipoAlienigena == Alienigenas.NEPTUNEANO) {
			return new Neptuneano();
		}else if(tipoAlienigena == Alienigenas.KLINGON) {
			return new Klingon();
		}
		return null;
	}
}
