public class lista {
    private int telefone;
    private String nome;
    private lista proximo;

    lista(){
        telefone = 0;
        proximo = null;
        nome = "";
    }

    public int getTelefone() {
        return telefone;
    }

    public void setTelefone(int telefone) {
        this.telefone = telefone;
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
