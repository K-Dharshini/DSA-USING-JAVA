package Inheritance.Driver;

import Inheritance.WooberUser.WooberUser;

public class Driver extends WooberUser
{
    String vehicleName;
    String vehicleNo; 

    public void parentWelcome()
    {
        super.welcome();
    }
}