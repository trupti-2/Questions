
// Q3:Write a Java Program to count the number of words in a string using HashMap.
import java.io.*;
import java.util.HashMap;
import java.util.Map;

class Q3 {
    public static void main(String[] args) {

        String str = "I am a girl and I am a boy";

        Map<String, Integer> hashMap = new HashMap<>();

        String[] words = str.split(" ");

        for (int i = 0; i < words.length; i++) {
            String word = words[i];

            Integer integer = hashMap.get(word);

            if (integer == null)

                hashMap.put(word, 1);
            else {

                hashMap.put(word, integer + 1);
            }
        }
        System.out.println(hashMap);
    }
}
