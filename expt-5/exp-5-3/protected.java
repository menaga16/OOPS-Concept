package packagenew;
import packagenew1.pattern;
public class Protected extends pattern
{
    public static void main(String[] args) 
   {
       Protected p=new Protected();
       System.out.println("Pattern in Protected Method:");
       p.display();
       try
       {
           p.defaultmethod();
       }
        catch(Exception e)
        {
           System.out.println(" Default method can't accessed outside the package");
           System.out.println(e);
        }
    }   
}