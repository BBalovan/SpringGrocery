package services;

import java.util.Arrays;
import java.util.List;

public class GreenVegService implements VegetableService {

	@Override
	public List<String> getVegetables() {
		List<String> vegs = Arrays.asList("Cucumber","GreenPepper","Avocado");
		
		return vegs;
	}

}