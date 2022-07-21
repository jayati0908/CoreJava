package Testinganonymous;

public class TestingStatic {
	public static void main(String[] args) {
		
	
	Richman1 r = new Richman1() {
		
		@Override
		public void Party() {
			// TODO Auto-generated method stub
			System.out.println("party");
		}
		
		@Override
		public void HelpToOthers() {
			// TODO Auto-generated method stub
			System.out.println("help to others");
		}
	
	}; r.Party();
	r.HelpToOthers();
	Richman1.Jayati();
	r.tesdef();
	}
}
