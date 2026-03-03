public class UC7OOPSBannerApp {
    static class CharacterPatternMap {

        private char character;
        private String[] pattern;

        public CharacterPatternMap(char character, String[] pattern) {
            this.character = character;
            this.pattern = pattern;
        }

        public char getCharacter() {
            return character;
        }

        public String[] getPattern() {
            return pattern;
        }
    }

    public static void main(String[] args) {

        CharacterPatternMap[] maps = {

            new CharacterPatternMap('O', new String[]{
                    " ***  ",
                    "**  **",
                    "**  **",
                    "**  **",
                    "**  **",
                    " ***  "
            }),

            new CharacterPatternMap('P', new String[]{
                    "***** ",
                    "**  **",
                    "***** ",
                    "**    ",
                    "**    ",
                    "**    "
            }),

            new CharacterPatternMap('S', new String[]{
                    " **** ",
                    "**    ",
                    " ***  ",
                    "    **",
                    "    **",
                    " **** "
            })
        };

        String word = "OOPS";

        for (int row = 0; row < 6; row++) {

            String[] parts = new String[word.length()];

            for (int i = 0; i < word.length(); i++) {

                char ch = word.charAt(i);

                for (CharacterPatternMap map : maps) {
                    if (map.getCharacter() == ch) {
                        parts[i] = map.getPattern()[row];
                        break;
                    }
                }
            }

            System.out.println(String.join("   ", parts));
        }
    }
}