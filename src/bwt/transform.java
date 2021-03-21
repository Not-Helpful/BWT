
package bwt;
import java.util.Arrays;
public class transform {
    
    private String[] suffixArray;
    private int[] transformArray;
    private String original;
    private String lex;
    Node root;
    
    public class Node{
        String binary;
        char[] left;
        char[] right;
        public Node(String str){
            int split = lex.length()/2;
            for (int i=0;i <= split;i++){
                left[i] = lex.charAt(i);
            }
            for (int i=split+1; i < lex.length();i++){
                right[i] = lex.charAt(i);
            }
        }
        
    }
    
    public void Transformer(String original){
        this.original = original;
        this.lex = sortString(original);
        suffixBuilder(original);
    }
    
    private void suffixBuilder(String original){
        suffixArray = new String[original.length()];
        for(int i = 0; i < original.length(); i++){
            suffixArray[i] = original.substring(i);
        }
        suffixSort();
    }
    private void suffixSort(){
        Arrays.sort(suffixArray); 
        transformBuilder();
    }
    
    private void transformBuilder(){
        transformArray = new int[original.length()];
        for(int i = 0; i < original.length(); i++){
            if ((original.length()-suffixArray[i].length()) == 0){
                transformArray[i] = original.length()-1;
            }else{
                transformArray[i] = (original.length()-suffixArray[i].length())-1;
            }
        }
    }
    
    public void test(){
        for(int i = 0; i < original.length(); i++){
            System.out.print(original.charAt(transformArray[i]));
        }
    }
    
    private void waveletTree(){
        root = new Node(lex);
        
    }
    
     public static String sortString(String inputString) 
    { 
        // convert input string to char array 
        char tempArray[] = inputString.toCharArray(); 
          
        // sort tempArray 
        Arrays.sort(tempArray); 
          
        // return new sorted string 
        return new String(tempArray); 
    } 
}
