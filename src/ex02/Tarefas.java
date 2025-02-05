package ex02;

public class Tarefas {

    public String tituloTarefa;
    public String descricaoTarefa;
    public String statusTarefa;

    public Tarefas(String tituloTarefa, String descricaoTarefa) {
        this.tituloTarefa = tituloTarefa;
        this.descricaoTarefa = descricaoTarefa;
        this.statusTarefa = "Pendente";
    }

    public void concluirTarefa() {
        statusTarefa = "Concluída";
    }

    public void exibirInformacoes() {
        System.out.println("Título: " + tituloTarefa);
        System.out.println("Descrição: " + descricaoTarefa);
        System.out.println("Status: " + statusTarefa);
    }
}




