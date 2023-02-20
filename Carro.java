package JAVA.projetos.SistemaDeVeiculos;

public class Carro extends Veiculo {
    public int portas;
    public int CapMala;
    public boolean tetoSolar;
    public Boolean malaAberta;


    public void abrirMala (){
        
    }

    public void fecharMala (){
        
    }

    public void darRe (){

    }



    public int getPortas() {
        return portas;
    }

    public int getCapMala() {
        return CapMala;
    }

    public boolean isTetoSolar() {
        return tetoSolar;
    }

    public Boolean getMalaAberta() {
        return malaAberta;
    }


    public void setPortas(int portas) {
        this.portas = portas;
    }

    public void setCapMala(int capMala) {
        CapMala = capMala;
    }

    public void setTetoSolar(boolean tetoSolar) {
        this.tetoSolar = tetoSolar;
    }

    public void setMalaAberta(Boolean malaAberta) {
        this.malaAberta = malaAberta;
    } 
    
}
