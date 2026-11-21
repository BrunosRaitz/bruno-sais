public class Usuario {
    private String id;
    private String nome;
    private String email;
    private String senha;
    private String cpf;
    private String endereco;

    public Usuario(String id, String nome, String email, String senha, String cpf, String endereco) {
        setId(id);
        setNome(nome);
        setEmail(email);
        setSenha(senha);
        setCpf(cpf);
        setEndereco(endereco);
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        if (id == null || id.isBlank()){
            throw new IllegalArgumentException("Id invalido");
        }
        this.id = id;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        if (nome == null || nome.isBlank()) {
            throw new IllegalArgumentException("Nome invalido");
        }
        this.nome = nome;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        if (email == null || email.isBlank()){
            throw new IllegalArgumentException("Email invalido");
        }
        this.email = email;
    }

    public String getSenha() {
        return senha;
    }

    public void setSenha(String senha) {
        if (senha == null || senha.isBlank()){
            throw new IllegalArgumentException("Senha invalido");
        }
        this.senha = senha;
    }

    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        if (cpf == null || cpf.isBlank()){
            throw new IllegalArgumentException("Cpf invalido");
        }
        this.cpf = cpf;
    }

    public String getEndereco() {
        return endereco;
    }

    public void setEndereco(String endereco) {
        if (endereco == null || endereco.isBlank()){
            throw new IllegalArgumentException("Endereco invalido");
        }
        this.endereco = endereco;
    }

    @Override
    public String toString() {
        return "Usuario{" +
                "id='" + id + '\'' +
                ", nome='" + nome + '\'' +
                ", email='" + email + '\'' +
                ", senha='" + senha + '\'' +
                ", cpf='" + cpf + '\'' +
                ", endereco='" + endereco + '\'' +
                '}';
    }
}
