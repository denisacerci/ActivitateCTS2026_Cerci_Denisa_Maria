package teste;

import clase.CalatorAbonat;
import org.junit.Assert;

public class CalatorAbonatTest {

    @org.junit.Test
    public void testPlatesteBilet() {
        CalatorAbonat calatorAbonat=new CalatorAbonat("Nick");
        calatorAbonat.setSold(5.5f);
        calatorAbonat.platesteBilet(1f);

        Assert.assertEquals(4.5f,calatorAbonat.getSold(),0.001f);
    }

    @org.junit.Test
    public void testPlatesteBiletInsuficient() {
        CalatorAbonat calatorAbonat=new CalatorAbonat("Nicki Jam");
        calatorAbonat.setSold(1f);
        calatorAbonat.platesteBilet(2f);

        Assert.assertEquals(1f,calatorAbonat.getSold(),0.001f);
    }



}

