import java.util.Scanner;
class Main {
  public static void main(String[] args) {
    System.out.println("Hello world!");

    Scanner sc= new Scanner(System.in);
    System.out.println("choose the unit which you want to convert..");
  
    System.out.println(" 1. kms to miles \n 2. inches to foot \n 3. cms to inches \n 4. pound to kgs \n  5.inches to meter ");
    
  int choice = sc.nextInt();
    
    switch(choice)
      {
        case 1:
     System.out.println("you have chosen km to miles\n");
     System.out.println("enter value\n");
       float x= sc.nextFloat();
     float result= x*0.621F;
       System.out.println("result is \n "+x + "km = "+ result +"miles\n\n");
      break;
      
       case 2:
     System.out.println("you have chosen inches to foot\n");
     System.out.println("enter value\n");
       x= sc.nextFloat();
     result=x*0.0833f;
     System.out.println("result is \n "+x + "inches = "+ result +"foot\n\n");
     break;
          
        case 3:
          System.out.println
          
      }
      
   /*case 3:
     printf("you have chosen cms to inches\n");
     printf("enter value\n");
     scanf("%f",&x);
     result=x*0.394;
     printf("result is \n %f cms = %f inches\n\n",x,result);
     break;

      
  /* case '4':
    printf("you have chosen pound to kgs\n");
    printf("enter value\n");
    scanf("%f",&x);
    result=x*0.454;
    printf("result is \n %f pound = %f kgs\n\n",x,result);
    break;
     
     
   case '5':
    printf("you have chosen inches to meter\n");
    printf("enter value\n");
    scanf("%f",&x);
    result=x*0.0254;
    printf("result is \n %f inches = %f meter\n\n",x,result);
    break;

   case 'q':
    printf("quiting the program..\n");
     goto end;

     
   default:
    printf("invalid choice \n\n");
      
  }
   
   
      }*/
  }
}
