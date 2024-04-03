import metier.Calcul;
import org.testng.Assert;
import org.testng.annotations.Test;




public class CalculTest {

    private Calcul calcul;
    @Test
    public void testSomme(){
        calcul = new Calcul();
        double a = 3, b= 4;
        double expected = 7;
        double res = calcul.somme(a,b);
        Assert.assertTrue(expected == res);



    }

}
