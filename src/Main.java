import java.util.*;

public class Main {
    public static void main(String[] args) {
        ArrayList<Integer> arr = new ArrayList<>();
        for (int i = 0; i < 50; i++) {
            arr.add(new Random().nextInt(1,100));
        }
        System.out.println(arr);

        ArrayList<Integer> arr1 = new ArrayList<>(25);
        ArrayList<Integer> arr2 = new ArrayList<>(25);

        Iterator<Integer> num = arr.iterator();
        while(num.hasNext()){
            Integer numm = 0;
            if(num.next() % 2 == 0){
                arr1.add(num.next());
            }else arr2.add(num.next());
        }

        System.out.println(arr1);
        System.out.println(arr2);
    }


}