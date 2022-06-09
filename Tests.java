package juegoDeEstrategia;

import static org.junit.Assert.assertEquals;
import org.junit.jupiter.api.Test;

class TestJuegoDeEstrategia {

@Test
public void testAtacar() {
	Soldado soldado = new Soldado();
	Soldado enemigo = new Soldado();
	soldado.Atacar(enemigo);
	assertEquals(190, enemigo.getSalud());
	assertEquals(90, soldado.getEnergia());
}

@Test
public void testAtacarSinEnergia() {
	Soldado soldado = new Soldado();
	Soldado enemigo = new Soldado();
	for(int i = 0; i <= 10; i++) {
		soldado.Atacar(enemigo);
	}
	assertEquals(0, soldado.getEnergia());
	assertEquals(100, enemigo.getSalud());
}

@Test
public void testAtacarSinSalud() {
	Soldado soldado = new Soldado();
	Soldado aliado = new Soldado();
	Soldado enemigo = new Soldado();
	for (int j = 0; j < 1; j++) {
		for (int i = 0; i < 10; i++) {
			soldado.Atacar(enemigo);
			aliado.Atacar(enemigo);
		}
	}
	assertEquals(0, enemigo.getSalud());
	enemigo.Atacar(soldado);
	assertEquals(200, soldado.getSalud());
}

@Test
public void testRecargarEnergiaSoldado() {
	Soldado soldado = new Soldado();
	Soldado enemigo = new Soldado();
	for(int i = 0; i <= 10; i++) {
		soldado.Atacar(enemigo);
	}
	assertEquals(0, soldado.getEnergia());
	soldado.pocionDeAgua();
	assertEquals(100, soldado.getEnergia());
}

@Test
public void testAtacarSinFlechas() {
	Arquero arquero = new Arquero();
	Soldado enemigo = new Soldado();
	enemigo.moverUnidad(3);
	for(int i = 0; i < 22; i++) {
		arquero.Atacar(enemigo);
	}
	assertEquals(0, arquero.getFlechas());
	assertEquals(100, enemigo.getSalud());
}

@Test
public void testArqueroRecargaFlechas() {
	Arquero arquero = new Arquero();
	Soldado enemigo = new Soldado();
	enemigo.moverUnidad(4);
	for(int i = 0; i < 22; i++) {
		arquero.Atacar(enemigo);
	}
	assertEquals(0, arquero.getFlechas());
	arquero.paqueteDeFlechas();
	arquero.Atacar(enemigo);
	assertEquals(95, enemigo.getSalud());
}

@Test
public void testAtaqueDeLancero() {
	Lancero lancero = new Lancero();
	Soldado enemigo = new Soldado();
	enemigo.moverUnidad(2);
	lancero.Atacar(enemigo);
	assertEquals(175, enemigo.getSalud());
	enemigo.moverUnidad(1);
	lancero.Atacar(enemigo);
	assertEquals(150, enemigo.getSalud());
	enemigo.moverUnidad(1);
	lancero.Atacar(enemigo);
	assertEquals(150, enemigo.getSalud());
}

@Test
public void testAtaqueCaballero() {
	Caballero caballero = new Caballero();
	Soldado enemigo = new Soldado();
	enemigo.moverUnidad(1);
	for (int i = 0; i < 3; i++) {
		caballero.Atacar(enemigo);
	}	
	assertEquals(50, enemigo.getSalud());
	caballero.Atacar(enemigo);
	assertEquals(50, enemigo.getSalud());
	caballero.pocionDeAgua();
	caballero.Atacar(enemigo);
	assertEquals(0, enemigo.getSalud());
}
@Test
public void testDañoConPuñal() {
	Unidad caballero = new Caballero ();
	Item puñal = new Puñal();
	UnidadConItem caballeroConPuñal = new UnidadConItem(caballero,puñal);
	assertEquals(53,caballeroConPuñal.getDaño());
}
@Test
public void testDefensaConCapa() {
	Unidad arquero = new Arquero();
	Item capa = new Capa();
	UnidadConItem arqueroConCapa = new UnidadConItem(arquero,capa);
	assertEquals(3,arqueroConCapa.getDefensa());
}
}
