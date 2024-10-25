import java.util.Scanner;

public class Task3 {
   static Scanner input = new Scanner(System.in);

   public static void ProblemA() {
      String s = input.nextLine();
      String t = input.nextLine();
      System.out.println(s.length() + " " + t.length());
      System.out.println(s + " " + t);
   }

   public static void ProblemD() {
      String s = input.nextLine();
      String t = input.nextLine();
      System.out.println(s.length() + " " + t.length());
      System.out.println(s + t);
      String newS = t.charAt(0) + s.substring(1);
      String newt = s.charAt(0) + t.substring(1);
      System.out.println(newS + " " + newt);
      input.close();
   }

   public static void ProblemE() {
      String s = input.nextLine();
      int i = s.length() - 1;
      long sum = 0;
      while (i >= 0) {
         long x = s.charAt(i) - '0';
         sum += x;
         i--;

      }
      System.out.println(sum);
   }

   public static void ProblemP() {
      String s = input.nextLine();
      long c = 0;
      s = s.replaceAll("[!.,?]", " ");
      boolean f = false;
      for (int i = 0; i < s.length(); i++) {
         if (s.charAt(i) != ' ') {
            if (!f) {
               c++;
               f = true;
            }
         } else {
            f = false;
         }
      }
      System.out.println(c);

   }

   public static void ProblemT() {
      String s = input.nextLine();
      int x = s.indexOf('?') + 1;
      StringBuilder key = new StringBuilder();
      StringBuilder value = new StringBuilder();
      boolean IsKey = true;

      for (int i = x; i < s.length(); i++) {
         if (s.charAt(i) == '=') {
            IsKey = false;
         } else if (s.charAt(i) == '&') {

            System.out.println(key + ": " + value);
            key.setLength(0);
            value.setLength(0);
            IsKey = true;

         } else {
            if (IsKey) {
               key.append(s.charAt(i));
            } else {
               value.append(s.charAt(i));

            }

         }
      }
      System.out.println(key + ": " + value);

   }

   public static void ProblemA2() 
   {
      int n=input.nextInt();
      long[] arr=new long[n];
      long sum=0;
      for(int i=0;i<n;i++)
      {
         arr[i]=input.nextLong();
         sum+=arr[i];
      }
      System.out.println(Math.abs(sum));
   }
   
   public static void ProblemB() 
   {
      int n=input.nextInt();
      long[] arr=new long[n];
      
      long index=0;
      boolean IsFound=false;
      for(int i=0;i<n;i++)
      {
         arr[i]=input.nextLong();
      }
      long search=input.nextLong();
      for(int i=0;i<n;i++)
      {
         if(arr[i]==search)
         {
            IsFound=true;
            index=i;
            break;
         }
      }
      System.out.println((IsFound?index:-1));


   }
   
  
   public static void ProblemN()
   {
      int x=input.nextInt();
      int y=input.nextInt();
      input.nextLine();
      String s=input.nextLine();
      boolean flag=true;
      if(s.charAt(x)=='-')
      {
         for(int i=0;i<s.length();i++)
         {
            if(i!=x)
            {
               if(!(s.charAt(i)>='0'&&s.charAt(i)<='9'))
               {
                  flag=false;
                  break;
               }

            }
         }
      }
      else
      {
         flag=false;
      }

      System.out.println(flag?"Yes":"No");


   }
  
   public static void ProblemF() 
   {
      int n=input.nextInt();
      long[] arr=new long[n];
      for(int i=0;i<n;i++)
      {
         arr[i]=input.nextLong();
      }

      for(int i=n-1;i>=0;i--)
      {
         System.out.print(arr[i]+" ");
      }

   }
   public static void main(String[] args) {

      // ProblemA();
      // ProblemD();
      // ProblemE();
      // ProblemP();
      //ProblemT();
      //ProblemA2();
      //ProblemB();
      //ProblemF();
      ProblemN();

   }
}