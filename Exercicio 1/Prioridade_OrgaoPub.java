public class Prioridade_OrgaoPub {
    lista primeiro;
    int tamanho = 0;

    Prioridade_OrgaoPub(){
        primeiro = null;
    }

    public void inserir(String nome, int valor){

            lista novo = new lista();
            lista aux = primeiro;
            if(primeiro == null){
                novo.setNome(nome);
                novo.setPrioridade(valor);
                novo.setProximo(null);
                primeiro = novo;
            }else{                
                while (aux != null) {
                    if (primeiro.getPrioridade() <= valor) {
                        novo.setNome(nome);
                        novo.setPrioridade(valor);
                        novo.setProximo(aux);
                        primeiro = novo;	    			
                        break;	       
                    }else{
                        novo.setNome(nome);
                        novo.setPrioridade(valor);
                        primeiro.setProximo(aux.getProximo());
                        aux.setProximo(novo); 			
                        break;
                    }   
                }
                aux = aux.getProximo();
            }
            tamanho++;
    }

    public void imprimir(){
        lista listar = primeiro;
        System.out.println("Bem-vindo ao Sistema Público Brasileiro");
       
        System.out.println(listar.getNome() + " - " + listar.getPrioridade());
     
    }

    public void total(){
        System.out.println("Número de Pessoas: " + tamanho);
    }

    public void remover(){
        lista aux = primeiro;
        lista removido = primeiro;
       
       
        aux = aux.getProximo();
        primeiro = aux;
        primeiro.setProximo(aux.getProximo());
        tamanho--;
              
 
        System.out.println("Eliminado a pessoa " + removido.getNome());
       }
    

    public static void main(String[] args) {
        Prioridade_OrgaoPub add = new Prioridade_OrgaoPub();
        add.inserir("Juana", 4);
        add.inserir("Juan", 2);
        add.inserir("Jota", 6);
        add.imprimir();
        add.total();
        add.remover();
        add.imprimir();
        add.total();
        add.inserir("Jilmar", 5);
        add.imprimir();
        add.total();


    }
}
