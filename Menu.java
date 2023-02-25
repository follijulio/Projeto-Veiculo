import java.util.*;

public class Menu {

    static Scanner LNum = new Scanner(System.in);
    static Scanner LStr = new Scanner(System.in);

    public void menu() {

        int opcao;

        System.out.println("|  _ - °  ° - _    M   E  N   U   _ - °  ° - _  |");
        System.out.println("| _ - ° 1  -  ADICIONAR UM VEICULO ° - _ |");
        System.out.println("| _ - ° 2  -  PESQUISAR UM VEICULO ° - _ |");
        System.out.println("| _ - ° 3  -  ATUALIZAR UM VEICULO ° - _ |");
        System.out.println("| _ - ° 4  -  REMOVER UM VEICULO ° - _ |");
        System.out.println("| _ - ° 5  -  SAIR DO APP ° - _|");
        opcao = LNum.nextInt();

        switch (opcao) {

            case 1:

                adicionarNovoVeiculo();

                break;

            case 2:

                pesquisarVeiculo();

                break;

            case 3:

                atualizarVeiculo();

                break;

            case 4:

                removerVeiculo();

                break;

            case 5:
                System.exit(0);
                break;

            default:
                this.menu();
                break;

        }

    }

    private void adicionarNovoVeiculo() {
        System.out.println("1 (teste)");



        this.menu();
    }

    private void pesquisarVeiculo() {
        System.out.println("2 (teste)");



        this.menu();
    }

    private void atualizarVeiculo() {
        System.out.println("3 (teste)");



        this.menu();
    }

    private void removerVeiculo() {
        System.out.println("4 (teste)");



        this.menu();
    }
    
}
