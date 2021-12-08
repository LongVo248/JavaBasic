package Generics;

interface Writer <T>{
    void update(T obj);
    void delete(T obj);
    void write(T obj);
}

class Book2<T> implements Writer<T> {

    @Override
    public void update(T obj) {
        // do something
    }

    @Override
    public void delete(T obj) {
        // do something
    }

    @Override
    public void write(T obj) {
        // do something
    }

}

class Demo1 {
    public static void main(String[] args) {
        Book2<String> t = new Book2<String>();
        t.write("Add data to book");
    }
}