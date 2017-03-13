package ds.arrays.problem7;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

/**
 * Created by arun on 14/03/17.
 */
public class SolutionTest {

    int[] input;
    Solution sol;

    @Before
    public void init(){
        sol =new Solution();
        input = new int[]{1, 4, 45, 6, 10, -8};
    }


    @Test
    public void hashingApproach() throws Exception {
        Assert.assertTrue(sol.SortingApproach(input, 16));
    }


    @Test
    public void sortingApproach() throws Exception {

        Assert.assertTrue(sol.SortingApproach(input, 16));
    }

    @Test
    public void hashingApproach_negitive() throws Exception {
        Assert.assertTrue(sol.SortingApproach(input, 17));
    }

    @Test
    public void sortingApproach_negitive() throws Exception {

        Assert.assertFalse(sol.SortingApproach(input, 17));
    }


}