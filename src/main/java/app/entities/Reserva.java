package app.entities;

import javax.persistence.Entity;

@Entity
public class Reserva {

    @Id
    @GeneratedValue(strategy=GenerationType.IDENTITY)
    @Column
    private int reservaoId;

    @Column @OneToOne
    @JoinColumn(name = "filmeId")
    private Filme filme;

    @Column @OneToOne
    @JoinColumn(name = "socioId")
    private Socio socio;

    public Reserva(int reservaoId, Filme filme, Socio socio) {
        this.reservaoId = reservaoId;
        this.filme = filme;
        this.socio = socio;
    }

    public Reserva(Filme filme, Socio socio) {
        this.filme = filme;
        this.socio = socio;
    }

    public int getReservaoId() {
        return reservaoId;
    }

    public void setReservaoId(int reservaoId) {
        this.reservaoId = reservaoId;
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
