package backspacecompare;

/**
 * Status: Accepted
 *
 * 2ms 57.69% faster | 42.1 mb less than 58.39% of Java submissions on 5/1/2022
 *
 * Given two strings s and t, return true if they are equal when both are typed into empty text editors.
 * '#' means a backspace character.
 * Note that after backspacing an empty text, the text will continue empty.
 */
public class BackSpaceStringCompare {

    public boolean backspaceCompare(String s, String t) {

        int size = Math.max(s.length(), t.length());
        StringBuilder resultOne = new StringBuilder();
        StringBuilder resultTwo = new StringBuilder();

        for(int i = 0; i < size; i++){

            if(i < s.length())
                if(s.charAt(i) == '#' && resultOne.length() > 0)
                    resultOne = new StringBuilder(resultOne.substring(0, resultOne.length() - 1));
                else if(s.charAt(i) != '#')
                    resultOne.append(s.charAt(i));

            if(i < t.length())
                if(t.charAt(i) == '#' && resultTwo.length() > 0)
                    resultTwo = new StringBuilder(resultTwo.substring(0, resultTwo.length() - 1));
                else if(t.charAt(i) != '#')
                    resultTwo.append(t.charAt(i));
        }

        return resultOne.toString().equals(resultTwo.toString());
    }
}
