package com.example.bestcrmintheunivers.Repositories;

import com.example.bestcrmintheunivers.entities.Client;
import com.example.bestcrmintheunivers.entitiesHw.ClientHw;
import org.springframework.data.repository.CrudRepository;



public interface ClientRepository extends CrudRepository<Client, Long> {
    // ClientRepository methods
}
