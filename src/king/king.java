package king;

import java.util.*;

public class king {
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        
        
        
        ArrayList<Integer> num = new ArrayList<>();
        num.add(1);
        num.add(1);
        num.add(2);
        num.add(2);
        num.add(2);
        num.add(8);
        
        ArrayList<Integer> list = new ArrayList<>();
        ArrayList<Integer> result = new ArrayList<>();
        
        for(int i = 0; i < 6; i++) {
            list.add(sc.nextInt());
        }
        
        for(int i = 0; i < 6; i++) {
            if(num.get(i) == list.get(i)) {
                result.add(0);
            }
            else {
                result.add(num.get(i)-list.get(i));
                
            }
        }
        for(Integer obj : result) {
            System.out.print(obj + " ");
        }
        
        
        
    }
}