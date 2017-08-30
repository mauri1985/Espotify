/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Entidades;

import java.io.Serializable;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Inheritance;
import javax.persistence.InheritanceType;
import javax.persistence.Table;

/**
 *
 * @author Mauricio
 */
@Entity
@Table(name = "listareproduccion")
@Inheritance(strategy = InheritanceType.JOINED)
public class ListaReproduccion implements Serializable{
    
    @Column(name = "listareproduccion")
    private String nombreLista;
    @Column(name = "portada")
    private String portada;
        
}
