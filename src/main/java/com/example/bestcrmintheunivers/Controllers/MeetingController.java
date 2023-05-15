package com.example.bestcrmintheunivers.Controllers;


import com.example.bestcrmintheunivers.Repositories.MeetingRepository;
import com.example.bestcrmintheunivers.entities.Meeting;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

@RequestMapping("/meeting")
@Controller
public class MeetingController {

    private final MeetingRepository meetingRepository;

    @Autowired
    public MeetingController(MeetingRepository meetingRepository) {
        this.meetingRepository = meetingRepository;
    }

    @GetMapping("/")
    public String list(Model model){
        model.addAttribute("meetings", this.meetingRepository.findAll());
        return "meeting/list";
    }

    @GetMapping("/add")
    public String add(Model model){
        model.addAttribute("meeting", new Meeting());
        return "meeting/add";
    }

    @PostMapping("/save")
    public String save(@ModelAttribute Meeting meeting){
        this.meetingRepository.save(meeting);
        return "redirect:/meeting/";
    }

    @GetMapping("/delete/{id}")
    public String delete(@PathVariable Long id){
        this.meetingRepository.deleteById(id);
        return "redirect:/meeting/";
    }

}
