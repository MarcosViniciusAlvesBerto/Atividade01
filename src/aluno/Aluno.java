package aluno;
import javax.swing.JOptionPane;

public class Aluno {
    
    private String nome;
    private String curso;
    private int idade;
    private int RA;

    public Aluno() {
    }

    public Aluno(String nome, String curso, int idade, int RA) {
        this.nome = nome;
        this.curso = curso;
        this.idade = idade;
        this.RA = RA;
    }

    public String getNome() {
        nome = JOptionPane.showInputDialog("qual o seu nome?");
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getCurso() {
        curso = JOptionPane.showInputDialog("qual o seu curso?");
        return curso;
    }

    public void setCurso(String curso) {
        this.curso = curso;
    }

    public int getIdade() {
        idade = Integer.parseInt(JOptionPane.showInputDialog("qual sua idade?"));
        return idade;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }

    public int getRA() {
        RA = Integer.parseInt(JOptionPane.showInputDialog("qual o seu RA?"));
        return RA;
    }

    public void setRA(int RA) {
        this.RA = RA;
    }
   
    
}
