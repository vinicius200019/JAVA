import java.util.Date;

class Emprestimo {
    private Livro livro;
    private Leitor leitor;
    private Date dataEmprestimo;
    private Date dataDevolucao;

    public Emprestimo(Livro livro, Leitor leitor, Date dataEmprestimo, Date dataDevolucao) {
        this.livro = livro;
        this.leitor = leitor;
        this.dataEmprestimo = dataEmprestimo;
        this.dataDevolucao = dataDevolucao;
    }

    public Livro getLivro() { return livro; }
    public Leitor getLeitor() { return leitor; }
    public Date getDataEmprestimo() { return dataEmprestimo; }
    public Date getDataDevolucao() { return dataDevolucao; }

    @Override
    public String toString() {
        return "Emprestimo: Livro - " + livro.getTitulo() + ", Leitor - " + leitor.getNome() +
                ", Data de Empréstimo: " + dataEmprestimo + ", Data de Devolução: " + dataDevolucao;
    }
}
