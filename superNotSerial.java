import java.io.*;
class superNotSerial
{
    public static void main(String[] args)
    {
        Dog d=new Dog(35,"Fido");
        System.out.println("Before: "+d.name+" "+d.weight);
        try
        {
            FileOutputStream fs=new FileOutputStream("testSer.txt");
            ObjectOutputStream os=new ObjectOutputStream(fs);
            os.writeObject(d);
            os.close();
        }
        catch(Exception ex)
        {
            ex.printStackTrace();
        }
        try
        {
            FileInputStream fis=new FileInputStream("testSer.txt");
            ObjectInputStream ois=new ObjectInputStream(fis);
            d = (Dog) ois.readObject();
            ois.close();
        }
        catch(Exception e) 
        {
            e.printStackTrace();
        }
        System.out.println("after: " + d.name + " "+ d.weight);
    }
}
class Dog extends Animal implements Serializable
{
    String name;
    Dog(int w,String n)
    {
        weight=w;//Inherited
        name=n;//not Inherited
    }
}
class Animal
{
    int weight=42;
}
