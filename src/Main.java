import zonda.classes.Moto;

import java.util.ArrayList;
import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        Scanner leitura = new Scanner(System.in);
        ArrayList<Moto> listaDeMotos = new ArrayList<>();
        int opcaoMenu = 0;

        //Loop do menu principal do serviço
        do {
            String mensagemMenu = """
                    >>>>>>Motos Zonda<<<<<<
                    1 - Solicitar serviço
                    2 - Iniciar serviço
                    3 - Remover solicitação
                    4 - Consultar solicitações
                    5 - Concluir serviços
                    6 - Encerrar expediente
                    7 - Sair
                    """;
            System.out.println(mensagemMenu);
            System.out.println("Digite a sua opção: ");
            opcaoMenu = leitura.nextInt();

            switch (opcaoMenu) {
                case 1:
                    //Cria o objeto moto e adiciona a lista
                    Moto moto = new Moto();
                    listaDeMotos.add(moto);
                    break;
                case 2:
                    //iniciarServico();
                    System.out.println("Qual é a placa: ");
                    String busca = leitura.next();

                    break;
                case 3:
                    //removerSolicitacao();
                    break;
                case 4:
                    //consultarSolicitacoes();
                    break;
                case 5:
                    //concluirServico();
                    break;
                case 6:
                    //encerrarExpediente();
                    break;
            }
        } while (opcaoMenu != 7);
        System.out.println(listaDeMotos);

    }
}