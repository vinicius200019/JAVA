import java.util.ArrayList;
import java.util.Date;
import java.util.List;

class Biblioteca {
    private List<Livro> livros;
    private List<Leitor> leitores;
    private List<Emprestimo> emprestimos;

    public Biblioteca() {
        this.livros = new ArrayList<>();
        this.leitores = new ArrayList<>();
        this.emprestimos = new ArrayList<>();
    }

    public void cadastrarLivro(Livro livro) {
        if (livro != null) {
            livros.add(livro);
            System.out.println("Livro cadastrado com sucesso!");
        } else {
            System.out.println("Erro: Livro inválido!");
        }
    }

    public void cadastrarLeitor(Leitor leitor) {
        if (leitor != null) {
            leitores.add(leitor);
            System.out.println("Leitor cadastrado com sucesso!");
        } else {
            System.out.println("Erro: Leitor inválido!");
        }
    }

    public void registrarEmprestimo(String tituloLivro, String idLeitor, int diasParaDevolucao) {
        Livro livro = livros.stream().filter(l -> l.getTitulo().equalsIgnoreCase(tituloLivro)).findFirst().orElse(null);
        Leitor leitor = leitores.stream().filter(l -> l.getId().equals(idLeitor)).findFirst().orElse(null);

        if (livro != null && leitor != null) {
            if (livro.getQuantidade() > 0) {
                Date dataEmprestimo = new Date();
                Date dataDevolucao = new Date(dataEmprestimo.getTime() + diasParaDevolucao * 86400000L);
                Emprestimo emprestimo = new Emprestimo(livro, leitor, dataEmprestimo, dataDevolucao);
                emprestimos.add(emprestimo);
                livro.setQuantidade(livro.getQuantidade() - 1);
                System.out.println("Empréstimo registrado com sucesso!");
            } else {
                System.out.println("Erro: Livro indisponível para empréstimo.");
            }
        } else {
            System.out.println("Erro: Livro ou Leitor não encontrado.");
        }
    }

    public void exibirLivros() {
        if (livros.isEmpty()) {
            System.out.println("Nenhum livro cadastrado.");
        } else {
            for (Livro livro : livros) {
                System.out.println(livro);
            }
        }
    }

    public void exibirLeitores() {
        if (leitores.isEmpty()) {
            System.out.println("Nenhum leitor cadastrado.");
        } else {
            for (Leitor leitor : leitores) {
                System.out.println(leitor);
            }
        }
    }

    public void exibirEmprestimos() {
        if (emprestimos.isEmpty()) {
            System.out.println("Nenhum empréstimo registrado.");
        } else {
            for (Emprestimo emprestimo : emprestimos) {
                System.out.println(emprestimo);
            }
        }
    }
}
