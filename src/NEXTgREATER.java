import java.util.Stack;

public class NEXTgREATER {
    public static void main(String[] args) {
        int arr[] = {4,9,7,2,1,3};
        Stack<Integer> s= new Stack<>();
        int nextGreater[] = new int[arr.length];

        for(int i = arr.length-1;  i>=0; i--){

            //while loop

            while(!s.isEmpty() && arr[s.peek()] <= arr[i]){
                s.pop();
            }
            //if condition
            if (s.isEmpty()){
                nextGreater[i] = -1;
            }
            else{
                nextGreater[i] =arr[s.peek()];
            }

            //push
            s.push(i);

        }
        for (int i= 0 ;i< nextGreater.length;i++){
            System.out.print(nextGreater[i] + " ");
        }
        System.out.println();
    }
}
