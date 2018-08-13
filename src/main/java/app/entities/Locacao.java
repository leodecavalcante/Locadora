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

    public Locacao(int locacaoId, Filme filme, Socio socio) {
        this.locacaoId = locacaoId;
        this.filme = filme;
        this.socio = socio;
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
