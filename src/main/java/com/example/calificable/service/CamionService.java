package com.example.calificable.service;

import com.example.calificable.model.Camion;
import com.example.calificable.repository.CamionRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CamionService {

    @Autowired
    private CamionRepository camionRepository;

    public void saveCamion(Camion camion) { // post
        camionRepository.save(camion);
    }

    public void deleteCamion(int id) { // delete
        camionRepository.deleteById(id);
    }

    public List<Camion> findAllCamion() { // get
        return camionRepository.findAll();
    }

    public void editCamion(Integer id, Camion camion) { // put
        Camion camion1 = camionRepository.findById(id).orElseThrow(() -> new RuntimeException("Camion no encontrado"));
        camion1.setMarca(camion.getMarca());
        camion1.setModelo(camion.getModelo());
        camion1.setCapacidadcarga(camion.getCapacidadcarga());
        camionRepository.save(camion1);
    }

}
