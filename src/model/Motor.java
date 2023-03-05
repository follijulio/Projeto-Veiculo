package src.model;

public abstract class Motor {

    private String nome;
    private int potencia;

    // Getters
    public String getNome() {
        return this.nome;
    }

    public int getPotencia() {
        return this.potencia;
    }

    // Setters
    public void setNome(String nome) {
        this.nome = nome;
    }

    public void setPotencia(int potencia) {
        this.potencia = potencia;
    }

}
