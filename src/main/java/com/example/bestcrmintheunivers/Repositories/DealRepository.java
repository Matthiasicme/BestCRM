package com.example.bestcrmintheunivers.Repositories;

import com.example.bestcrmintheunivers.entities.Client;
import com.example.bestcrmintheunivers.entities.Deal;
import org.springframework.data.repository.CrudRepository;

import java.util.List;

public interface DealRepository extends CrudRepository<Deal, Long> {

    List<Deal> findAllByClient(Client client);

}
