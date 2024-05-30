package br.com.bookraiders.model;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

import java.time.LocalDate;

@Entity
public class Emprestimo {

    @Id @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private LocalDate dataRetirada;
    private LocalDate dataEntragaPrev;
    private LocalDate dataEntregaReal;
    private Long idDono;
    private Long idTomador;
    private Long idLivro;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public LocalDate getDataRetirada() {
        return dataRetirada;
    }

    public void setDataRetirada(LocalDate dataRetirada) {
        this.dataRetirada = dataRetirada;
    }

    public LocalDate getDataEntragaPrev() {
        return dataEntragaPrev;
    }

    public void setDataEntragaPrev(LocalDate dataEntragaPrev) {
        this.dataEntragaPrev = dataEntragaPrev;
    }

    public LocalDate getDataEntregaReal() {
        return dataEntregaReal;
    }

    public void setDataEntregaReal(LocalDate dataEntregaReal) {
        this.dataEntregaReal = dataEntregaReal;
    }

    public Long getIdDono() {
        return idDono;
    }

    public void setIdDono(Long idDono) {
        this.idDono = idDono;
    }

    public Long getIdTomador() {
        return idTomador;
    }

    public void setIdTomador(Long idTomador) {
        this.idTomador = idTomador;
    }

    public Long getIdLivro() {
        return idLivro;
    }

    public void setIdLivro(Long idLivro) {
        this.idLivro = idLivro;
    }
}
