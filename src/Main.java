import tmdpbo.views.Home;

public class Main{
	public static Home home;
	public static void main(String[] args) {
		try{
			home = new Home("Home Page");
		}catch(Exception e){
			System.out.print(e);
		}
	}
}