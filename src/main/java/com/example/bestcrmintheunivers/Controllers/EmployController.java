package com.example.bestcrmintheunivers.Controllers;


import com.example.bestcrmintheunivers.Repositories.EmployRepository;
import com.example.bestcrmintheunivers.entities.Employ;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

@RequestMapping("/employ")
@Controller
public class EmployController {

    private final EmployRepository employRepository;

    @Autowired
    public EmployController(EmployRepository employRepository) {
        this.employRepository = employRepository;
    }

    @GetMapping("/")
    public String list(Model model){
        model.addAttribute("employees", this.employRepository.findAll());
        return "employ/list";
    }

    @GetMapping("/add")
    public String add(Model model){
        model.addAttribute("employ", new Employ());
        return "employ/add";
    }

    @PostMapping("/save")
    public String save(@ModelAttribute Employ employ){
        this.employRepository.save(employ);
        return "redirect:/employ/";
    }

    @GetMapping("/delete/{id}")
    public String delete(@PathVariable Long id){
        this.employRepository.deleteById(id);
        return "redirect:/employ/";
    }

}
