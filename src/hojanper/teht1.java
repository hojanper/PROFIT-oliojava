package hojanper;

public class teht1 {

    public static void main(String[] args) 
    {
    	int i;
    	double j;

    	for(i=0;i<1000;i++)
		{
    		j= Math.sqrt(i);
    		if(j % 1 == 0)
    		{
    			System.out.println("Luvun " + i +" neliöjuuri on kokonaisluku " +(int)Math.sqrt(i));
    		}
		}
       
    }

}
