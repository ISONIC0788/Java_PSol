 class Tools {
    int num1 ;
    int num2 ;
    int num3;
    /*
        .. constructor
    */

    Tools(){
       num1 = 1 ;
       num2 = 2 ;
       num3 = 3 ;
    }
    Tools(int num1 ,int num2 , int num3 ){
        this.num1 = num1;
        this.num2 = num2;
        this.num3 = num3 ;

    }
    int CustomizeSum (int num1 , int num2 , int num3){
        return num1 + num2 + num3;
    }
     void DefoultSum(){
         System.out.println(num1 + num2 + num3);
     }

}
