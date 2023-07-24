package interfarences;

public class oneplus implements intterface1{
    @Override
    public String processor() {
        return "SD833";
    }
    public String OS(){
        String s = "MAC os";
        return s;
        //System.out.println("vlo phone");
    }

    @Override
    public String SpaceInGB() {
        return "15 GB";
    }

}
