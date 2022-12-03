package bingo;
import java.util.Scanner;

import java.util.ArrayList;

public class Bingo90 extends Bingo {

	public Bingo90() {
		super(90);
	}

	@Override
	protected void jugar() {
		ArrayList array = new ArrayList<>(90);
		Scanner sc = new Scanner(System.in);
		int times = 1;

		getTablero().inicializar(9,10);
		while (times != 91) {
			System.out.println("Pulsa ENTER para sacar la bola...");
			String x = sc.nextLine(); 
			while  (true){
			Bola bola = new Bola();
			bola = sacarBola();
			if (array.contains(bola.getValor())) {
				continue;
			}
			else{
				array.add(bola.getValor());
				getTablero().imprimirTablero(bola, 9, 10);
				System.out.println("Numero de tiradas: " + times);
				times++;
				break;
				}
			}
		}
	}
}
