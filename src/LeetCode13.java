import java.util.HashMap;
import java.util.Map;

public class LeetCode13 {
    public static void main(String[] args) {
        System.out.println(romanToInt("MCMXCIV"));
        System.out.println(intToRoman(romanToInt("MCMXCIV")));
    }
    //罗马数字转整数
    public static int romanToInt(String s) {
        Map<Character,Integer> map = new HashMap<Character,Integer>();
        map.put('I',1);
        map.put('V',5);
        map.put('X',10);
        map.put('L',50);
        map.put('C',100);
        map.put('D',500);
        map.put('M',1000);
        int i=0;
        int result = 0;
        int l = s.length();
        while(i<l){
            if(i==l-1) {
                result+=map.get(s.charAt(i));
                break;
            }
            if(map.get(s.charAt(i))<map.get(s.charAt(i+1))){
                result+=map.get(s.charAt(i+1))-map.get(s.charAt(i));
                i+=2;
            }else{
                result+=map.get(s.charAt(i));
                i++;
            }

        }
        return result;
    }
    //整数转罗马数字
    public static String intToRoman(int num) {
        final String numerals[] = {"M", "CM", "D", "CD", "C", "XC", "L", "XL", "X", "IX", "V", "IV", "I"};
        final int values[] = {1000, 900, 500, 400, 100, 90, 50, 40, 10, 9, 5, 4, 1};
        StringBuilder builder = new StringBuilder();
        int i = 0;
        while (num > 0){
            if (num >= values[i]){
                builder.append(numerals[i]);
                num -= values[i];
            }else {
                i++;
            }
        }
        return builder.toString();
    }

}
