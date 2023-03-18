package Throwandthrows;

public class Userdefined extends Exception {
    Userdefined(String str){
        super(str);
    }
}
class Test{
    public static void main(String[] args) {
        try{
            throw new Userdefined("This is my User Defined exception");
        }catch(Userdefined e){
            System.out.println(e);
        }
        System.out.println("rest of the code");
    }
}