package JAVA.projetos.SistemaDeVeiculos;

public abstract class Veiculo {
    protected int id;
    protected String marca;
    protected String modelo;
    protected String pintura;
    protected int capacidadeTanque;
    protected Motor A;
    protected int passageiros;
    protected boolean ligado;
    public boolean emMovimento;

    // Metodos

    public boolean isEmMovimento() {
        return emMovimento;
    }

    public void setEmMovimento(Boolean emMovimento) {
        this.emMovimento = emMovimento;
    }

    public void ligar() {

    }

    public void desligar() {

    }

    public void acelerar() {

    }

    public void frear() {

    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public String getPintura() {
        return pintura;
    }

    public void setPintura(String pintura) {
        this.pintura = pintura;
    }

    public int getCapacidadeTanque() {
        return capacidadeTanque;
    }

    public void setCapacidadeTanque(int capacidadeTanque) {
        this.capacidadeTanque = capacidadeTanque;
    }

    public Motor getA() {
        return A;
    }

    public void setA(Motor a) {
        A = a;
    }

    public int getPassageiros() {
        return passageiros;
    }

    public void setPassageiros(int passageiros) {
        this.passageiros = passageiros;
    }

    public boolean isLigado() {
        return ligado;
    }

    public void setLigado(boolean ligado) {
        this.ligado = ligado;
    }

}
