package org.launchcode.codingevents.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

@Controller
@RequestMapping("events")
public class EventController {
//    HashMap<String, String> events = new HashMap<>();

    @GetMapping
    public String displayAllEvents(Model model){
//        List<String> events = new ArrayList<>();
//        events.add("Code til Dawn");
//        events.add("Women in Technology");
//        events.add("a11ySTL");
//        model.addAttribute("events", events);
//        return "events/index";
        HashMap<String, String> events = new HashMap<>();
        events.put("Women in Technology", "Friday, March 6, Living World, STL Zoo");
        events.put("a11ySTL Launch", "Wednesday, February 12, 401 Pine St.");
        events.put("Code Till Dawn", "Thursday, March 5, CIC STL");
        model.addAttribute("events", events);
        return "events/index";
    }

    //lives at /events/create
    @GetMapping("create")
    public String renderCreateEventForm(){
        return "events/create";
    }

//    @PostMapping("create")
//    public String createEvent(@RequestParam String eventName, String eventDescription) {
//        events.put(eventName, eventDescription);
//        return "redirect:";
//    }
}
