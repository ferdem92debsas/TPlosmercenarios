package juegoDeEstrategia;

public abstract class Unidad {
int vida;
int posicion;
boolean vivo;

abstract public void atacar();
abstract public void recibirDa�o();
abstract public boolean vivo();
}
