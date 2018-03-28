
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author gabriel de carli
 */
public class TestVetor {

    public TestVetor() {
    }

    @BeforeClass
    public static void setUpClass() {
    }

    @AfterClass
    public static void tearDownClass() {
    }

    @Before
    public void setUp() {
    }

    @After
    public void tearDown() {
    }

    @Test
    public void TestMaior() {
        double a[] = {1.1, 2.1, 4.1, 5.1, 7.1, 3.1};
        Vetores v = new Vetores();
        int n;
        n = 3;
        double[] maiores = new double[n];
        maiores = v.maiorvetor(a, n);

        assertEquals(7.1, maiores[0], 0.001);
        assertEquals(5.1, maiores[1], 0.001);
        assertEquals(4.1, maiores[2], 0.001);
    }
}
