package com.freetymekiyan.catrancher;

import java.util.Comparator;

/**
 * Define a comparator to compare two string arrays
 * 
 * @author FreeTymeKiyan
 * @date 2013-10-13
 */
public class StringArrayComparator implements Comparator<String[]>{

    @Override
    public int compare(String[] str1, String[] str2) {
        for (int i = 0; i < str1.length && i < str2.length; i++) {
            int result = str1[i].compareTo(str2[i]);
            if (result == 0) { // same, compare next one
                continue;
            } else { // different
                return result;
            }
        }
        return 0; // all the same
    }

}
