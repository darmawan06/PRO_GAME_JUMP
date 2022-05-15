import Views.*;

public class Main{
	public static Home home;
	public static void main(String[] args) {
		try{
			home = new Home();
		}catch(Exception e){
			System.out.print(e);
		}
	}
}