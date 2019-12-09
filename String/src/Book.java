import java.util.Objects;
//要进行compareto 实现Comparable 接口
public class Book implements Comparable<Book>{
    public String ISBN;
    public String author;
    public  String title;
    public  int price;

// alt+ insert;
    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Book book = (Book) o;
        return Objects.equals(ISBN, book.ISBN);
    }

    @Override
    public int hashCode() {

        return Objects.hash(ISBN);
    }
    /*@Override
    public boolean equals(Object obj) {
        //1.判断obj 是不是为null；
        if(obj == null){
            return  false;
        }
        //2.obj 指向的对象是否是Book;
        if(!(obj instanceof Book)){
            return  false;
        }
        //3.先向下转型
        Book book = (Book)obj
        //4. 根据你的需要，进行合适的判断
        return this.ISBN.equals(book.ISBN);
    }*/
    public static void main(String[] args) {
       Book book1 = new Book();
       book1.ISBN = "119";
       book1.price = 100;
       book1.author = "马晨佩";
       book1.title = "救火指南";
        Book book2 = new Book();
        book2.ISBN = "119";
        book2.price = 100;
        book2.author = "马晨佩";
        book2.title = "救火指南";
        System.out.println(book1 == book2);
        System.out.println(book1.equals(book2));
        System.out.println(book1.compareTo(book2));
    }

    @Override
    //不进行非空比较
    public int compareTo(Book o) {
       return this.price- o.price;

    }
}
