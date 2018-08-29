
import tdd.Mediana;
import tdd.Media;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;
import tdd.MaioreMenor;
import tdd.DesvioPadrao;
public class Testes {

    public Testes() {
    }

    @Test
    public void TesteMedianaVetorImpar() {
        double vet[] = {1, 2, 3, 4, 5};
        Mediana mediana = new Mediana();
        double res = mediana.calcularMediana(vet);
        assertEquals(3, res, 0.01);
    }

    @Test
    public void TesteMedianaVetorPar() {
        double vet[] = {1, 2, 3, 4, 5, 6};
        Mediana mediana = new Mediana();
        double res = mediana.calcularMediana(vet);
        assertEquals(3.5, res, 0.01);
    }

    @Test
    public void TesteMedia() {
        double vet[] = {1, 2, 3, 4, 5, 6};
        Media media = new Media();
        double res = media.calcularMedia(vet);
        assertEquals(3.5, res, 0.01);
    }

    @Test
    public void TesteMaior() {
        double vet[] = {1, 2, 3, 4, 5, 6};
        Media maior = new Media();
        double res = maior.verificarMaior(vet);
        assertEquals(6, res, 0.01);
    }

    @Test
    public void TesteMenor() {
        double vet[] = {1, 2, 3, 4, 5, 6};
        Media menor = new Media();
        double res = menor.verificarMenor(vet);
        assertEquals(1, res, 0.01);
    }

    @Test
    public void TesteAcimaMedia() {
        double vet[] = {1, 2, 3, 4, 5, 6};
        Media acima = new Media();
        double res = acima.verificarAcimaMedia(vet);
        assertEquals(3, res, 0.01);
    }

    @Test
    public void TesteAbaixoMedia() {
        double vet[] = {1, 2, 3, 4, 5, 6};
        Media abaixo = new Media();
        double res = abaixo.verificarAbaixoMedia(vet);
        assertEquals(3, res, 0.01);
    }

    @Test
    public void TesteDesvioPadrao() {
        double vet[] = {1, 2, 3, 4, 5};
        DesvioPadrao desvio = new DesvioPadrao();
        double res = desvio.calcularDesvioPadrao(vet);
        assertEquals(1.58114, res, 0.01);
    }
}
