package ArrayList;

import java.util.ArrayList;

public class App21 {

	public static void main(String[] args) {
		ArrayList<String> color=new ArrayList<String>(3);
		color.add("red");
		color.add("blue");
		color.add("green");
		color.add("orange");
		color.remove("green");
		color.add("pink");
		color.add("yellow");
		
		System.out.println(color.get(1));
		System.out.println(color.contains("orange"));
		System.out.println(color.size());
		System.out.println(color);
		
	}

}
