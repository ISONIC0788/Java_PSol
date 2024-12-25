public class Main {
    public static void main(String[] args) {
      Tools ToolsOne = new Tools();
      //Other consitructor
      Tools ToolsTwo = new Tools(23 , 34 ,34 );
      int Sum = ToolsOne.CustomizeSum( 2 , 3 , 4 );
      int num1 = ToolsTwo.num1;
      int num2 = ToolsTwo.num2;
      int num3 = ToolsTwo.num3;
      int SumaLL = num1 + num2 + num3;

      System.out.println("This is customized consturcture"+"\n"+ToolsTwo.num1+"\n"+ToolsTwo.num2+"\n"+ToolsTwo.num3);
      System.out.println("This the sum of all consutucted value"+SumaLL);
      System.out.println("This is customized sum " + Sum);
      ToolsOne.DefoultSum();
    }
}