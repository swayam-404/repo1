 public class day3 {
     public static void main(String[] args) {
        float a = 7/4.0f*9/2.0f;
         System.err.println(a);
     }
 }

 public class day3 {

     public static void main(String[] args) {
         char grade = 'B';
         grade = (char)(grade + 8);
         System.out.println(grade);
         grade = (char) (grade - 8);
         System.out.println(grade);
     }
 }


 import java.util.Scanner;

 public class day3 {

     public static void main(String[] args) {
         Scanner sc = new Scanner(System.in);
         int a = sc.nextInt();
         System.out.println(99>9);
     }
 }

 import java.util.Scanner;

 public class day3 {

     public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
         System.out.println(7*49/7+35/7);
     }
 }




 public class day3 {

     public static void main(String[] args) {
         String name = "Harry";
         System.out.println("The name is :");
         System.out.println(name);
     }
 }

 import java.util.Scanner;

 public class day3 {

     public static void main(String[] args) {
         Scanner sc = new Scanner(System.in);
         String st = sc.next();
         System.out.println(st);
     }
 }



 public class day3 {

     public static void main(String[] args) {
         String name = "Harry";
         System.out.println(name);
         int value = name.length();
         System.out.println(value);
         String lString = name.toLowerCase();
         System.out.println(lString);
         String uString = name.toUpperCase();
         System.out.println(uString);

         String nonTrString = "      Harry     ";
         System.out.println(nonTrString);
         String tString = nonTrString.trim();
         System.out.println(tString);
         System.out.println(name.substring(2));
     }
 }



 public class day3 {

     public static void main(String[] args) {
         String name = "Thanos";
         System.out.println(name.substring(1,4));
     }
 }


 public class day3 {

     public static void main(String[] args) {
         String name = "Thannnos";
         System.out.println(name.replace('n','l' ));
         System.out.println(name.startsWith("The"));
         System.out.println(name.endsWith("nos"));
     }
 }





 public class day3 {

     public static void main(String[] args) {
         String name = "Thannnos";
         System.out.println(name.charAt(5));
         System.out.println(name.indexOf("nos"));
         System.out.println(name.equals("Thannnos"));
         System.out.println(name.equalsIgnoreCase("thannnOS"));
         System.out.println("I am escape sequence \n\t double quote");
    
     }
 }




 public class day3 {

     public static void main(String[] args) {
         String name = "swayam";
         System.out.println(name.toUpperCase());
     }
 }


 public class day3 {

     public static void main(String[] args) {
         String name = "swa yam";
         System.out.println(name.replace(" ", "_"));
     }
 }


 public class day3 {

     public static void main(String[] args) {
         String letter = " Hey <|name|>,Thanks a lot!";
         letter = letter.replace("<|name|>", "Sonex");
         System.out.println(letter);
     }
 }


 public class day3 {

     public static void main(String[] args) {
         String name = "This   String contains double  or  triple spaces";
         System.out.println(name.indexOf("   "));
         System.out.println(name.indexOf("   "));
     }
 }



 public class day3 {

     public static void main(String[] args) {
         String letter = "my name is somu \nI am from CTC \t badambadi";
         System.out.println(letter);
     }
 }


 public class day3 {

     public static void main(String[] args) {
         int age = 16;
         if (age>= 18) {
             System.out.println("You can drive");
         }else {
             System.out.println("You cannot Drive!");
            
            
         }
     }
 }



 public class day3 {

     public static void main(String[] args) {
         boolean a = true;
         boolean b = true;
         boolean c = false;
         if (a || b && c) {
             System.out.println("Y");
         }else{
             System.out.println("N");
         }
     }
 }




 import java.util.Scanner;

 public class day3 {

     public static void main(String[] args) {
         int age;
         System.out.println("Enter your age : ");
         Scanner sc = new Scanner(System.in);
         age = sc.nextInt();
         if (age>=56) {
             System.out.println("You are experienced");
         }
         else if (age>45) {
             System.out.println("You are semi-experienced");
         }else{
             System.out.println("You are not experienced");
             }
             if (age>2) {
                 System.out.println("You are not a baby");
                
             }
         }
 
     }

 import java.util.Scanner;

 public class day3 {

     public static void main(String[] args) {
         int age;
         System.out.println("Enter your age");
         Scanner sc = new Scanner(System.in);
         age = sc.nextInt();

         switch (age) {
             case 18:
             System.out.println("You are going to become an Adult");
             break;
             case 21:
             System.out.println("You are going to join a job");
             break;
             case 60:
             System.out.println("You are going to be retired");
                
                 break;
        
             default:
             System.out.println("You are going to enjoy your life");
                 break;
         }
         System.out.println("Thanks");
     }
 }


 public class day3 {

     public static void main(String[] args) {
         String letter = "Hii <|name|>, are you free on 12/12/12?";
         letter = letter.replace("<|name|>", "Jyoti");
         System.out.println(letter);
     }
 }

 import java.util.Scanner;

 public class day3 {

     public static void main(String[] args) {
         Scanner sc = new Scanner(System.in);
         System.out.println("Enter your name : ");
         String name = sc.nextLine();
         System.out.println("Enter the Day : ");
         int day= sc.nextInt();
         System.out.println("Enter Month : ");
         int month = sc.nextInt();
         System.out.println("Enter Year : ");
         int year = sc.nextInt();
         System.out.println("Hey " + name);
         System.out.println("Are you free on " +day+"/"+month+"/" +year);
        

     }
 }

