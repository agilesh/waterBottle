
interface Service
{
	public Bottle fillin();
	public Bottle fillout();
	public Bottle water_remaining();
	public Bottle vaccum_space();
	
}

public class BottleService {

	private final int  bottleCapacity = 20;
	private static int litres=0;
	
	
	public boolean isfullyEmpty()
	{
		if(litres==0)
		{
			return true;
		}
		return false;
	}
	
	
	public int remainingCapacity(int water)
	{
		if(bottleCapacity>water)
		{
		return bottleCapacity-water;
		}
		else
		{
			return 0;
		}
	}
	
	public double fillin(int water)
	{
  //    int remainingbottlecapacity = remainingCapacity(water);
      if(water>bottleCapacity)
      {
    	  int extra = water-bottleCapacity;
    	  overflow(extra);
      }
      else if(water<bottleCapacity)
      {
    	  litres=litres+water;
      }
	return litres;
		
	}
	
	
	public void overflow(int water)
	{
	 System.out.print("overflow happens !!! "+water+" litres of water wasted");	
	}
	
	
	
	public double fillout(int water)
	{
		
		if(isfullyEmpty())
		{
			System.out.print("already empty");
			return (Double) null;
		}
		int remainingbottlecapacity = remainingCapacity(water);
		int waterinBottle = litres;
		if(water>waterinBottle)
		{
			System.out.print("emptying fully");
			litres=0;
		}
		else
		{
			litres = litres - water;
		}
		return litres;
		
	}
	
	
	public int waterinBottle()
	{
return litres;
	}
}
