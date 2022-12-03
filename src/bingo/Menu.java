package bingo;

import java.util.Scanner;

public class Menu {


public static void menuJugar() {
  try (Scanner input = new Scanner(System.in)) {
	  		int n;
		  System.out.print("Ingresa el BINGO que deseas jugar: \n1. Bingo 90 \n2. Bingo 75.\n- ");
		  n = input.nextInt();
		  
		  switch(n){
		  case 1 -> {
			  Bingo bingo90 = new Bingo90();
			  bingo90.jugar();
		  }
		  case 2 -> {
			  Bingo bingo75 = new Bingo75();
			  bingo75.jugar();
		  }
		  default -> {
			  System.out.print("\nIngreso una opcion incorrecta, usa los parametros dados\n");
		  		}
		  }
  	}
	}  
}
    
    