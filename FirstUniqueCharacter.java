import java.util.LinkedHashMap;
import java.util.Scanner;
public class FirstUniqueCharacter {
    public int firstUniqChar(String s) {
        LinkedHashMap<Character, Integer> hm = new LinkedHashMap<Character, Integer>();
        for(char c : s.toCharArray()){
            if(hm.containsKey(c)){
                hm.replace(c,hm.get(c) + 1);
            }
            else{
                hm.put(c,1);
            }
        }
        for(int i=0;i<s.length();i++){
            int freq = hm.get(s.charAt(i));
            if(freq == 1){
                return i;
            }
        }
        return -1;
        /* 
        takes up extra space and time is also gretaer than the other solution
        char unique = '!';
        for (Map.Entry<Character, Integer> mapElement : hm.entrySet()) {
            if((mapElement.getValue()) == 1){
                unique = mapElement.getKey();
                System.out.println(unique);
                break;
            }
        }
        int index=-1;
        for(int i=0;i<s.length();i++){
            if(unique == s.charAt(i)){
                index=i;
                break;
            }
        }
        return index;
        */
    }
    public static void main(String[] args) {
        FirstUniqueCharacter fuc = new FirstUniqueCharacter();
        @SuppressWarnings("resource")
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the string:");
        String s = sc.next();
        int index = fuc.firstUniqChar(s);
        System.out.println("The first unique character in the string "+ s +" is present at index " + index);
    }
}
