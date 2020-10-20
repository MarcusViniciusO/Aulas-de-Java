package Collections;

import java.util.ArrayList;
import java.util.*;

public class Exercicio3Collections {
		
		public static void main(String [] args)
		{	
			int opcao;
			Scanner ler = new Scanner(System.in);
			ArrayList<String> estoque = new ArrayList<String>();
					
					
					
			do {
				System.out.println("(1)Adicionar produtos ao estoque\n(2)Remover\n(3)Atualizar"
									+ "\n(4)Mostrar todos os produtos do estoque\n(0)Encerrar programa");
				opcao = ler.nextInt();
					
						
				
			switch(opcao)
			{
			case 1:
				System.out.print("Digite o produto para adicionar ao estoque:");
				String produtos = ler.next();
				estoque.add(produtos);
			break;
						
			case 2:
				System.out.println("Digite o produto para remover do estoque:");
				String produto = ler.next();
				estoque.remove(produto);
			break;
									
			case 3:
									
				System.out.println("Digite o produto que quer atualizar: ");
				String verifica = ler.next();
				System.out.println("Digite o nome do produto que entrará no lugar de "+verifica+":");
				String novo = ler.next();
									
			if(estoque.contains(verifica))
			{
				estoque.remove(verifica);
				estoque.add(novo);
			}
				System.out.println(estoque);
				break;
						
				case 4:
						System.out.println(" Os produto  do estoque:");
						System.out.println(estoque);
				break;
									
				default:
						System.out.println("Finalizou o programa!!!");
				}
					
			}while(opcao !=0);

		}
}
