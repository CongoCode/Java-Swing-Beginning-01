public class P1Driver 
{
    public static void main(String[] args)
    {
        int x = 100;
        int y = 100;
        
        for(int i = 1; i < 4; i++)
           {
                 P1Frame myFrame = new P1Frame("This is Frame " + i); 
                 myFrame.setLocation(x*i, y*i);
           } 
    }  
}
