import zonda.classes.Moto;
import zonda.classes.Servicos;


import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        Scanner leitura = new Scanner(System.in);
        Servicos listaDeMotos = new Servicos();
        int opcaoMenu;
        String busca;
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
                    busca = leitura.next();
                    //compara a placa da busca com as presentes na listaDeMotos
                    for (int i = 0; i < listaDeMotos.size(); i++) {
                        if (listaDeMotos.get(i).getPlaca().equals(busca)) {
                            listaDeMotos.get(i).setStatus(1);
                        }else{
                            System.out.println("Essa moto não esta presente no sistema.");
                        }
                    }
                    break;
                case 3:
                    //removerSolicitacao();
                    System.out.println("Qual é a placa: ");
                    busca = leitura.next();
                    //compara a placa da busca com as presentes na listaDeMotos
                    for (int i = 0; i < listaDeMotos.size(); i++) {
                        if (listaDeMotos.get(i).getPlaca().equals(busca)) {
                            listaDeMotos.get(i).setStatus(2);
                        }else{
                            System.out.println("Essa moto não esta presente no sistema.");
                        }
                    }
                    break;
                case 4:
                    //consultarSolicitacoes();
                    if(listaDeMotos.isEmpty())
                        System.out.println("Não há serviço registrado no sistema.");
                    else{
                        for(Moto veiculo:  listaDeMotos ) {
                            System.out.println(veiculo);
                        }
                    }
                    break;
                case 5:
                    //concluirServico();
                    boolean achou = false;
                    System.out.println("Qual é a placa: ");
                    busca = leitura.next();
                    //compara a placa da busca com as presentes na listaDeMotos
                    for (int i = 0; i < listaDeMotos.size(); i++) {
                        if (listaDeMotos.get(i).getPlaca().equals(busca)) {
                            listaDeMotos.get(i).setStatus(3);
                            listaDeMotos.get(i).setPreco();
                            achou = true;
                            break;
                        }
                    }
                    if(!achou) System.out.println("O veículo não esta no sistema.");

                    break;
                case 6:
                    //encerrarExpediente();
                    System.out.println("O total ganho foi de: R$" + listaDeMotos.valorGanho());
                    break;
            }
        } while (opcaoMenu != 7);


    }
}