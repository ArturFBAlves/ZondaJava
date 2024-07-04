import zonda.classes.Moto;
import zonda.classes.Servicos;

import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner leitura = new Scanner(System.in);
        ArrayList<Servicos> listaDeMotos = new ArrayList<Servicos>();
        int opcaoMenu = 0;

        // Loop do menu principal do serviço
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
            try {
                opcaoMenu = Integer.parseInt(leitura.nextLine()); // Usando nextLine() e parseInt()
            } catch (NumberFormatException e) {
                System.out.println("Opção inválida. Por favor, digite um número entre 1 e 7.");
                continue; // Volta ao início do loop para pedir a entrada novamente
            }

            switch (opcaoMenu) {
                case 1:
                    // Cria o objeto moto e adiciona à lista
                    Moto moto = new Moto();
                    System.out.println("Qual é o defeito: ");
                    String defeito = leitura.nextLine();
                    Servicos servicos = new Servicos(moto, defeito);
                    listaDeMotos.add(servicos);
                    break;
                case 2:
                    System.out.println("Digite a placa do veículo: ");
                    String placa = leitura.nextLine();
                    boolean found = false;
                    for (Servicos servico : listaDeMotos) {
                        if (placa.equals(servico.getMoto().getPlaca())) {
                            servico.setStatus(1);
                            found = true;
                            break;
                        }
                    }
                    if (!found) {
                        System.out.println("Serviço não encontrado.");
                    }
                    break;
                case 3:
                    System.out.println("Digite a placa do veículo: ");
                    placa = leitura.nextLine();
                    found = false;
                    for (Servicos servico : listaDeMotos) {
                        if (placa.equals(servico.getMoto().getPlaca())) {
                            servico.setStatus(2);
                            found = true;
                            break;
                        }
                    }
                    if (!found) {
                        System.out.println("Serviço não encontrado.");
                    }
                    break;
                case 4:
                    if (listaDeMotos.isEmpty())
                        System.out.println("Não há serviço registrado no sistema.");
                    else {
                        for (Servicos veiculo : listaDeMotos) {
                            System.out.println(veiculo);
                        }
                    }
                    break;
                case 5:
                    System.out.println("Digite a placa do veículo: ");
                    placa = leitura.nextLine();
                    found = false;
                    for (Servicos servico : listaDeMotos) {
                        if (placa.equals(servico.getMoto().getPlaca())) {
                            servico.setStatus(3);
                            System.out.println("Qual foi o valor do serviço: ");
                            try {
                                float preco = Float.parseFloat(leitura.nextLine());
                                servico.setPreco(preco);
                            } catch (NumberFormatException e) {
                                System.out.println("Valor inválido. Por favor, digite um número.");
                            }
                            found = true;
                            break;
                        }
                    }
                    if (!found) {
                        System.out.println("Serviço não encontrado.");
                    }
                    break;
                case 6:
                    float total = 0;
                    for (Servicos servico : listaDeMotos) {
                        total += servico.getPreco();
                    }
                    System.out.printf("Os ganhos do dia foram de R$ %.2f%n", total);
                    break;
                case 7:
                    System.out.println("Sistema encerrado.");
                    break;
                default:
                    System.out.println("Opção inválida. Por favor, digite um número entre 1 e 7.");
                    break;
            }
        } while (opcaoMenu != 7);
    }
}
