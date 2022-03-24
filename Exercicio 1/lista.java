public class lista {
    private int prioridade;
    private String nome;
    private lista proximo;

    lista(){
        prioridade = 0;
        proximo = null;
        nome = "";
    }

    public int getPrioridade() {
        return prioridade;
    }

    public void setPrioridade(int prioridade) {
        this.prioridade = prioridade;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public lista getProximo() {
        return proximo;
    }
    public void setProximo(lista proximo) {
        this.proximo = proximo;
    }

}
