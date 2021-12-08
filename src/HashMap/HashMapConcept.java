package HashMap;

import java.util.HashMap;
import java.util.Map;

public class HashMapConcept {
    //Hash map tuan thu theo Map interface
    //extends AbstractMap

    public static void main(String[] args){
        HashMap<Integer,String> hm= new HashMap<Integer,String>();
        hm.put(1,"Text1");
        hm.put(2,"Text2");
        hm.put(3,"Text3");
        hm.put(4,"Text4");


        System.out.println(hm.get(1));
        System.out.println(hm.get(4));

        for (Map.Entry m: hm.entrySet()){
            System.out.println(m.getKey()+" "+m.getValue());
        }

        System.out.println(hm);
        hm.remove(3);
        System.out.println(hm);

        HashMap<Integer, Employee> emp = new HashMap<Integer, Employee>();

        Employee e1= new Employee("Thang", 25, "admin");
        Employee e2= new Employee("Khanh", 26, "Dev");
        Employee e3= new Employee("Long", 25, "Dev");

        emp.put(1, e1);
        emp.put(2, e2);
        emp.put(3, e3);

        //traverse the hashmap:
        for (Map.Entry<Integer,Employee> m : emp.entrySet()){
            int key=  m.getKey();
            Employee e= m.getValue();
            System.out.println("Employee "+key+" Info: ");
            System.out.println(e.name +" "+e.age+" "+e.dept);


        }
    }
}
