package JAVA.projetos.SistemaDeVeiculos;

public class Carro extends VeiculoTerrestre {

    public boolean isEmMovimento() {

        return super.isEmMovimento();
    }

    public void setEmMovimento(Boolean emMovimento) {

        super.setEmMovimento(emMovimento);
    }

    public int portas;
    public int CapMala;
    public int CapAtualMala;
    public boolean tetoSolar;
    public Boolean malaAberta;

    public void abrirMala() {
        setMalaAberta(true);

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

    public int getPortas() {
        return portas;
    }

    public int getCapMala() {
        return CapMala;
    }

    public boolean isTetoSolar() {
        return tetoSolar;
    }

    public Boolean getMalaAberta() {
        return malaAberta;
    }

    public void setPortas(int portas) {
        this.portas = portas;
    }

    public void setCapMala(int capMala) {
        CapMala = capMala;
    }

    public void setTetoSolar(boolean tetoSolar) {
        this.tetoSolar = tetoSolar;
    }

    public void setMalaAberta(Boolean malaAberta) {
        this.malaAberta = malaAberta;
    }

    public int getCapAtualMala() {
        return CapAtualMala;
    }

    public void setCapAtualMala(int capAtualMala) {
        CapAtualMala = capAtualMala;
    }

    public int getRodas() {
        return super.getRodas();
    }

    public void setRodas(int rodas) {

        super.setRodas(rodas);
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

    public Motor getA() {

        return super.getA();
    }

    public int getCapacidadeTanque() {

        return super.getCapacidadeTanque();
    }

    public int getId() {

        return super.getId();
    }

    public String getMarca() {

        return super.getMarca();
    }

    public String getModelo() {
        return super.getModelo();
    }

    public int getPassageiros() {

        return super.getPassageiros();
    }

    public String getPintura() {

        return super.getPintura();
    }

    public boolean isLigado() {

        return super.isLigado();
    }

    public void ligar() {

        super.ligar();
    }

    public void setA(Motor a) {

        super.setA(a);
    }

    public void setCapacidadeTanque(int capacidadeTanque) {

        super.setCapacidadeTanque(capacidadeTanque);
    }

    public void setId(int id) {

        super.setId(id);
    }

    public void setLigado(boolean ligado) {

        super.setLigado(ligado);
    }

    public void setMarca(String marca) {

        super.setMarca(marca);
    }

    public void setModelo(String modelo) {

        super.setModelo(modelo);
    }

    public void setPassageiros(int passageiros) {
        super.setPassageiros(passageiros);
    }

    public void setPintura(String pintura) {
        super.setPintura(pintura);
    }

}
