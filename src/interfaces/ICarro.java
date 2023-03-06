package interfaces;

import java.util.ArrayList;

import model.terrestres.Carro;



public interface ICarro {

    public void criar(Carro carro);

    public ArrayList<Carro> listar();

    public Carro pesquisar(int id);

    public void atualizar(int id, Carro carro);

    public void deletar(int id);

}
