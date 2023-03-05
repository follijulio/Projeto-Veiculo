package src.model.aereos;

public class AviaoAgricola extends Aviao {

    private int capacidadeIrrigação;
    private boolean compartimentoAberto;
    private int cargaComp;

    // Metodos
    public void abrirCompatimento() {
        if (isCompartimentoAberto()) {
            System.out.println("Compartimento já estava aberto.");
        } else {
            System.out.println("Abrindo compartimento...");
            setCompartimentoAberto(true);
        }

    }

    public void fecharCompatimento() {
        if (isCompartimentoAberto()) {
            System.out.println("Fechando compartimento");
            setCompartimentoAberto(false);
        } else {
            System.out.println("O compartimento já está fechado");
        }

    }

    public void esvaziarCompartimento() {
        if (getCargaComp() <= 0) {
            System.out.println("O compartimento já está vazio");

        } else {
            if (isCompartimentoAberto()) {
                System.out.println("esvaziando compartimento");
                setCargaComp(0);
            } else {
                System.out.println("O compartimento está fechado, assim sendo, não pode ser esvaziado");

            }

        }

    }

    public void encherCompartimento() {
        int auxiliar;
        if (getCargaComp() >= 100) {
            System.out.println("O compartimento já está cheio");

        } else {
            if (isCompartimentoAberto()) {
                System.out.println("enchendo compartimento");

                System.out.printf("ele está com %d'%' da sua carga", getCargaComp());
                auxiliar = 100 - getCargaComp();
                System.out.printf("O compartimento enchera %d'%' ", auxiliar);

                setCargaComp(100);
            } else {
                System.out.println("O compartimento está fechado, assim sendo, não pode ser enchido");

            }

        }

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

    // Setters
    public void setCompartimentoAberto(boolean compartimentoAberto) {
        this.compartimentoAberto = compartimentoAberto;
    }

    public int getCargaComp() {
        return this.cargaComp;
    }

    public void setCargaComp(int cargaComp) {
        this.cargaComp = cargaComp;
    }

}
