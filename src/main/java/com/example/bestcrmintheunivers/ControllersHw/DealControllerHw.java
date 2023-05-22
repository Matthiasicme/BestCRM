package com.example.bestcrmintheunivers.ControllersHw;


import com.example.bestcrmintheunivers.Repositories.DealRepository;
import com.example.bestcrmintheunivers.entities.Deal;
import com.example.bestcrmintheunivers.entitiesHw.DealHw;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

@RequestMapping("/dealHw")
@Controller
public class DealControllerHw {

    private final DealRepository dealRepository;

    @Autowired
    public DealControllerHw(DealRepository dealRepository) {
        this.dealRepository = dealRepository;
    }

    @GetMapping("/")
    public String list(Model model){
        model.addAttribute("dealsHw", this.dealRepository.findAll());
        return "dealHw/list";
    }

    @GetMapping("/add")
    public String add(Model model){
        model.addAttribute("deal", new Deal());
        return "dealHw/add";
    }

    @PostMapping("/save")
    public String save(@ModelAttribute Deal deal){
        this.dealRepository.save(deal);
        return "redirect:/dealHw/";
    }

    @GetMapping("/delete/{id}")
    public String delete(@PathVariable Long id){
        this.dealRepository.deleteById(id);
        return "redirect:/dealHw/";
    }

}
