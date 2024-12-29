public class Classone {
    public static void main(String[] args) {
      // to create an object
       Classtwo p1 = new Classtwo();
       p1.name = "Ebedi";
       p1.level = 123;
       p1.attack();
       Classtwo p2 = new Classtwo();
       System.out.println("++++++++++++++++++++++++++++++++");
       System.out.println(p2.name);
       System.out.println(p2.level);

        System.out.println(p1.name + ""+p1.level);
       // update class that  contain 3 para meter
        Classtwo cons3 = new Classtwo("Ebedi" , 23);
        System.out.println(cons3.level);
        System.out.println(cons3.name );


    }
}
