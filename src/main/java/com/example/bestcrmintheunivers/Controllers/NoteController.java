package com.example.bestcrmintheunivers.Controllers;


import com.example.bestcrmintheunivers.Repositories.NoteRepository;
import com.example.bestcrmintheunivers.entities.Note;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

@RequestMapping("/note")
@Controller
public class NoteController {

    private final NoteRepository noteRepository;

    @Autowired
    public NoteController(NoteRepository noteRepository) {
        this.noteRepository = noteRepository;
    }

    @GetMapping("/")
    public String list(Model model){
        model.addAttribute("notes", this.noteRepository.findAll());
        return "note/list";
    }

    @GetMapping("/add")
    public String add(Model model){
        model.addAttribute("note", new Note());
        return "note/add";
    }

    @PostMapping("/save")
    public String save(@ModelAttribute Note note){
        this.noteRepository.save(note);
        return "redirect:/note/";
    }

    @GetMapping("/delete/{id}")
    public String delete(@PathVariable Long id){
        this.noteRepository.deleteById(id);
        return "redirect:/note/";
    }

}
