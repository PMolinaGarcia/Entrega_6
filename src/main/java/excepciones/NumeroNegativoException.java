package excepciones;

public class NumeroNegativoException extends RuntimeException {

    private int numeroNegativoException;

    public NumeroNegativoException(){}

    public NumeroNegativoException(int numeroNegativoException){
        this.numeroNegativoException=numeroNegativoException;
    }

    public int getNumeroNegativoException(){
        return numeroNegativoException;
    }

}
