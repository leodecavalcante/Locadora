package app.entities;

import app.enums.LocacaoEnum;

import javax.persistence.*;
import java.util.List;

@Entity
public class Filme {

    @Id
    @GeneratedValue(strategy= GenerationType.IDENTITY)
    @Column
    private int filmeId;

    @Column
    private String titulo;

    @Column
    private List<Categoria> categoria;

    @Column
    private int quantidade;

    @Column
    private LocacaoEnum locacaoEnum;

    public Filme(String titulo, List<Categoria> categoria, int quantidade) {
        this.titulo = titulo;
        this.categoria = categoria;
        this.quantidade = quantidade;
    }

    public int getFilmeId() {
        return filmeId;
    }

    public void setFilmeId(int filmeId) {
        this.filmeId = filmeId;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public List<Categoria> getCategoria() {
        return categoria;
    }

    public void setCategoria(List<Categoria> categoria) {
        this.categoria = categoria;
    }

    public int getQuantidade() {
        return quantidade;
    }

    public void setQuantidade(int quantidade) {
        this.quantidade = quantidade;
    }
}
