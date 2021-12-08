package Mutable_Immutable;

public class Main1 {
    public static void main(String[] args){
        Immutable im= new Immutable("vo","Long");
        // im.first_name="vo"; l

        Mutable m= new Mutable("vo hoang","long");
        m.first_name= "vo";
        System.out.printf(m.first_name);
    }
}
