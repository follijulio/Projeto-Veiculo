package interfaces;

import java.util.ArrayList;

import model.aereos.AviaoPassageiro;;

public interface IAviaoPassageiro {
    
    public void criar(AviaoPassageiro AviaoPassageiro);

    public ArrayList<AviaoPassageiro> listar();

    public AviaoPassageiro pesquisar(int id);

    public void atualizar(int id, AviaoPassageiro AviaoPassageiro);

    public void deletar(int id);

    
}
