package services;

import java.util.List;

import org.springframework.stereotype.Service;

@Service
public interface FruitService {
	List<String> getFuits();
}
