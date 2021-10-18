package controller.client;

import controller.client.IGeneralClient;
import model.Client;

import java.util.ArrayList;
import java.util.List;

public class ClientManage implements IGeneralClient<Client> {
    private List<Client>clients=new ArrayList<>();

    public ClientManage() {
    }

    public ClientManage(List<Client> clients) {
        this.clients = clients;
    }

    @Override
    public void showAll() {
        for (Client client: clients){
            System.out.println(client);
        }
    }

    @Override
    public void addNew(Client client) {
        clients.add(client);
    }

    @Override
    public void updateByLicensePlate(String identity, Client client) {
        int index = searchByLicensePlate(identity);
        if (index != -1) {
            clients.set(index,client);
        } else {
            System.err.println("Số CMND không hợp lệ =>>.");
        }
    }

    @Override
    public void removeByLicensePlate(String identity, Client client) {
        int index = searchByLicensePlate(identity);
        if (index != -1) {
            clients.remove(index);
        } else {
            System.err.println("Số CMND không hợp lệ =>>.");
        }
    }

    @Override
    public int searchByLicensePlate(String identity) {
        int index = -1;
        for (int i = 0; i < clients.size(); i++) {
            if (clients.get(i).getIdentity().equals(identity)) {
                index = i;
            }
        }
        return index;
    }
}
