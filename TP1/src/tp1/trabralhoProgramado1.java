package tp1;
import java.util.Scanner;

public class trabralhoProgramado1 {
	//Declarações cliente
	static int quantidade_clientes_total=0;
	static int contador;
	static int quantidade_clientes;
	///////////////////////////////////////////
	static int[] numero= new int[20];
	static String endereco[] = new String[20];
	static String nome[]= new String[20];
	
	//Declarações produtos
	static int quantidade_produtos;
	static int contador2;
	static int quantidade_produtos_total=0;
	
	static String nome_produto[] = new String[20];
    static String descricao[]= new String[20];
    static double[] valor= new double[20];
    static double[] porcentagem=new double[20];
    static int[] total= new int[20];
  
    
    //Declarações strings
	static Scanner ler = new Scanner(System.in);
	static Scanner texto = new Scanner(System.in);
	
	public static void main(String[] args) {
		
		 		 int opcao;
		 
		 do {
			 System.out.println("\n\n--------------------MENU--------------------\n\n");
			 System.out.println("ESCOLHA UMA OPÇÃO :");
			 System.out.println("\n1.Cadastrar cliente(Digite 1)");
			 System.out.println("2.Buscar cliente(Digite 2)");
			 System.out.println("3.Cadastrar produto(Digite 3)");
			 System.out.println("4.Buscar produto(Digite 4)");
			 System.out.println("5.Cadastrar venda(Digite 5)");
			 System.out.println("6.Lista de todos produtos cadastrados(Digite 6)");
			 System.out.println("7.Encerrar programa(Digite 7)");
			 opcao = ler.nextInt();
			 
		 switch(opcao) {
		 case 1: 
			 cadastro_cliente();
			//quantidade_clientes é a variável para contar a quantidade total de clientes em um cadastro isolado.
			 quantidade_clientes_total=quantidade_clientes_total+quantidade_clientes;
			// quantidade_clientes_total é a variável para contar a quantidade total de clientes de todos os cadastros.
			 break;
		 case 2:
			 Buscar_cliente();
			 break;
		 case 3:
			 cadastro_produto();
			//quantidade_produtos é a variável para contar a quantidade total de produtos em um cadastro isolado
			 quantidade_produtos_total=quantidade_produtos+quantidade_produtos_total;
			// quantidade_produtos_total é a variável para contar a quantidade total de produtos de todos os cadastros.
			 break;
		 case 4:
			 buscar_produto();
			 break;
		 case 5:
			 cadastro_venda();
			 break;
		 case 6:
			 lista_produto();
			break;
		 default:
			 System.out.println("Programa Encerrado!");
		 }
			 
		
		 }while(opcao<7);
	
	}

	
	//////////////////////////////////////(CADASTRAR CLIENTE)//////////////////////////////
	
	public static void cadastro_cliente() {		
		
		
		System.out.println("\nInforme quantos clientes serão cadastrados :\n");
		quantidade_clientes = ler.nextInt();
		
		
		for (contador=quantidade_clientes_total ; contador<(quantidade_clientes+quantidade_clientes_total) ;++contador) {
			
			System.out.println("\nInforme o nome do "+(contador+1)+"° cliente : ");
			nome[contador]= texto.nextLine();
	
			System.out.println("\nInforme o endereço do "+(contador+1)+"° cliente : ");
			endereco[contador]= texto.nextLine();
			
			System.out.println("\nInforme o telefone do "+(contador+1)+"° cliene : ");
			numero[contador] = ler.nextInt();
			
		}
		
	
		
	}
	
//////////////////////////////////////(BUSCAR CLIENTE)//////////////////////////////
	
