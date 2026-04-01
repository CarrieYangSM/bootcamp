public class temp2 {
  public static void main(String[] args) {
        String s = "725094849";
        
        char maxDigit = '0';
        int largestIndex = -1;
        
        for (int i = 0; i < s.length(); i++) {
            char current = s.charAt(i);
            if (current > maxDigit) {
                maxDigit = current;
                largestIndex = i;           // update when we find a larger digit
            } else if (current == maxDigit) {
                largestIndex = i;           // update index when we find the same max digit again (rightmost)
            }
        }
        
        System.out.println("String: " + s);
        System.out.println("Largest digit: " + maxDigit);
        System.out.println("Largest index (0-based): " + largestIndex);
    }
}
