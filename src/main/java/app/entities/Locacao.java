package app.entities;

import javax.persistence.*;

@Entity
public class Locacao {

    @Id
    @GeneratedValue(strategy=GenerationType.IDENTITY)
    @Column
    private int locacaoId;

    @Column @OneToOne
    @JoinColumn(name = "filmeId")
    private Filme filme;

    @Column @OneToOne
    @JoinColumn(name = "socioId")
    private Socio socio;

    @Column
    private String status;

    public Locacao(int locacaoId, Filme filme, Socio socio, String status) {
        this.locacaoId = locacaoId;
        this.filme = filme;
        this.socio = socio;
        this.status = status;
    }

    public Locacao(Filme filme, Socio socio) {
        this.filme = filme;
        this.socio = socio;
    }

    public int getLocacaoId() {
        return locacaoId;
    }

    public void setLocacaoId(int locacaoId) {
        this.locacaoId = locacaoId;
    }

    public Filme getFilme() {
        return filme;
    }

    public void setFilme(Filme filme) {
        this.filme = filme;
    }

    public Socio getSocio() {
        return socio;
    }

    public void setSocio(Socio socio) {
        this.socio = socio;
    }
}
