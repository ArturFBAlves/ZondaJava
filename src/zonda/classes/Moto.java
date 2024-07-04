package zonda.classes;

import java.util.Scanner;

public class Moto {
    String modelo;
    String placa;
    Scanner leitura = new Scanner(System.in);

//Gerador da classe moto
    public  Moto() {
        System.out.println("Qual é o modelo do veiculo: ");
        setModelo(leitura.nextLine());
        System.out.println("Qual é a placa do veiculo:");
        setPlaca(leitura.next());
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public void setPlaca(String placa) {
        this.placa = placa;
    }

    public String getModelo() {
        return modelo;
    }


    public String getPlaca() {
        return this.placa;
    }

    @Override
    public String toString() {
        return """
                Modelo: %s
                Placa: %s
                """.formatted(modelo,placa);
    }
}

