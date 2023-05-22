package com.example.bestcrmintheunivers.ControllersHw;


import com.example.bestcrmintheunivers.Repositories.NoteRepository;
import com.example.bestcrmintheunivers.entities.Note;
import com.example.bestcrmintheunivers.entitiesHw.NoteHw;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

@RequestMapping("/noteHw")
@Controller
public class NoteControllerHw {

    private final NoteRepository noteRepository;

    @Autowired
    public NoteControllerHw(NoteRepository noteRepository) {
        this.noteRepository = noteRepository;
    }

    @GetMapping("/")
    public String list(Model model){
        model.addAttribute("notesHw", this.noteRepository.findAll());
        return "noteHw/list";
    }

    @GetMapping("/add")
    public String add(Model model){
        model.addAttribute("note", new Note());
        return "noteHw/add";
    }

    @PostMapping("/save")
    public String save(@ModelAttribute Note note){
        this.noteRepository.save(note);
        return "redirect:/noteHw/";
    }

    @GetMapping("/delete/{id}")
    public String delete(@PathVariable Long id){
        this.noteRepository.deleteById(id);
        return "redirect:/noteHw/";
    }

}
