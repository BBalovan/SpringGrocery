package services;

import java.util.Arrays;
import java.util.List;

public class RedFruitService implements FruitService {

	@Override
	public List<String> getFuits() {
		return Arrays.asList("Apple", "Tomato");
	}

}
