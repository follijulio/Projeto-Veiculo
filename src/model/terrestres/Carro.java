package src.model.terrestres;

public class Carro extends VeiculoTerrestre {

    private int portas;
    private int CapMala;
    private int CapAtualMala;
    private boolean tetoSolar;
    private boolean tetoAberto;
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

    public void abrirTetoSolar() {
        if (isTetoSolar()) {
            if (isLigado()) {
                if (isTetoAberto()) {
                    System.out.println("O teto solar já está aberto");
                } else {
                    System.out.println("Abrindo teto solar");
                    setTetoAberto(true);
                }
            } else {
                System.out.println("O carro está desligado, assim sendo, não pode abrir o teto solar");
            }
        } else {

            System.out.println("O carro não tem teto solar, por isso fica impossivel abrir o teto solar");
        }

    }

    public void fecharTetoSolar() {
        if (isTetoSolar()) {
            if (isLigado()) {
                if (isTetoAberto() == false) {
                    System.out.println("O teto solar já está fechado");
                } else {
                    System.out.println("Fechando teto solar");
                    setTetoAberto(false);
                }
            } else {
                System.out.println("O carro está desligado, assim sendo, não pode fechar o teto solar");
            }
        } else {

            System.out.println("O carro não tem teto solar, por isso fica impossivel fechar o teto solar");
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

    public boolean isTetoAberto() {
        return tetoAberto;
    }

    public void setTetoAberto(boolean tetoAberto) {
        this.tetoAberto = tetoAberto;
    }
}
