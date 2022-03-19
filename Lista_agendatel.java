public class Lista_agendatel {
    lista primeiro;
    int tamanho = 0;

    Lista_agendatel(){
        primeiro = null;
    }

    public void inserir(String nome, int telefone){
    
            lista aux = primeiro; 
            lista novo = new lista();
            if(primeiro == null){
                novo.setNome(nome);
                novo.setTelefone(telefone);
                novo.setProximo(null);
                primeiro = novo;
            }else{
                novo.setNome(nome);
                novo.setTelefone(telefone);
                novo.setProximo(aux);
                primeiro = novo;    
            }
            tamanho++;
        
    }

    public void imprimir(){
        lista listar = primeiro;
        while(listar != null){
            if(listar.getProximo() != null){
            System.out.print(listar.getNome() + " - " + listar.getTelefone() + " -> ");
            listar = listar.getProximo();
            }else{
            System.out.println(listar.getNome() + " - " + listar.getTelefone());
            break;    
            }
            
        }
    }

    public void total(){
        System.out.println("Número de Contatos: " + tamanho);
    }

    public void remover(String nome){
        lista aux = primeiro;
        lista ant = null;

        while(aux != null){
            if(aux.getNome() == nome && ant == null){
                aux = aux.getProximo();
                primeiro = aux;
                tamanho--;
            }else if(aux.getNome() == nome){
                ant.setProximo(aux.getProximo());
                tamanho--;
            }
            ant = aux;
            aux = aux.getProximo();
        }
        System.out.println("Eliminado o contato " + nome);
       }
    
    public void buscar(String nome){
        lista aux = primeiro;
        int encontrou = 0;
        while(aux != null){
            if(aux.getNome() == nome){
                 encontrou = 1;
            }
            aux = aux.getProximo();
        }
        System.out.println("Buscando o contato " + nome);
        if(encontrou == 0){
            System.out.println("O contato " + nome + " não está presente!");
        }else{
            System.out.println("O contato " + nome + " está presente!");  
        }     
    }



    public static void main(String[] args) {
        Lista_agendatel add = new Lista_agendatel();
        add.inserir("João", 111111111);
        add.inserir("Juan", 222222222);
        add.inserir("Jota", 333333333);
        add.inserir("Jilmar", 444444444);
        add.imprimir();
        add.total();
        add.remover("Juan");
        add.imprimir();
        add.buscar("Juan");
        add.total();

    }
}
