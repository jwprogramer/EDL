

public class ConcretoIterator implements Iterator{
	
	Item[] itens;
    int posicao = 0;
	

    public ConcretoIterator(Item[] itens) {
        this.itens = itens;
    }
	
    public Object next() {
		int tam = itens.length;
		if(posicao <= tam){
		
        Item valor = itens[tam-(posicao+1)];
        tam--;
		posicao++;
		return valor;

		}else{

			return false;
		}
       
    }

    public boolean hasNext() {
        if (posicao >= itens.length || itens[posicao] == null) {
            return false;
        } else {
            return true;
        }
    }
}
