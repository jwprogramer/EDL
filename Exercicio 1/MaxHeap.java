
public class MaxHeap {
	public int[] Heap;
	public int tamanho;
	public int total;

	public MaxHeap(int total)
	{
		
		this.total = total;
		this.tamanho = 0;
		Heap = new int[this.total];
	}

	private int pai(int pos) { return (pos) / 2; }


	private int filhoEsquerda(int pos) { return (2 * pos); }


	private int filhoDireita(int pos)
	{
		return ((2 * pos) + 1);
	}


	private boolean folha(int pos)
	{
		if (pos > (tamanho / 2) && pos <= tamanho) {
			return true;
		}
		return false;
	}


	private void troca(int fpos, int spos)
	{
		int tmp;
		tmp = Heap[fpos];
		Heap[fpos] = Heap[spos];
		Heap[spos] = tmp;
	}

	private void maxHeapify(int pos)
	{
		if (folha(pos))
			return;

		if (Heap[pos] < Heap[filhoEsquerda(pos)]
			|| Heap[pos] < Heap[filhoDireita(pos)]) {

			if (Heap[filhoEsquerda(pos)]
				> Heap[filhoDireita(pos)]) {
				troca(pos, filhoDireita(pos));
				maxHeapify(filhoEsquerda(pos));
			}
			else {
				troca(pos, filhoDireita(pos));
				maxHeapify(filhoDireita(pos));
			}
		}
	}

	public void aumentarPrioridade(int pos, int p){
		Heap[pos] = Heap[pos] + p;
		maxHeapify(pos);
	}

	public void diminuirPrioridade(int pos, int p){
		Heap[pos] = Heap[pos] - p;
		maxHeapify(pos);
	}

	public void inserir(int elemento)
	{
		Heap[tamanho] = elemento;

	
		int aux = tamanho;
		while (Heap[aux] > Heap[pai(aux)]) {
			troca(aux, pai(aux));
			aux = pai(aux);
		}
		tamanho++;
	}

	public void imprimir()
	{
	
	for(int i=0;i<tamanho/2; i++){

			System.out.print("Pai : " + Heap[i] );
			
			if(filhoEsquerda(i)<tamanho) 
			System.out.print( " No - Direita - Filho: " + Heap[filhoEsquerda(i+1)]);
			
			if(filhoDireita(i)<tamanho) 
				System.out.print(" No - Esquerda - Filho: "+ Heap[filhoDireita(i)]);
			
				System.out.println(); 
				
		}
		
	}

	public int maiorHeap()
	{
		return Heap[0];
	}

	public int removerMaiorHeap()
	{
		int maior = Heap[0];
		for(int i = 0; i < tamanho; i++){
		Heap[i] = Heap[i+1];
		}
		tamanho--; 
		maxHeapify(tamanho);
		return maior;
	}

	public static void main(String [] args)
	{
	
		MaxHeap maxHeap = new MaxHeap(8);
        
		maxHeap.inserir(5);
		maxHeap.inserir(3);
		maxHeap.inserir(17);
		maxHeap.inserir(10);
		maxHeap.inserir(84);
		maxHeap.inserir(19);
		maxHeap.inserir(6);
	
		maxHeap.imprimir();


		System.out.println("O maior valor é " + maxHeap.maiorHeap());

		System.out.println("O maior valor é " + maxHeap.removerMaiorHeap() + " foi removido!");

		maxHeap.aumentarPrioridade(3, 1);
		maxHeap.diminuirPrioridade(5, 2);

		maxHeap.imprimir();
	}
	
}
