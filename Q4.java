// Q4:Write a Java Program to find the duplicate characters in a string.

public class Q4 {
    public static void main(String[] args) {
        String str = "Students";
        int count;
        str = str.toLowerCase();
        char[] stringArray = str.toCharArray();
        for (int i = 0; i < stringArray.length; i++) {
            count = 1;

            for (int j = i + 1; j < stringArray.length; j++) {
                if (stringArray[i] == stringArray[j] && stringArray[i] != ' ') {
                    count++;
                    stringArray[j] = '0';
                }
            }
            if (count > 1 && stringArray[i] != '0')
                System.out.println(stringArray[i] + "= " + count + " times");
        }
    }
}
