package practiseInterface;

public interface Parent {

    void myParent(String mom, String dad);
}
class B implements Parent{
    @Override
    public void myParent(String mom ,String dad) {
        mom= "Nargis Ara Begum";
        dad= "Md Abdul Khalek";
        System.out.println("my moms name is:-"+mom);
        System.out.println("my father name is:- "+dad);
    }

    public static void main(String[] args) {
        B p= new B();
        p.myParent("mom","dad");
    }
}