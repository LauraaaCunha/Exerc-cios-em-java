/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.gets_sets;

/**
 *
 * @author laura
 */
public class veiculo {
    private String marca;
    private String modelo;
    private int ano;
    
    
    //metodo construtor
    
    public veiculo(String marcaA, String modeloO, int anoO){
        this.marca = marcaA;
            this.modelo = modeloO;
            this.ano = anoO;
    }
    
    //metodos get
    
    public String getMarca(){
        return marca;
    }
    
    public String getModelo(){
        return modelo;
    }
    
    public int getAno(){
    return ano;
    }
    
    //metodos set
    
    public void setMarca(String marcaA){
    this.marca = marcaA;
    }
    
    public void setModelo(String modeloO){
    this.modelo = modeloO;
    }
    
    public void setAno(int anoO){
    this.ano = anoO;
    }
    
    //metodo toString
    @Override
    public String toString(){
    return "\n Modelo: \n" + modelo + "\n marca: \n" + marca + "\n ano: \n" + ano;
    }
    
    
}




/*marca, modelo e ano . Em seguida, crie uma
classe `Motorista` com atributos como nome, idade e veículo dirigido*/