/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package com.proyecto.implementacion;

import com.proyecto.dao.ICargaDao;
import com.proyecto.entities.Carga;
import com.proyecto.services.ICargaServices;
import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
public class CargaServices implements ICargaServices {
    @Autowired
    private ICargaDao cargaDao;

    @Transactional(readOnly = true)
    public List<Carga> findAll() {
	return (List<Carga>) cargaDao.findAll();
    }

    @Transactional(readOnly = false)
    public Carga create(Carga carga) {
	System.out.println(carga.getDescripcion());
	return cargaDao.save(carga);
    }

    @Transactional(readOnly = false)
    public Carga update(Carga carga) {
	return cargaDao.save(carga);
    }
    
    @Transactional(readOnly = true)
	public Optional<Carga>findById(Long id){
		return cargaDao.findById(id);
	}
    
    @Transactional(readOnly = false)
	public void delete(Long id) {
    	cargaDao.deleteById(id);
	}

}
