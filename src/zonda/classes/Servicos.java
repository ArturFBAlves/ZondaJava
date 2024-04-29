package zonda.classes;

import java.util.ArrayList;
import java.util.Iterator;

public class Servicos implements Iterable<Moto>{
    private final ArrayList<Moto> servicos;

    public Servicos() {
        this.servicos = new ArrayList<>();
    }

    public void add(Moto moto) {
        servicos.add(moto);
    }

    public boolean isEmpty() {
        return servicos.isEmpty();
    }

    public int size() {
        return servicos.size();
    }

    public Moto get(int index) {
        return servicos.get(index);
    }

    @Override
    public Iterator<Moto> iterator() {
        return servicos.iterator();
    }

    public double valorGanho() {
        double total = 0;
        for(Moto moto: servicos){
            total += moto.getPreco();
        }
        return total;
    }
}
