public class employeewage
{
    public static void main( String[] args )

    {
        System.out.println( "Welcome to employee wage computation!" );
              int IS_FULL_TIME = 1 ;
              double empCheck = Math.floor(Math.random() * 10) % 2 ;
             
              if (empCheck == IS_FULL_TIME)
                 System.out.println("Employee is present ");
              else
                 System.out.println("Employee is absent");

    }
}




