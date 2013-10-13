public interface Constants {
    
    /**All the possible inputs*/
    public static final String POSSIBLE_INPUT = "1btg 2btg 3btg "
            + "1btb 2btb 3btb "
            + "1btr 2btr 3btr "
            + "1bsg 2bsg 3bsg "
            + "1bsb 2bsb 3bsb "
            + "1bsr 2bsr 3bsr "
            + "1brg 2brg 3brg "
            + "1brb 2brb 3brb "
            + "1brr 2brr 3brr " // b ended
            + "1wtg 2wtg 3wtg "
            + "1wtb 2wtb 3wtb "
            + "1wtr 2wtr 3wtr "
            + "1wsg 2wsg 3wsg "
            + "1wsb 2wsb 3wsb "
            + "1wsr 2wsr 3wsr "
            + "1wrg 2wrg 3wrg "
            + "1wrb 2wrb 3wrb "
            + "1wrr 2wrr 3wrr " // w ended
            + "1ttg 2ttg 3ttg "
            + "1ttb 2ttb 3ttb "
            + "1ttr 2ttr 3ttr "
            + "1tsg 2tsg 3tsg "
            + "1tsb 2tsb 3tsb "
            + "1tsr 2tsr 3tsr "
            + "1trg 2trg 3trg "
            + "1trb 2trb 3trb "
            + "1trr 2trr 3trr"; // t ended
    
    /**The size of a haul*/
    public static final int HAUL_SIZE_12 = 12;
    /**The size of a haul*/
    public static final int HAUL_SIZE_15 = 15;
    /**The valid length of an input*/
    public static final int VALID_INPUT_LENGTH = 4;
    /**
     * Quality Trio is represented by a comma separated list 
     * of cat identification strings
     * */
    public static final String COMMA_SEPERATOR = ",";
    /**
     * Multiple Quality Trios should be separated by a space
     * */
    public static final String SPACE_SEPERATOR = " ";
}
