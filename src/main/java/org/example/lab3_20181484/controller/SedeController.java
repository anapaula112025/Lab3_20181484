package org.example.lab3_20181484.controller;

import org.example.lab3_20181484.entity.Sede;
import org.example.lab3_20181484.repository.SedeRepository;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import java.util.List;

@Controller
public class SedeController {

    final SedeRepository sedeRepository;

    public SedeController(SedeRepository sedeRepository){
        this.sedeRepository = sedeRepository;
    }
    @GetMapping(value = "/sede/inicio")
    public String listarSedes(Model model){
        List<Sede> sedeList = sedeRepository.findAll();
        model.addAttribute("listaSedes",sedeList);
        return "/sede/inicio";
    }
}
