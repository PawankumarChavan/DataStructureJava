package Revision1;
import java.util.*;
public class Collection1 {

    public static void main(String[] args) {
//        Object obj[] = new Object[5];
//        obj[0]=10;
//        obj[1]="Hare Krushna";
//        System.out.println(obj);
//        for (Object o:obj){
//            System.out.println(o);
//        }
//
//        ArrayList al = new ArrayList();
//        al.add(20);
//        al.add(30);
//        al.add(40);
//        al.set(2,400);
//        System.out.println(al.contains(30));
//        Iterator itr = al.iterator();
//        while(itr.hasNext()){
//            Object o=itr.next();
//            System.out.println(o);
//        }
//
//        System.out.println(al.remove(1));

//        Vector v = new Vector();
//        v.add(20);
//        v.add(30);
//        v.add(40);
//        v.add(50);
//        v.add(Arrays.asList(1,2,3,4,5));
//        System.out.println(v.get(4));
//
//        Vector v1 = new Vector(3);
//        v1.add(10);
//        v1.add(20);
//        v1.add(30);
//        v1.add(40);
//        System.out.println(v1.capacity());

        ArrayList<Integer> al = new ArrayList<Integer>();
        al.add(20); //
        al.add(30);
        al.add(40);

        Integer i =500;
        Integer b = 500;
        System.out.println(System.identityHashCode(i)+"\t"+System.identityHashCode(b));
        Vector<Integer> v2 = new Vector<Integer>(al);
       v2.add(300);
        System.out.println(al.hashCode()+"\t"+v2.hashCode()+"\t");
        for(Integer i1:v2){
            System.out.println(i1);
        }
        System.out.println("=======================================================");
        for(Integer i1:al){
            System.out.println(i1);
        }

        Vector <Integer>v3 = new Vector<Integer>(v2);
        v3.add(203);


//        Enumeration e = v3.elements();
//        while(e.hasMoreElements()){
//            System.out.println(e.nextElement());
//        }

//        v3.forEach((ele)-> System.out.println(ele));
//
//        Employee e = new Employee(1,"Pawan");
//        Employee e1 = new Employee(2,"Aniket");
//        Employee e2 = new Employee(3,"Pruthviraj");
//
//        Vector v4 = new Vector(3);
//        v4.add(e);
//        v4.add(e1);
//        v4.add(e2);
//        boolean flag=false;
//        Enumeration enr=v4.elements();
//        while(enr.hasMoreElements()){
//            Employee temp=(Employee)enr.nextElement();
//            System.out.println(temp.getId()+"\t"+temp.getName());
//            if(temp.getId()==1){
//                flag=true;
//                break;
//            }
//        }
//        if(flag) System.out.println("Found");
//        else System.out.println("Not found");

    }
}
