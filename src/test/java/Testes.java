import tdd.Mediana;
import tdd.Media;
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
    public void TesteMedianaVetorImpar() {
        double vet [] = {1,2,3,4,5};
        Mediana mediana= new Mediana ();
        double res = mediana.calcularMediana(vet);
        assertEquals(3, res, 0.01);
    }
    
    @Test
    public void TesteMedianaVetorPar () {
        double vet [] = {1,2,3,4,5,6};
        Mediana mediana= new Mediana ();
        double res = mediana.calcularMediana(vet);
        assertEquals(3.5, res, 0.01);
    }
    
    @Test
        public void TesteMedia () {
        double vet [] = {1,2,3,4,5,6};
        Media media = new Media ();
        double res = media.calcularMedia(vet);
        assertEquals(3.5, res, 0.01);
    }
}
