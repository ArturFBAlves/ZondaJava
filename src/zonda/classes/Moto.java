package zonda.classes;

import java.util.Scanner;

public class Moto extends Servicos{
    String modelo;
    String placa;
    String defeito;
    int status;         //0 - não iniciado / 1 - iniciado / 2 - cancelado / 3 - concluido
    float preco;
    Scanner leitura = new Scanner(System.in);

//Gerador da classe moto
    public  Moto() {
        System.out.println("Qual é o modelo do veiculo: ");
        setModelo(leitura.next());
        System.out.println("Qual é a placa do veiculo:");
        setPlaca(leitura.next());
        System.out.println("Qual é o defeito do veiculo:");
        setDefeito(leitura.next());
        setStatus(0);
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public void setPlaca(String placa) {
        this.placa = placa;
    }

    public void setDefeito(String defeito) {
        this.defeito = defeito;
    }

    public void setStatus(int status) {
        this.status = status;
    }

    public void setPreco() {
        System.out.println("Qual é o valor do serviço: ");
        this.preco = leitura.nextFloat();
    }

    public String getModelo() {
        return modelo;
    }

    public String getPlaca() {
        return placa;
    }

    public String getDefeito() {
        return defeito;
    }

    public int getStatus() {
        return status;
    }

    public float getPreco() {
        return preco;
    }

    @Override
    public String toString() {
        return """
                (Modelo: %s
                Placa: %s
                Defeito: %s
                Status: %d
                Preço: %.2f)""".formatted(modelo,placa,defeito,status,preco);
    }
}

