package arrays;

import homeWork7.arrays.ImprovedArray;
import org.junit.Assert;
import org.junit.Test;

/**
 * Created by Александр on 27.03.2016.
 */
public class ImprovedArrayTest {

    @Test
    public void newInstanceShouldBeEmpty() {

        ImprovedArray improvedArray = new ImprovedArray();

        Assert.assertEquals(0, improvedArray.size());
    }

    @Test
    public void sizeShouldBeChangedOnAdd() {

        ImprovedArray improvedArray = new ImprovedArray();

        improvedArray.add("Cat");
        improvedArray.add("Cat");
        improvedArray.add("Cat");

        Assert.assertEquals(3, improvedArray.size());
    }

    @Test
    public void theElementShouldBeGetOnIndex() {

        ImprovedArray improvedArray = new ImprovedArray();

        improvedArray.add("Cat");
        improvedArray.add("Dog");
        improvedArray.add("Lion");

        Assert.assertEquals("Cat", improvedArray.get(0));
    }

    @Test
    public void ifTheElementsAreEqualTrueShouldBeReturned() {

        ImprovedArray improvedArray = new ImprovedArray();
        ImprovedArray improvedArray1 = new ImprovedArray();

        improvedArray.add("Cat");
        improvedArray1.add("Cat");

        Assert.assertEquals(true, improvedArray.equals(improvedArray1));
    }
}
