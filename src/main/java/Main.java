import java.util.Scanner;
import java.util.Date;

public class Main {
    public static void main(String[] args) {
        Biblioteca biblioteca = new Biblioteca(); // Instância da biblioteca
        Scanner scanner = new Scanner(System.in); // Scanner para entrada de dados
        int opcao;
        do {
            // Menu principal
            System.out.println("\n=== Sistema de Gerenciamento de Biblioteca ===");
            System.out.println("1. Cadastrar Livro");
            System.out.println("2. Cadastrar Leitor");
            System.out.println("3. Exibir Livros Cadastrados");
            System.out.println("4. Exibir Leitores Cadastrados");
            System.out.println("5. Registrar Empréstimo (funcao disponivel apenas depois de cadastar usuario e livro)");
            System.out.println("6. Exibir Empréstimos (funcao disponivel apenas depois de resgistrar um emprestimo)");
            System.out.println("7. Sair");
            System.out.print("Escolha uma opção: ");
            opcao = scanner.nextInt();
            scanner.nextLine(); // Consumir a nova linha
            switch (opcao) {
                case 1: // Cadastrar Livro
                    System.out.println("\n--- Cadastro de Livro ---");
                    System.out.print("Título: ");
                    String titulo = scanner.nextLine();
                    System.out.print("Autor: ");
                    String autor = scanner.nextLine();
                    System.out.print("ISBN: ");
                    String isbn = scanner.nextLine();
                    System.out.print("Ano de Publicação: ");
                    int anoPublicacao = scanner.nextInt();
                    System.out.print("Quantidade Disponível: ");
                    int quantidade = scanner.nextInt();
                    scanner.nextLine();
                    Livro livro = new Livro(titulo, autor, isbn, anoPublicacao, quantidade);
                    biblioteca.cadastrarLivro(livro);
                    break;
                case 2: // Cadastrar Leitor
                    System.out.println("\n--- Cadastro de Leitor ---");
                    System.out.print("Nome: ");
                    String nome = scanner.nextLine();
                    System.out.print("E-mail: ");
                    String email = scanner.nextLine();
                    System.out.print("Telefone: ");
                    String telefone = scanner.nextLine();
                    System.out.print("ID do Leitor: ");
                    String id = scanner.nextLine();
                    Leitor leitor = new Leitor(nome, email, telefone, id);
                    biblioteca.cadastrarLeitor(leitor);
                    break;
                case 3: // Exibir Livros
                    System.out.println("\n--- Lista de Livros ---");
                    biblioteca.exibirLivros();
                    break;
                case 4: // Exibir Leitores
                    System.out.println("\n--- Lista de Leitores ---");
                    biblioteca.exibirLeitores();
                    break;
                case 5: // Registrar Empréstimo
                    System.out.println("\n--- Registrar Empréstimo ---");
                    System.out.print("Título do Livro: ");
                    String tituloLivro = scanner.nextLine();
                    System.out.print("ID do Leitor: ");
                    String idLeitor = scanner.nextLine();
                    System.out.print("Dias para Devolução: ");
                    int diasParaDevolucao = scanner.nextInt();
                    scanner.nextLine();
                    biblioteca.registrarEmprestimo(tituloLivro, idLeitor, diasParaDevolucao);
                    break;
                case 6: // Exibir Empréstimos
                    System.out.println("\n--- Lista de Empréstimos ---");
                    biblioteca.exibirEmprestimos();
                    break;
                case 7: // Sair
                    System.out.println("Encerrando o sistema. Até mais!");
                    break;
                default:
                    System.out.println("Opção inválida! Tente novamente.");
            }
        } while (opcao != 7);
        scanner.close();
    }
}
