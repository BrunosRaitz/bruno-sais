public class Alunos {

    private String nome;
    private int idade;
    private String matriculo;
    private String curso;
    private double mediaFinal;



    public Alunos(String nome, int idade, String matriculo, String curso, double mediaFinal) {
        setNome(nome);
        setIdade(idade);
        setMatriculo(matriculo);
        setCurso(curso);
        setMediaFinal(mediaFinal);
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        if (nome == null || nome.isBlank()){
            throw new IllegalArgumentException("Nome invalido");
        }
        this.nome = nome;
    }

    public int getIdade() {
        return idade;
    }

    public void setIdade(int idade) {
        if (idade < 0){
            throw new IllegalArgumentException("Idade invalida");
        }
        this.idade = idade;
    }

    public String getMatriculo() {
        return matriculo;
    }

    public void setMatriculo(String matriculo) {
        if (matriculo == null || matriculo.isBlank()){
            throw new IllegalArgumentException("Matricula invalida");
        }
        this.matriculo = matriculo;
    }

    public String getCurso() {
        return curso;
    }

    public void setCurso(String curso) {
        if (curso == null || curso.isBlank()){
            throw new IllegalArgumentException("Curso invalido");
        }
        this.curso = curso;
    }

    public double getMediaFinal() {
        return mediaFinal;
    }

    public void setMediaFinal(double mediaFinal) {
        if (mediaFinal < 0){
            throw new IllegalArgumentException("Media invalida");
        }
        this.mediaFinal = mediaFinal;
    }
}
