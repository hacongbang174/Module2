package service;

import model.ERole;
import model.User;
import repository.UserRepository;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class UserService {
    private UserRepository userRepository;
    public UserService() {
        userRepository = new UserRepository();
    }
    public List<User> getAllUser() throws IOException {
        return userRepository.getAll();
    }
    public User loginCustomer(String username, String password) throws IOException {
        List<User> allUsers = getAllUser();
        for (int i = 0; i < allUsers.size(); i++) {
            if(allUsers.get(i).getUsername().equals(username) && allUsers.get(i).getPassword().equals(password) && allUsers.get(i).geteRole() == ERole.customer) {
                return allUsers.get(i);
            }
        }
        return null;
    }
    public boolean checkLoginAdmin(String username, String pass) throws IOException {
        User user = getAllUser().get(0);
        if(user.getUsername().equals(username) && user.getPassword().equals(pass)){
            return true;
        }
        return false;
    }
    public boolean checkLoginCustomer(String username, String pass) throws IOException {
        List<User> allUsers = getAllUser();
        for (int i = 1; i < allUsers.size(); i++) {
            if (allUsers.get(i).getUsername().equals(username) && allUsers.get(i).getPassword().equals(pass)) {
                return true;
            }
        }
        return false;
    }
    public List<User> getCustomerList() throws IOException {
        List<User> allUsers = userRepository.getAll();
        List<User> customerList = new ArrayList<>();
        for(User user: allUsers){
            if(user.geteRole() == ERole.customer){
                customerList.add(user);
            }
        }
        return customerList;
    }
    public void deleteById(int id) throws IOException {
        userRepository.deleteById(id);
    }

    public User loginAdmin(String username, String password) throws IOException {
        List<User> allUsers = getAllUser();
        for (int i = 0; i < allUsers.size(); i++) {
            if(allUsers.get(i).getUsername().equals(username) && allUsers.get(i).getPassword().equals(password) && allUsers.get(i).geteRole() == ERole.admin) {
                return allUsers.get(i);
            }
        }
        return null;
    }
}
