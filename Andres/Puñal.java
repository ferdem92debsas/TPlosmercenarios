package juegoDeEstrategia;

public class Puñal implements Item{
	//defensa tambien en 3 puntos.
	
@Override
public int getDañoBase() {
	return 3;
	}		

public int getDefensaBase() {
	return -3;
}
}
