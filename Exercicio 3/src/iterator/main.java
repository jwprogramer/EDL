
public class main {

	public static void main(String[] args) {
		Item [] Itens = new Item[4];
		
		Itens[0] = new Item("Paula");
		Itens[1] = new Item("Iramar");
		Itens[2] = new Item("Aislania");
		Itens[3] = new Item("Alan");
		
		Iterator Iterator = new ConcretoIterator(Itens);

		while (Iterator.hasNext()) {
            Item valor = (Item)Iterator.next();
            System.out.println(valor.nome);
        }
			
	}

}
