package JAVA.projetos.SistemaDeVeiculos;

public class Carro extends VeiculoTerrestre {

    private int portas;
    private int CapMala;
    private int CapAtualMala;
    private boolean tetoSolar;
    private Boolean malaAberta;

    public void abrirMala() {
        setMalaAberta(true);

    }

    public void acelerar() {
        if (isLigado()) {
            super.acelerar();
            System.out.println("ACELERANDOOOO");
            setEmMovimento(true);
        } else {
            System.out.println("IMPOSSIVEL ACELERAR, O carro está desligado");

        }

    }

    public void ligar() {

        super.ligar();
    }

    public void desligar() {
        if (isLigado()) {
            super.desligar();
        } else {
            System.out.println("IMPOSSIVEL DESLIGAR, o carro já está desligado");
        }

    }

    public void frear() {
        if (isEmMovimento()) {
            System.out.println("FREANDOOOOO");
            super.frear();

        } else {
            System.out.println("IMPOSSIVEL FREAR, o Carro não está em movimento");
        }

    }

    public void pararCarro() {
        if (isEmMovimento()) {
            frear();
            setEmMovimento(false);
            System.out.println("O carro parou");
        }
    }

    public void fecharMala() {
        if (this.CapAtualMala > CapMala) {
            System.out.println("IMPOSSIVEL fechar mala, ela está sobrecarregada.");
        } else {
            setMalaAberta(false);
        }

    }

    public void darRe() {
        if (isLigado()) {
            if (getMalaAberta()) {
                System.out.println("IMPOSSIVEL DAR RÉ, A mala está aberta");
            } else {
                System.out.println("Dando ré\nBI BI BI BI BI");
            }
        } else {
            System.out.println("IMPOSSIVEL DAR RÉ, O carro está desligado");
        }
    }

    // Getters
    public int getPortas() {
        return this.portas;
    }

    public int getCapMala() {
        return this.CapMala;
    }

    public boolean isTetoSolar() {
        return this.tetoSolar;
    }

    public int getCapAtualMala() {
        return this.CapAtualMala;
    }

    public Boolean getMalaAberta() {
        return this.malaAberta;
    }

    public void setMalaAberta(Boolean malaAberta) {
        this.malaAberta = malaAberta;
    }

    public void setPortas(int portas) {
        this.portas = portas;
    }

    public void setCapMala(int capMala) {
        this.CapMala = capMala;
    }

    public void setTetoSolar(boolean tetoSolar) {
        this.tetoSolar = tetoSolar;
    }

    public void setCapAtualMala(int capAtualMala) {
        this.CapAtualMala = capAtualMala;
    }
}
