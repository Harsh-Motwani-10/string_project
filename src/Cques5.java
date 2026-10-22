public class Cques5 {
    static void main(String[] args) {
        String str1 = "Fi_er";
        String str2 = "Fever:Filer:Filter:Fibre:Fiber:Offer:tailor:fixer";
        String output = "";
        str1 = str1.toUpperCase();
        String[] r = str2.toUpperCase().split(":");
        int pos = str1.indexOf("_");

        for(String s:r){
            String temp = str1;
            char ch = s.charAt(pos);
            temp = temp.replace('_',ch);
            if(temp.equals(s)){
                if(output.equals("")) output = temp;
                 else output = output + ":"+temp;
            }
        }
        if(output.equals("")) output = "ERROR:009";
        System.out.println(output);
    }
}
