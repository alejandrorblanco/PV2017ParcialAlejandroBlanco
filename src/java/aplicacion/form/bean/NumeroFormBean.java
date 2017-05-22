/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package aplicacion.form.bean;

import aplicacion.modelo.dominio.ArregloNumeros;
import java.io.Serializable;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.ViewScoped;

/**
 *
 * @author Alumno
 */
@ManagedBean
@ViewScoped
public class NumeroFormBean implements Serializable{
    private ArregloNumeros numeros;
    private int numer;
    private double prom;
    private int menor;
   
    /**
     * Creates a new instance of NumeroFormBean
     */
    public NumeroFormBean() {
        numeros = new ArregloNumeros();
       
    }
   
    public void mmp(){
        setMenor(getNumeros().numMenor());
        setProm(getNumeros().calcularPromedio());
    }
    public void agregarNumero(){
        getNumeros().agregarNumero(getNumer());
    }
   
    public NumeroFormBean(ArregloNumeros numeros, int numer) {
        this.numeros = numeros;
        this.numer = numer;
    }

    /**
     * @return the numeros
     */
    public ArregloNumeros getNumeros() {
        return numeros;
    }

    /**
     * @param numeros the numeros to set
     */
    public void setNumeros(ArregloNumeros numeros) {
        this.numeros = numeros;
    }

    /**
     * @return the numer
     */
    public int getNumer() {
        return numer;
    }

    /**
     * @param numer the numer to set
     */
    public void setNumer(int numer) {
        this.numer = numer;
    }

    /**
     * @return the prom
     */
    public double getProm() {
        return prom;
    }

    /**
     * @param prom the prom to set
     */
    public void setProm(double prom) {
        this.prom = prom;
    }


    /**
     * @return the menor
     */
    public int getMenor() {
        return menor;
    }

    /**
     * @param menor the menor to set
     */
    public void setMenor(int menor) {
        this.menor = menor;
    }
    
    
    
}
