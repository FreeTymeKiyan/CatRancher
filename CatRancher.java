import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

/**
 * @author FreeTymeKiyan
 * @date 2013-10-13
 */
public class CatRancher implements Constants{
    
    static List<String> haul = new ArrayList<String>();
    static ArrayList<String[]> output = new ArrayList<String[]>();
    
    public static void main(String args[]) {
        // scan input
        Scanner scan = new Scanner(System.in);
        while (scan.hasNextLine()) {
            String[] nextLine = scan.nextLine().split(SPACE_SEPERATOR);
            for (int i = 0; i < nextLine.length; i++) {
                if (!isInputValid(nextLine[i])) {
                    System.out.println("invalud input: " + nextLine[i]);
                } else { // input valid
                    haul.add(nextLine[i]);
                    int size = haul.size();
                    if (size == nextLine.length) {
                        if (size == HAUL_SIZE_12 
                                || size == HAUL_SIZE_15) {
                            findQualityTrio();
                            formatOutput();
                            afterOutput();
                        } else {
                            System.out.println("size wrong, skip this line");
                        }
                    } else {
            //                  System.out.println("plz add more cats to fill the haul");
                    }
                }
            }
        }
        scan.close(); 
    }
    
    /**
     * Judge whether an input is valid
     * 
     * @param input
     * @return
     */
    private static boolean isInputValid(String input) {
        if (POSSIBLE_INPUT.contains(input) 
                && input.length() == VALID_INPUT_LENGTH) {
            return true;
        }
        return false;
    }
    
    /**
     * Find QualityTrio from input 
     * Add it to the output list
     */
    private static void findQualityTrio() {
        for (int i = 0; i < haul.size() - 2; i++) {
            for (int j = i + 1; j < haul.size() - 1; j++) {
                for (int k = j + 1; k < haul.size(); k++) {
                    if (isQualityTrio(haul.get(i), 
                            haul.get(j), haul.get(k))) {
                        String[] temp = new 
                                String[]{
                                haul.get(i),
                                haul.get(j), 
                                haul.get(k)};
                        Arrays.sort(temp);
                        output.add(temp);
                    }
                }
            }
        }
    }
    
    /**
     * Judge whether a group of three cats is quality trio
     * 
     * @param catsCode
     * @return  true    if it is
     *          false   if it's not
     */
    private static boolean isQualityTrio(String cat1, String cat2, String cat3) {
        for (int i = 0; i < cat1.length(); i++) {
            if (cat1.charAt(i) == cat2.charAt(i) 
                    && cat1.charAt(i) == cat3.charAt(i)) {// all the same
                continue; // compare next bit
            } else if (cat1.charAt(i) != cat2.charAt(i) 
                    && cat1.charAt(i) != cat3.charAt(i)
                    && cat2.charAt(i) != cat3.charAt(i)) {// all different
                continue; // compare next bit
            } else {
//                System.out.println("not quality trio");
                return false;
            }
        }
//        System.out.println("is quality trio");
        return true;
    }
    
    /**
     * Generate result in a given format
     * Use comma seperator between cats
     * Use space seperator between QualityTrios
     * 
     * Eg:
     *      1tsb,2wsb,3bsb 1tsr,2trb,3ttg 1tsr,2wsg,3bsb 1wrb,2bsr,3ttg
     */
    private static void formatOutput() {
        // sort string arrays
        Collections.sort(output, new StringArrayComparator());
        for (int i = 0; i < output.size(); i++) {
            String[] temp = output.get(i);
            for (int j = 0; j < temp.length; j++) {
                if (j != temp.length - 1) {
                    System.out.print(temp[j] + COMMA_SEPERATOR);
                    continue;
                }
                System.out.print(temp[j] + SPACE_SEPERATOR);
            }
        }
        System.out.println();
    }
    
    /**
     * Do some cleaning
     * Get prepared for the next loop
     */
    private static void afterOutput() {
        output.clear();
//        haul = haul.subList(HAUL_SIZE, haul.size());
        haul.clear();
    }
}
