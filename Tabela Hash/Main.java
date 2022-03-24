public class Main {                                             // Classe Main
  public static void main(String [] args) {                   // Metodo main
    Hash hash = new Hash(7);                                // Cria uma tabela Hash com operador 4
      hash.inserir(new Pessoa(2, "Saulo"));      // Insere n elementos
      hash.inserir(new Pessoa(6, "Joao"));
      hash.inserir(new Pessoa(13, "Marta"));
      hash.inserir(new Pessoa(12, "Roberta"));
      hash.inserir(new Pessoa(7, "Maria"));

    System.out.println(hash);                               // Imprime a tabela Hash e suas listas
  }
}