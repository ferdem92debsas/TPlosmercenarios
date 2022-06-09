package juegoDeEstrategia;

public class Lancero implements Unidad {
	protected int salud = 150; 
	protected int posicion = 0;
	protected int defensa = 0;
	
	
@Override
public void Atacar(Unidad x) {
	if (salud !=0) {
		if (x.getPosicion() >= posicion + 1 && x.getPosicion() <= posicion + 3) {
			Lancero u = new Lancero();
			x.recibirDa�o(u);
		}
	}
	if (salud == 0) {
		System.out.println("Esta unidad cay� en combate");
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
public int getSalud() {
	return salud;
}
	
@Override
public int getPosicion() {
	return posicion;
}
	
@Override
public int getDa�o() {
	return 25;
	}

@Override
public int getDefensa() { 
	return defensa;
}
}
