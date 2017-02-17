package findvowels;

/**
 * Write a short Java method that counts the number of vowels in a given
 * character string.
 *
 * @author Khav
 */
public class FindVowels {

    public static void main(String[] args) {
        String str = "LEts count vowels";
        int vowels_count = CountVowels(str);
        if (vowels_count != -1) {
            System.out.println(vowels_count);
        }
    }

    /**
     *
     * @param str String
     * @return the number of vowels in a string ; -1 if string is empty
     */
    public static int CountVowels(String str) {
        int count = 0;
        int str_length = str.length();
        if (str_length == 0) {
            return -1;
        }
        str = str.toLowerCase();
        for (int i = 0; i < str_length; i++) {
            switch (str.charAt(i)) {
                case 'a':
                case 'e':
                case 'i':
                case 'o':
                case 'u':
                    count++;
            }
        }
        return count;
    }

}
