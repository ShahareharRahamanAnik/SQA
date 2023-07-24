//public class govt {
//    public void school(int x){
//        if(x == 1) {
//            System.out.println("he is present");
//        } else {
//            System.out.println("he is absent");
//        }
//    }
//
//}
public class govt {
    public boolean isPresent(int x){
        return x == 2;
    }

    public void school(int x){
        if(isPresent(x)) {
            System.out.println("he is present");
        } else {
            System.out.println("he is absent");
        }
    }

//    public static void main(String[] args) {
//        govt gv = new govt();
//        gv.school();
//    }
}
