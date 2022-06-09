package juegoDeEstrategia;
//public class UnidadConItem implements Unidad {

public class UnidadConItem implements Unidad {
	  private final Unidad unidad;
	  private final Item item;

public UnidadConItem (Unidad unidad, Item item) {
	 this.unidad = unidad;
	 this.item = item;
	}


public int getDa�o() {
	return (unidad.getDa�o() + item.getDa�oBase());
	}

@Override
public int getDefensa() {
	return ((unidad.getDefensa() + item.getDefensaBase()));
}

/*@Override
public void Atacar(Unidad x) {
	// TODO Auto-generated method stub
	
}*/
public void Atacar(Unidad x) {
	// TODO Auto-generated method stub
	
}

@Override
public void moverUnidad(int x) {
	// TODO Auto-generated method stub
	
}

@Override
public void recibirDa�o(Unidad x) {
	// TODO Auto-generated method stub
	
}

@Override
public int getSalud() {
	// TODO Auto-generated method stub
	return 0;
}

@Override
public int getPosicion() {
	// TODO Auto-generated method stub
	return 0;
}
}
