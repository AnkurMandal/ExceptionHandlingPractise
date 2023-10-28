public class Main {
    public static void main(String[] args) {
//        System.out.println("Hello world!");
        int age=12;
       try {
           if(age<18){
               throw new UnderAgeException("You are under age");
           }
       }catch (Exception e){
           System.out.println(e.getMessage());
       }
    }
}