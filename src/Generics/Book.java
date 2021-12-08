package Generics;
//extends Generics
public class Book extends Pair<String,String>{
    public Book(String key, String value) {
        super(key, value);
    }
}
class Book1<V> extends Pair<String, V> {

    public Book1(String key, V value) {
        super(key, value);
    }

}
class Demo{
    public static void main(String[] args){
        Book book= new Book("Study","hoc");
        String english= book.getKey();
        String vietnamese= book.getValue();
        System.out.println(english+": "+vietnamese);
    }
}