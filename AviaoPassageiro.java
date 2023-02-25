public class AviaoPassageiro extends Aviao {

    private boolean tremAberto;
    private int numTrem;

    // Metodos
    public void abrirTrem() {
        if (isEmVoo()) {
            if (isTremAberto()) {
                System.out.println("O trem de pouso já está aberto");
            } else {
                System.out.println("Abrindo compartimento...");
                setTremAberto(true);
            }

        }

    }

    public void fecharTrem() {
        if (isEmVoo()) {
            if (isTremAberto() == false) {
                System.out.println("O trem de pouso já está fechado");
            } else {
                System.out.println("Fechando trem de pouso");
                setTremAberto(true);
            }

        } else {
            System.out.println("Impossivel fechar trem de pouso, o avião não está em vou");
        }
    }

    public boolean isTremAberto() {
        return this.tremAberto;
    }

    public void setTremAberto(boolean tremAberto) {
        this.tremAberto = tremAberto;
    }

    public int getNumTrem() {
        return numTrem;
    }

    public void setNumTrem(int numTrem) {
        this.numTrem = numTrem;
    }

}
