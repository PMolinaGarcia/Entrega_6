package org.entrg6;

import excepciones.ListaConCeroException;
import excepciones.ListaVaciaException;
import excepciones.SumaInversosEsCeroException;
import org.junit.Test;
import static org.junit.Assert.*;
import java.util.*;


public class AppTest 
{

    //Creamos un test en el que admitamos un error en el valor calculado, de tal forma que si
    //el valor real es 2.718, si da 2.719 también lo admitamos como válido.
    //Hemos hecho la prueba con x=1, de tal forma que el resultado se corresponda con el número e.
    //También hemos diseñado pruebas para los casos "raros" dentro del código, que son cuando metemos 0..
    //Después de comprobar el valor que tiene que dar y observar un fallo, comenzamos
    //a probar con la implementación de un método que pueda pasar las pruebas.
    @Test
    public void testEXTaylor() {
        assertEquals(2.7182818284,App.eXTaylorIterativo(1, 10), 0.0000001);
    }
    //Creamos un test en el que intentamos que falle pasándole 0 como valor de todo.
    @Test
    public void testEXTaylorCeroTodo() {
        assertEquals(1,App.eXTaylorIterativo(0, 0), 0);
    }
    //Creamos un test para que falle al pasarle 0 como n.
    @Test
    public void testEXTaylorCeroN() {
        assertEquals(1,App.eXTaylorIterativo(10, 0), 0);
    }
    //Creamos un test para que falle al pasarle 0 como x.
    @Test
    public void testEXTaylorCeroX() {
        assertEquals(1,App.eXTaylorIterativo(0, 10), 0);
    }
    @Test
    public void testEXTaylorNegativo() {
        assertEquals(0.3678794411,App.eXTaylorIterativo(-1, 10), 0.0000001);
    }
    @Test
    public void testEXTaylorRecursivoCeroTodo() {
        assertEquals(1,App.eXTaylorRecursivo(0,0), 0);
    }
    @Test
    public void testEXTaylorRecursivoCeroX() {
        assertEquals(1,App.eXTaylorRecursivo(0,10), 0);
    }
    @Test
    public void testEXTaylorRecursivoCeroN() {
        assertEquals(1,App.eXTaylorRecursivo(10,0), 0);
    }
    @Test
    public void testEXTaylorRecursivo() {
        assertEquals(2.7182818284,App.eXTaylorRecursivo(1,10), 0.0000001);
    }
    @Test
    public void testEXTaylorRecursivoNegativo() {
        assertEquals(0.3678794411,App.eXTaylorRecursivo(-1,10), 0.0000001);
    }
    @Test
    public void testMediaArmonicaVacia() throws ListaVaciaException, ListaConCeroException, SumaInversosEsCeroException {
        Double[] array1 = {};
        List <Double> lista1 = Arrays.asList(array1);
        assertEquals(0, App.mediaArmonica(lista1),0);
    }
    @Test
    public void testMediaArmonicaElemento0() throws ListaVaciaException, ListaConCeroException, SumaInversosEsCeroException {
        Double[] array1 = {0.0,0.0,0.0};
        List <Double> lista1 = Arrays.asList(array1);
        assertEquals(0, App.mediaArmonica(lista1),0);
    }
    @Test
    public void testMediaArmonicaSumaInversosEsCero() throws ListaVaciaException, ListaConCeroException, SumaInversosEsCeroException {
        Double[] array1 = {1.0, -1.0};
        List <Double> lista1 = Arrays.asList(array1);
        assertEquals(0, App.mediaArmonica(lista1),0);
    }
    @Test
    public void testMediaArmonicaNegativos() throws ListaVaciaException, ListaConCeroException, SumaInversosEsCeroException {
        Double[] array1 = {-1.0,-2.0,-3.0,-4.0,-5.0};
        List <Double> lista1 = Arrays.asList(array1);
        assertEquals(-2.1898, App.mediaArmonica(lista1),0.0001);
    }
    @Test
    public void testMediaArmonica() throws ListaVaciaException, ListaConCeroException, SumaInversosEsCeroException {
        Double[] array1 = {1.0, 2.0, 3.0, 4.0, 5.0};
        List<Double> lista1 = Arrays.asList(array1);
        assertEquals(2.1898, App.mediaArmonica(lista1), 0.0001);
    }



}
