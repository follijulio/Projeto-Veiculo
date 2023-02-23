package JAVA.projetos.SistemaDeVeiculos;

public abstract class Aviao extends Veiculo {

    private float envergaduraAsa;
    private int numMotores;
    private int tremDePouso;
    private boolean tremAberto;
    private int passageiros;

    // Metodos
    public void pousar() {
        if (isTremAberto()) {
            System.out.println("Poubhsando...");
        } else {
            System.out.println("IMPOSSIVEL POUSAR, O trem de pouso está fechado");
        }

    }

    public void decolar() {

    }


    //Getters
    public int getNumMotores() {
        return numMotores;
    }

    public float getEnvergaduraAsa() {
        return envergaduraAsa;
    }

    public int getTremDePouso() {
        return tremDePouso;
    }

    public int getPassageiros() {
        return passageiros;
    }

    public boolean isTremAberto() {
        return tremAberto;
    }


    //Setters
    public void setEnvergaduraAsa(float envergaduraAsa) {
        this.envergaduraAsa = envergaduraAsa;
    }

    public void setNumMotores(int numMotores) {
        this.numMotores = numMotores;
    }

    public void setTremDePouso(int tremDePouso) {
        this.tremDePouso = tremDePouso;
    }

    public void setTremAberto(boolean tremAberto) {
        this.tremAberto = tremAberto;
    }

    public void setPassageiros(int passageiros) {
        this.passageiros = passageiros;
    }

}
