package juegoDeEstrategia;

public abstract class Unidad {
int vida;
int posicion;
boolean vivo;

abstract public void atacar();
abstract public void recibirDaņo();
abstract public boolean vivo();
}
