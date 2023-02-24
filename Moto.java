
public class Moto extends VeiculoTerrestre {

    private boolean embreagem;

    public void darGrau() {
        System.out.println("RANDANDANDA\nOLHA A QUEDA MININUUUUU");

    }

    public boolean isEmbreagem() {
        return this.embreagem;
    }

    public void setEmbreagem(boolean embreagem) {
        this.embreagem = embreagem;
    }

    public void acelerar() {
        System.out.println("Acelerando\nVRUMMMMMMMMMM");
        super.acelerar();
    }

    public void desligar() {

        super.desligar();
    }

    public void frear() {

        super.frear();
    }

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

    public void ligar() {

        super.ligar();
    }

    public void setA(Motor a) {

        super.setMotor(a);
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
