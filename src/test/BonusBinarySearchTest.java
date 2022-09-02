package test;

import main.BonusBinarySearch;
import org.junit.Before;
import org.junit.Test;

import java.util.Arrays;
import java.util.Random;

import static org.junit.Assert.*;

public class BonusBinarySearchTest {

    int[] nums;
    int search;
    int expected;
    int exclusiveUpperBound = 100;
    int inclusiveLowerBound = 1;
    int arraySize = 13;
    Random generator = new Random();
    @Before
    public void createArray() {
//        nums = new int[]{2, 5, 25, 28, 47, 17, 9, 3, 6, 8, 13, 18, 21, 7};
//        Arrays.sort(nums);
//        System.out.println(Arrays.toString(nums));
//        // set array version
//        nums = new int[]{2, 3, 5, 6, 7, 8, 9, 13, 17, 18, 21, 25, 28, 47};

        // random array version
        nums = generator.ints(arraySize,inclusiveLowerBound,exclusiveUpperBound).toArray();
        Arrays.sort(nums);
    }

//    @Test
//    public void emptyTest() {
//        assertEquals(true,true);
//    }

    //version with random array
    @Test
    public void numNotFoundAboveReturnsNeg1() {
        search = exclusiveUpperBound;
        expected = -1;
        int result = BonusBinarySearch.binarySearch(nums,search);
        assertEquals(expected,result);
    }
    @Test
    public void numNotFoundBelowReturnsNeg1() {
        search = inclusiveLowerBound-1;
        expected = -1;
        int result = BonusBinarySearch.binarySearch(nums,search);
        assertEquals(expected,result);
    }
    @Test
    public void numFoundAtStart() {
        search = nums[0];
        expected = Arrays.binarySearch(nums,search);
        int result = BonusBinarySearch.binarySearch(nums,search);
        assertEquals(expected,result);
    }
    @Test
    public void numFoundAtEnd() {
        search = nums[nums.length-1];
        expected = Arrays.binarySearch(nums,search);
        int result = BonusBinarySearch.binarySearch(nums,search);
        assertEquals(expected,result);
    }
    @Test
    public void numFoundInMiddle() {
        search = nums[generator.ints(1,1,arraySize-2).findFirst().getAsInt()];
        expected = Arrays.binarySearch(nums,search);
        int result = BonusBinarySearch.binarySearch(nums,search);
        assertEquals(expected,result);
    }

//  //version with set array
//    @Test
//    public void numNotFoundAboveReturnsNeg1() {
//        search = 100;
//        expected = -1;
//        int result = BonusBinarySearch.binarySearch(nums,search);
////        System.out.println(expected+", "+result);
//        assertEquals(expected,result);
//    }
//    @Test
//    public void numNotFoundBelowReturnsNeg1() {
//        search = 1;
//        expected = -1;
//        int result = BonusBinarySearch.binarySearch(nums,search);
////        System.out.println(expected+", "+result);
//        assertEquals(expected,result);
//    }
//    @Test
//    public void numFoundAtStart() {
//        search = 2;
//        expected = Arrays.binarySearch(nums,search);
//        int result = BonusBinarySearch.binarySearch(nums,search);
////        System.out.println(expected+", "+result);
//        assertEquals(expected,result);
//    }
//    @Test
//    public void numFoundAtEnd() {
//        search = 47;
//        expected = Arrays.binarySearch(nums,search);
//        int result = BonusBinarySearch.binarySearch(nums,search);
////        System.out.println(expected+", "+result);
//        assertEquals(expected,result);
//    }
//    @Test
//    public void numFoundInMiddle() {
//        search = 7;
//        expected = Arrays.binarySearch(nums,search);
//        int result = BonusBinarySearch.binarySearch(nums,search);
////        System.out.println(expected+", "+result);
//        assertEquals(expected,result);
//    }


}

