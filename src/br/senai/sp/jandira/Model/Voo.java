package br.senai.sp.jandira.Model;

public abstract class Voo {
    private String numeroVoo;
    private String origem;
    private String destino;
    private String dataPartida;
    private String horaPartida;

    public Voo(String numeroVoo, String origem, String destino, String dataPartida, String horaPartida) {
        this.numeroVoo = numeroVoo;
        this.origem = origem;
        this.destino = destino;
        this.dataPartida = dataPartida;
        this.horaPartida = horaPartida;
    }
    public String getNumeroVoo() {
        return numeroVoo;
    }
    public String getOrigem() {
        return origem;
    }
    public String getDestino() {
        return destino;
    }
    public String getDataPartida() {
        return dataPartida;
    }
    public String getHoraPartida() {
        return horaPartida;
    }
    public abstract String getNomeCompanhia();
    public abstract void exibirDetalhes();
}

