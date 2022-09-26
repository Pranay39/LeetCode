class Solution {
    public void reverseString(char[] s) {
        int start = 0;
        int end = s.length - 1;
        while(start < end){
            char temp = s[start];
            s[start] = s[end];
            s[end] = temp;
            start++;
            end--;
        }
        System.out.println(Arrays.toString(s));
        
    // public void swap(char c1, char c2){
    //     char temp = c1;
    //     c1 = c2;
    //     c2 = temp;
    // }
    }
}