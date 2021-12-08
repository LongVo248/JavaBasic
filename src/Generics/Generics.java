package Generics;

public class Generics {
    public static void main(String[] args){
        Pair<String,String>  one= new Pair<>("one","so 1");
        Pair<String,String>  cat= new Pair<>("cat","con meo");
        Pair<String,String>  dog= new Pair<>("one","con cho");
        Pair<String,String>  song= new Pair<>("one","bai hat");

        Pair<String,Integer> iphone13= new Pair<>("iphone 13 gray",2000);

        Person male= new Person("Long");
        Person female= new Person("Nobody");
        Pair<Person,Person> couple1= new Pair<>(male,female);

        System.out.println(one.getKey()+" = "+one.getValue());
        System.out.println(cat.getKey()+" = "+cat.getValue());
        System.out.println(couple1.getKey().getName()+" = "+couple1.getValue().getName());
        System.out.println(iphone13.getKey()+" = "+iphone13.getValue());

    }
}
