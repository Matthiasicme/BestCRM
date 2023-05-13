package com.example.bestcrmintheunivers.Repositories;

import com.example.bestcrmintheunivers.entities.Client;
import com.example.bestcrmintheunivers.entities.Employ;
import org.springframework.data.repository.CrudRepository;

import java.util.List;

public interface EmployRepository extends CrudRepository<Employ, Long> {

    List<Employ> findAllByClient(Client client);

}
