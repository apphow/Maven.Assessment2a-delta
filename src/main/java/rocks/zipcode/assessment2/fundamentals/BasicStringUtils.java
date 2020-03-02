package rocks.zipcode.assessment2.fundamentals;

import java.util.ArrayList;

public class BasicStringUtils {
    /**
     * @param string1 - Base string to be added to
     * @param string2 - String to add to `string1`
     * @return concatenation of `string1` and `string2`
     */
    public static String concatentate(String string1, String string2) {
        return string1 + string2;
    }

    /**
     * @param string1 - String to be reversed
     * @return an identical string with characters in reverse order
     */
    public static String reverse(String string1) {
        String a = "";
        for (int i = string1.length() - 1; i >= 0; i--) {
            a = a + string1.charAt(i);
        }

        return a;
    }

    /**
     * @param string1 - first string to be reversed
     * @param string2 - second string to be reversed
     * @return concatenation of the reverse of `string1` and reverse of `string2`
     */
    public static String reverseThenConcatenate(String string1, String string2) {


        StringBuilder result = new StringBuilder();
        StringBuilder result1 = new StringBuilder();

        for (int i = string1.length() -1; i >=0; i--) {

            result.append(string1.charAt(i));
            for (int j = string2.length()-1; j >=0; j--) {
                result1.append(string2.charAt(j));
            }

        }

        return result + result1.toString();

    }


        /**
         * @param string - the string to be manipulated
         * @param charactersToRemove - Characters that should be removed from `string`
         * @return `string` with `charactersToRemove` removed
         */
        public static String removeCharacters (String string, String charactersToRemove){

            return string.substring(0, Integer.parseInt(charactersToRemove)) + string.substring(Integer.parseInt(charactersToRemove + 1));

        }

        /**
         * @param string - the string to be manipulated
         * @param charactersToRemove - characters to be removed from the string
         * @return reverse of `string` with `charactersToRemove` removed
         */
        public static String removeCharactersThenReverse (String string, String charactersToRemove){
            return null;
        }
    }

