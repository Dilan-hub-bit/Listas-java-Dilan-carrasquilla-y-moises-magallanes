/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Clases;

import java.util.ArrayList;

/**
 *
 * @author Delia
 */
public class Usuarios {
    private String nombre;
    private String nickname;
    private String clave;
    
   
    public static ArrayList<Usuarios> listaUsuarios = new ArrayList<>();

    
    public Usuarios(String nombre, String nickname, String clave) {
        this.nombre = nombre;
        this.nickname = nickname;
        this.clave = clave;
    }

    
    public String getNombre() {
        return nombre;
    }

    public String getNickname() {
        return nickname;
    }

    public String getClave() {
        return clave;
    }

    
    public static void guardarUsuario(String nombre, String nickname, String clave) {
        Usuarios nuevoUsuario = new Usuarios(nombre, nickname, clave);
        listaUsuarios.add(nuevoUsuario);
    }
}

