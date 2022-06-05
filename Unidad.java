package juegoDeEstrategia;

public abstract class Unidad {
public int vida ;
public int posicion;
public boolean vivo;
public int salud;

public Unidad(int vida2, int posicion2, boolean vivo2,int salud) {
	this.vida = vida2;
	this.posicion = posicion2;
	this.vivo = vivo2;
	this.salud = salud;
}

abstract public void atacar(Unidad jugador2);
abstract public void recibirDaño();
abstract public boolean vivo();
}
