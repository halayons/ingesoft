/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.labguis.gfour.interfaces;

import com.labguis.gfour.modelo.Usuario;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

/**
 *
 * @author Makot
 */
@Repository
public interface IUsuario extends CrudRepository<Usuario, Integer> {    
    Usuario findByNombre(String nombre);
}
