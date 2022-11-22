package bingo;

import java.io.IOException;
import java.util.ArrayList;

public class Bingo90 extends Bingo {

	private ArrayList<Bola> tablero = new ArrayList<Bola>();

	public Bingo90() {
		super(90);
	}

	@Override
	public void inicializar() {
		System.out.println("Inicializando bingo 90 bolas");
		int valorBola = 1;
		for (int i = 0; i < 9; i++) {
			for (int j = 0; j < 10; j++) {
				tablero.add(new Bola(valorBola + "", false));
				System.out.print(tablero.get(valorBola - 1) + "\t");
				valorBola++;
			}
			System.out.println("\n");
		}
	}

	@Override
	public void imprimirBola(Bola bola) {
		System.out.println("Pintando: " + bola);
		int positionBola = Integer.parseInt(bola.getValor()) - 1;
		bola.setValor("[" + bola.getValor() + "]");
		tablero.set(positionBola, bola);
		int valorBola = 1;
		for (int i = 0; i < 9; i++) {
			for (int j = 0; j < 10; j++) {
				System.out.print(tablero.get(valorBola - 1) + "\t");
				valorBola++;
			}
			System.out.println("\n");
		}
	}
	@Override
	protected void jugar() {
		inicializar();
		
		for (int i = 1; i <= 90; i++) {
			Bola bola = new Bola();
			bola = sacarBola();
			System.out.println("Pulse enter para sacar bola..");
			try {
				System.in.read();
			} catch (IOException e) {
				e.printStackTrace();
			}
			imprimirBola(bola);
		}

	}

}
