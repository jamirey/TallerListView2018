package com.example.usuario.tallerlistview2018;

import java.util.ArrayList;

public class DatosResultado {

    private static ArrayList<Resultado> Resultado = new ArrayList<>();

    public static void guardar (Resultado R){

        Resultado.add(R);
    }

    public static ArrayList<Resultado> obtener(){

        return Resultado;
    }
}
