package excepciones;
import java.util.*;

public class ListaVaciaException extends RuntimeException {

  private List listaVaciaException;

  public ListaVaciaException(){}

  public ListaVaciaException(List listaVaciaException){
    this.listaVaciaException=listaVaciaException;
  }

  public List getListaVaciaException(){
    return listaVaciaException;
  }
}
