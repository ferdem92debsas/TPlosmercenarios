package juegoDeEstrategia;

public class Soldado implements Unidad {

	protected int salud = 200;
	protected int energia = 100;
	protected int posicion = 0;
	protected int defensa = 0;
	
@Override
public void Atacar(Unidad x) {
	if (salud !=0 && energia != 0) {
		if (posicion == x.getPosicion()) {
			Soldado u = new Soldado();
			x.recibirDa�o(u);
			energia -= 10;
		}
	}
	if (salud == 0) {
		System.out.println("Esta unidad cay� en combate");
	}
	if (energia == 0) {
		System.out.println("Esta unidad no tiene energia");
	}
}
	
@Override
public void moverUnidad(int x) {
	posicion += x;
}

@Override
public int getDa�o() {
	return 10;
	}

@Override
public int getPosicion() {
	return posicion;
}

@Override
public void recibirDa�o(Unidad x) {
	salud -= x.getDa�o();
}

@Override
public int getDefensa() { 
	return defensa;
}

@Override
public int getSalud() {
	return salud;
}

public int getEnergia() {
	return energia;
}

public void pocionDeAgua() {
	energia += 100;
}

}
