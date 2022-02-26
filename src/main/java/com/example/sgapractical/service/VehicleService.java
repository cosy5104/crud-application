package com.example.sgapractical.service;

import com.example.sgapractical.model.Vehicle;

import java.util.List;

public interface VehicleService {
    List<Vehicle> getAllVehicles();
    void saveVehicle(Vehicle vehicle);
}
