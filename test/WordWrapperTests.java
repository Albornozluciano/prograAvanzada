import org.junit.Assert;
import org.junit.Test;

public class WordWrapperTests {
    @Test
    public void queElObjectoExista(){
        Assert.assertNotNull(new WordWrapper());
    }

    @Test
    public void casoBasico() {
        WordWrapper miWrapper = new WordWrapper();
        Assert.assertEquals("", miWrapper.wrap("",1));
        Assert.assertEquals("palabra", miWrapper.wrap("palabra", 7));
    }

    @Test
    public void casoExcede(){
        WordWrapper miWrapper = new WordWrapper();
        Assert.assertEquals("palabro\nta", miWrapper.wrap("palabrota", 7));
        Assert.assertEquals("pal\nabr\nota", miWrapper.wrap("palabrota", 3));
    }

    @Test
    public void casoDosPalabras(){
        WordWrapper miWrapper = new WordWrapper();
        Assert.assertEquals("casa\ncasa", miWrapper.wrap("casa casa", 4));
        Assert.assertEquals("casa\ncaso\nna", miWrapper.wrap("casa casona", 4));
        Assert.assertEquals("casa\ncasa", miWrapper.wrap("casa casa", 5));
    }
}
