/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controladores;

import Entidades.Album;
import Entidades.Artista;
import Entidades.Cliente;
import Entidades.Usuario;
import java.util.List;
import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import javax.swing.JOptionPane;

/**
 *
 * @author Mauricio
 */
public class CUsuario {
    
    private static EntityManager manager;
    
    private static EntityManagerFactory emf;
    

    //Constructor por defecto
    public CUsuario() {
        
    }
    
    
    /* FUNCIONES DE PERSISTENCIA */
    
    public static void altaCliente(Cliente c){
        
        emf = Persistence.createEntityManagerFactory("MiEspotifyPU");
        
        manager = emf.createEntityManager();
        
        manager.getTransaction().begin();
        
        manager.persist(c);
        
        manager.getTransaction().commit();
                        
        
    }
    
        
    public static void altaArtista(Artista a){
        
        emf = Persistence.createEntityManagerFactory("MiEspotifyPU");
        
        manager = emf.createEntityManager();
        
        manager.getTransaction().begin();
        
        manager.persist(a);
        
        manager.getTransaction().commit();
                        
        
    }
    
    public static void altaAlbum(Album al){
        
        emf = Persistence.createEntityManagerFactory("MiEspotifyPU");
        
        manager = emf.createEntityManager();
        
        manager.getTransaction().begin();
        
        manager.persist(al);
        
        manager.getTransaction().commit();
        
    }
    
    public static void crearListaParticular(String nickname, String nombreLista,String imagen, boolean privada){
        JOptionPane.showMessageDialog(null,"crearListaParticular - No implementada");
    }
   
    
    /* PREDICADO */
    
    public boolean existeNickname(String nickname){
        JOptionPane.showMessageDialog(null,"existeNickname - No implementada");
        return false;
    }
    
    public boolean existeEmail(String email){
        JOptionPane.showMessageDialog(null,"existeEmail - No implementada");
        return false;
    }
    
    /* OTRAS FUNCIONES */
    
    public static void elijoCancionAlbum(String nicknameArtista, String nombreAlbum, String nombreCancion){
        JOptionPane.showMessageDialog(null,"elijoCancionAlbum - No implementada");
    }
    
    public static void vincularUsuarios(String nicknameSeguidor, String nicknameSeguido){
        JOptionPane.showMessageDialog(null,"vincularUsuarios - No implementada");
    }
    
    public static void desvincularUsuarios(String nicknameSeguidor, String nicknameSeguido){
        JOptionPane.showMessageDialog(null,"desvincularUsuarios - No implementada");
    }
    
    public static Album seleccionarAlbumAFA(String nombreArista, String nombreAlbum){
     
        JOptionPane.showMessageDialog(null,"seleccionarAlbum - No implementada, devuelve null");
        return null;
    }
    
    public static void seleccionarCancionAFA(String nicknameArista, String nombreAlbum, String nombreCancion){
        JOptionPane.showMessageDialog(null,"seleccionarCancionAFA - No implementada");
    }
    
    public static void eliminarAlbumFavorito(String nombreAlbum, String nombreArtista){
        JOptionPane.showMessageDialog(null,"eliminarAlbumFavorito - No implementada");
    }
    
}
