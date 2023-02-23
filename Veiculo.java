package JAVA.projetos.SistemaDeVeiculos;

public abstract class Veiculo {
    private int id;
    private String marca;
    private String modelo;
    private String pintura;
    private int capacidadeTanque;
    private int cargaTanquePor;
    private Motor motor;
    private int passageiros;
    private boolean ligado;
    private boolean emMovimento;
    private float velociadade;
    private float velociadadeMax;

    // Metodos

    public void ligar() {
        if (isLigado() == false) {

            if (getCargaTanquePor() <= 0) {

                System.out.println(
                        "Infelizmente o veiculo está sem combustivel, assim sendo, não pode ser ligado");

            } else {
                System.out.println("Ligando...");
                setLigado(true);
            }
        } else {
            System.out.println("O veiculo já está ligado");

        }

    }

    public void desligar() {
        if (isLigado()) {
            if (isEmMovimento()) {
                System.out.println(
                        "Infelizmente o veiculo está em movimento, assim sendo, não pode ser desligado");

            } else {
                System.out.println("Desligando...");
                setLigado(false);
            }
        } else {
            System.out.println("O veiculo já está desligadp");

        }

    }

    public void acelerar() {
        if (isLigado()) {
            System.out.println("Acelerando");
            if (getVelociadade() < getVelociadadeMax()) {
                setVelociadade(getVelociadade() + 15);
            } else {
                System.out.println("O veiculo já está na sua velocidade maxima");
            }

        } else {
            System.out.println("O veiculo está desligado");
        }

    }

    public void frear() {
        if (isEmMovimento()) {
            System.out.println("Freando...");
            setVelociadade(getVelociadade() - 50);
        } else {

            System.out.println("O veiculo não está em movimento");
        }

    }

    private void defVelocidade() {

        setTelociadadeMax(motor.getPotencia() * 0.656);

    }

    // Getters
    public int getId() {
        return id;
    }

    public String getMarca() {
        return marca;
    }

    public String getModelo() {
        return modelo;
    }

    public String getPintura() {
        return pintura;
    }

    public int getCapacidadeTanque() {
        return capacidadeTanque;
    }

    public Motor getMotor() {
        return motor;
    }

    public int getPassageiros() {
        return passageiros;
    }

    public boolean isLigado() {
        return ligado;
    }

    public boolean isEmMovimento() {
        return emMovimento;
    }

    // Setters

    public void setLigado(boolean ligado) {
        this.ligado = ligado;
    }

    public void setPassageiros(int passageiros) {
        this.passageiros = passageiros;
    }

    public void setMotor(Motor motor) {
        this.motor = motor;
    }

    public void setCapacidadeTanque(int capacidadeTanque) {
        this.capacidadeTanque = capacidadeTanque;
    }

    public void setPintura(String pintura) {
        this.pintura = pintura;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public void setId(int id) {
        this.id = id;
    }

    public void setEmMovimento(Boolean emMovimento) {
        this.emMovimento = emMovimento;
    }

    public int getCargaTanquePor() {
        return cargaTanquePor;
    }

    public void setCargaTanquePor(int cargaTanquePor) {
        this.cargaTanquePor = cargaTanquePor;
    }

    public void setEmMovimento(boolean emMovimento) {
        this.emMovimento = emMovimento;
    }

    public int getVelociadade() {
        return velociadade;
    }

    public void setVelociadade(int velociadade) {
        this.velociadade = velociadade;
    }

    public void setVelociadade(float velociadade) {

        this.velociadade = velociadade;
    }

    public float getVelociadadeMax() {
        return velociadadeMax;
    }

    public void setVelociadadeMax(float velociadadeMax) {
        this.velociadadeMax = velociadadeMax;
    }
}
