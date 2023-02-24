package JAVA.projetos.SistemaDeVeiculos;

public class AviaoAgricola extends Aviao {

    private int capacidadeIrrigação;
    private boolean compartimentoAberto;
    private boolean tremAberto;

    // Metodos
    public void abrirCompatimento() {

    }

    public void fecharCompatimento() {

    }

    public void esvaziarCompartimento() {

    }

    public void encherCompartimento() {

    }

    public void abrirTrem() {
        System.out.println("O trem de pouso já está aberto");

    }

    public void fecharTrem() {
        System.out.println("IMPOSSIVEL FECHAR TREM DE POUSO");

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
    public int getCapacidadeIrrigação() {
        return this.capacidadeIrrigação;
    }

    public void setCapacidadeIrrigação(int capacidadeIrrigação) {
        this.capacidadeIrrigação = capacidadeIrrigação;
    }

    public boolean isCompartimentoAberto() {
        return this.compartimentoAberto;
    }

    public boolean isTremAberto() {
        return this.tremAberto;
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

    // Setters
    public void setMotor(Motor a) {

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

    public void setCompartimentoAberto(boolean compartimentoAberto) {
        this.compartimentoAberto = compartimentoAberto;
    }

    public void setTremAberto() {
        this.tremAberto = true;
    }

}
