package excepciones;
import java.util.*;

public class SumaInversosEsCeroException extends Exception {

    private List sumaInversosEsCeroException;

    public SumaInversosEsCeroException(){}

    public SumaInversosEsCeroException(List sumaInversosEsCeroException){
        this.sumaInversosEsCeroException=sumaInversosEsCeroException;
    }

    public List getSumaInversosEsCeroException(){
        return sumaInversosEsCeroException;
    }

}
