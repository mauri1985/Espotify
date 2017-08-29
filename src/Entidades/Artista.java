/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Entidades;

import java.util.Date;
import java.util.List;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;

/**
 *
 * @author Mauricio
 */
@Entity
@Table(name = "artista")
public class Artista extends Usuario {
    
    
    @Column(name = "web")
    private String web;
    
    @Column(name = "biografa")
    private String biografia;
    
    /* Pensar como se guarda en la BD */
    private List<String> listaAlbums; 

    //Constructor por defecto
    public Artista() {
    }
       
    
    public Artista(String web, String biografia) {
        this.web = web;
        this.biografia = biografia;
    }

    public Artista(String web, String biografia, String nickname, String email, String nombre, String apellido, Date fchnac, String fotoPerfil) {
        super(nickname, email, nombre, apellido, fchnac, fotoPerfil);
        this.web = web;
        this.biografia = biografia;
    }

    public String getWeb() {
        return web;
    }

    public String getBiografia() {
        return biografia;
    }

    public void setWeb(String web) {
        this.web = web;
    }

    public void setBiografia(String biografia) {
        this.biografia = biografia;
    }

    
    
    

    
    
}
