public class DrawingLab
{
    public static void exercise1()
    {
        //insert code here to make a new window with your first drawing
        Draw.window(500,500);
        Draw.setFill(true);
        Draw.setColor(255,0,0);
        Draw.oval(175,175,150,150);
        Draw.setColor(255,255,255);
        Draw.oval(200,200,100,100);
        Draw.setColor(255,0,0);
        Draw.oval(225,225,50,50);
        

    }

    public static void exercise2()
    {
        //insert code here to make a new window with your second drawing
        Draw.window(200,600);
        Draw.setFill(true);
        Draw.setColor(255,0,0);
        Draw.oval(0,0,200,200);
        Draw.setColor(255,255,0);
        Draw.oval(0,200,200,200);
        Draw.setColor(0,255,0);
        Draw.oval(0,400,200,200);

    }

    public static void exercise3()
    {
        //insert code here to make a new window with your third drawing
        Draw.window(400,400);
        Draw.setFill(true);
        Draw.setColor(0,0,255);
        Draw.rectangle(0,0,800,800);
        Draw.setColor(255,0,0);
        Draw.rectangle(50,50,100,100);
        Draw.rectangle(250,250,100,100);
        Draw.rectangle(200,0,200,200);
        Draw.rectangle(0,200,200,200);
        Draw.setColor(0,0,255);
        Draw.rectangle(250,50,100,100);
        Draw.rectangle(50,250,100,100);

    }

    public static void exercise4()
    {
        //insert code here to make a new window with your fourth drawing
        Draw.window(800,800);
        Draw.setFill(true);
        Draw.setColor(0,0,255);
        Draw.polygon(100,400,200,100,600,100,700,400,400,600);

    }
    
     public static void exercise5()
    {
        //insert code here to make a new window with your fourth drawing
        Draw.window(800,800);
        Draw.setFill(false);
        Draw.setColor(0,0,255);
        Draw.polygon(100,400,600,100,400,600,200,100,700,400);

    }
