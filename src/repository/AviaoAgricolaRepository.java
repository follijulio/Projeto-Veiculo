package repository;

import java.util.ArrayList;

import interfaces.IAviãoAgricola;
import model.aereos.AviaoAgricola;

public class AviaoAgricolaRepository implements IAviãoAgricola {

    private ArrayList<AviaoAgricola> aviaoAgricolas;

    public AviaoAgricolaRepository() {
        this.aviaoAgricolas = new ArrayList<AviaoAgricola>();
    }

    @Override
    public void criar(AviaoAgricola AviaoAgricola) {

        this.aviaoAgricolas.add(AviaoAgricola);

    }

    @Override
    public ArrayList<AviaoAgricola> listar() {

        return this.aviaoAgricolas;

    }

    @Override
    public AviaoAgricola pesquisar(int id) {
        for (int i = 0; i < this.aviaoAgricolas.size(); i++) {
            if (this.aviaoAgricolas.get(i).getId() == id) {
                return this.aviaoAgricolas.get(i);
            }

        }

        return null;

    }

    @Override
    public void atualizar(int id, AviaoAgricola AviaoAgricola) {
        for (int i = 0; i < this.aviaoAgricolas.size(); i++) {
            if (this.aviaoAgricolas.get(i).getId() == id) {
                this.aviaoAgricolas.set(i, AviaoAgricola);
                break;

            }
        }
    }

    @Override
    public void deletar(int id) {
        for (int i = 0; i < this.aviaoAgricolas.size(); i++) {
            if (this.aviaoAgricolas.get(i).getId() == id) {
                this.aviaoAgricolas.remove(i);
                break;

            }

        }

    }

}