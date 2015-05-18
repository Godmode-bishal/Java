//Actual class name in the book was Dog. I changed it to random to see if java compiler gives me an error for a class name being a keyword.Well, it does not.
class random
{
    String name;
    public static void main(String[] args)
    {
        random dog1=new random();
        dog1.bark();
        dog1.name="Bart";
        //Making a random array
        random[] mydog=new random[3];
        //let's put some real objects in it.
        mydog[0]=new random();
        mydog[1]=new random();
        mydog[2]=new random();
        //let's access the dogs using the references.
        mydog[0].name="Fred";
        mydog[1].name="Marge";
        System.out.println("Let's print out last dog's name :" +mydog[2].name);
    }
    public void bark()
    {
        System.out.println(name + "says Ruff");
    }
}
        
