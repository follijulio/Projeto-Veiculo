package JAVA.projetos.SistemaDeVeiculos;

public abstract class Veiculo {
    protected int id;
    protected String marca;
    protected String modelo;
    protected String pintura;
    protected int capacidadeTanque;
    protected Motor A;

    // Metodos

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

}
