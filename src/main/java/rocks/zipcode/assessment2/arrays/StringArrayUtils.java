package rocks.zipcode.assessment2.arrays;

/**
 * @author leon on 28/11/2018.
 */
public class StringArrayUtils {
    /**
     * @param arrayToBeSpliced - array to be evaluated
     * @param startingIndex - starting index of array to be spliced
     * @param endingIndex - ending index of array
     * @return an array with all elements between `startingIndex` and `endingIndex`
     */
    public static String[] getSubArray(String[] arrayToBeSpliced, int startingIndex, int endingIndex) {

        if(startingIndex > arrayToBeSpliced.length -1) {
            throw new IllegalArgumentException();
        }
        String[] slice = new String[arrayToBeSpliced.length - startingIndex];

        for (int i = 1; i < slice.length; i++) {
            slice[i] = arrayToBeSpliced[startingIndex + i];
        }
        return slice;
    }


    /**
     * @param arrayToBeSpliced - array to be evaluated
     * @param startingIndex - starting index of array to be spliced
     * @return an array all elements between after `startingIndex`
     */
    public static String[] getEndingArray(String[] arrayToBeSpliced, int startingIndex) {
        if(startingIndex > arrayToBeSpliced.length -1) {
            throw new IllegalArgumentException();
        }

        String[] slice = new String[arrayToBeSpliced.length - startingIndex];
        for (int i = 0; i < slice.length; i++) {
            slice[i] = arrayToBeSpliced[startingIndex +i];
        }

        return slice;
    }
}
