package interfarences;

public class home {
    public static void main(String[] args) {
        oneplus one = new oneplus();
        one.OS();
        intterface1 phn = new oneplus();
        String txt = phn.OS();
        System.out.println(txt);
        intterface1 sphn = new samgsung();
        sphn.OS();
    }
}
