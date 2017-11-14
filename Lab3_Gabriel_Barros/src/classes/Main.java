package classes;
import java.util.ArrayList;
import java.util.Scanner;

public class Main {
	
	public static void menu() {
		System.out.println("");
		System.out.println("    (C)adastrar Contato          ");
		System.out.println("    (L)istar Contatos            ");
		System.out.println("    (E)xibir Contato             ");
		System.out.println("    (S)air                       ");
		System.out.println("");
		System.out.print("Opção> ");
	}
	
	public static void cadastrarContato(Scanner sc, Agenda agenda) {
		int posicao;
		String nome;
		String sobrenome;
		String telefone;
		
		System.out.print("Posição: ");
		posicao = sc.nextInt();
		sc.nextLine();
		
		System.out.print("Nome: ");
		nome = sc.nextLine();
		
		System.out.print("Sobrenome: ");
		sobrenome = sc.nextLine();
		
		System.out.print("Telefone: ");
		telefone = sc.nextLine();
		
		Contato contato = new Contato(nome, sobrenome, telefone);
		try {
			agenda.cadastrarContato(contato, posicao);
			System.out.println("CADASTRO REALIZADO!");
		}catch(ArrayIndexOutOfBoundsException e) {
			System.out.println("Posição inválida");
		}
		
		
	}
	
	public static void listarContatos(Agenda agenda) {
		System.out.println("");
		ArrayList<String>listaContatos = agenda.listarContatos();
		for(int i = 0; i < listaContatos.size(); i++) {
			System.out.println(listaContatos.get(i));
		}
	}
	
	public static void exibirContato(Scanner sc, Agenda agenda) {
		System.out.print("Contato> ");
		int posicao = sc.nextInt();
		sc.nextLine();
		System.out.println(agenda.exibirContato(posicao));
	}
	
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String op = "";
		Agenda agenda = new Agenda();
		do {
			menu();
			op = sc.nextLine().toLowerCase();
			switch(op) {
			case "c":
				cadastrarContato(sc, agenda);
				break;
			case "l":
				listarContatos(agenda);
				break;
			case "e":
				exibirContato(sc, agenda);
				break;
			case "s":
				break;
			default:
				System.out.println("OPÇÃO INVÁLIDA!");
			}
			
		}while(!op.equals("s"));
	}
}
