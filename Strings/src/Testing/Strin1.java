package Testing;

public class Strin1 {
	public static void main(String[] args) {
		String name= "Jayati Chouhan";
		System.out.println("1:string length is:"+name.length());
		System.out.println("2:7th character is:"+ name.charAt(5));
		System.out.println("3:Chou index is:"+name.indexOf("Chou"));
		System.out.println("4:first i position:"+name.indexOf("i"));
		System.out.println("5:last i position is:"+name.lastIndexOf("i"));
		System.out.println("6:a is replaced by @:"+name.replace("a", "@"));
		System.out.println("7:all a is replaced by @:"+name.replaceAll("[a-z]","@"));
		System.out.println("8:character into lower case:"+name.toLowerCase());
		System.out.println("9:characters into upper case:"+name.toUpperCase());
		System.out.println("10:name starts with Jayati:"+name.startsWith("Jayati"));
		System.out.println("11:name ends with wal:"+name.endsWith("wal"));
		System.out.println("12:substring is:"+name.substring(7));
	}

}
