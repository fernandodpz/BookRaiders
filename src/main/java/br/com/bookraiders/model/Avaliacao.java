package br.com.bookraiders.model;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

@Entity
public class Avaliacao {

    @Id @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private int notaEmprestimo;
    private int notaLivro;
    private String comentario;
    private Long idEmprestimo;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public int getNotaEmprestimo() {
        return notaEmprestimo;
    }

    public void setNotaEmprestimo(int notaEmprestimo) {
        this.notaEmprestimo = notaEmprestimo;
    }

    public int getNotaLivro() {
        return notaLivro;
    }

    public void setNotaLivro(int notaLivro) {
        this.notaLivro = notaLivro;
    }

    public String getComentario() {
        return comentario;
    }

    public void setComentario(String comentario) {
        this.comentario = comentario;
    }

    public Long getIdEmprestimo() {
        return idEmprestimo;
    }

    public void setIdEmprestimo(Long idEmprestimo) {
        this.idEmprestimo = idEmprestimo;
    }
}
