package service;

import model.Food;
import model.Oder;
import model.User;
import repository.ISearch;
import repository.OderAllRepository;
import repository.OderRepository;
import view.FoodView;

import java.io.IOException;
import java.util.List;
import java.util.Scanner;

public class OderService {
    private OderRepository oderRepository;
    private OderAllRepository oderAllRepository;
    public OderService() {
        oderRepository = new OderRepository();
        oderAllRepository = new OderAllRepository();
    }
    public List<Oder> getAllOder() throws IOException {
        return oderRepository.getAll();
    }
    public Oder findFoodById(int id) throws IOException {
        return oderRepository.findById(id);
    }
    public int checkIdFood(int id) throws IOException {
        return oderRepository.checkID(id);
    }
    public int checkNameFood(String name) throws IOException {
        return oderRepository.checkName(name);
    }
    public void deleteFoodById(int id) throws IOException {
        oderRepository.deleteById(id);
    }
    public void addOder(Oder oder) throws IOException {
        oderRepository.add(oder);
    }
    public void updateFoodById(int id, Oder oder) throws IOException {
        oderRepository.updateById(id,oder);
    }
    public List<Oder> searchOderByName(String name, ISearch<Oder> iSearch) throws IOException {
        return oderRepository.searchByName(name,iSearch);
    }
    public void addOderList(List<Oder> list) throws IOException {
        oderRepository.addList(list);
    }

    public List<Oder> getAllOderAll() throws IOException {
        return oderAllRepository.getAll();
    }
}
