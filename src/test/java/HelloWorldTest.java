import org.testng.Assert;
import org.testng.annotations.Test;

public class HelloWorldTest {

    @Test
    public void HelloWordIsShowed(){
        HelloWorld helloWorld = new HelloWorld();
        String text = helloWorld.Hello();
        Assert.assertEquals(text,"Hello World");
    }

}
