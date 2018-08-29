import tdd.Mediana;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

public class Testes {
    
    public Testes() {
    }
    
    @Test
    public void testevetorordenadoimpar() {
        double vet [] = {1,2,3,4,5};
        Mediana mediana= new Mediana ();
        double res = mediana.calcularMediana(vet);
        assertEquals(3, res, 0.01);
    }
    
    @Test
    public void testevetorordenadopar () {
        double vet [] = {1,2,3,4,5,6};
        Mediana mediana= new Mediana ();
        double res = mediana.calcularMediana(vet);
        assertEquals(3.5, res, 0.01);
    }
}
