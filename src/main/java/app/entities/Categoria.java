package app.entities;

import javax.persistence.*;

@Entity
public class Categoria {

    @Id
    @GeneratedValue(strategy= GenerationType.IDENTITY)
    @Column
    private int categoriaID;

    @Column
    private String nome;

    public Categoria(String nome) {
        this.nome = nome;
    }

    public int getCategoriaID() {
        return categoriaID;
    }

    public void setCategoriaID(int categoriaID) {
        this.categoriaID = categoriaID;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }
}
