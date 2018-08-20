/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package app1;

import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author Alumno
 */
public class App1 {

    //Codifiación de mensajes
    public static void main(String[] args) {
        
        String texto;
        int cuantos=0;
        ArrayList <String> prueba= new ArrayList<String>();
        Codigo cod= new Codigo();
        
        
        
        Scanner leer= new Scanner(System.in);
        System.out.println("Escribe el mensaje");
        texto= leer.next();
        
        cuantos= texto.length();
        
        for(int i=0; i<cuantos; i++){
            for(int j=0; j<27; j++){
                if(texto.charAt(i)==(cod.getLetras()).charAt(j))
                    prueba.add(Integer.toString(cod.getCodigo(j)));
            }
        }
        for(int i=0; i<prueba.size(); i++){
            System.out.print(prueba.get(i));
        }
        //cuantos= letras.length();
        //System.out.println(cuantos);
                
    }
    
}
