public class Cques4 {
    static void main(String[] args) {
        String a = "World Wide Web";
        a=a.toUpperCase();
        String[] arr = a.split(" ");

        String res="";
        for(String s:arr){
            int sum =0;
            for (int i = 0; i < s.length()/2; i++) {
                int ch1 = s.charAt(i) - 64;
                int ch2 = s.charAt(s.length()-1-i) - 64;
                sum += Math.abs(ch1 - ch2);
            }
            if(s.length()%2 != 0){
                int ch3 = s.charAt(s.length()/2)-64;
                sum+=ch3;
            }
            res+= sum;
        }
        System.out.println(res);
    }
}
