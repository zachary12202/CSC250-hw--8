import java.util.ArrayList;
import org.json.simple.JSONArray;
import org.json.simple.JSONObject;
import org.json.simple.JSONValue;
import java.util.Arrays;
public class CardParser 
{
	private String urlString;
	private ArrayList<HearthstoneCard> theMinions;
	
	public CardParser(String urlString)
	{
		//initial fields
		this.urlString = urlString;
		theMinions = new ArrayList<HearthstoneCard>();
		
		URLReader hearthstoneURLReader = new URLReader(this.urlString);
		Object obj = JSONValue.parse(hearthstoneURLReader.getTheURLContents());
		
	    if(obj instanceof JSONArray)
	    {
	    	//I am only in here if obj IS a JSONArray
	    	JSONArray array = (JSONArray)obj;
	    	
		    for(int i = 0; i < array.size(); i++)
		    {
		    	JSONObject cardData = (JSONObject)array.get(i);
		    	if(cardData.containsKey("cost") && cardData.containsKey("name"))
		    	{
		    		if(cardData.containsKey("type") && cardData.get("type").equals("MINION"))
		    		{
		    			//I am only here is this is a minion card!!!
		    			//System.out.println(cardData.keySet().toString());
		    			String name = (String)cardData.get("name");
		    			int cost = Integer.parseInt(cardData.get("cost").toString());
		    			int attack = Integer.parseInt(cardData.get("attack").toString());
		    			int health = Integer.parseInt(cardData.get("health").toString());
		    			HearthstoneCard temp = new HearthstoneCard(name, cost, attack, health);
		    			theMinions.add(temp);
		    			
		    			if (cost == 1)
		    			{
		    				System.out.println ( "name: " + name + " ,cost: " + cost + " ,attack: " + attack + " ,Health: " + health);
		    			}
		    			
		    			if (cost == 2)
		    			{
		    				 System.out.println ( "name: " + name + " ,cost: " + cost + " ,attack: " + attack + " ,Health: " + health);
		    			}
		    			
		    			if (cost == 3)
		    			{
		    				 System.out.println ( "name: " + name + " ,cost: " + cost + " ,attack: " + attack + " ,Health: " + health);
		    			}
		    			
		    			if (cost == 4)
		    			{
		    				 System.out.println ( "name: " + name + " ,cost: " + cost + " ,attack: " + attack + " ,Health: " + health);
		    			}
		    			
		    			if (cost == 5)
		    			{
		    				 System.out.println ( "name: " + name + " ,cost: " + cost + " ,attack: " + attack + " ,Health: " + health);
		    			}
		    			
		    			if (cost == 6)
		    			{
		    				 System.out.println ( "name: " + name + " ,cost: " + cost + " ,attack: " + attack + " ,Health: " + health);
		    			}
		    			
		    			if (cost == 7)
		    			{
		    				 System.out.println ( "name: " + name + " ,cost: " + cost + " ,attack: " + attack + " ,Health: " + health);
		    			} 
		    			
		    			if (cost == 8)
		    			{
		    				 System.out.println ( "name: " + name + " ,cost: " + cost + " ,attack: " + attack + " ,Health: " + health);
		    			}
		    			
		    			if (cost == 9)
		    			{
		    				 System.out.println ( "name: " + name + " ,cost: " + cost + " ,attack: " + attack + " ,Health: " + health);
		    			}
		    			
		    			if (cost == 10)
		    			{
		    				 System.out.println ( "name: " + name + " ,cost: " + cost + " ,attack: " + attack + " ,Health: " + health);
		    			}
		    			
		    			
		    		}
		    		
		    		
		    		//for (int j = 0; j < this.theMinions.size(); j++ )
		    		//{
		    			//if (cost == 1)
		    			//{
		    			//	System.out.print(cardData);
		    			//}
		    	}
		    	
		    }
	    }
	  
	
	}
	
	public void showMinions()
	{
		for(int i = 0; i < this.theMinions.size(); i++)
		{
			this.theMinions.get(i).display();
		}
	}
	
	public void OrderOfHearthStonecards()
	{
		//for (int j = 0; j < theMinions.size() - 1; j++) 
		//{
			//if ( theMinions.get(j).getCost() > (j + 1) )
			//{
				//System.out.println("hello");
			//}
		//}
	}

}