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
	public void inicializar(int a, int b) {
		System.out.println("Inicializando bingo 90 bolas");
		int valorBola = 1;
		for (int i = 0; i < a; i++) {
			for (int j = 0; j < b; j++) {
				tablero.add(new Bola(valorBola - 1, valorBola + "", false));
				System.out.print(getBola(valorBola - 1) + "\t");
				valorBola++;
			}
			System.out.println("\n");
		}
	}

	// TODO
	// No puede ser fijo la matriz
	public void imprimirTablero(Bola bola, int a, int b) {
		bola.setValor("[" + bola.getValor() + "]");
		tablero.set(bola.getPosition(), bola);
		int valorBola = 1;
		for (int i = 0; i < a; i++) {
			for (int j = 0; j < b; j++) {
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