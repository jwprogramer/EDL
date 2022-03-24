public class Main {                                             // Classe Main
  public static void main(String [] args) {                   // Metodo main
    Hash hash = new Hash(7);                                // Cria uma tabela Hash com operador 4
      hash.inserir(new Chave(2));      // Insere n elementos
      hash.inserir(new Chave(6));
      hash.inserir(new Chave(13));
      hash.inserir(new Chave(12));
      hash.inserir(new Chave(7));

    System.out.println(hash);                               // Imprime a tabela Hash e suas listas
  }
}