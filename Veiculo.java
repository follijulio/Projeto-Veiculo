package JAVA.projetos.SistemaDeVeiculos;

public abstract class Veiculo {
    private int id;
    private String marca;
    private String modelo;
    private String pintura;
    private int capacidadeTanque;
    private Motor motor;
    private int passageiros;
    private boolean ligado;
    private boolean emMovimento;

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

    public Motor getMotor() {
        return motor;
    }

    public void setMotor(Motor motor) {
        this.motor = motor;
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
