package MidExamAssignment;

 class Sem1 {
     float GPA_S1(float gpa_1){

         return gpa_1;
     }
}
class Sem2 extends Sem1{
     float GPA_S2(float gpa_2){

         return gpa_2;
     }
}
class Sem3 extends  Sem2{
     float GPA_S3(float gpa_3){

         return gpa_3;
     }

     float SGPA(float gpa_1,float gpa_2,float gpa_3){
       float  avg_gpa= (gpa_1+gpa_2+gpa_3)/3;
       return avg_gpa;

     }
 }
class Test{
    public static void main(String[] args) {
        Sem3 id= new Sem3();
        System.out.println("The Average gpa is:- "+id.SGPA(3.50f,3.70f,3.30f));

    }
}