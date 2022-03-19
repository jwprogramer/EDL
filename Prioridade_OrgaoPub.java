public class Prioridade_OrgaoPub {
    lista primeiro;
    int tamanho = 0;
    int i = 0, x = 0;

    Prioridade_OrgaoPub(){
        primeiro = null;
    }

    public void inserir(String nome, int valor){
            
            lista aux = primeiro;  //5,2,6,1   6,5,2 6/1 5/1 2/1
            lista novo = new lista();
            if(primeiro == null){
                novo.setNome(nome);
                novo.setPrioridade(valor);
                novo.setProximo(null);
                primeiro = novo;
            }else{
                while(i <= tamanho){
                    if(primeiro.getPrioridade() >= valor){
                            novo.setNome(nome);
                            novo.setPrioridade(valor);
                        while(x <= tamanho){
                            while(aux.getProximo() == null){
                                novo.setProximo(null);
                                primeiro.setProximo(novo);
                            }    
                            aux = aux.getProximo();
                            x++;
                        }
                    }else{
                        while(aux.getProximo() != null){
                                novo.setNome(nome);
                                novo.setPrioridade(valor);
                            if(primeiro.getPrioridade() >= valor){
                                novo.setProximo(aux.getProximo());
                                aux.setProximo(novo);
                            }else{
                                novo.setProximo(primeiro);
                                primeiro = novo;
                            }
                                aux = aux.getProximo();
                        }
                    }
                    i++;    
                }
                tamanho++;
            }    
           
        
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
        lista nome = primeiro;

       
        aux = aux.getProximo();
        primeiro = aux;
        primeiro.setProximo(aux.getProximo());
        tamanho--;
              
 
        System.out.println("Eliminado a pessoa " + nome);
       }
    

    public static void main(String[] args) {
        Prioridade_OrgaoPub add = new Prioridade_OrgaoPub();
        add.inserir("João", 5);
        add.inserir("Juan", 2);
        add.inserir("Jota", 6);
        add.inserir("Jilmar", 1);
        add.imprimir();
        add.total();


    }
}
