package Day1;

 class Single1
 {
	public void name()
	{
		System.out.println("Single");
	}	
}


class doubles extends Single1
{
	public void name() {
		System.out.println("double1");
	}
}

class Single
{
	public static void main(String[] args)
	{
		doubles doubles=new doubles();
		doubles.name();
	}
}






