import java.util.*;

public class epicFeature1 {
    void TestingGit(int n){

        Stack<Integer> s = new Stack<>();
        
        while(n > 0){
            s.push(n % 2);
            n = n / 2;
        }
        while(!s.isEmpty()){
            //Pop items from the stack
            System.out.println(s.pop());
        }
    }
}
