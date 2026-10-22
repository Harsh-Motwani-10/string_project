public class Cques6 {
    static void main(String[] args) {
        String firstname = "Kumud";
        String lastname = "kumar";
        String ans = "";
        int pin = 462309;
        int n  = 5;
        String pincd = String.valueOf(pin);

        int comp = firstname.compareTo(lastname);
        if(comp>0) {
            ans = ans + lastname.toLowerCase().charAt(0);
            ans = ans+ firstname.toUpperCase();
        }
        else {
            ans = ans + firstname.toLowerCase().charAt(0);
            ans = ans+ lastname.toUpperCase();
        }
        ans+= pincd.charAt(n-1);
        ans+= pincd.charAt(pincd.length()-n);
        System.out.println(ans);

    }
}
