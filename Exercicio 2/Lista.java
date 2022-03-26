 class Lista {                              
  No inicio;                              
  int tamanho;                            
 
  public void inserir(Chave info) {     
    No no = new No();                  
    no.info = info;                     
    no.proximo = inicio;                
    inicio = no;                       
    tamanho++;                          
  }

  public String toString() {            
      String out = "";                   
      No no = inicio;                   
    while (no != null) {               
      out += no.info + " ";         
      no = no.proximo;               
    }
    return out;                         
  }
}