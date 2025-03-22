package excepciones;
import java.util.*;

public class ListaConCeroException extends Exception {

    private List listaConCeroException;

    public ListaConCeroException(List listaConCeroException){
        this.listaConCeroException=listaConCeroException;
    }

    public ListaConCeroException(){}

    public List getListaConCeroException(){
        return listaConCeroException;
    }
}
