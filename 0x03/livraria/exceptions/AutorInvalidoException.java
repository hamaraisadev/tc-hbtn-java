package livraria.exceptions;

public class AutorInvalidoException extends Exception{

    public AutorInvalidoException(String autor){
        super(autor);
    }
}
