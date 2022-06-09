package juegoDeEstrategia;

public interface Unidad {
	 
	public void Atacar(Unidad x);
	
	public void moverUnidad(int x);
	
	public void recibirDaño(Unidad x);
	
	public int getDaño();
	
	public int getDefensa();
	
	public int getSalud();
	
	public int getPosicion();
}
