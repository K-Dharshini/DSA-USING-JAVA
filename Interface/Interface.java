package Interface;
public class Interface 
{
    public static void main(String[] args) 
    {
        serviceManager s = new serviceManager();
        s.cleanLocation();
        s.hourlyMessage();
        s.showIdcard();
    }
}

interface location
{
    public void cleanLocation();
    public void hourlyMessage();
}

interface defaultUser
{
    public void showIdcard();
}

class serviceManager implements location, defaultUser
{
    public void cleanLocation()
    {
        System.out.println("This is cleanLocation method");
    }

    public void hourlyMessage()
    {
        System.out.println("This is hourlyMessage method");
    }

    public void showIdcard()
    {
        System.out.println("This is showIdcard method");
    }
}