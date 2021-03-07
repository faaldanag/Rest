/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package com.proyecto.services;

import com.proyecto.entities.Carga;
import java.util.List;
import java.util.Optional;


public interface ICargaServices {

    
	public List<Carga> findAll();
	public Carga create(Carga carga);
	public Carga update(Carga carga);
	public Optional<Carga> findById(Long id);
	public void  delete(Long id);
}
