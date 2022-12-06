
public class ArvoreBinaria {

    Node raiz;
    
    public Node getRaiz() {//retorna raiz
		return raiz;
	}
    
	public ArvoreBinaria (int valor){//construtor
        raiz = new Node(valor);        
    }
	
	public void ImprimeEmOrdem() {
		ImprimeEmOrdem(raiz);
	}
	
	public void ImprimePreOrdem() {
		ImprimePreOrdem(raiz);
	}
	
	public void ImprimePosOrdem() {
		ImprimePosOrdem(raiz);
	}
	
	public boolean EstritamenteBinaria() {
		return EstritamenteBinaria(raiz);
	}
	
	public int Profundidade() {
		return Profundidade(raiz);
	}
	
	public int QuantidadeNos() {
		return QuantidadeNos(raiz);
	}
	
	public void Insert(int valor) {
	    	Insert(valor, raiz);
	    }
	
	public boolean Search(int valor) {
    	return Search(valor, raiz);
    }
	
	    
    private void ImprimeEmOrdem (Node node){
        if (node == null)
            return;

        ImprimeEmOrdem(node.getNodeLeft());//subarvore esquerda
        	System.out.print(node.getValor() + " ");//raiz no meio
        ImprimeEmOrdem(node.getNodeRight());//subarvore direita
    }
    
    private void ImprimePreOrdem (Node node){
        if (node == null)
            return;

        	System.out.print(node.getValor() + " ");//raiz no começo
        ImprimePreOrdem(node.getNodeLeft());//subarvore esquerda
        ImprimePreOrdem(node.getNodeRight());//subarvore direita
    }
   
    private void ImprimePosOrdem (Node node){
        if (node == null)
            return;

        ImprimePosOrdem(node.getNodeLeft());//subarvore esquerda
        ImprimePosOrdem(node.getNodeRight());//subarvore direita
        	System.out.print(node.getValor() + " ");//raiz no fim
    }
    
    private boolean EstritamenteBinaria(Node node) {
    	if (node == null)
    		return true;
    	if ((node.getNodeLeft() == null && node.getNodeRight() != null) || //caso tenha apenas um filho dos dois lados
    		(node.getNodeLeft() != null && node.getNodeLeft() == null))
    		return false;
    	
    	return EstritamenteBinaria(node.getNodeLeft()) && //atravez de recursividade, voltar nos filhos e fazer o metodo novamente, para percorrer toda a árvore
    		   EstritamenteBinaria(node.getNodeRight());
    }
    
    private int QuantidadeNos (Node node) {//quantidade de nos
	    if (node == null) {
	        return 0;
	    } else {
	        return (QuantidadeNos(node.getNodeRight()) + QuantidadeNos(node.getNodeLeft()) + 1);//recursividade para contar todos os nós
	    }
	}
    
    private int Profundidade (Node tree) {//profundidade da arvore, altura total
	    if (tree == null) {
	        return 0;
	    } else 
	    	return Math.max(Profundidade(tree.getNodeLeft()), 
	    			Profundidade(tree.getNodeRight()))+1;
	    
	}
    
    private void Insert(int valor, Node raiz) {//inserir elemento de forma recursiva
    	if (raiz.getValor() == valor)
    		return;
    	if (raiz.getNodeLeft() == null &&
    		raiz.getValor() > valor) {
    			Node novoNo = new Node(valor);
    			raiz.setNodeLeft(novoNo);
    		return;//inserir o valor na esquerda caso menor que o valor da raiz
    	}
    	else
    	if (raiz.getNodeRight() == null &&
    		raiz.getValor() < valor) {
    			Node novoNo = new Node(valor);
    			raiz.setNodeRight(novoNo);
    		return;//inserir o valor na direita caso maior que o valor da raiz
    	}//fazer recursividade com os demais filhos da arvore(os demais elementos da das direitas e esquerdas da árvore)
    	if (valor < raiz.getValor())
    		Insert(valor, raiz.getNodeLeft());
    	else
    		Insert(valor, raiz.getNodeRight());
    }
    
    private boolean Search(int valor, Node raiz) {//procurar elemento de forma recursiva
    	if (raiz == null)
    		return false;//verifica se o elemento é vazio
    	if (raiz.getValor() == valor)
    		return true;//verifica se é igual a raiz
    			
    		//fazer recursividade com os demais filhos da arvore(os demais elementos das direitas e esquerdas da árvore) para achar o valor
    	if (valor < raiz.getValor())
    		return Search(valor, raiz.getNodeLeft());
    	else
    		return Search(valor, raiz.getNodeRight());
    }
    
}


