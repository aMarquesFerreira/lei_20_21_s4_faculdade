/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package eapli.base.app.other.console;

/**
 *
 * @author andre
 */
public class Mensagem {

    private byte codigo;
    private byte[] data;
    
    public Mensagem(byte codigo, byte[] data) {
        this.codigo = codigo;
        this.data = data;
    }
    
    public byte[] dados(){
        return data;
    }
    
    public byte getCodigo(){
        return codigo;
    }
    
    
}