	public static void Buscar_cliente() {
		
		//Declarações
		String palavra;
		int nao_cadastrado=0,escolha;
		//Solicitação para o usuario digitar o usuário
		System.out.println("\nInforme o nome do cliente que deseja pesquisar: \n");
		palavra = texto.nextLine();
		
	
       for (contador=0 ; contador<quantidade_clientes_total ;++contador) {
			
    	 //Verificar se tem algum cliente com o mesmo nome digitado pelo usuário
		   if(palavra.equalsIgnoreCase(nome[contador])) {
			   
			   //Dados so usuário solicitado
			    System.out.println("Nome do Cliente :"+nome[contador]);
			    System.out.println("Endereço do(a) "+nome[contador]+" é : "+endereco[contador]);
			    System.out.println("Número do(a) "+nome[contador]+" é : "+numero[contador]);
			    System.out.println("\n\nDeseja alterar os dados do usuário ?(digite 1 para sim e 2 para não)");
			    escolha = ler.nextInt();
			    
			    do {
			    switch (escolha) {
			    case 1:
			    	//Opção de mudar os dados do usuário
			    	System.out.println("\nDigite o novo Endereço : ");
			    	endereco[contador]= texto.nextLine();
			    	System.out.println("\nDigite o novo numero : ");
			    	numero[contador] = ler.nextInt();
			    	break;
			    case 2:
			    	//Saída para o menu principal
			    	break;
			     default:
			    	 //Caso o usuário digite o numero errado
			    	 System.out.println("\nVocê precisa digitar 1 ou 2:");
			    	 escolha = ler.nextInt();
			    }
			    }while(escolha!=1 && escolha!=2);
		    
		    }else {
		    	//contagem para verificar se o usuário não estar cadastrado
		    	++nao_cadastrado;
		    }
         }
      if(nao_cadastrado==quantidade_clientes_total) {
    	   System.out.println("Cliente não encontrado!");
      }
	}
	
//////////////////////////////////////(CADASTRAR PRODUTO)//////////////////////////////
	
	public static void cadastro_produto() {
		
		

		System.out.println("\nInforme quantos produtos serão cadastrados :\n");
		quantidade_produtos = ler.nextInt();
		
		//SOlicitação para pedir os dados dos produtos
		for (contador2=quantidade_produtos_total ; contador2<(quantidade_produtos+quantidade_produtos_total);++contador2) {
			
		System.out.println("Informe o nome do "+(contador2+1)+"° produto :");
		nome_produto[contador2]=texto.nextLine();
		
		System.out.println("Informe a descrição do "+(contador2+1)+"° produto :");
		descricao[contador2]= texto.nextLine();
		
		System.out.println("Informe o valor da compra do "+(contador2+1)+"° produto :");
		valor[contador2]=ler.nextDouble();
		
		System.out.println("Informe a porcetagem de lucro do "+(contador2+1)+"° produto :");
		porcentagem[contador2]=ler.nextDouble();
		
		System.out.println("Informe a quantidade em estoque do "+(contador2+1)+"° produto :");
		total[contador2]=ler.nextInt();
		//total=estoque
				
		}
		
		
	}
	
//////////////////////////////////////(BUSCAR CLIENTE)//////////////////////////////
	
	public static void buscar_produto() {
	      
		 //Declarações
	     int escolha2,nao_cadastrado2=0;
		 String pesquisa;
		 
	     System.out.println("\nInforme o nome do produto que deseja pesquisar: \n");
	     pesquisa= texto.nextLine();
	      
	     for (contador2=0 ; contador2<quantidade_produtos_total; ++contador2) {
	      
	     //Verificar se tem algum produto com o mesmo nome digitado pelo usuário
	     if(pesquisa.equalsIgnoreCase(nome_produto[contador2])){
	       //dados do produto
	      System.out.println("Nome do produto : "+nome_produto[contador2]);
	      System.out.println("Descrição do produto : "+descricao[contador2]);
	      System.out.println("Valor da compra : "+valor[contador2]+" R$");
	      System.out.println("Porcetagem de lucro : "+porcentagem[contador2]+" %");
	      System.out.println("Quantidade em estoque : "+total[contador2]);
	      System.out.println("\n\nDeseja alterar os dados do produto?(digite 1 para sim e 2 para não)");
	      escolha2 = ler.nextInt();
	      
	        do {
	        	switch(escolha2) {
	        	case 1:
	        	  //Opção para alterar os dados do produto pesquisado
	      	      System.out.println("Digite a nova descrição do produto : ");
	      	      descricao[contador2]= texto.nextLine();
	      	      System.out.println("Digite o novo valor da compra : ");
	      	      valor[contador2]=ler.nextDouble();
	      	      System.out.println("Digite a nova porcetagem de lucro : ");
	      	      porcentagem[contador2]=ler.nextDouble();
	      	      System.out.println("Digite a nova quantidade em estoque : ");
	      	      total[contador2]=ler.nextInt();
	      	        break;
	        	case 2:
	        		//Saída para o menu principal
	        		break;
	        	default:
	        		//Caso o usuário digite o numero errado
	        	   System.out.println("\nVocê precisa digitar 1 ou 2:");
			        escolha2 = ler.nextInt();
	        	  }
	         }while(escolha2!=1 && escolha2!=2);
	        
	  
	       }else {
	    	   ++nao_cadastrado2;
	    	   
	       }
	       
	       if(nao_cadastrado2==quantidade_produtos_total) {
	    	   System.out.println("Produto não encontrado!");
	       }
	      
	     }
	     
	     
	     
	}
    
//////////////////////////////////////(CADASTRAR VENDA)//////////////////////////////
	
