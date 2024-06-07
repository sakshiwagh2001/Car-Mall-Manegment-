package com.example.clients.service;

import com.example.clients.model.Client;

import java.util.List;

public interface ClientService {

    List<Client> getAllClients();

    Client getClientById(Long userId);

    Client addClient(Client client);

    Client updateClient(Long userId, Client client);

    boolean deleteClient(Long userId);
}
