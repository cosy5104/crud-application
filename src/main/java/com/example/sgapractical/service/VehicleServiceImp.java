package com.example.sgapractical.service;

import com.example.sgapractical.model.Vehicle;
import com.example.sgapractical.repository.VehicleRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public class VehicleServiceImp  implements VehicleService{
    @Autowired
    private VehicleRepository vehicleRepository;
    @Override
    public List<Vehicle> getAllVehicles() {
        return vehicleRepository.findAll();
    }

    @Override
    public void saveVehicle(Vehicle vehicle) {
        this.vehicleRepository.save(vehicle);
    }
}
