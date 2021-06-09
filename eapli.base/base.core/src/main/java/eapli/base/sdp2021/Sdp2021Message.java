/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package eapli.base.sdp2021;

/**
 *
 * @author andre
 */
public class Sdp2021Message {
    private byte versao;
    private byte codigo;
    private byte[] data;
    
    public Sdp2021Message(byte versao, byte codigo, byte[] data) {
        this.versao = versao;
        this.codigo = codigo;
        this.data = data;
    }
    
    public byte[] getDados(){
        return data;
    }
    
    public byte getCodigo(){
        return codigo;
    }

    public byte getVersao() {
        return versao;
    }

    @Override
    public String toString() {
        return "Sdp2021Message{" + "versao=" + versao + ", codigo=" + codigo + ", data size=" + data.length + '}';
    }
    
    
}
