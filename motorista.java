/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.gets_sets;

/**
 *
 * @author laura
 */

public class motorista {

private String nome_motorista;
private int idade_motorista;
private String veiculo_motorista;



//metodo construtor

public motorista(String nome_motorista, int idade_motorista, String veiculo_motorista){
    this.nome_motorista = nome_motorista;
    this.idade_motorista = idade_motorista;
    this.veiculo_motorista = veiculo_motorista;
    
}

//metodos gets

public String getNome_motorista(){

return nome_motorista;
}

public int getIdade_Motorista(){
return idade_motorista;
}

public String getveiculo_motorista(){
return veiculo_motorista;
}

//setters

public void setNome_motorista(String Nome_motoristaA){
this.nome_motorista = Nome_motoristaA;
}


public void setIdade_Motorista(int idade_motoristaA){
this.idade_motorista = idade_motoristaA;
}

public void setveiculo_motorista(String veiculo_motoristaA){
this.veiculo_motorista = veiculo_motoristaA;
}

@Override
public String toString(){
return "\n nome do motorista: \n" + nome_motorista + "\n idade do motorista: \n" + idade_motorista + "\n veiculo do motorista: \n" + veiculo_motorista;
}

}
