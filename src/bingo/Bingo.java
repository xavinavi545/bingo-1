package bingo;

import java.util.Random;

public abstract class Bingo {

	private int numeroBolas;

	public Bingo(int numeroBolas) {
		this.numeroBolas = numeroBolas;
	}

	public abstract void inicializar();

	public Bola sacarBola() {
		Random random = new Random();
		return new Bola((random.nextInt(numeroBolas - 1 + 1) + 1) + "", true);
	}

	public abstract void imprimirBola(Bola bola);

	public int getNumeroBolas() {
		return numeroBolas;
	}

	public void setNumeroBolas(int numeroBolas) {
		this.numeroBolas = numeroBolas;
	}

	protected abstract void jugar();

}
