package Banking;

import java.io.BufferedReader;
import java.io.FileReader;

public class AccountStatement {
	public void enquiry(){
	try(FileReader fstatement = new FileReader("account_statement.txt");
			BufferedReader statement = new BufferedReader(fstatement)){
		int x;
		while ((x = statement.read()) != -1) {
			System.out.print((char) x);
		}
	}
	catch(Exception e) {
		e.printStackTrace();
	}
}
	
}
