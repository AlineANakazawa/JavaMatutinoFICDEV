package dia06.Biblioteca.Principal;

import java.util.List;
import java.util.Scanner;

import dia06.Biblioteca.Modelo.Livro;
import dia06.Biblioteca.Modelo.Usuario;
import dia06.Biblioteca.Servico.BibliotecaService;

public class App {

    private static BibliotecaService bibliotecaService
            = new BibliotecaService();
    private static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        int opcao = -1;

        while (opcao != 0) {
            System.out.println("\n\nBiblioteca\n");
            System.out.println("1 - Cadastrar livro");
            System.out.println("2 - cadastrar usuário");
            System.out.println("3 - Realizar empréstimo");
            System.out.println("4 - Realizar Devolução");
            System.out.println("5 - Listar livros");
            System.out.println("6 - Listar usuários");
            System.out.println("7 - Buscar livro");
            System.out.println("8  Buscar usuário");
            System.out.println("0 - Sair");

            System.out.println("\nDigite a opção desejada: ");
            opcao = scanner.nextInt();

            switch (opcao) {
                case 0 -> System.out.println("Finalizado!");
                case 1 -> cadastrarLivro();
                case 2 -> cadastrarUsuario();
                case 3 -> realizarEmprestimo();
                case 4 -> realizarDevolucao();
                case 5 -> listarLivros();
                case 6 -> listarUsuarios();
                case 7 -> buscarLivro();
                case 8 -> buscarUsuario();
                default -> System.out.println("Opção inválida");
            }
        }
    }

    private static void cadastrarLivro() {
        System.out.println("\nCadastro de livro\n");
        scanner.nextLine();
        System.out.println("Titulo: ");
        String titulo = scanner.nextLine();
        System.out.println("Autor: ");
        String autor = scanner.nextLine();
        Livro livro = new Livro(titulo, autor);
        bibliotecaService.cadastrarLivro(livro);
        System.out.println("Livro cadastrado com sucesso.");
    }

    private static void cadastrarUsuario() {
        System.out.println("\nCadastro de usuário\n");
        scanner.nextLine();
        System.out.println("Nome: ");
        String nome = scanner.nextLine();
        System.out.println("Email: ");
        String email = scanner.nextLine();
        System.out.println("Telefone: ");
        int telefone = scanner.nextInt();
        Usuario usuario = new Usuario(nome, email, telefone);
        bibliotecaService.cadastrarUsuario(usuario);
        System.out.println("Usuário cadastrado com sucesso.");
    }

    private static void realizarEmprestimo() {
        System.out.println("\nEmpréstimo de livro\n");
        System.out.println("ID do livro: ");
        int idLivro = scanner.nextInt();
        System.out.println("ID do usuário: ");
        int idUsuario = scanner.nextInt();
        try {
            bibliotecaService.realizarEmprestimo(idLivro, idUsuario);
            System.out.println("Empréstimo realizado com sucesso.");
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }

    private static void realizarDevolucao() {
        System.out.println("\nDevolução de livro\n");
        System.out.print("ID do livro: ");
        int idLivro = scanner.nextInt();
        System.out.print("ID do usuário: ");
        int idUsuario = scanner.nextInt();
        try {
            bibliotecaService.realizarDevolucao(idLivro, idUsuario);
            System.out.println("Devolução realizada com sucesso.");
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }

    private static void listarLivros() {
        System.out.println("\nLista de livros\n");
        List<Livro> livros = bibliotecaService.listarLivros();
        for (Livro livro : livros) {
            System.out.println(livro);
        }
    }

    private static void listarUsuarios() {
        System.out.println("\nLista de usuários\n");
        List<Usuario> usuarios = bibliotecaService.listarUsuarios();
        for (Usuario usuario : usuarios) {
            System.out.println(usuario);
        }
    }

    private static void buscarLivro() {
        System.out.println("\nBusca de livro\n");
        System.out.print("ID do livro: ");
        int id = scanner.nextInt();
        Livro livro = bibliotecaService.buscarLivro(id);
        if (livro != null) {
            System.out.println(livro);
        } else {
            System.out.println("Livro não encontrado.");
        }
    }

    private static void buscarUsuario() {
        System.out.println("\nBusca de usuário\n");
        System.out.print("ID do usuário: ");
        int id = scanner.nextInt();
        Usuario usuario = bibliotecaService.buscarUsuario(id);
        if (usuario != null) {
            System.out.println(usuario);
        } else {
            System.out.println("Usuário não encontrado.");
        }
    }
}
