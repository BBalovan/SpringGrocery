package services;

import java.util.List;

import org.springframework.stereotype.Service;

@Service
public interface VegetableService {

	List<String> getVegetables(int direction);
}
