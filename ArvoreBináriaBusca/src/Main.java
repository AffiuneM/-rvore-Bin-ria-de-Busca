import java.util.*;//biblioteca de Scanner
public class Main {

	public static void main(String[] args) {
		
		//setar elementos
		
		ArvoreBinaria arvoreBinariaTeste = new ArvoreBinaria(3);
		arvoreBinariaTeste.Insert(2);
		arvoreBinariaTeste.Insert(1);
		arvoreBinariaTeste.Insert(4);
		arvoreBinariaTeste.Insert(3);
		arvoreBinariaTeste.Insert(5);
		arvoreBinariaTeste.Insert(10);
		
		//Ordenar a árvore
		
			System.out.print("Em Ordem: ");
		arvoreBinariaTeste.ImprimeEmOrdem();
			System.out.print("\nPré Ordem: ");
		arvoreBinariaTeste.ImprimePreOrdem();
			System.out.print("\nPós Ordem: ");
		arvoreBinariaTeste.ImprimePosOrdem();
		
		//verificar métodos da classe Arvore Binaria
		
		Scanner dados = new Scanner(System.in);//usada para ler dado digitado no console
		
		System.out.println("\nÉ estritamente binária: " + arvoreBinariaTeste.EstritamenteBinaria());
		System.out.println("Quantidade de nós: " + arvoreBinariaTeste.QuantidadeNos());
		System.out.println("Profundidade: " + arvoreBinariaTeste.Profundidade());
		System.out.println("Verificar elemento: ");
			int elemento = dados.nextInt();//recebe dado pelo console
		System.out.println(arvoreBinariaTeste.Search(elemento));
		
	}

}
