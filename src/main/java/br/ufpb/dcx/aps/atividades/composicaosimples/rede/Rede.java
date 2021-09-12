package br.ufpb.dcx.aps.atividades.composicaosimples.rede;

public class Rede {

    private String nome;
    private String ip;
    private String enderecoMec;

   
    public Rede(String nome, String ip, String enderecoMec){
        this.nome = nome;
        this.ip = ip;
        this.enderecoMec = enderecoMec;
    }

    public String getNome(){
        return this.nome;
    }
    public void setNome(String nome){
        this.nome = nome;
    }
    public String getIp(){
        return this.ip;
    }
    public void setIp(String ip){
        this.ip = ip;
    }
    public String getEnderecoMec(){
        return this.enderecoMec;
    }
    public void setEnderecoMec(String enderecoMec){
        this.enderecoMec = enderecoMec;
    }
    
    
}
