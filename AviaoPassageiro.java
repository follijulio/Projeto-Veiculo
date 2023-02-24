
public class AviaoPassageiro extends Aviao {

    private boolean tremAberto;

    // Metodos
    public void abrirTrem() {

    }

    public void fecharTrem() {

    }

    public void acelerar() {

        super.acelerar();
    }

    public void ligar() {

        super.ligar();
    }

    public void desligar() {

        super.desligar();
    }

    public void frear() {

        super.frear();
    }

    // Getters
    public Motor getMotor() {

        return super.getMotor();
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

    public void setPassageiros(int passageiros) {
        super.setPassageiros(passageiros);
    }

    public boolean isTremAberto() {
        return this.tremAberto;
    }

    // Setters

    public void setMotor(Motor motor) {

        super.setMotor(motor);
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

    public void setPintura(String pintura) {
        super.setPintura(pintura);
    }

    public void setTremAberto(boolean tremAberto) {
        this.tremAberto = tremAberto;
    }

}
