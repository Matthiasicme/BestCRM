package com.example.bestcrmintheunivers.ControllersHw;


import com.example.bestcrmintheunivers.Repositories.MeetingRepository;
import com.example.bestcrmintheunivers.entities.Meeting;
import com.example.bestcrmintheunivers.entitiesHw.MeetingHw;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

@RequestMapping("/meetingHw")
@Controller
public class MeetingControllerHw {

    private final MeetingRepository meetingRepository;

    @Autowired
    public MeetingControllerHw(MeetingRepository meetingRepository) {
        this.meetingRepository = meetingRepository;
    }

    @GetMapping("/")
    public String list(Model model){
        model.addAttribute("meetingsHw", this.meetingRepository.findAll());
        return "meetingHw/list";
    }

    @GetMapping("/add")
    public String add(Model model){
        model.addAttribute("meetingHw", new MeetingHw());
        return "meetingHw/add";
    }

    @PostMapping("/save")
    public String save(@ModelAttribute Meeting meeting){
        this.meetingRepository.save(meeting);
        return "redirect:/meetingHw/";
    }

    @GetMapping("/delete/{id}")
    public String delete(@PathVariable Long id){
        this.meetingRepository.deleteById(id);
        return "redirect:/meetingHw/";
    }

}
