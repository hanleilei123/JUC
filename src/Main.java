import com.sun.org.apache.xpath.internal.SourceTree;

import java.util.LinkedList;
import java.util.concurrent.atomic.AtomicLong;

public class Main {

    public static void main(String[] args) {
        System.out.println("Hello World!");


        AtomicLong atomicLong = new AtomicLong(100);

       // twoSum();

        twoSumLinked();
    }

   public static void twoSum(){
        int[] ints = {2, 7, 11, 15};
        int target=22;
        int length = ints.length;
        for(int i=0;i<length;i++){
            for(int j=i+1;j<length;j++){
                if(ints[i]+ints[j]==target){
                    System.out.println(ints[i]+"  "+ints[j]);
                    break;
                }
            }
        }
    }



    public static void twoSumLinked() {
        LinkedList<Integer> linkedList = new LinkedList<Integer>();
        linkedList.add(2);
        linkedList.add(4);
        linkedList.add(3);


        LinkedList<Integer> linkedList1 = new LinkedList<Integer>();
        linkedList1.add(5);
        linkedList1.add(6);
        linkedList1.add(4);

        StringBuffer num1=new StringBuffer();
        for(Integer integer:linkedList){
            num1.append(integer);
        }
        Integer integer1 = Integer.valueOf(num1.toString());

        StringBuffer num2=new StringBuffer();
        for(Integer integer:linkedList1){
            num2.append(integer);
        }
        Integer integer2 = Integer.valueOf(num2.toString());

        System.out.println(integer1+integer2);

    }
}

