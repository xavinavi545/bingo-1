package bingo;

import java.util.Scanner;

public class Menu {


public static void menuJugar() {
	Scanner num = new Scanner(System.in);
	System.out.println("!Bienvenido al juego de BINGO seleciona tu tabla!,\n1: TABLA90    \n2: TABLA 75  ");
	
	int elegir = num.nextInt();
		switch (elegir) {
	        case 1 -> {
	            Bingo bingo90 = new Bingo90();
	            bingo90.jugar();
	        }
	        case 2 -> {
	            Bingo bingo75 = new Bingo75();
	            bingo75.jugar();
	        }
		}
	}
} 
    