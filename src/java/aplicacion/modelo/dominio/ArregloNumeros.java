/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package aplicacion.modelo.dominio;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.Arrays;


/**
 *
 * @author Alumno
 */
public class ArregloNumeros implements Serializable {
    private ArrayList <Integer> numeros;
    private String texto;

    public ArregloNumeros() {
        numeros = new ArrayList();
     
    }

    public ArregloNumeros(ArrayList <Integer> numeros) {
        this.numeros = numeros;
    }
    
    public void agregarNumero (int n){
     numeros.add(n);
        setTexto(Arrays.toString(numeros.toArray()));
    }

    
    public double calcularPromedio(){
        double promedio;
        double contador=0;
        for(int i=0;i<getNumeros().size();i++){
            contador=contador+getNumeros().get(i);
        }
        promedio=contador/getNumeros().size();
        return promedio;
    }
   
    
     public int numMenor (){
        int menor = getNumeros().get(0);
        for (int i=1;i<getNumeros().size();i++){
            if (getNumeros().get(i)<menor){
                menor = getNumeros().get(i);
                
            }
        }
        return menor;
    }

    /**
     * @return the numeros
     */
    public ArrayList <Integer> getNumeros() {
        return numeros;
    }

    /**
     * @param numeros the numeros to set
     */
    public void setNumeros(ArrayList <Integer> numeros) {
        this.numeros = numeros;
    }

    /**
     * @return the texto
     */
    public String getTexto() {
        return texto;
    }

    /**
     * @param texto the texto to set
     */
    public void setTexto(String texto) {
        this.texto = texto;
    }

    
}
