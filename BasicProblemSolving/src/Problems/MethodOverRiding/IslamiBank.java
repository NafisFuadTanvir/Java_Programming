package Problems.MethodOverRiding;
class Bank{
    int rateOfinterest(){
        return 0;
    }
}
class IslamiBank extends Bank {
    int rateOfInterest(){
        return 10;
    }
}
class OneBank extends IslamiBank{
    @Override
    int rateOfInterest() {
        return 50;
    }
}
class AbBank extends IslamiBank{
    @Override
    int rateOfInterest() {
        return 70;
    }
}
class Test{
    public static void main(String[] args) {
        IslamiBank i= new IslamiBank();
        System.out.println("Rate of interest of Islami Bank is:- "+i.rateOfInterest());
    }
}