public class Consitructor {
    // decration of attribute
    int x ;
    // constructor
    public Consitructor(){
       x = 23 ;
    }
    public static void main(String[] args) {
        Consitructor obj = new Consitructor();
        int d = obj.x;
        System.out.println(d);
    }
}
