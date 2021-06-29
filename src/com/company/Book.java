package com.company;

public class Book {

    private String título;
    private String isbn;
    private String autor;
    private boolean emprestado;

    public Book() {
    }

    public Book(String título, String isbn, String autor, boolean emprestado) {
        this.título = título;
        this.isbn = isbn;
        this.autor = autor;
        this.emprestado = emprestado;
    }

    public String getTítulo() {
        return título;
    }

    public String getIsbn() {
        return isbn;
    }

    public String getAutor() {
        return autor;
    }

    public boolean getEmprestado() {
        return emprestado;
    }

    public void setTítulo(String título) {
        this.título = título;
    }

    public void setIsbn(String isbn) {
        this.isbn = isbn;
    }

    public void setAutor(String autor) {
        this.autor = autor;
    }

    public void emprestar(){
        this.emprestado = true;
    }

    public void devolver(){
        this.emprestado = false;
    }


    @Override
    public String toString() {
        return isbn + "-->" +
                "\n\ttítulo: " + título +
                "\n\tautor: " + autor +
                "\n\temprestado:" + (emprestado ? "sim":"não");
    }


}
