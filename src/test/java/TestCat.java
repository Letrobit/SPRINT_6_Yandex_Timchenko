import com.example.Cat;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.mockito.Spy;
import org.mockito.junit.MockitoJUnitRunner;
import com.example.Animal;
import com.example.Feline;

import java.util.List;

import static org.junit.Assert.assertEquals;

@RunWith(MockitoJUnitRunner.class)
public class TestCat {
    @Mock
    public Cat cat;

    @Spy
    public Feline feline;


    @Test
    public void getSoundTestMeowExpected() {
        Mockito.when(cat.getSound()).thenReturn("Мяу");
        assertEquals("Мяу", cat.getSound());
    }

    @Test
    public void getFoodTestPredatorResultExpected() throws Exception {
        Mockito.when(cat.getFood()).thenReturn(List.of("Животные", "Птицы", "Рыба"));
        assertEquals(List.of("Животные", "Птицы", "Рыба"), cat.getFood());

    }
}