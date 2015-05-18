class GameShape
{
    public void displayShape()
    {
        System.out.println("Displaying shape");
    }
}
class PlayerPiece extends GameShape
{
    public void movePiece()
    {
        System.out.println("Moving Game piece");
    }
}
public class TestShapes
{
    public static void main(String[] args)
    {
        PlayerPiece shape=new PlayerPiece();
        shape.displayShape();
        shape.movePiece();
    }
}
