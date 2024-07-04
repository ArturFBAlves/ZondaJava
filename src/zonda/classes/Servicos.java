package zonda.classes;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.Scanner;

public class Servicos{
    String defeito;
    int status;         //0 - não iniciado / 1 - iniciado / 2 - cancelado / 3 - concluido
    float preco;
    Moto moto;
    Scanner leitura = new Scanner(System.in);

    public Servicos(Moto moto,String defeito) {
        this.defeito = defeito;
        this.moto = moto;
        this.status = 0;
    }

    public void setDefeito(String defeito) {
        this.defeito = defeito;
    }

    public void setPreco(float preco) {
        this.preco = preco;
    }

    public void setStatus(int status) {
        this.status = status;
    }

    public Moto getMoto() {
        return moto;
    }

    public float getPreco() {
        return preco;
    }

    @Override
    public String toString() {
        return
            ("""
                Defeito: %s
                Status: %d
                Preço: %.2f
                %s
                """).formatted(defeito,status,preco,moto);


    }
}
