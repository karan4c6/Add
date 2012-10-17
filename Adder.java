package adder;

public class Adder 
{

    public static void main(String[] args)
    {
	int length = args.length;
	if(length > 1)
	{
	    double sumOfArgs = 0.0;
	    for(int i = 0; i<length; i++)
	    {
		sumOfArgs += Double.parseDouble(args[i]);
	    }
	    System.out.println(sumOfArgs);
	}
	else
	{
	    System.out.print("You entered only one value.\n");
	}
    }
}
