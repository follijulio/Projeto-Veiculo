
package repository;

import java.util.ArrayList;

import interfaces.IMoto;

import model.terrestres.Moto;

public class MotoRepository implements IMoto {

    private ArrayList<Moto> motos;

    public MotoRepository() {
        this.motos = new ArrayList<Moto>();
    }

    @Override
    public void criar(Moto moto) {

        this.motos.add(moto);

    }

    @Override
    public ArrayList<Moto> listar() {

        return this.motos;

    }

    @Override
    public Moto pesquisar(int id) {
        for (int i = 0; i < this.motos.size(); i++) {
            if (this.motos.get(i).getId() == id) {
                return this.motos.get(i);
            }

        }

        return null;

    }

    @Override
    public void atualizar(int id, Moto Moto) {
        for (int i = 0; i < this.motos.size(); i++) {
            if (this.motos.get(i).getId() == id) {
                this.motos.set(i, Moto);
                break;

            }
        }
    }

    @Override
    public void deletar(int id) {
        for (int i = 0; i < this.motos.size(); i++) {
            if (this.motos.get(i).getId() == id) {
                this.motos.remove(i);
                break;

            }

        }

    }

}