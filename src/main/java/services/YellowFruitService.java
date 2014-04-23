package services;

import java.util.Arrays;
import java.util.List;

import org.springframework.stereotype.Service;

@Service
public class YellowFruitService implements FruitService {

	@Override
	public List<String> getFuits() {
		return Arrays.asList("Banana", "Pear");
	}

}
