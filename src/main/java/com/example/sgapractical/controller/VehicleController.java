package com.example.sgapractical.controller;

import com.example.sgapractical.model.Vehicle;
import com.example.sgapractical.service.VehicleService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;

@Controller
public class VehicleController
{
    @Autowired
    private VehicleService vehicleService;
    //display list of vehicles
    @GetMapping("/")
    public  String viewHomePage(Model model){
        model.addAttribute("listVehicles", vehicleService.getAllVehicles());
        return "index";

    }
    @GetMapping("/showNewVehicleForm")
    public String showNewVehicleForm(Model model){
        //create model attribute to bind form data
        Vehicle vehicle=new Vehicle();
        model.addAttribute("vehicle", vehicle);
        return "new_vehicle";

    }
    @PostMapping("/saveVehicle")
    public  String saveVehicle(@ModelAttribute("vehicle") Vehicle vehicle){
        //save vehicle to the database
        vehicleService.saveVehicle(vehicle);
        return "redirect:/";

    }
}
