package app.entities;

import javax.persistence.*;

@Entity
public class Socio {

    @Id
    @GeneratedValue(strategy= GenerationType.IDENTITY)
    @Column
    private int socioId;

    @Column
    private String nome;

    @Column
    private int idade;

    @Column
    private String cpf;

    public Socio(String nome, int idade, String cpf) {
        this.nome = nome;
        this.idade = idade;
        this.cpf = cpf;
    }

    public int getSocioId() {
        return socioId;
    }

    public void setSocioId(int socioId) {
        this.socioId = socioId;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getIdade() {
        return idade;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }

    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }
}
