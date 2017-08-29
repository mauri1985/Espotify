/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Entidades;

import java.util.List;
import javax.persistence.Entity;
import javax.persistence.Table;

/**
 *
 * @author Mauricio
 */

@Entity
@Table(name = "cliente")
public class Cliente extends Usuario {
    
    //Listas creadas por el usuario
    private List<Cancion> listaPorDefecto;
    private List<ListaReproduccion> listasParticulares;
    
    //Favoritos agregados por el usuario
    private List<Album> albumsFavoritos;
    private List<ListaReproduccion> listasFavoritas;
    private List<Cancion> cancionesFavoritas;
    
        
}
