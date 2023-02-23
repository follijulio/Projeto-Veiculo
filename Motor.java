package JAVA.projetos.SistemaDeVeiculos;

public abstract class Motor {

    private String nome;
    private int potencia;


    //Getters
    public String getNome() {
        return nome;
    }
    public int getPotencia() {
        return potencia;
    }
    

    //Setters
    public void setNome(String nome) {
        this.nome = nome;
    }
    public void setPotencia(int potencia) {
        this.potencia = potencia;
    }

}
