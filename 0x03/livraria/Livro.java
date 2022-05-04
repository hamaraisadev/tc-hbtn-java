

import livraria.exceptions.AutorInvalidoException;
import livraria.exceptions.LivroInvalidoException;

public class Livro {
    public String titulo;
    public String autor;
    public double preco;

    public Livro(String titulo, String autor, double preco) throws AutorInvalidoException, LivroInvalidoException {
        this.setTitulo(titulo);
        this.setAutor(autor);
        this.setPreco(preco);
    }

    public void setTitulo(String titulo) throws LivroInvalidoException {

        if (titulo.length() < 3) {
            throw new LivroInvalidoException("Titulo de livro invalido");

        } else this.titulo = titulo;
    }

    public void setAutor(String autor) throws AutorInvalidoException {

        if (!autor.contains(" ")) {
            throw new AutorInvalidoException("Nome de autor invalido");
        } else this.autor = autor;

    }

    public void setPreco(double preco) throws LivroInvalidoException {
        if (preco <= 0) {
            throw new LivroInvalidoException("Preco de livro invalido");
        } else this.preco = preco;
    }


    public double getPreco() {
        return preco;
    }

    public String getTitulo() {
        return titulo;
    }

    public String getAutor() {
        return autor;
    }

}





