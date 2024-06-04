//Write a java program to read a file and display the content on screen.
import java.io.File;
public class ReadFileDisplay {
	public static void main(String[] args) {
		File myObj = new File("D:\\java
			programs\\Assignment\\Assignment8\\newSTreAM.txt");
		if (myObj.exists()) {
			System.out.println("File name is "+myObj.getName());
			System.out.println("File Absolute path is "+myObj.getAbsolutePath());
			System.out.println("Writeable "+myObj.canWrite());
			System.out.println("Readable "+myObj.canRead());
			System.out.println("File size in byte "+myObj.length());
		} else	{
			System.out.println("File does not Exists ");
		}
	}
}
