package juegoDeEstrategia;

public class gamesMain {

	public static void main(String[] args) {
		Unidad jugador1 = new Soldado (3, 40, true, 200, 100, 40, 0);
		Unidad jugador2 = new Soldado (3, 40, true, 200, 100, 40, 0);

		
		//jugador 1 ataca a jugador2 y le resta 20 de salud.
		jugador1.atacar(jugador2);
		System.out.println(jugador2.toString());
		jugador2.recibirDaño();
		System.out.println(jugador2.vivo());
/*		se prueba atacar() las veces necesarias para derrotar al jugador2 y 
	que la funcion vivo() retorne false;
*/
		jugador1.atacar(jugador2);
		jugador1.atacar(jugador2);
		jugador1.atacar(jugador2);
		jugador1.atacar(jugador2);
		jugador1.atacar(jugador2);
		jugador1.atacar(jugador2);
		jugador1.atacar(jugador2);
		jugador1.atacar(jugador2);
		jugador1.atacar(jugador2);
		jugador1.atacar(jugador2);
		jugador1.atacar(jugador2);
		System.out.println(jugador2.toString());
		System.out.println(jugador2.vivo());
	}

}
