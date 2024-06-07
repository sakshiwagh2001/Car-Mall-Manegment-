package com.example.clients_seq.service;




import com.example.clients_seq.model.ClientSeq;

import java.util.List;

public interface ClientSeqService {

    ClientSeq getClient();

    ClientSeq updateClient(ClientSeq clientSeq);
}
