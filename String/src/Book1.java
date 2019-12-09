public class Book1 implements  Comparable<Book> {
    public String ISBN;
    public String author;
    public  String title;
    public  int price;

    @Override
    public boolean equals(Object obj) {
        if(obj == null){
            return false;
        }
        if(!(obj instanceof  Book)){
            return  false;
        }
        Book book = (Book)obj;
        return this.ISBN.equals(book.ISBN);
    }

    @Override
    public int compareTo(Book o) {
        return  this.price - o.price;
    }
}
