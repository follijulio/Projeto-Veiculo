package repository;

import java.util.ArrayList;

import interfaces.IAviaoPassageiro;
import model.aereos.AviaoPassageiro;

public class AviaoPassageiroRepository implements IAviaoPassageiro {

    private ArrayList<AviaoPassageiro> aviaoPassageiros;

    @Override
    public void criar(AviaoPassageiro AviaoPassageiro) {
        this.aviaoPassageiros.add(AviaoPassageiro);
    }

    @Override
    public ArrayList<AviaoPassageiro> listar() {
        return this.aviaoPassageiros;

    }

    @Override
    public AviaoPassageiro pesquisar(int id) {
        for (int i = 0; i < this.aviaoPassageiros.size(); i++) {
            if (this.aviaoPassageiros.get(i).getId() == id) {
                return this.aviaoPassageiros.get(i);
            }

        }

        return null;
    }

    @Override
    public void atualizar(int id, AviaoPassageiro AviaoPassageiro) {
        for (int i = 0; i < this.aviaoPassageiros.size(); i++) {
            if (this.aviaoPassageiros.get(i).getId() == id) {
                this.aviaoPassageiros.set(i, AviaoPassageiro);
                break;

            }
        }

    }

    @Override
    public void deletar(int id) {
        for (int i = 0; i < this.aviaoPassageiros.size(); i++) {
            if (this.aviaoPassageiros.get(i).getId() == id) {
                this.aviaoPassageiros.remove(i);
                break;

            }

        }
    }

}
