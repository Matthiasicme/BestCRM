package com.example.bestcrmintheunivers.Controllers;


import com.example.bestcrmintheunivers.Repositories.DealRepository;
import com.example.bestcrmintheunivers.entities.Deal;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

@RequestMapping("/deal")
@Controller
public class DealController {

    private final DealRepository dealRepository;

    @Autowired
    public DealController(DealRepository dealRepository) {
        this.dealRepository = dealRepository;
    }

    @GetMapping("/")
    public String list(Model model){
        model.addAttribute("deals", this.dealRepository.findAll());
        return "deal/list";
    }

    @GetMapping("/add")
    public String add(Model model){
        model.addAttribute("deal", new Deal());
        return "deal/add";
    }

    @PostMapping("/save")
    public String save(@ModelAttribute Deal deal){
        this.dealRepository.save(deal);
        return "redirect:/deal/";
    }

    @GetMapping("/delete/{id}")
    public String delete(@PathVariable Long id){
        this.dealRepository.deleteById(id);
        return "redirect:/deal/";
    }

}
