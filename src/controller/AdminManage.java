package controller;

import model.Admin;

import java.util.ArrayList;
import java.util.List;

public class AdminManage {
    private List<Admin> admins = new ArrayList<>();

    public AdminManage() {
    }

    public AdminManage(List<Admin> admins) {
        this.admins = admins;
    }

    public Admin isLogin(Admin admin) {
        for (Admin adm : admins) {
            if (admin.getName().equals(adm.getName()) && admin.getPassword().equals(adm.getPassword())) {
                return adm;
            }
        }
        return null;
    }

    public void addAccount(Admin admin) {
        admins.add(admin);
    }
}
