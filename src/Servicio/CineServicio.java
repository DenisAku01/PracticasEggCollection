/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Servicio;

import java.text.ParseException;

/**
 *
 * @author denis
 */
public class CineServicio {
    public void IniciarCine() throws ParseException{
        
        //ADMIN PARA INGRESAR LAS PELICULAS
        AdministradorServicio add = new AdministradorServicio();
        add.menu();
        
        
        
        
        // CLIENTE QUE ACCEDE AL CATALOGO PARA VER LAS PELICULAS DE LA FORMA QUE QUIERA
        ClienteServicio ver = new ClienteServicio();
        ver.verCatalogo();
    }
}
