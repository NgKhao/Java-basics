
public class ViDu {
	public static void main(String[] args) {
		int out, in = 0;
		outer: for(out = 0; out < 10; out ++)
		{
			for(in = 0; in < 20; in++ )
			{
				if(in > 10)
					continue outer;
			}
			System.out.println("ben trong vong lap out: out =" + out + ", in = " + in);
			
		}
		System.out.println("ben ngoai vong lap out: out =" + out + ", in = " + in);
	}
}
