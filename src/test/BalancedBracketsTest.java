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
    /*@Test
    public void name9(){
        assertFalse(BalancedBrackets.hasBalancedBrackets());
    }
    @Test
    public void name10(){
        assertFalse(BalancedBrackets.hasBalancedBrackets());
    }
    @Test
    public void name11(){
        assertFalse(BalancedBrackets.hasBalancedBrackets());
    }
    @Test
    public void name12(){
        assertFalse(BalancedBrackets.hasBalancedBrackets());
    }
    */


    /*

    blank
    null
    no brackets
    starts with close
    ends with open
    odd num of total brackets


    //True
    "[]"
    "[[]]"
    "[][]"
    "[][][]" 3 sep
    "[[[]]]" 1 sep in 2 nest
    "[][[]]" 1 sep, 2 nest
    "[[]][]" 2 nest, 1 sep
    "[[][]]" 2 sep in 1 nest
    "[][][][]" 4 sep
    "[[[[]]]]" 4 nest
    "[][[[]]]" 1 sep, 3 nest
    "[[[]]][]" 3 nest, 1 sep
    "[][][[]]" 2 sep, 2 nest
    "[[]][][]" 2 nest, 2 sep
    "[][[]][]" 1 sep, 2 nest, 1 sep
    "[[][][]]" 3 sep in 1 nest
    "[[[][]]]" 2 sep in 2 nest
    "[[][]][]" 2 sep in 1 nest, 1 sep
    "[][[][]]" 1 sep, 2 sep in 1 nest


    //no bracket always false
    ""

    //one bracket always false
    "["
    "]"

    //2 brackets: three false, one true
    "]["
    "[["
    "]]"
    true "[]"

    //3 brackets, ALWAYS false
    "[[["
    "[]]"
    "[[]"
    "[]["
    "]]]"
    "][["
    "][]"
    "]]["

    //4 brackets
    "[[]["
    "][]["
    "][]]"
    ""abc"
    "]abc"
    "[abc"
    "abc["
    "abc["
    "][abc"
    */

}
