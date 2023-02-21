package JAVA.projetos.SistemaDeVeiculos;

public abstract class Aviao extends Veiculo {

    protected float envergaduraAsa;
    protected int numMotores;
    protected int tremDePouso;
    protected boolean tremAberto;

    public void pousar() {
        if (isTremAberto()) {
            System.out.println("Pousando");
        } else {
            System.out.println("IMPOSSIVEL POUSAR, O trem de pouso está fechado");
        }

    }

    public void decolar() {

    }

    public float getEnvergaduraAsa() {
        return envergaduraAsa;
    }

    public void setEnvergaduraAsa(float envergaduraAsa) {
        this.envergaduraAsa = envergaduraAsa;
    }

    public int getNumMotores() {
        return numMotores;
    }

    public void setNumMotores(int numMotores) {
        this.numMotores = numMotores;
    }

    public int getTremDePouso() {
        return tremDePouso;
    }

    public void setTremDePouso(int tremDePouso) {
        this.tremDePouso = tremDePouso;
    }

    public boolean isTremAberto() {
        return tremAberto;
    }

    public void setTremAberto(boolean tremAberto) {
        this.tremAberto = tremAberto;
    }

}
