public class Hash {           
  int operador;               
  Lista[] vetor;             

    Hash(int operador) {                                
      this.operador = operador;                     
      vetor = new Lista[operador];                   
      for (int i = 0; i < operador; i++) {            
      vetor[i] = new Lista();    }                 
}

  void inserir(Chave contato) {                     
    int chave = contato.codigo % operador;          
    vetor[chave].inserir(contato);                  
  }

  
  public String toString() {                          
      String out = "";                               
    for(int i = 0; i < operador; i++) {             
      out += "" + i + ": ";                      
      out += vetor[i % operador] + "\n";
    }
    return out;                                    
  }

  public static void main(String [] args) {                   
    Hash hash = new Hash(5);                               
    hash.inserir(new Chave(2));      
    hash.inserir(new Chave(6));
    hash.inserir(new Chave(13));
    hash.inserir(new Chave(12));
    hash.inserir(new Chave(7));

  System.out.println(hash);                               
}
}