public class Vereador {

    private String nome;
    private String partido;
    private int qtdProjeto;
    private int qtdProjetoAprovado;

    public Vereador(String nome, String partido, int qtdProjeto, int qtdProjetoAprovado) {
        setNome(nome);
        setPartido(partido);
        setQtdProjeto(qtdProjeto);
        setQtdProjetoAprovado(qtdProjetoAprovado);
    }

    public double indiceDeTrabalho(){
        if (qtdProjeto > 17){
            return 1.22;
        } else if (qtdProjeto >= 11) {
            return 1.08;
        } else if (qtdProjeto >= 6) {
            return 1.0;
        } else if (qtdProjeto >= 1) {
            return 0.8;
        }
        return 0;
    }

    public double calcularDesempenhoVereador(){

        if (qtdProjeto == 0){
            return 0;
        }else {
          return ((double) qtdProjetoAprovado / qtdProjeto) * indiceDeTrabalho();
        }
    }

    public double calcularPorcemtagemProjetosAprovado(){
        return (double) (qtdProjetoAprovado * 100) / qtdProjeto;
    }


    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        if (nome == null || nome.isBlank()){
            throw new IllegalArgumentException("noem invalido");
        }
        this.nome = nome;
    }

    public String getPartido() {
        return partido;
    }

    public void setPartido(String partido) {
        if (partido == null || partido.isBlank()){
            throw new IllegalArgumentException("Partido invalido");
        }
        this.partido = partido;
    }

    public int getQtdProjeto() {
        return qtdProjeto;
    }

    public void setQtdProjeto(int qtdProjeto) {
        if (qtdProjeto <= 0){
            throw new IllegalArgumentException("quantidade invalida");
        }
        this.qtdProjeto = qtdProjeto;
    }

    public int getQtdProjetoAprovado() {
        return qtdProjetoAprovado;
    }

    public void setQtdProjetoAprovado(int qtdProjetoAprovado) {
        if (qtdProjetoAprovado < 0 || qtdProjetoAprovado > qtdProjeto){
            throw new IllegalArgumentException("Projetos invalidos");
        }
        this.qtdProjetoAprovado = qtdProjetoAprovado;
    }

    @Override
    public String toString() {
        return "Vereador{" +
                "nome='" + nome + '\'' +
                ", partido='" + partido + '\'' +
                ", qtdProjeto=" + qtdProjeto +
                ", qtdProjetoAprovado=" + qtdProjetoAprovado +
                '}';
    }
}
