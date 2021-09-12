package br.ufpb.dcx.aps.atividades.composicaosimples.rede;


import java.util.LinkedList;
import java.util.List;

public class Roteador extends Rede {

    private List<Rede> componentes = new LinkedList<>();

    public Roteador(String nome, String ip, String enderecoMec) {
        super(nome, ip, enderecoMec);

    }

    public void addComponente(Rede rede) {
        componentes.add(rede);
    }

    public List<Rede> getComponentes() {
        return this.componentes;
    }

}
