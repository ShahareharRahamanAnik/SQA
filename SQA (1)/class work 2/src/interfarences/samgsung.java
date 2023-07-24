package interfarences;

public class samgsung implements intterface1{

    @Override
    public String processor() {
        return "SD833";
    }

    @Override
    public String OS() {
        System.out.println("vlo phone motamuti");
       return "Oxygen";
    }

    @Override
    public String SpaceInGB() {
        return "15 GB";
    }
}
