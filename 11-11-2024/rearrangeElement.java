class Solution {
    void rearrange(ArrayList<Integer> arr) {
        // code here
        ArrayList<Integer> positives = new ArrayList<>();
        ArrayList<Integer> negatives = new ArrayList<>();

       
        for (int num : arr) {
            if (num >= 0) {
                positives.add(num);
            } else {
                negatives.add(num);
            }
        }
        int posIndex = 0, negIndex = 0;
        int i = 0;
        while (posIndex < positives.size() && negIndex < negatives.size()) {
            
            if (i % 2 == 0) {
                arr.set(i, positives.get(posIndex++));
            } else {
                arr.set(i, negatives.get(negIndex++));
            }
            i++;
        }
        
      
        while (posIndex < positives.size()) {
            arr.set(i++, positives.get(posIndex++));
        }
        
        
        while (negIndex < negatives.size()) {
            arr.set(i++, negatives.get(negIndex++));
        }
    }
}