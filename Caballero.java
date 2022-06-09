package juegoDeEstrategia;

public class Caballero implements Unidad {
	protected int salud = 200;
	protected int posicion = 0;
	private int contador = 0;
	protected int defensa = 0;

@Override
public void Atacar(Unidad x) {
	if (salud !=0 && contador != 3) {
		if (x.getPosicion() >= posicion + 1 && x.getPosicion() <= posicion + 2) {
			Caballero u = new Caballero();
//			x.recibirDa�o(x);
						x.recibirDa�o(u);
			contador++;
		}
	}
	if (salud == 0) {
		System.out.println("Esta unidad cay� en combate");
	}
	if (contador == 3) {
		System.out.println("El caballo se puso rebelde, calmelo");
	}
}

@Override
public void moverUnidad(int x) {
	posicion += x;
}

@Override
public void recibirDa�o(Unidad x) {
	salud -= x.getDa�o();
}

@Override
public int getPosicion() {
	return posicion;
}


public int getDa�o() {
	return 50;
	}

@Override
public int getDefensa() { 
	return defensa;
}

@Override
public int getSalud() {
	return salud;
}

public void pocionDeAgua() {
	contador = 0;
}
}
