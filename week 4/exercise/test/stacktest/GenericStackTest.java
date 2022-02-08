package stacktest;

import org.junit.Before;
import org.junit.Test;
import stackdatastructure.GenericStack;
import stackdatastructure.IntStack;

import static org.junit.Assert.*;

public class GenericStackTest
{
    private GenericStack<String> aStack; //Fixture

    @Before
    public void setUp() throws Exception
    {
        aStack = new GenericStack<>();
    }

    @Test
    public void anEmptyStackShouldBeEmpty()
    {
        assertTrue(aStack.isEmpty());
    }

    @Test
    public void pushingAValueShouldGiveANonEmpty()
    {
        aStack.push("1");
        assertFalse(aStack.isEmpty());
    }

    @Test
    public void pushingThenPoppingShouldGiveAEmptyStack()
    {
        aStack.push("1");
        aStack.pop();
        assertTrue(aStack.isEmpty());
    }

    @Test
    public void topShouldBePushedValue()
    {
        aStack.push("1");
        assertEquals("1",aStack.top());
    }

    @Test
    public void pushingAndPoppingTwoValuesShouldGiveAnEmptyStack()
    {
        aStack.push("1");
        aStack.push("2");
        assertEquals("2",aStack.pop());
        assertEquals("1",aStack.pop());
        assertTrue(aStack.isEmpty());
    }
}
