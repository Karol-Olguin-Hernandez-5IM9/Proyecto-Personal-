/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package app1;

/**
 *
 * @author Alumno
 */
public class Codigo {
   private int [] Codigo= new int[27];
   private String letras= "abcdefghijklmnñopqrstuvwxyz";
   
    public Codigo(){
       for(int i=0; i<27; i++){
            Codigo[i]= (i+1);
        }
    }

    public int getCodigo(int j) {
        return Codigo[j];
    }

    public void setCodigo(int[] Codigo) {
        this.Codigo = Codigo;
    }

    public String getLetras() {
        return letras;
    }

    public void setLetras(String letras) {
        this.letras = letras;
    }
   

    
    
}
