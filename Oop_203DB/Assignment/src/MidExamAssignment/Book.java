package MidExamAssignment;

public class Book {

   private String bookName;
    private String isbnNumber;
    private String authorName;
   private String publisher;
   private int price;
// first constructor
   public Book(String a, String b){
       bookName=a;
       isbnNumber=b;
   }
   //second constructor
   public Book(String a,String b,int c){
       authorName=a;
       publisher= b;
       price=c;
   }
// all setter methods for each instance variables
    public void setBookName(String bookName) {
        this.bookName = bookName;
    }

    public void setIsbnNumber(String isbnNumber) {
        this.isbnNumber = isbnNumber;
    }

    public void setAuthorName(String authorName) {
        this.authorName = authorName;
    }

    public void setPublisher(String publisher) {
        this.publisher = publisher;
    }

    public void setPrice(int price) {
        this.price = price;
    }
    // all getter methods for each instance variables
    public String getBookName() {
        return bookName;
    }

    public String getIsbnNumber() {
        return isbnNumber;
    }

    public String getAuthorName() {
        return authorName;
    }

    public String getPublisher() {
        return publisher;
    }

    public int getPrice() {
        return price;
    }
// updatePrice Function
    void updatePrice(int total){
        if(price<200){
            price = (int) (total+ (total * 0.5));
        }
        else{
            price=(int) (total+(total*0.3));
        }

          }
          //display Function
          void display(){
              System.out.println("Book name is:- "+bookName);
              System.out.println("ISBN number is:- "+isbnNumber);
              System.out.println("Author name is:- "+authorName);
              System.out.println("Publisher name is:- "+publisher);
              System.out.println("price is:- "+price);
   }

    public static void main(String[] args) {
        Book[] mybooks = new Book[10];
        //randomly set the names of all
        mybooks[0] = new Book("physics", "2-56112-008-9");
        mybooks[0].setAuthorName("Nafis Fuad Tanvir");
        mybooks[0].setPrice(450);
        //using updateprice Function
        mybooks[0].updatePrice(100);
        mybooks[0].setPublisher("Nest");
        System.out.println();
        mybooks[1] = new Book("chemistry", "1-56112-008-9");
        mybooks[1].setAuthorName("Nafis Fuad Tanvi");
        mybooks[1].setPrice(550);
        mybooks[1].setPublisher("Pearson");
        System.out.println();
        mybooks[2] = new Book("biology", "2-11111-008-9");
        mybooks[2].setAuthorName("James Mark");
        mybooks[2].setPrice(605);
        mybooks[2].setPublisher("Kingfisher");
        System.out.println();
        mybooks[3] = new Book("math", "2-22222-008-9");
        mybooks[3].setAuthorName("James Reason");
        mybooks[3].setPrice(190);
        mybooks[3].setPublisher("Nest");
        System.out.println();
        mybooks[4] = new Book("higher math", "2-33333-008-9");
        mybooks[4].setAuthorName("Tom Reason");
        mybooks[4].setPrice(120);
        mybooks[4].setPublisher("Kingfisher");
        System.out.println();
        mybooks[5] = new Book("A Tale of Two Lovers", "2-44444-008-9");
        mybooks[5].setAuthorName("James Reason");
        mybooks[5].setPrice(125);
        mybooks[5].setPublisher("Kingfisher");
        System.out.println();
        mybooks[6] = new Book("A Tale of Two Countries", "2-67589-008-9");
        mybooks[6].setAuthorName("Mandy Reason");
        mybooks[6].setPrice(440);
        mybooks[6].setPublisher("Kingfisher");
        System.out.println();
        mybooks[7] = new Book("A Tale of Two Towns", "2-34215-008-9");
        mybooks[7].setAuthorName("James Reason");
        mybooks[7].setPrice(12);
        mybooks[7].updatePrice(20);
        mybooks[7].setPublisher("Nest");
        System.out.println();
        mybooks[8] = new Book("A Tale of Two Sisters", "2-67490-008-9");
        mybooks[8].setAuthorName("James Reason");
        mybooks[8].setPrice(50);
        mybooks[8].setPublisher("Pearson");
        System.out.println();
        mybooks[9] = new Book("A Tale of Two Friends", "2-14141-008-9");
        mybooks[9].setAuthorName("James Reason");
        mybooks[9].setPrice(75);
        mybooks[9].setPublisher("Kingfisher");
        for (Book book : mybooks)
            book.display();
    }

}
