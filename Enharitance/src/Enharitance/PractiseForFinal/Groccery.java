package Enharitance.PractiseForFinal;

 class Groccery{

String productName= "rice";
    String riceprice(){
        return "100taka";

    }
}
class KachaBazar extends Groccery{
    String goodsName="korola";
    String korolaPrice(){
        return "80 taka";
    }
}
class machBazar extends Groccery{
     String machName= "Loytta fish";
     String machPrice(){
         return "150taka";
     }
}
class MyBazar{
    public static void main(String[] args) {
        machBazar m= new machBazar();
        System.out.println(m.riceprice());

    }
}