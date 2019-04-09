/**
 * 
 * @author Prabhdeep Kainth
 * student ID: 12089162
 * period #4
 */
public class Item{
  //Your code goes here
	private int id;
	private int inv;
	
	/**
	 * 
	 * @param id - id of the item
	 * @param inv - inventory of the item
	 */
	public Item(int id, int inv) {
		this.id = id;
		this.inv = inv;
	}
	
	/**
	 * Accessor method for the id of the item
	 * @return id of the item
	 */
	public int getId() {
		return id;
	}
	
	/**
	 * Accessor method for the inventory of the item
	 * @return inventory of the item
	 */
	public int getInv() {
		return inv;
	}
	
	/**
	 * 
	 * @param i - other item object
	 * @return integer representing which item has the greater id number
	 */
	public int compareTo(Item i) {
		return id - i.getId();
	}
	
	/**
	 * ToString method for an item object
	 * @return representation of the item
	 */
	public String toString() {
		return id + " " + inv;
	}
}