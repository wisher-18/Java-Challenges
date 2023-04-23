import java.util.Scanner;

public class PasswordCheck {
    public static boolean isPasswordComplex(String password)
    {
        if(password.length()<6)
        {
            return false;
        }
            boolean hasLowerCase = false;
            boolean hasUpperCase = false;
            boolean hasDigit = false;
            for(int i = 0; i < password.length() || !hasDigit && !hasLowerCase && !hasUpperCase;i ++)
            {
                char current = password.charAt(i);
                if(Character.isDigit(current))
                {
                    hasDigit= true;
                }
                else if(Character.isLowerCase(current))
                {
                    hasLowerCase = true;
                }
                else if(Character.isUpperCase(current))
                {
                    hasUpperCase = true;
                }
            }
            return hasDigit && hasLowerCase && hasUpperCase;
        
    }
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter your password:");
        String input = sc.next();
        System.out.println("Is password is complex ? "+isPasswordComplex(input));
        sc.close();
        
    }
}
