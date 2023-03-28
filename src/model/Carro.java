/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model;

/**
 *
 * @author 182120069
 */
public class Carro {
    private String marca;
    private String modelo;
    private int anoFab;
    private int anoMod;
    private String cor;
    private String tpCambio;
    private String combustivel;
    private Pessoa proprietário;//agragação da classe model Pessoa com Carro

    public Carro() {
    }

    public Carro(String marca, String modelo, int anoFab, int anoMod, String cor, String tpCambio, String combustivel, Pessoa proprietário) {
        this.marca = marca;
        this.modelo = modelo;
        this.anoFab = anoFab;
        this.anoMod = anoMod;
        this.cor = cor;
        this.tpCambio = tpCambio;
        this.combustivel = combustivel;
        this.proprietário = proprietário;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public int getAnoFab() {
        return anoFab;
    }

    public void setAnoFab(int anoFab) {
        this.anoFab = anoFab;
    }

    public int getAnoMod() {
        return anoMod;
    }

    public void setAnoMod(int anoMod) {
        this.anoMod = anoMod;
    }

    public String getCor() {
        return cor;
    }

    public void setCor(String cor) {
        this.cor = cor;
    }

    public String getTpCambio() {
        return tpCambio;
    }

    public void setTpCambio(String tpCambio) {
        this.tpCambio = tpCambio;
    }

    public String getCombustivel() {
        return combustivel;
    }

    public void setCombustivel(String combustivel) {
        this.combustivel = combustivel;
    }

    public Pessoa getProprietário() {
        return proprietário;
    }

    public void setProprietário(Pessoa proprietário) {
        this.proprietário = proprietário;
    }

    @Override
    public String toString() {
        return "Carro{" + "marca=" + marca + ", modelo=" + modelo + ", anoFab=" + anoFab + ", anoMod=" + anoMod + ", cor=" + cor + ", tpCambio=" + tpCambio + ", combustivel=" + combustivel + ", propriet\u00e1rio=" + proprietário + '}';
    }
    
    
}//fim classe carro
