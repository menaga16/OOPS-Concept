package packagenew1;
public class pattern 
{
    protected void display()
    {
        
        int rows = 4;        
        for (int i= 0; i<= rows-1 ; i++)
        {
            for (int j=0; j<=i; j++) { 
                System.out.print("*"+ " "); 
            }
            System.out.println("");
        }
        for (int i=rows-1; i>=0; i--)
        {
            for(int j=0; j <= i-1;j++)
            {
                System.out.print("*"+ " ");
            }
            System.out.println("");
    }
}
    void defaultmethod()
    {
        
         int rows=4;
         for(int i=0;i<rows;i++)
         {
             for(int j=0;i<rows;j++){
                 System.out.println("*  ");
             }
             System.out.println();
         }
    }
}