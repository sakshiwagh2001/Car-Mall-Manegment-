package com.example.clients.service.impl;


import com.example.clients.model.Client;
import com.example.clients.repository.ClientRepository;
import com.example.clients.service.ClientService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class ClientServiceImpl  implements ClientService {

    @Autowired
    private ClientRepository clientRepository;
    @Override
    public List<Client> getAllClients() {
        return clientRepository.findAll();
    }

    @Override
    public Client getClientById(Long userId) {
        Optional<Client> clientOptional = clientRepository.findById(userId);
        return clientOptional.orElse(null);
    }

    @Override
    public Client addClient(Client client) {
        return clientRepository.save(client);
    }


    @Override
    public Client updateClient(Long user_id, Client client) {
        if (clientRepository.existsById(user_id)) {
            client.setUser_id(user_id); // Ensure userId is set for update
            return clientRepository.save(client);
        }
        return null; // Or throw an exception
    }
    @Override
    public boolean deleteClient(Long userId) {
        if (clientRepository.existsById(userId)) {
            clientRepository.deleteById(userId);
            return true;
        }
        return false; // Or throw an exception
    }

}
