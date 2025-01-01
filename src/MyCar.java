public class MyCar {
//    int  spee;
    public  void  fullThrotte(){
        System.out.println("This car can move frist other one");
    }
    public  int speed (int spee){
//        this.spee = spee;
        return spee ;
    }

    public static void main(String[] args) {
        MyCar obj = new MyCar();
        obj.fullThrotte();
        System.out.println("the current speed is :" +obj.speed(23));
    }
}
