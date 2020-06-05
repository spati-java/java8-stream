package excersize;

public class UniqueChar {

    public static void main(String... args) {

        UniqueChar uniqueChar = new UniqueChar();

        System.out.println(uniqueChar.isAllUniqueChar("abc"));
    }

    private boolean isAllUniqueChar(String word) {

        char[] charArray = word.toCharArray();
        char[] newArray = new char[charArray.length];

        for (int i = 0; i < charArray.length; i++) {

            for (int j = 0; j < newArray.length; j++) {
                if (charArray[i] == newArray[j])
                    return false;
            }

            newArray[i] = charArray[i];
        }

        return true;
    }
}