package services;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class GreenVegService implements VegetableService {

	@Override
	public List<String> getVegetables(int direction) {
		List<String> vegs = Arrays.asList("Cucumber", "GreenPepper", "Avocado");

		switch (direction) {
		case 1:
			Collections.sort(vegs);
			break;

		case 2:
			Collections.sort(vegs, Collections.reverseOrder());
			break;

		}
		return vegs;
	}
}