	public static void cadastro_venda() {
		
		//Declarações
		int selecao_cliente,selecao_produto,finalizar,quantidade_vendido,cliente_inexistente=0;
		
		System.out.println("\nLista de clientes :");
		 
		for (contador=0 ; contador<quantidade_clientes_total ;++contador) {
			
			 System.out.println((contador+1)+"-"+nome[contador]);
		}
		
		    System.out.println("Selecione um dos clientes(Digite o numero que esta acompanhando o nome) :");
		    selecao_cliente= ler.nextInt();
		  for (contador=0 ; contador<quantidade_clientes_total ;++contador) {
				
				 if((contador+1)!=selecao_cliente) {
					 ++cliente_inexistente;
				 }
	       }
		    
		  if(cliente_inexistente==quantidade_clientes_total) {
			  System.out.println("Cliente não existente");
		  }else {
		  
		    //O cliente sera escolhido de acordo com o número 
		 
		    do{
		          System.out.println("\nLista de produtos");
		
		       for(contador2=0 ; contador2<quantidade_produtos_total; ++contador2) {
				
			 System.out.println((contador2+1)+"-"+nome_produto[contador2]);
		     }
		    //Escolha do produto que foi vendido para o cliente escolhido anteriormente
		    System.out.println("Selecione um dos Produtos para cadastrar a venda(Digite o numero que esta acompanhando o nome) :");
		    selecao_produto= ler.nextInt();
		
		    System.out.println("Informe quantos desse produto foi vendido para esse cliente :");
		    quantidade_vendido=ler.nextInt();
		    
		      for (contador2=0 ; contador2<quantidade_produtos_total ; ++contador2 ) {
				  
				 if(selecao_produto==(contador2+1)) {
					 
					 if(total[contador2]>=quantidade_vendido) {
						 //retirando do estoque a quantidade que foi vendida para tal
						 total[contador2]=total[contador2]-quantidade_vendido;
					 }else if(total[contador2]<quantidade_vendido) {
						 //Caso o quantidade solicitada for maior que a presente no estoque
						 System.out.println("Não existe quantidade suficiente no estoque para essa venda");
					   }
			     	 }
		       }
		  
		  System.out.println("Deseja finalizar o cadastro de vendas?(digite 1 para sim e 2 para não)");
		  finalizar=ler.nextInt();
		  
       
		}while(finalizar==2);
      }    
	   
	}
	
//////////////////////////////////////(LISTAR PRODUTOS)//////////////////////////////
	public static void lista_produto() {
		
		 System.out.println("\n---------------Lista de todos produtos cadastrados:--------------\n");
		
		for(contador2=0 ; contador2<quantidade_produtos_total; ++contador2) {
			//lista de todos produtos com seu estoque atual
			System.out.println("\n"+(contador2+1)+"-"+nome_produto[contador2]);
			System.out.println("Quantidade em estoque :"+total[contador2]);
			
		}
		
	}


}

