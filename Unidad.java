package juegoDeEstrategia;

public interface Unidad {
	 
	public void Atacar(Unidad x);
	
	public void moverUnidad(int x);
	
	public void recibirDa�o(Unidad x);
	
	public int getDa�o();
	
	public int getDefensa();
	
	public int getSalud();
	
	public int getPosicion();
}
