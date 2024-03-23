package com.example.calificable.controller;

import com.example.calificable.model.Camion;
import com.example.calificable.service.CamionService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@Controller
public class CamionController {

    @Autowired
    private CamionService camionService;

    @PostMapping("/save")
    public void saveCamion(@RequestBody Camion camion) {
        camionService.saveCamion(camion);
    }

    @DeleteMapping("/delete")
    public void deleteCamion(@RequestParam int id) {
        camionService.deleteCamion(id);
    }

    @GetMapping("/all")
    public String findAllCamiones(Model model) {
        List<Camion> camionList = camionService.findAllCamion();
        model.addAttribute("Camion", camionList);
        return "mostrarTabla";
    }

    @PostMapping("/procesar-formulario")
    public String procesarFormulario(Camion camion) {
        camionService.saveCamion(camion);
        return "redirect:/all";
    }

    @PutMapping("/edit")
    public void editCamion(@RequestParam Integer id, @RequestBody Camion camion) {
        camionService.editCamion(id,camion);

    }
}
