import java.util.*;

public class Menu {

    static Scanner LStr = new Scanner(System.in);
    static Scanner LNum = new Scanner(System.in);

    public void menu() {
        int opcao;
        // criar, ler (listar e pesquisar), atualizar e deletar

        System.out.println("MENU");
        System.out.println("1 - adicionar um novo veiculo ");
        System.out.println("2 - procurar um veiculo no banco de dados");
        System.out.println("3 - Atualizar a situação de um veiculo do banco de dados");
        System.out.println("4 - Remover um veiculo");
        opcao = LNum.nextInt();
        switch (opcao) {
            case 1:

                adcVeiculo();

                break;

            case 2:

                procuraVeiculo();

                break;

            case 3:

                atualizarVeiculo();

                break;

            case 4:

                RemVeiculo();

                break;
        }

    }

    static public void adcVeiculo() {
        System.out.println("adcVeiculo");
    }

    static public void procuraVeiculo() {
        System.out.println("procuraVeiculo");
    }

    static public void atualizarVeiculo() {
        System.out.println("atualizarVeiculo");
    }

    static public void RemVeiculo() {
        System.out.println("RemVeiculo");
    }

}
