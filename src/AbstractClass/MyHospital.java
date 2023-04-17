package AbstractClass;

public class MyHospital extends Hospital{

    MyHospital()
    {
        System.out.println("Constructor!");
    }
    @Override
    void emergency() {
        System.out.println("Emergency Method!");
    }
    @Override
    void appointment()
    {
        System.out.println("Appointment!");
    }
    @Override
    void admit()
    {
        System.out.println("Admit method!");
    }
    @Override
    void billing()
    {
        System.out.println("Billing method!");
    }
}
