package com.proyecto.controller;

import com.proyecto.entities.Carga;
import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import com.proyecto.services.ICargaServices;
import org.springframework.web.bind.annotation.PutMapping;

@RestController
@RequestMapping("/api")
public class CargaRestController {
    @Autowired
    private ICargaServices cargaService;

    @GetMapping("/carga")
    public List<Carga> index() {
	return cargaService.findAll();
    }

    @PostMapping("/carga")
    public Carga create(@RequestBody Carga carga) {
	return cargaService.create(carga);
    }
    
    @PutMapping("/carga")
    public Carga update(@RequestBody Carga carga) {
    	return cargaService.update(carga);}
    	   
    @GetMapping("/carga/{id}")
	public Optional<Carga> ver (@PathVariable Long id){
		return cargaService.findById(id);
	}
    
    @DeleteMapping("/carga/{id}")
  	public void borrar (@PathVariable Long id){
  		 cargaService.delete(id);
  	}
    
    
}


