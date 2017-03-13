package ds.arrays.problem7;

import java.util.Arrays;
import java.util.Collection;
import java.util.HashSet;
import java.util.Set;

/**
 * Created by arun on 14/03/17.
 */
public class Solution {

    public boolean SortingApproach(int[] input, int searchKey){
        boolean found = false;
        int i=0; int l=input.length-1;

        Arrays.sort(input);

        while(i<l){
            if(searchKey == input[i]+input[l]){
                found = true;
                break;
            }else if(searchKey < input[i]+input[l]){
                l--;
            }else{
                i++;
            }
        }

        return found;
    }

    public boolean hashingApproach(int[] input, int searchKey){
        boolean found = false;
        Set<Integer> elements = new HashSet<Integer>();

        for(int i=0; i<input.length; i++){
            elements.add(input[i]);
        }

        for(int i=0; i<input.length; i++){
            if(elements.contains(searchKey-input[i])){
                found =true;
                break;
            }
        }

        return found;
    }

}
