import com.dnk.Candle;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class CandleTest {
    private Candle candle = new Candle("20170907,000000,1.1915800,1.2059700,1.1913000,1.2020000,1894644");
                                                                //op        hi      low      close     vol
    @Test
    public void getDATE() {

        Assert.assertEquals(candle.getDATE(), "20170907");
    }

    @Test
    public void getTIME() {
        Assert.assertEquals(candle.getTIME(), "000000");
    }

    @Test
    public void getOPEN() {
        Assert.assertEquals(candle.getOPEN(), Float.parseFloat("1.1915800"), 0.00000001);
    }

    @Test
    public void getHIGH() {
        Assert.assertEquals(candle.getHIGH(), Float.parseFloat("1.2059700"), 0.00000001);
    }

    @Test
    public void getLOW() {
        Assert.assertEquals(candle.getLOW(), Float.parseFloat("1.1913000"), 0.00000001);
    }

    @Test
    public void getCLOSE() {
        Assert.assertEquals(candle.getCLOSE(), Float.parseFloat("1.2020000"), 0.00000001);
    }

    @Test
    public void getVOL() {
        Assert.assertEquals(candle.getVOL(), Integer.parseInt("1894644"));
    }
}