package services;

import java.util.Scanner;

public class LeitorService {

	public int lerDoConsole() {
		try (Scanner sc = new Scanner(System.in)) {
			int numero = 0;
			while (sc.hasNext()) {
				numero = sc.nextInt();
				if (numero > 0) {
					break;
				}
			}
			return numero;

		}
	}

}
