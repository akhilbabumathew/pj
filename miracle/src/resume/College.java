package resume;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
public class College {

	public static void main(String[] args) throws IOException {
		String name;
		String age;
		String degree;
		String branch;
		String no;
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
        System.out.println("Enter your name");
        name=br.readLine();
        System.out.println("Enter your age");
        age=br.readLine();
        System.out.println("Enter your degree");
        degree=br.readLine();
        System.out.println("Enter your branch");
        branch=br.readLine();
        System.out.println("Enter your no");
        no=br.readLine();
        System.out.println("Name   : "+name);
        System.out.println("Age    : "+age);
        System.out.println("Degree : "+degree);
        System.out.println("Branch : "+branch);
        System.out.println("No     : "+no);
	}

}
