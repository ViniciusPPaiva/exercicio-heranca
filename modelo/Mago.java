package modelo;

public class Mago extends Personagem {
    private int mana;

    public Mago(String nome, int nivel, int mana) {
        super(nome, nivel);
        this.mana = mana;
    }

    @Override
    public void atacar() {
        System.out.println(getNome() + " lançou feitiço! Mana gasta: 10. Restante: " + (mana - 10));
    }
}
