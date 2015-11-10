import com.google.common.base.CharMatcher;

public class ModuleOne {
    
    String input = "This invoice has an id of 192/10/10";
    
    CharMatcher charMatcher = CharMatcher.DIGIT.or(CharMatcher.is('/'));
    
    String output = charMatcher.retainFrom(input);
    
    public static void main(String args[]){
        System.out.println("I am starting");
    }

}
