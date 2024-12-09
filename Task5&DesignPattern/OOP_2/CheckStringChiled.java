import java.util.Scanner;

public class CheckStringChiled extends CheckString{
    Scanner scanner=new Scanner(System.in);
    
    public boolean CheckIsTrueOrFalse() {
        System.out.println("Enter the Arc: ");
        String Arc=scanner.nextLine();
        setArc(Arc);

        for(char c:Arc.toCharArray()){
              if(c=='(')   
              {
                stack.push(c);
              }    
              else if(c==')')
              {
                   if(stack.isEmpty() || stack.pop()!='(')
                   {
                     return false;
                   }
              }     

        }
        return stack.isEmpty();

    }

    
}
