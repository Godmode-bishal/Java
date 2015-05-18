//deleting,renaming and creating file in java I/O using File class
import java.io.*;
public class directoryManipulation
{
    public static void main(String[] args)
    {
        File delDir=new File("deldir");
        delDir.mkdir();     //creating a directory
        
        File delFile1=new File(delDir,"delfile1.txt");
        delFile1.createNewFile();   //creating new file
        
        File delFile2=new File(delDir,"delfile2.txt");
        delFile2.createNewFile();   //creating new file
        
        delFile1.delete();   //deleting a file
        System.out.println("delDir is "+delDir.delete());//attempt to delete the directory
        
        File newName=new File(delDir,"newname.txt");
        delFile2.renameTo(newName);
        
        File newDir=new File("newdir");
        delDir.renameTo(newDir);
    }
}
        
        