package services;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class RedFruitService implements FruitService {

	@Override
	public List<String> getFuits() {
		return StrategyTest((fruitList) -> {
			List<String> extendedList = new ArrayList<String>();
			extendedList.add("Red fruit Additional");
			extendedList.addAll(fruitList);
			Collections.sort(extendedList);
			return extendedList;
		});
	}

	public List<String> getFuitsAnotherWay() {
		return StrategyTest((fruitList) -> {
			Collections.sort(fruitList);
			return fruitList;
		});
	}

	public List<String> StrategyTest(ListMethods strategy) {
		List<String> fruits = Arrays.asList("Apple", "Tomato", "Currant",
				"Cranberry");
		return strategy.SortFruits(fruits);
	}
}
