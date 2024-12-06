class Leitor {
    private String nome;
    private String email;
    private String telefone;
    private String id;

    public Leitor(String nome, String email, String telefone, String id) {
        this.nome = nome;
        this.email = email;
        this.telefone = telefone;
        this.id = id;
    }

    public String getNome() { return nome; }
    public String getEmail() { return email; }
    public String getTelefone() { return telefone; }
    public String getId() { return id; }

    @Override
    public String toString() {
        return "Leitor: " + nome + " (ID: " + id + "), Email: " + email + ", Telefone: " + telefone;
    }
}