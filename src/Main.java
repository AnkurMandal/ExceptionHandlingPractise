public class Main {
    public static void main(String[] args) {
//        System.out.println("Hello world!");
        int age=12;
       try {
            if(checkAge(age)){
                System.out.println("Congrats you are Adult now!!!");
           }
       }catch (Exception e){
           System.out.println(e.getMessage());
       }
    }
    public static boolean checkAge(int age) throws UnderAgeException {

        if(age<18) {
                throw new UnderAgeException("You are under age");
        }
//        int a=3/0;

        return true;
    }
}