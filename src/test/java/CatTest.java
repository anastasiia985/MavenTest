package test.java;

import main.java.Cat;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;

public class CatTest {
    Cat newCat;
    @BeforeEach
    public void setUp(){
        newCat= new Cat("Murka", 3);
    }
    @Test
    public  void shouldGetAge(){
        newCat.getAge();
        Assertions.assertEquals(3, newCat.getAge());
    }
    @Test
    public void shouldMeow(){
        ByteArrayOutputStream output = new ByteArrayOutputStream();
        System.setOut(new PrintStream(output));
        newCat.meow();
        Assertions.assertEquals(output.toString(), "Meow!\r\n");
    }
    @Test
    public void shouldSetName (){
        newCat.name="Vaska";
        Assertions.assertEquals(newCat.name, "Vaska");
    }
    @Test
    public void shouldGetName (){
        Assertions.assertEquals(newCat.name, "Murka");
    }
    @AfterEach
    public void remove(){
        newCat=null;
    }

}


