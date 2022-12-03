package bingo;

import java.util.ArrayList;

public class Tablero {

	private ArrayList<Bola> tablero;

	public Tablero() {
		this.tablero = new ArrayList<Bola>();
	}

	// TODO
	// No puede ser fijo la matriz
	// No debe funcionar solo para 90
	public void inicializar() {
		System.out.println("Inicializando bingo 75 bolas");
		int valorBola = 1;
		for (int i = 0; i < 15; i++) {
			for (int j = 0; j < 5; j++) {
				tablero.add(new Bola(valorBola - 1, valorBola + "", false));
				System.out.print(getBola(valorBola - 1) + "\t");
				valorBola++;
			}
			System.out.println("\n");
		}
	}

	// TODO
	// No puede ser fijo la matriz
	public void imprimirTablero(Bola bola) {
		bola.setValor("[" + bola.getValor() + "]");
		tablero.set(bola.getPosition(), bola);
		int valorBola = 1;
		for (int i = 0; i < 15; i++) {
			for (int j = 0; j < 5; j++) {
				System.out.print(getBola(valorBola - 1) + "\t");
				valorBola++;
			}
			System.out.println("\n");
		}
		System.out.println("Última bola random: " + bola);
	}

	public Bola getBola(int position) {
		return tablero.get(position);
	}

	public ArrayList<Bola> getTablero() {
		return tablero;
	}

	public void setTablero(ArrayList<Bola> tablero) {
		this.tablero = tablero;
	}

}
