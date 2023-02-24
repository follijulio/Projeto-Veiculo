
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

}
