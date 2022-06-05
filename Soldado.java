package juegoDeEstrategia;

public class Soldado extends Unidad {

public int energia ;
public int distancia;
public int da�o;


int posicion;

public Soldado(int vida,int posicion,boolean vivo, int salud,int energia,
		int distancia,int da�o){
super(vida,posicion,vivo,salud);
this.energia = energia;
this.distancia = distancia;
this.da�o = da�o;

}
public void atacar(Unidad jugador) {
	jugador.salud -=20;
}


public void recibirDa�o() {
	System.out.println("te han impactado! salud = "+this.salud);
	
}

public boolean vivo() {
	boolean life;
	int min =0;
	if(this.salud <=0) {
		this.vida -=1;
		life = false;
	}else {life =true;}
	
	return life;
}
	
public int getSalud() {
	return salud;
}
	 
//getters y setter y al final toString();
public void setSalud(int salud) {
	this.salud = salud;
}


public int getEnergia() {
	return energia;
}

public void setEnergia(int energia) {
	this.energia = energia;
}

public int getDistancia() {
	return distancia;
}

public void setDistancia(int distancia) {
	this.distancia = distancia;
}

public int getDa�o() {
	return da�o;
}

public void setDa�o(int da�o) {
	this.da�o = da�o;
}

public int getPosicion() {
	return posicion;
}

public void setPosicion(int posicion) {
	this.posicion = posicion;
}


	
public String toString() {
	return "Soldado salud=" + this.salud + ", energia=" + this.energia + ", distancia=" + this.distancia + ", da�o=" + this.da�o
			+ ", posicion=" + this.posicion ;
}
}
