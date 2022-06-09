package juegoDeEstrategia;

public class Arquero implements Unidad {
	protected int salud = 50;
	protected int flechas = 20;
	protected int posicion = 0;
	protected int defensa = 0;
	
@Override
public void Atacar(Unidad x) {
	if (salud !=0 && flechas != 0) {
		if (x.getPosicion() >= posicion + 2 && x.getPosicion() <= posicion + 5) {
			Arquero u = new Arquero();
			x.recibirDa�o(u);
			flechas -= 1;
		}
	}
	if (salud == 0) {
		System.out.println("Esta unidad cay� en combate");
	}
	if (flechas == 0) {
		System.out.println("Esta unidad se qued� sin flechas");
	}
}
	
@Override
public void moverUnidad(int x) {
	posicion += x;
}
	
@Override
public int getDa�o() {
	return 5;
	}

@Override
public int getDefensa() { 
	return defensa;
}

@Override
public int getPosicion() {
	return posicion;
}

@Override
public int getSalud() {
	return salud;
}

public void paqueteDeFlechas() {
	flechas += 6;
}


public void recibirDa�o(Unidad x) {
	salud -= x.getDa�o();
}

public int getFlechas() {
	return flechas;
}
}
