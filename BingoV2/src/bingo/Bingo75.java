package bingo;
import java.util.Scanner;
import java.util.ArrayList;

public class Bingo75 extends Bingo {

	public Bingo75() {
		super(75);
	}

	@Override
	protected void jugar() {
		ArrayList array = new ArrayList<>(75);
		Scanner sc = new Scanner(System.in);
		int times = 1;

		getTablero().inicializar(5, 15);
		while (times != 76) {
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
				getTablero().imprimirTablero(bola, 5,15);
				System.out.println("Numero de tiradas: " + times);
				times++;
				break;
				}
			}
		}
	}
}