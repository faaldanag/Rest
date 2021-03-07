/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package com.proyecto.dao;


import org.springframework.data.repository.CrudRepository;

import com.proyecto.entities.Carga;


public interface ICargaDao extends CrudRepository<Carga, Long> {

}
