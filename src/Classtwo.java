public class Classtwo {
    String name ;
    int level ;
    Classtwo (){
        name = "hellow";
        level = 23;
    }
    // constructor where user can pass values
    Classtwo( String name  , int level ){
         this.name = name ;
         this.level = level;
         this.attack();
    }
    void  attack(){
        System.out.println(name);
//        return false;
    }
}
