package controller;

import model.car.User;

import java.util.ArrayList;
import java.util.List;

public class UserManager implements IGeneralUser<User> {
    private List<User> userList = new ArrayList<>();

    public UserManager(List<User> userList) {
        this.userList = userList;
    }

    public UserManager() {
    }

    public List<User> getUserList() {
        return userList;
    }

    public void setUserList(List<User> userList) {
        this.userList = userList;
    }

    @Override
    public void addAll(User user) {
        userList.add(user);
    }

    @Override
    public void showAll() {
        for (User user : userList) {
            System.out.println(user);
        }
    }

    @Override
    public void removeByIdentity(String identity ) {
        int index = searchByIdentity(identity);
        if (index!=-1){
            userList.remove(index);
        }else {
            System.out.println("Không tìm thấy Biển số xe này >>>.");
        }
    }

    @Override
    public void updateByIdentity(String identity, User user) {
        int index = searchByIdentity(identity);
        if (index != -1) {
            userList.set(index, user);
        } else {

            System.out.println("Không tìm thấy biển số này >>.");
        }
    }

    @Override
    public int searchByIdentity(String identity) {
        int index = -1;
        for (int i = 0; i < userList.size(); i++) {
            if (userList.get(i).getIdentity().equals(identity)){
                return i;
            }
        }
        return index;
    }
}
