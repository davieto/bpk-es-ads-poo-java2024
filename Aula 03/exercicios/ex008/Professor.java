package ex008;

public class Professor {
    private String nome;
    private String materia;
    private int salario;

    public Professor(String nome,String materia, int salario){
        this.nome = nome;
        this.materia = materia;
        this.salario = salario;

    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getMateria() {
        return materia;
    }

    public void setMateria(String materia) {
        this.materia = materia;
    }

    public int getSalario() {
        return salario;
    }

    public void setSalario(int salario) {
        this.salario = salario;
    }

    void darAula(){
        System.out.println("Dar aula");
    }

    void corrigirProvas(){
        System.out.println("Corrigindo Provas");
    }


}
