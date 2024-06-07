package com.example.clients_seq.controller;
import com.example.clients_seq.model.ClientSeq;
import com.example.clients_seq.service.ClientSeqService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/clients")
public class ClientSeqController {

    private final ClientSeqService clientSeqService;

    @Autowired
    public ClientSeqController(ClientSeqService clientSeqService) {
        this.clientSeqService = clientSeqService;
    }

    @GetMapping
    public ClientSeq getClient() {
        return clientSeqService.getClient();
    }

    @PutMapping
    public ClientSeq updateClient(@RequestBody ClientSeq clientSeq) {
        return clientSeqService.updateClient(clientSeq);
    }
}
