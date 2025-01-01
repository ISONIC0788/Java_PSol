public class PubSatatic {
    static void  myStaticMethod (){
        System.out.println("Hellow my name is static function ");
    }
    public  void myPublicMethod(){
        System.out.println("Hellow my name is public function ");
    }
    public static void main(String[] args) {
     // let call function
        myStaticMethod();
        PubSatatic Obj = new PubSatatic();
        Obj.myPublicMethod();
    }
}
