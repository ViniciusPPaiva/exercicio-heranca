package br.edu.equipe.modelo;

public abstract class Personagem {
    private String nome;
    private int nivel;

    public Personagem(String nome, int nivel) {
        this.nome = nome;
        this.nivel = nivel;
    }

    public void atacar() {
        System.out.println(nome + " realizou um ataque comum.");
    }

    public String getNome() { return nome; }

    @Override
    public String toString() {
        return "Nome: " + nome + " | Nível: " + nivel;
    }
}
