package com.example.bestcrmintheunivers.Repositories;

import com.example.bestcrmintheunivers.entities.Client;
import com.example.bestcrmintheunivers.entities.Deal;
import com.example.bestcrmintheunivers.entities.Note;
import org.springframework.data.repository.CrudRepository;

import java.util.List;

public interface NoteRepository extends CrudRepository<Note, Long> {



}
