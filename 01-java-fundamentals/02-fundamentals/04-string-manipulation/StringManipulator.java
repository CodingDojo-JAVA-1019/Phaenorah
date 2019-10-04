public class StringManipulator {
    public String trimAndConcat(String str1, String str2) {
        String string1 = str1.trim();
        String string2 = str2.trim();
        String string3 = string1.concat(string2);
        return string3;
    }
    public Integer getIndexOrNull(String str, char c) {
        int i = str.indexOf(c);
        if (i == -1) {
            return null;
        }
        else {
            return i;
        }
    }
    public Integer getIndexOrNull(String str1, String str2) {
        int i = str1.indexOf(str2);
        if (i == -1) {
            return null;
        }
        else {
            return i;
        }
    }
    public String concatSubstring(String str1, int int1, int int2, String str2) {
        String substring = str1.substring(int1, int2);
        return substring.concat(str2);
    }
}