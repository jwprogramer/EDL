

public class ConcretoIteratorNormal implements Iterator{
	
	Item[] itens;
    int posicao = 0;
	

    public ConcretoIteratorNormal(Item[] itens) {
        this.itens = itens;
    }
	
    public Object next() {
	
        Item valor = itens[posicao];
		posicao++;
		return valor;

       
    }

    public boolean hasNext() {
        if (posicao >= itens.length || itens[posicao] == null) {
            return false;
        } else {
            return true;
        }
    }
}
