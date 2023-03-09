package  model.terrestres;

public class Moto extends VeiculoTerrestre {

    private boolean embreagem;

    public void darGrau() {
        System.out.println("Dando grau HANDANDAM");

    }

    public void acelerar() {
        System.out.println("Acelerando\nVRUMMMMMMMMMM");
        super.acelerar();
    }

    public boolean isEmbreagem() {
        return this.embreagem;
    }

    public void setEmbreagem(boolean embreagem) {
        this.embreagem = embreagem;
    }

}
