public class ques3 {
    static void main(String[] args) {
        String str = "Hello";
        str=str.toUpperCase();
        String res = "";
        for (int i = 0; i < str.length()/2; i++) {
            char char1 = str.charAt(i);
            char char2 = str.charAt(str.length()-1-i);
             res += char1;
             res += char2;
        }
        if(str.length()%2 != 0){
            char char3 = str.charAt(str.length()/2);
            res+=char3;
        }
        System.out.println(res);
    }
}
