package interfaces;

import java.util.ArrayList;

import model.aereos.AviaoAgricola;

public interface IAviãoAgricola {

    public void criar(AviaoAgricola AviaoAgricola);

    public ArrayList<AviaoAgricola> listar();

    public AviaoAgricola pesquisar(int id);

    public void atualizar(int id, AviaoAgricola AviaoAgricola);

    public void deletar(int id);

}
