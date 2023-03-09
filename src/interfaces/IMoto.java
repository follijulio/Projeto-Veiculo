package interfaces;

import java.util.ArrayList;

import model.terrestres.Moto;

public interface IMoto {



    public void criar(Moto moto);

    public ArrayList<Moto> listar();

    public Moto pesquisar(int id);

    public void atualizar(int id, Moto moto);

    public void deletar(int id);



}
