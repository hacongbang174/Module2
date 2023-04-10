package service;

import model.ERole;
import model.Food;
import model.User;
import repository.FoodRepository;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class FoodService {
    private FoodRepository foodRepository;
    public FoodService() {
        foodRepository = new FoodRepository();
    }
    public List<Food> getAllUser() throws IOException {
        return foodRepository.getAll();
    }

}
