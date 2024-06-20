import java.util.*;
import java.util.stream.Collectors;

public class Main {
    public static void main(String[] args) {

        String s = "a good          example";
        char[] trimmed = s.trim().toCharArray();
      // System.out.println(reverseWords(s));
        System.out.println(trimmed);
        int index = 0;
        int next = 0;
        while (index < trimmed.length) {
            // Copy non-space characters or single spaces
            if (trimmed[index] != ' ' || (next > 0 && trimmed[next - 1] != ' ')) {
                trimmed[next++] = trimmed[index];
            }
            index++;
        }
        System.out.println(trimmed);
    }


    public String reverseWords2(String s) {
        char[] trimmed = s.trim().toCharArray();

        // compact
        int index = 0, next = 0;
        for (; index < trimmed.length; index++) {
            if (index > 0 && trimmed[index] == ' ' && trimmed[index - 1] == ' ') {
                continue;
            } else {
                trimmed[next++] = trimmed[index];
            }
        }

        char[] chars = new String(trimmed, 0, next).toCharArray();

        reverse(chars, 0, chars.length - 1);
        int start = 0, end = start;
        while (start < next) {
            if (chars[start] == ' ') {
                start++;
            } else {
                end = start;
                while (end < next && chars[end] != ' ') {
                    end++;
                }
                reverse(chars, start, end - 1);
                start = end;
            }
        }

        return new String(chars);
    }

    private void reverse(char[] chars, int start, int end) {
        for (int i = start, j = end; i < j; i++, j--) {
            swap(chars, i, j);
        }
    }

    private void swap(char[] chars, int i, int j) {
        char tmp = chars[i];
        chars[i] = chars[j];
        chars[j] = tmp;
    }


    public static String reverseWords(String s) {

        String[] wrd = s.split("\\s+");
        StringBuffer s2 = new StringBuffer();

        for(int i=(wrd.length-1);i>=0;i--)
        {
            s2.append(wrd[i]);
            s2.append(" ");
        }

        return s2.toString().trim();
    }




    public static String reverseVowels(String s) {

        Set<Character> vowels = Set.of('a', 'e', 'i', 'o', 'u', 'A', 'E', 'I', 'O', 'U');
        char[] charArr = s.toCharArray();
        int left = 0;
        int right = s.length() - 1;
        while (left < right) {
            while (left < right && !vowels.contains(charArr[left])) {
                left++;
            }
            while (left < right && !vowels.contains(charArr[right])) {
                right--;
            }
            char temp = charArr[left];
            charArr[left] = charArr[right];
            charArr[right] = temp;
            left++;
            right--;
        }
        return new String(charArr);



    }}







