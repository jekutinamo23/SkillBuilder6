public class SkillBuilder6 {

    private static final int NO_PATTERN = 0;
    private static final int FOUND_T = 1;

    public static String findTYPattern(String s) {
        int state = NO_PATTERN;
        int startIndex = -1;

        for (int i = 0; i < s.length(); i++) {
            char currentChar = s.charAt(i);
            if (state == NO_PATTERN) {
                if (currentChar == 't' || currentChar == 'T') {
                    state = FOUND_T;
                    startIndex = i;
                }
            } else if (state == FOUND_T) {
                if (currentChar == 'y' || currentChar == 'Y') {
                    return s.substring(startIndex, i + 1);
                }
            }
        }


        return "";
    }}

