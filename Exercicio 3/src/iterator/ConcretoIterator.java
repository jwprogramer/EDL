import javax.lang.model.element.Element;

public class ConcretoIterator implements Iterator{
	
	Item[] itens;
	int posicao = 0;
	int tamanho = itens.length;
	Object elemento = null;
	
	public ConcretoIterator(Item[] itens) {
		this.itens = itens;
	}

	public Object next() {
		//Item videoItem = itens[tamanho];
		if(posicao < tamanho){
			elemento = itens[tamanho];
			tamanho--;
		}
		return elemento;
	}

	public boolean hasNext() {
		if (posicao >= itens.length || itens[tamanho] == null) {
			return false;
		} else {
			return true;
		}
	}
}
