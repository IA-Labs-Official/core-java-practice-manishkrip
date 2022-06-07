package com.training;
import java.util.*;

public class Assignment1 {

    public static void main(String[] args) {

//1) Write a Java program that accepts four integer from the
        // user and prints equal if all four are equal, and not equal otherwise.
//        int[] user = new int[4];
//        Scanner s = new Scanner(System.in);
//    int a = s.nextInt();
//    int b = s.nextInt();
//    int c = s.nextInt();
//    int d = s.nextInt();
//        for (int i = 0; i < 4; i++) {
//            user[i] = s.nextInt();
//
//        }
//        if(user[0]==user[1] && user[0]==user[2] && user[0]==user[3] )
//        {
//            System.out.println("All are equals");
//        }
//        else
//        {
//            System.out.println("Something goes wrong");
//        }



       // 2) Write a Java program that accepts two double variables and test if both strictly
        // between 0 and 1 and false otherwise.

//        Scanner s = new Scanner(System.in);
//        double d = s.nextDouble();
//        double e = s.nextDouble();
//        if(0<d && d<1 && 0<e && e<1 )
//        {
//            System.out.println("The value of d is" + d + "\n"+ "The value of e is "+ e);
//        }
//        else
//        {
//            System.out.println("The value of d and e is not accepted");
//        }


//        3) Write a Java program to find the k largest elements in a given array. Elements
//        in the array can be in any order.
//        Scanner s = new Scanner(System.in);
//        int n = s.nextInt();
//        int user[] = new int[n];
//        for(int i=0 ; i<n;i++)
//        {
//            user[i] = s.nextInt();
//        }
//int k = s.nextInt();
//        Arrays.sort(user);
//        for(int i=n-1; i>=n-k;i--)
//        {
//
//            if(i>0 && user[i] == user[i-1])
//            {
//                k++;
//                continue;
//
//            }
//            else
//            {
//                System.out.println(user[i]);
//
//            }
//        }



    //    4) Write a Java program that reads an integer between 0 and 1000
        //   and adds all the digits in the integer.
//        System.out.println("How many integer do u want to enter between  0 to 1000");
//                Scanner s= new Scanner(System.in);
//                int n = s.nextInt();
//                int []number = new int[n];
//                 boolean  flag = false;
//                 int res = 0;
//                    for(int i=0;i<n;i++) {
//                        number[i] = s.nextInt();
//                                        }
//                    for(int i=0;i<n;i++)
//                    {
//                        if (number[i] > 1000 || number[i] < 0)
//                        {
//                            flag = true;
//                            break;
//                        }
//                        else
//                        {
//                        res = res + number[i];
//                         }
//                    }
//
//                     if(flag == true)
//                   {
//                       System.out.println("Enter the correct value");
//                   }
//                    else
//                   {
//                       System.out.println("The sum of the given number are  "+ res);
//                   }





      //  5) Write a Java program that accepts two integers from the user and then prints
        //the sum, the difference, the product, the average, the distance (the difference between integer),
        // the maximum (the larger of the two integers), the minimum (smaller of the two integers).
//             Scanner s = new Scanner(System.in);
//             int a = s.nextInt();
//             int b = s.nextInt();
//        System.out.println("The sum of the two number is "+ (a+b));
//        System.out.println("The difference of the two number is "+ (a-b));
//        System.out.println("The product of the two number is "+ (a*b));
//        System.out.println("The average of the two number is "+ (a+b)/2);
//        if(a>b)
//        {
//            System.out.println("A is Greater "+ a);
//            System.out.println("B is Smaller "+ b);
//        }
//        else
//        {
//            System.out.println("B is Greater "+ b);
//            System.out.println("A is Smaller "+ a);
//        }



     //   6) Write java program to get a number from the user and print whether it is positive or
       //         negative

//        Scanner s = new Scanner(System.in);
//             int a = s.nextInt();
//             if(a>0)
//             {
//                 System.out.println("I am a positive number ");
//             }
//             else
//             {
//                 System.out.println("I am a Negative Number");
//             }


   //     7) Take three numbers from the user and print the greatest number
//        Scanner s = new Scanner(System.in);
//        System.out.println("Enter the A");
//           int a = s.nextInt();
//        System.out.println("Enter the B");
//           int b = s.nextInt();
//        System.out.println("Enter the C");
//           int c = s.nextInt();
//
//           if(a>b&&a>c)
//           {
//               System.out.println("A is greater "+a);
//           }
//           else if(b>a&&b>c)
//           {
//               System.out.println("B is greater "+b);
//           }
//           else
//           {
//               System.out.println("C is greater "+ c);
//           }
//




        //8) Write a Java program that keeps a number from the user and generates an integer between 1 and 7
        //and displays the name of the weekday


//        Scanner s = new Scanner(System.in);
//        System.out.println("Enter 1 to 7 for showing the day");
//        int number = s.nextInt();
//
//        switch (number)
//        {
//                case 1:
//                System.out.println(" Monday ");
//                break;
//
//                case 2:
//                System.out.println(" Tuesday ");
//                break;
//
//                case 3:
//                System.out.println(" Tuesday ");
//                break;
//
//                case 4:
//                System.out.println("  Wednesday  ");
//                break;
//
//                case 5:
//                System.out.println(" Thursday ");
//                break;
//
//                case 6:
//                System.out.println(" Saturday ");
//                break;
//
//                case 7:
//                System.out.println(" Sunday ");
//                break;
//
//            default:
//                System.out.println("You Have entered the wrong key");
//
//
//
//        }


//        9) Write a Java program that takes the user to provide a single character from the alphabet.
//        Print Vowel or Consonant, depending on the user input. If the user input is not a letter
//        (between a and z or A and Z), or is a string of length > 1, print an error message.

//                Scanner s = new Scanner(System.in);
//                String c = s.next().toLowerCase();
//                boolean upppercase = c.charAt(0)>65 && c.charAt(0)<90;
//                boolean lowercase = c.charAt(0)>97 && c.charAt(0)<122;
//                boolean vowels = c.equals("a")|| c.equals("e")|| c.equals("i")|| c.equals("o")|| c.equals("u");
//                if(c.length()>1)
//                {
//                    System.out.println("You have enter more than onr character");
//                } else if (!(lowercase || upppercase)) {
//                    System.out.println("You have entered  number");
//                }
//                else if(vowels)
//                {
//                    System.out.println("You entered the vowel");
//                }
//                else
//                {
//                    System.out.println("You enterd the consonents");
//                }
//



     // 10   Write a program in Java to display the n terms of odd natural number and their sum.

        Scanner s = new Scanner(System.in);
        System.out.println("Enter the range u want to fetch");
        int n = s.nextInt();
        for(int i=0;i<n;i++)
        {
            if(i%2!=0)
            {
                System.out.println(i);
            }

        }
    }
}
