public class Test {

public static void main(String[] args) {

 String str = "ABC406D90";
 StringBuilder result = new StringBuilder();
 char[] chArr = str.toCharArray();

 for(int i = 0; i < str.length(); i++){
     if(Character.isDigit(chArr[i])) {
        result.append(i);
     }
 }

 System.out.println(result);
}


}
