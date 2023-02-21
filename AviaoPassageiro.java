package JAVA.projetos.SistemaDeVeiculos;

public class AviaoPassageiro extends Aviao {

    public boolean tremAberto;
    public int passageiros;

    public void abrirTrem() {

    }

    public void fecharTrem() {

    }

    public boolean isTremAberto() {
        return tremAberto;
    }

    public void setTremAberto(boolean tremAberto) {
        this.tremAberto = tremAberto;
    }

    public void acelerar() {

        super.acelerar();
    }

    public void desligar() {

        super.desligar();
    }

    public void frear() {

        super.frear();
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
