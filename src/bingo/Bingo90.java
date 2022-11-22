package bingo;

import java.io.IOException;

public class Bingo90 extends Bingo {

	private Tablero tablero;

	public Bingo90() {
		super(90);
		tablero = new Tablero();
	}
	
	@Override
	protected void jugar() {
		tablero.inicializar();
		for (int i = 1; i <= 90; i++) {
			Bola bola = new Bola();
			bola = sacarBola();
			System.out.println("Pulse enter para sacar bola..");
			try {
				System.in.read();
			} catch (IOException e) {
				e.printStackTrace();
			}
			tablero.imprimirTablero(bola);
		}

	}


}
