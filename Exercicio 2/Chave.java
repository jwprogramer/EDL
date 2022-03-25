public class Chave {								// Classe Contato
	int codigo;											// Código do contato
										// Nome do contato
								// Telefone do contato

	Chave(int codigo) {	// Construtor com parâmetros
		this.codigo = codigo;							// Inicializa o atributo codigo
							// Inicializa o atributo nome
						// Inicializa o atributo telefone
	}

	public String toString() {							// Sobrescreve o metodo toString
		return "(" + codigo + ")";		// REtorna o código e o nome
	}
};