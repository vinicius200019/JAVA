class Livro {
    private String titulo;
    private String autor;
    private String isbn;
    private int anoPublicacao;
    private int quantidade;

    public Livro(String titulo, String autor, String isbn, int anoPublicacao, int quantidade) {
        this.titulo = titulo;
        this.autor = autor;
        this.isbn = isbn;
        this.anoPublicacao = anoPublicacao;
        this.quantidade = quantidade;
    }

    public String getTitulo() { return titulo; }
    public String getAutor() { return autor; }
    public String getIsbn() { return isbn; }
    public int getAnoPublicacao() { return anoPublicacao; }
    public int getQuantidade() { return quantidade; }
    public void setQuantidade(int quantidade) {

    }
}

