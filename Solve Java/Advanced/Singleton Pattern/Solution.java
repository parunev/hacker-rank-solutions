package Java_Singleton_Pattern;

public class Solution {
    private Solution() {}

    public String str;
    private static Solution instance = null;

    public static Solution getSingleInstance() {
        if (instance == null) {
            instance = new Solution();
        }

        return instance;
    }
}
