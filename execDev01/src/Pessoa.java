import java.security.PublicKey;

public class Pessoa {

    private String nome;
    private String sexo;
    private String cpf;
    private String dataNascimento;
    private int idade;




    public Pessoa(String cpf, String dataNascimento, int idade, String nome, String sexo) {
        this.cpf = cpf;
        this.dataNascimento = dataNascimento;
        this.idade = idade;
        this.nome = nome;
        this.sexo = sexo;
    }

    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    public String getDataNascimento() {
        return dataNascimento;
    }

    public void setDataNascimento(String dataNascimento) {
        this.dataNascimento = dataNascimento;
    }

    public int getIdade() {
        return idade;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getSexo() {
        return sexo;
    }

    public void setSexo(String sexo) {
        this.sexo = sexo;
    }

    @Override
    public String toString() {
        return "Pessoa{" +
                "cpf='" + cpf + '\'' +
                ", nome='" + nome + '\'' +
                ", sexo='" + sexo + '\'' +
                ", dataNascimento='" + dataNascimento + '\'' +
                ", idade=" + idade +
                '}';
    }
}
