package list.OperacoesBasicas;

import java.util.ArrayList;
import java.util.List;

public class CarrinhoCompras {
    private List<Item> comprasLista;

    public CarrinhoCompras() {
        this.comprasLista = new ArrayList<>();
    }

    public void adicionarItem(String nome, double preco, int quantidade){
        comprasLista.add(new Item(nome, preco, quantidade));
    }

    public void removerItem(String nome){
        List<Item> itensParaRemover = new ArrayList<>();
        for(Item i: comprasLista){
            if(i.getNome().equalsIgnoreCase(nome)){
                itensParaRemover.add(i);
            }
        }
        comprasLista.removeAll(itensParaRemover);
    }

    public double calcularValorTotal(){
        double valorTotal = 0;
        if(!comprasLista.isEmpty()){
            for(Item i : comprasLista){
                double valorItem =i.getPreco() * i.getQuantidade();
                valorTotal += valorItem;
            }
            return valorTotal;
        }else
            throw new RuntimeException("A lista está vazia!");
    }

    public void exibirItens(){
        System.out.println(comprasLista);
    }


    public static void main(String[] args) {
        CarrinhoCompras comprasLista = new CarrinhoCompras();
        comprasLista.adicionarItem("Notebook", 6000, 1);
        comprasLista.adicionarItem("TV", 2000, 2);
        comprasLista.exibirItens();

        System.out.println(comprasLista.calcularValorTotal());
    }
}


