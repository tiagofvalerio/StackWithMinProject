package br.com.stack.test;

import org.junit.Assert;
import org.junit.Test;

import br.com.stack.StackWithMin;

public class StackWithMinTest {

    @Test
    public void shouldReturnMinFour() {
        StackWithMin stackWithMin = new StackWithMin();
        
        stackWithMin.push(new Integer(4));
        Assert.assertTrue(new Integer(4).compareTo(stackWithMin.min()) == 0);
    }
    
    @Test
    public void shouldReturnMinTwo() {
        StackWithMin stackWithMin = new StackWithMin();
        
        stackWithMin.push(new Integer(4));
        stackWithMin.push(new Integer(2));
        Assert.assertTrue(new Integer(2).compareTo(stackWithMin.min()) == 0);
    }
    
    @Test
    public void shouldReturnMinOne() {
        StackWithMin stackWithMin = new StackWithMin();
        
        stackWithMin.push(new Integer(4));
        stackWithMin.push(new Integer(2));
        stackWithMin.push(new Integer(2));
        stackWithMin.push(new Integer(5));
        stackWithMin.push(new Integer(3));
        stackWithMin.push(new Integer(1));
        Assert.assertTrue(new Integer(1).compareTo(stackWithMin.min()) == 0);
    }
    
    @Test
    public void shouldReturnMinTwoAfterPop() {
        StackWithMin stackWithMin = new StackWithMin();
        
        stackWithMin.push(new Integer(4));
        stackWithMin.push(new Integer(2));
        stackWithMin.push(new Integer(2));
        stackWithMin.push(new Integer(5));
        stackWithMin.push(new Integer(3));
        stackWithMin.push(new Integer(1));
        stackWithMin.pop();
        Assert.assertTrue(new Integer(2).compareTo(stackWithMin.min()) == 0);
    }
    
    @Test
    public void shouldReturnMinTwoAfterFourPops() {
        StackWithMin stackWithMin = new StackWithMin();
        
        stackWithMin.push(new Integer(4));
        stackWithMin.push(new Integer(2));
        stackWithMin.push(new Integer(2));
        stackWithMin.push(new Integer(5));
        stackWithMin.push(new Integer(3));
        stackWithMin.push(new Integer(1));
        stackWithMin.pop();
        stackWithMin.pop();
        stackWithMin.pop();
        stackWithMin.pop();
        Assert.assertTrue(new Integer(2).compareTo(stackWithMin.min()) == 0);
    }
    
    
}
