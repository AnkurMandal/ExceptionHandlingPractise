public class Main {
    public static void main(String[] args) {
//        System.out.println("Hello world!");
        int age=124;
       try {
            if(checkAge(age)){
                System.out.println("Congrats you are Adult now!!!");
           }
       }catch (Exception e){
           System.out.println(e.getMessage());
       }
    }
    public static boolean checkAge(int age) {

        if(age<18) {
            throw new UnderAgeException("You are under age");
        }
        return true;
    }
}