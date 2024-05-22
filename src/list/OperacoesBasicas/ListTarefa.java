package list.OperacoesBasicas;

import java.util.ArrayList;
import java.util.List;

public class ListTarefa {
    //atributo
    private List<Tarefa> tarefaList;

    public ListTarefa() {
        this.tarefaList = new ArrayList<>();
    }

    public void adicionarTarefa(String descricao) {
        tarefaList.add(new Tarefa(descricao));
    }

    public void removerTarefa(String descricao) {
        List<Tarefa> tarefasParaRemover = new ArrayList<>();
        for(Tarefa t: tarefaList){
            if(t.getDescricao().equalsIgnoreCase(descricao)){
                tarefasParaRemover.add(t);
            }
        }
        tarefaList.removeAll(tarefasParaRemover);
    }

    public int obterNumeroTotalTarefas(){
        return tarefaList.size();
    }

    public void obterDescricoesTarefas(){
        System.out.println(tarefaList);
    }

    public static void main(String[] args) {
        ListTarefa listTarefa = new ListTarefa();
        System.out.println(listTarefa.obterNumeroTotalTarefas());

        listTarefa.adicionarTarefa("Tarefa 1");
        listTarefa.adicionarTarefa("Tarefa 1");
        listTarefa.adicionarTarefa("Tarefa 2");
        System.out.println(listTarefa.obterNumeroTotalTarefas());

        listTarefa.removerTarefa("Tarefa 1");
        System.out.println(listTarefa.obterNumeroTotalTarefas());

        listTarefa.obterDescricoesTarefas();
    }
}
