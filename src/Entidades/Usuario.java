/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Entidades;

import java.io.Serializable;
import java.util.Date;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.persistence.Temporal;

/**
 *
 * @author Mauricio
 */

@Entity
@Table(name = "usuario")
public class Usuario implements Serializable{
   
    /**
     * 
     */
    
    private static final long serialVersionUID = 1L;  
    
    @Id
    @Column(name = "nickname")
    private String nickname;
    
    @Column(name = "email")
    private String email;
    
    @Column(name = "nombre")
    private String nombre;
    
    @Column(name = "apellido")
    private String apellido;
    
    @Column(name = "fchnac")
    @Temporal(javax.persistence.TemporalType.DATE) // La utilidad de esta linea es para que guarde solamente fecha, y no otros campos como horas, minutos, segundos, etc.
    private Date fchnac;
    
    @Column(name = "foto")
    private String fotoPerfil;

    //Constructor por defecto sin parametros
    public Usuario() {
    }

    public Usuario(String nickname, String email, String nombre, String apellido, Date fchnac, String fotoPerfil) {
        this.nickname = nickname;
        this.email = email;
        this.nombre = nombre;
        this.apellido = apellido;
        this.fchnac = fchnac;
        this.fotoPerfil = fotoPerfil;
    }

    public String getNickname() {
        return nickname;
    }

    public String getEmail() {
        return email;
    }

    public String getNombre() {
        return nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public Date getFchnac() {
        return fchnac;
    }

    public String getFotoPerfil() {
        return fotoPerfil;
    }

    public void setNickname(String nickname) {
        this.nickname = nickname;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public void setFchnac(Date fchnac) {
        this.fchnac = fchnac;
    }

    public void setFotoPerfil(String fotoPerfil) {
        this.fotoPerfil = fotoPerfil;
    }
    
    

}
