
public class main {

	public static void main(String[] args) {
		Item [] Itens = new Item[5];
		
		Itens[0] = new Item("Paula");
        Itens[1] = new Item("Iramar");
        Itens[2] = new Item("Aislania");
        Itens[3] = new Item("Alan");
		Itens[4] = new Item("Jane");


		Iterator iteratorNormal = new ConcretoIteratorNormal(Itens);

		System.out.println("Ordem Normal");

        while (iteratorNormal.hasNext()) {
            Item valor = (Item)iteratorNormal.next();
            System.out.println(valor.nome);
        }

		System.out.println("________________");

		System.out.println("Ordem Inversa");

        Iterator iterator = new ConcretoIterator(Itens);

        while (iterator.hasNext()) {
            Item valor = (Item)iterator.next();
            System.out.println(valor.nome);
        }


    }

}
