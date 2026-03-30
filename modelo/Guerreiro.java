package modelo;

public class Guerreiro extends Personagem {
    private double forca;

    public Guerreiro(String nome, int nivel, double forca) {
        super(nome, nivel);
        this.forca = forca;
    }

    @Override
    public void atacar() {
        System.out.println(getNome() + " atacou com espada! Dano: " + (getNivel() * forca));
    }
}
