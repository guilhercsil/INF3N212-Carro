/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package controller;

import java.util.ArrayList;
import model.Pessoa;

/**
 *
 * @author 182120069
 */
public class CPessoa {

    ArrayList<Pessoa> pessoas = new ArrayList<>();
    int idPessoa = 1;

    /**
     * Autoincrement idPessoa
     *
     * @return
     */
    public int geraID() {
        return this.idPessoa++;
    }

    /**
     * método addPessoa Pessoa no ArrayList pessoas
     *
     * @param p
     */
    public void addpessoa(Pessoa p) {
        this.pessoas.add(p);
    }

    /**
     * método remove pessoa do ArrayList pessoas
     *
     * @param p
     */
    public void removePessoa(Pessoa p) {
        this.pessoas.remove(p);
    }

    public ArrayList<Pessoa> getPessoa() {
        return this.pessoas;
    }

    /**
     * Método getPessoaCPF retorna uma Pessoa caso encontre correspondência no
     * CPF do ArrayList pessoas, caso contrário retorna null.
     *
     * @param CPF
     * @return
     */
    public Pessoa getPessoaCPF(String CPF) {
        Pessoa p = null;
        for (Pessoa pes : pessoas) {
            if (pes.getCpf().equals(CPF)) {
                p = pes;
                break;
            }
        }//fim foreach
        return p;
    }

    public void mockPessoas() {
        Pessoa p1 = new Pessoa();
        p1.setIdPessoa(geraID());
        p1.setCpf("86345391050");
        p1.setNome("Juvenal das Condongas");
        p1.setTelefone("51999889988");
        p1.setEndereco("Rua das Margaridas");
        addpessoa(p1);
        Pessoa p2 = new Pessoa();
        p1.setIdPessoa(geraID());
        p1.setCpf("24808624028");
        p1.setNome("Madalena Espirito SAanto");
        p1.setTelefone("51988998899");
        p1.setEndereco("Rua sem saída");
        addpessoa(p2);
    }
}//fim classe controller
