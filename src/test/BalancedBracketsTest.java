package test;

import main.BalancedBrackets;
import org.junit.Test;

import static org.junit.Assert.*;

public class BalancedBracketsTest {

    //TODO: add tests here
//    @Test
//    public void emptyTest() {
//        assertEquals(true, true);
//    }
    @Test
    public void pairsReturnTrue(){
        assertTrue(BalancedBrackets.hasBalancedBrackets("[]"));
        assertTrue(BalancedBrackets.hasBalancedBrackets("[][]"));
    }
    @Test
    public void nestedReturnTrue(){
        assertTrue(BalancedBrackets.hasBalancedBrackets("[[]]"));
        assertTrue(BalancedBrackets.hasBalancedBrackets("[[[]]]"));
        assertTrue(BalancedBrackets.hasBalancedBrackets("[[[[[[[]]]]]]]"));
    }
    @Test
    public void nestedAndPairsReturnTrue(){
        assertTrue(BalancedBrackets.hasBalancedBrackets("[[]][]"));
        assertTrue(BalancedBrackets.hasBalancedBrackets("[][[[]]]"));
        assertTrue(BalancedBrackets.hasBalancedBrackets("[[[][][]]]"));
    }
    @Test
    public void balancedAroundOtherCharReturnsTrue(){
        assertTrue(BalancedBrackets.hasBalancedBrackets("[a]"));
        assertTrue(BalancedBrackets.hasBalancedBrackets("[abc]"));
        assertTrue(BalancedBrackets.hasBalancedBrackets("[[a]]"));
        assertTrue(BalancedBrackets.hasBalancedBrackets("[a[b]c]"));
    }
    @Test
    public void balancedSurroundedByOtherCharReturnsTrue(){
        assertTrue(BalancedBrackets.hasBalancedBrackets("a[]b"));
        assertTrue(BalancedBrackets.hasBalancedBrackets("a[[]]b"));
        assertTrue(BalancedBrackets.hasBalancedBrackets("a[]b[]c"));
    }
    @Test
    public void blankReturnsFalse(){
        assertFalse(BalancedBrackets.hasBalancedBrackets(""));
    }
    @Test(expected = NullPointerException.class)
    public void nullReturnsNPE() {
        assertFalse(BalancedBrackets.hasBalancedBrackets(null));
        fail("shouldn't get here, expected NullPointerException or false");
    }
    @Test
    public void noBracketsReturnsFalse(){
        assertFalse(BalancedBrackets.hasBalancedBrackets("a"));
    }
    @Test
    public void startsWithCloseEvenNumReturnsFalse(){
        assertFalse(BalancedBrackets.hasBalancedBrackets("][[][][]"));
    }
    @Test
    public void endsWithOpenEvenNumReturnsFalse() {
        assertFalse(BalancedBrackets.hasBalancedBrackets("[][]]["));
    }
    @Test
    public void anyOddNumTotalBracketsReturnsFalse(){
        assertFalse(BalancedBrackets.hasBalancedBrackets("[[]"));
        assertFalse(BalancedBrackets.hasBalancedBrackets("[]]"));
        assertFalse(BalancedBrackets.hasBalancedBrackets("[][]]"));
        assertFalse(BalancedBrackets.hasBalancedBrackets("[[][]"));
        assertFalse(BalancedBrackets.hasBalancedBrackets("[][][]]"));
        assertFalse(BalancedBrackets.hasBalancedBrackets("[[[[]]]"));
        assertFalse(BalancedBrackets.hasBalancedBrackets("[[[[[[[[]]]]]]]]]"));

    }
    @Test
    public void anyBalancedBracketsBadOrderReturnsFalse(){
        assertFalse(BalancedBrackets.hasBalancedBrackets("[]][[]"));
        assertFalse(BalancedBrackets.hasBalancedBrackets("[]][][][[]"));
    }
}
