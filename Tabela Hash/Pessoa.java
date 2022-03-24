public class Pessoa {								// Classe Contato
	int codigo;											// Código do contato
	String nome;										// Nome do contato
								// Telefone do contato

	Pessoa(int codigo, String nome) {	// Construtor com parâmetros
		this.codigo = codigo;							// Inicializa o atributo codigo
		this.nome = nome;								// Inicializa o atributo nome
						// Inicializa o atributo telefone
	}

	public String toString() {							// Sobrescreve o metodo toString
		return "(" + codigo + ", " + nome + ")";		// REtorna o código e o nome
	}
};