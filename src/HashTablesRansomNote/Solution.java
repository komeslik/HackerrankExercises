package HashTablesRansomNote;

import java.util.*;

public class Solution {
    public static HashMap<String, Integer> getStringFrequency(String string){
        String[] arrayOfWords = string.split(" ");
        HashMap<String, Integer> FrequencyMap= new HashMap<>();
        for(String word: arrayOfWords){
            if(FrequencyMap.get(word)== null){
                FrequencyMap.put(word, 1);
            }else {
                FrequencyMap.put(word, FrequencyMap.get(word) + 1);
            }
        }
        return FrequencyMap;
    }

    public static boolean hasEnoughStrings(Map<String,Integer> magazineFrequency, Map<String, Integer> noteFrequency){
        for(String word : noteFrequency.keySet()){
            if (!(magazineFrequency.containsKey(word)&&magazineFrequency.get(word)>=noteFrequency.get(word))) {
                return false;
            }
        }
        return true;
    }

    public static boolean canBuildRansomNote(String magazine,String note){
        Map<String, Integer> magazineFrequency= getStringFrequency(magazine);
        Map<String, Integer> noteFrequency= getStringFrequency(note);
        return hasEnoughStrings(magazineFrequency,noteFrequency);
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int m = scanner.nextInt();
        int n = scanner.nextInt();

        // Eat whitespace to beginning of next line
        scanner.nextLine();
        System.out.println((canBuildRansomNote(scanner.nextLine(),scanner.nextLine()))? "Yes":"No");

    }
}