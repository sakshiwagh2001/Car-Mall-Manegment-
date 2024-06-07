package com.example.clients_seq.service.impl;


import com.example.clients_seq.model.ClientSeq;
import com.example.clients_seq.repository.ClientSeqRepository;
import com.example.clients_seq.service.ClientSeqService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ClientSeqServiceImpl implements ClientSeqService {

    private final ClientSeqRepository clientSeqRepository;

    @Autowired
    public ClientSeqServiceImpl(ClientSeqRepository clientSeqRepository) {
        this.clientSeqRepository = clientSeqRepository;
    }

    @Override
    public ClientSeq getClient() {
        return clientSeqRepository.findAll().get(0); // Assuming there's only one record
    }

    @Override
    public ClientSeq updateClient(ClientSeq clientSeq) {
        return clientSeqRepository.save(clientSeq);
    }
}
