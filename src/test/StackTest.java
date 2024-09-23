package test;

import org.junit.jupiter.api.Test;
import project.MinStack;

import java.util.Stack;

import static java.lang.Integer.valueOf;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class StackTest {
    MinStack minStack=new MinStack();

    @Test
    void testMinAfterPush() {
        minStack.push(3);
        minStack.push(2);
        minStack.push(5);
        minStack.push(1);
        assertEquals( 1,minStack.min() );
    }
    @Test
    void testMinAfterPop(){
        minStack.push(3);
        minStack.push(2);
        minStack.push(5);
        minStack.push(1);
        minStack.pop();
        assertEquals(2, minStack.min());
    }
    @Test
    void Testmin(){
        minStack.push(1);
        minStack.push(2);
        minStack.push(3);
        minStack.push(4);
        assertEquals(1, minStack.min());
    }

}
