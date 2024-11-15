//{ Driver Code Starts
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList; // Import ArrayList
import java.util.Stack;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int t = Integer.parseInt(br.readLine());

        while (t-- > 0) {
            String input = br.readLine();
            String[] inputs = input.split(" ");
            int[] arr = new int[inputs.length];

            for (int i = 0; i < inputs.length; i++) {
                arr[i] = Integer.parseInt(inputs[i]);
            }

            // Get the result as an ArrayList<Integer>
            ArrayList<Integer> ans = new Solution().findTwoElement(arr);
            System.out.println(ans.get(0) + " " + ans.get(1));
            System.out.println("~");
        }
    }
}

// } Driver Code Ends


// User function Template for Java

class Solution {
    
    
    
    // Function to find two elements in array
   /* ArrayList<Integer> findTwoElement(int arr[]) {
        // code here
        ArrayList<Integer> x=new ArrayList<>();
        int n=arr.length;
        int result=(n*(n+1))/2;
        for(int i=0;i<arr.length;i++){
            int j=i+1;
            while(j<arr.length){
                if(arr[i]==arr[j]){
                    x.add(arr[i]);
                    break;
                }
                j++;
            }
            
        }
        int add=0;
        for(int i=0;i<arr.length;i++){
            add=add+arr[i];
        }
        int b=result-(add-(x.get(0)));
        x.add(b);
        return x;
    }*/
    
    
    ArrayList<Integer> findTwoElement(int arr[]) {
        ArrayList<Integer> result = new ArrayList<>();
        int n = arr.length;
        int repeating = -1, missing = -1;

        // Step 1: Find the repeating element
        for (int i = 0; i < n; i++) {
            int index = Math.abs(arr[i]) - 1; // Map value to index
            if (arr[index] < 0) {
                repeating = Math.abs(arr[i]);
            } else {
                arr[index] = -arr[index]; // Mark as visited
            }
        }

        // Step 2: Find the missing element
        for (int i = 0; i < n; i++) {
            if (arr[i] > 0) { // Positive value indicates missing number
                missing = i + 1;
                break;
            }
        }

        // Add results to the list
        result.add(repeating);
        result.add(missing);
        return result;
    }
}
