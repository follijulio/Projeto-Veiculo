package repository;

import java.util.ArrayList;

import interfaces.ICarro;
import model.terrestres.Carro;

public class CarroRepository implements ICarro {

    private ArrayList<Carro> carros;

    public CarroRepository() {
        this.carros = new ArrayList<Carro>();
    }

    @Override
    public void criar(Carro carro) {

        this.carros.add(carro);

    }

    @Override
    public ArrayList<Carro> listar() {

        return this.carros;

    }

    @Override
    public Carro pesquisar(int id) {
        for (int i = 0; i < this.carros.size(); i++) {
            if (this.carros.get(i).getId() == id) {
                return this.carros.get(i);
            }

        }

        return null;

    }

    @Override
    public void atualizar(int id, Carro carro) {
        for (int i = 0; i < this.carros.size(); i++) {
            if (this.carros.get(i).getId() == id) {
                this.carros.set(i, carro);
                break;

            }
        }
    }

    @Override
    public void deletar(int id) {
        for (int i = 0; i < this.carros.size(); i++) {
            if (this.carros.get(i).getId() == id) {
                this.carros.remove(i);
                break;

            }

        }

    }
    
}