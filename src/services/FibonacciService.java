package services;

import java.util.ArrayList;
import java.util.List;

public class FibonacciService {

	public boolean isFibonacciValid(int entrada) {

		final List<Integer> sequencia = new ArrayList<>();
		sequencia.add(0);
		sequencia.add(1);

		for (; sequencia.get(sequencia.size() - 1) < entrada ;) {
			sequencia.add(sequencia.get(sequencia.size() - 1) + sequencia.get(sequencia.size() - 2));
		}

		return sequencia.contains(entrada);
	}

}
