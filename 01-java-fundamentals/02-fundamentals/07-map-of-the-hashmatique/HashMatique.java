import java.util.*;

public class HashMatique {
	public static void main(String[] args){
		HashMap<String,String> trackList = new HashMap<String, String>();
		trackList.put("Adventure of a Lifetime", "I feel my heart beating Oh, you make me feel,Like I'm alive again,Alive again.");
		trackList.put("A Sky Full of Stars", "I don't care, go on and tear me apart,I don't care if you do ooh ooh.");
		trackList.put("Violet Hill", "Was a long and dark December,When the banks became cathedrals,And the fog,Became God.");
		trackList.put("Lost", "But if only you could see yourself in my eyes,You'd see you shine, you shine.");
		
		String name = trackList.get("Lost");
		System.out.println(name);

		Set<String> keys = trackList.keySet();
		for(String key : keys){
			System.out.println(key+": "+trackList.get(key));

		}
	}

}