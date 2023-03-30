/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package controller;

import static inf3n212.carro.INF3N212Carro.cadPessoa;
import java.util.ArrayList;
import model.Carro;

/**
 *
 * @author 182120069
 */
public class CCarro {

    ArrayList<Carro> carros = new ArrayList();

    public void addCarro(Carro c) {
        this.carros.add(c);
    }

    public void removeCarro(Carro c) {
        this.carros.remove(c);
    }

    public ArrayList<Carro> getCarros() {
        return this.carros;
    }

    public Carro getCarroPlaca(String placa) {
        Carro c = null;

        for (Carro carro : carros) {
            if (carro.getPlaca().equals(placa)) {
                c = carro;
                break;
            }
        }
        return c;
    }

    public void mockCarro() {
        Carro c1 = new Carro();
        c1.setPlaca("abc1f34");
        c1.setAnoFab(2023);
        c1.setAnoMod(2023);
        c1.setMarca("Fiat");
        c1.setModelo("Palio");
        c1.setTpCambio("Manual");
        c1.setCombustivel("Flex");
        c1.setCor("Bege");
        c1.setProprietario(cadPessoa.getPessoaCPF("86345391050"));
        addCarro(c1);

        Carro c2 = new Carro();
        c2.setPlaca("abc1g34");
        c2.setAnoFab(2023);
        c2.setAnoMod(2023);
        c2.setMarca("Fiat");
        c2.setModelo("Uno");
        c2.setTpCambio("Manual");
        c2.setCombustivel("Flex");
        c2.setCor("Branco");
        c2.setProprietario(cadPessoa.getPessoaCPF("24808624028"));
        addCarro(c2);
    }

    
}//fim Classe CCarro
