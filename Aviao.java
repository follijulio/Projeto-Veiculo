package JAVA.projetos.SistemaDeVeiculos;

public abstract class Aviao extends Veiculo {

    private float envergaduraAsa;
    private int numMotores;
    private int tremDePouso;
    private boolean tremAberto;
    private int passageiros;
    private boolean emVoo;

    // Metodos
    public void pousar() {
        if (isEmVoo()) {
            if (isTremAberto()) {
                System.out.println("Pousando...");
                setEmVoo(false);
                setEmMovimento(false);
            } else {
                System.out.println("IMPOSSIVEL POUSAR, O trem de pouso está fechado");
            }
        } else {
            System.out.println("O avião está no chão... assim sendo não pode pousar");

        }
    }

    public void decolar() {
        if (isEmVoo()) {
            System.out.println("O avião já está em voo...");
        } else {
            System.out.println("Decolando...");
            setEmVoo(true);
            setEmMovimento(true);
        }

    }

    // Getters
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

    public boolean isEmVoo() {
        return emVoo;
    }

    // Setters
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

    public void setEmVoo(boolean emVoo) {
        this.emVoo = emVoo;
    }

}
