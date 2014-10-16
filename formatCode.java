import java.io.*;
import java.util.*;
class formatCode
	{
	public static void main(String[]args)
		throws IOException
	{
		System.out.println("Enter name of file, which will change");
		Scanner scan = new Scanner(System.in);
		String name = scan.nextLine();
		BufferedReader br = new BufferedReader(new FileReader(name));
		String code = br.readLine();
		code = format(code);
		System.out.println(code);
	}
	public static String format(String code){
		code = code.replaceAll(";","; \n");
		return code;
	}
}
