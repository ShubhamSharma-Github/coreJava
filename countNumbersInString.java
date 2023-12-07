package Day1;

public class countNumbersInString {
    public static void main(String[] args) {
        String str = "Hel647568787lo12ggj575883";
        int digit = 0;

        for (int i=0;i<str.length();i++){
            if(str.charAt(i)>=48 && str.charAt(i)<=57)
                digit++;
        }
        System.out.println("Total numbers of digit is: "+digit);
    }
}
