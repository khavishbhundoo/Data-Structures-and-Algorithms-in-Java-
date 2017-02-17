package deletepunctuations;

/**
 *
 * Write a short Java method that uses a StringBuilder instance to remove all
 * the punctuation from a string s storing a sentence, for example, transforming
 * the string "Let’s try, Mike!" to "Lets try Mike".
 *
 * @author Khav
 */
public class DeletePunctuation {

    public static void main(String[] args) {
        StringBuilder sb = new StringBuilder();
        sb.append("Let's try, Mike!");
        RemovePunctuations(sb);
        System.out.println(sb);
    }

    public static void RemovePunctuations(StringBuilder sb) {
        if (sb.length() != 0) {
            String[] punctuations = {"'", ",", "!", "."};
            for (String punctuation : punctuations) {
                //delete punctuation from array if it exists
                int index = sb.indexOf(punctuation);
                //delete all instances of that specific punctuation from string 
                while (index != -1) {
                    sb.deleteCharAt(index);
                    index = sb.indexOf(punctuation);
                }
            }
        }

    }
}
