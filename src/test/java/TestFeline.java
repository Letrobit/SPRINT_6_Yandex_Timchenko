import com.example.Feline;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.mockito.Spy;
import org.mockito.junit.MockitoJUnitRunner;

import java.util.List;

import static org.junit.Assert.assertEquals;
@RunWith(MockitoJUnitRunner.class)
public class TestFeline {
    private static final String EXPECTED_FAMILY = "Кошачьи";
    private static final int NUMBER_OF_KITTENS = 10;
    @Mock
    public Feline feline;

    @Test
    public void getFamilyExpectedCat(){
        Mockito.when(feline.getFamily()).thenReturn(EXPECTED_FAMILY);
        assertEquals(EXPECTED_FAMILY,feline.getFamily());
    }
    @Test
    public void getFoodExpectedPredator() throws Exception {
        Mockito.when(feline.eatMeat()).thenReturn(List.of("Животные", "Птицы", "Рыба"));
        assertEquals(List.of("Животные", "Птицы", "Рыба"),feline.eatMeat());
    }
    @Test
    public void getKittensNoParamsShouldReturnOne(){
        Mockito.when(feline.getKittens()).thenReturn(1);
        assertEquals(1,feline.getKittens());
    }

    @Test
    public void getKittensParamsTrueShouldReturnSame(){
        Mockito.when(feline.getKittens(NUMBER_OF_KITTENS)).thenReturn(NUMBER_OF_KITTENS);
        assertEquals(NUMBER_OF_KITTENS,feline.getKittens(NUMBER_OF_KITTENS));
    }

}
