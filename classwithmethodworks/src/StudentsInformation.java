public class StudentsInformation {
    int id,phone,semesterNumber;
    String name,FathersName,MothersName,Location;

    void setInformations(String n,String f,String m,String l,int i,int p,int s)
    {
         name= n;
         FathersName= f;
         MothersName= m;
         Location= l;
         id= i;
         phone= p;
         semesterNumber= s;
    }

     void displayInformation()
    {
        System.out.println("        Name is:- "+name);
        System.out.println("        Fathers Name is:- "+FathersName);
        System.out.println("        Mothers Name is:- "+MothersName);
        System.out.println("        Location is:- "+Location);
        System.out.println("        student id is:- "+id);
        System.out.println("        Phone number is:- "+phone);
        System.out.println("        semester number is:- "+semesterNumber+"th");
        System.out.println();

    }

}
