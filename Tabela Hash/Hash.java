public class Hash {            // Classe Hash
  int operador;               // Atributo operador
  Lista[] vetor;             // Vetor de Listas

    Hash(int operador) {                                // Construtor iniciando com um operador
      this.operador = operador;                       // Inicializa o operador
      vetor = new Lista[operador];                    // Inicializa o vetor de Listas
      for (int i = 0; i < operador; i++) {            // Para cada posicao no vetor
      vetor[i] = new Lista();                     // Inicializa a Lista daquela posicao do vetor
    }
}

  void inserir(Pessoa contato) {                     // Metodo para inserir um contato
    int chave = contato.codigo % operador;          // Posicao = resto do codigo /operador
    vetor[chave].inserir(contato);                  // Insere o contato naquela lista
  }

  Pessoa buscar(int codigo) {                        // Metodo buscar pelo codigo
    return vetor[codigo % operador].buscar(codigo); // Busca apenas na lista especifica
  }
  
  public String toString() {                          // Sobrescreve o metodo toString
      String out = "";                                // Cria uma string de saida
    for(int i = 0; i < operador; i++) {             // Para cada posicao no vetor de Listas
      out += "" + i + ": ";                       // adiciona uma string representando a Lista
      out += vetor[i % operador] + "\n";
    }
    return out;                                     // Retorna a String
  }
}