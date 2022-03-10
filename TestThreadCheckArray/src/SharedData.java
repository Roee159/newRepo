import java.util.ArrayList;

/**
 * @author classroom
 *
 */
public class SharedData 
{
	ArrayList <Integer> array;
	private boolean [] winArray;
	private boolean flag;
	private final int b;
	
	/**
	 * @param array
	 * @param b
	 * Class Contractor
	 */
	public SharedData(ArrayList<Integer> array, int b) {
		
		this.array = array;
		this.b = b;
	}

	/**
	 * @return   winArray
	 */
	public boolean[] getWinArray() 
	{
		return winArray;
	}

	/**
	 * @param winArray
	 */
	public void setWinArray(boolean [] winArray) 
	{
		this.winArray = winArray;
	}

	/**
	 * @return array list of integers.
	 */
	public ArrayList<Integer> getArray() 
	{
		return array;
	}

	/**
	 * @return b.
	 */
	public int getB() 
	{
		return b;
	}

	/**
	 * @return flag.
	 */
	public boolean getFlag() 
	{
		return flag;
	}

	/**
	 * @param flag
	 * Set flag.
	 */
	public void setFlag(boolean flag) {
		this.flag = flag;
	}

}
