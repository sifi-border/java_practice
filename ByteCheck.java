public class ByteCheck
{
	public static void main(String[] args)
	{
		//オーバーフロー
		System.out.println("100000 * 100000 = " + 100000 * 100000);
		//long(64bit)にすることで回避
		System.out.println("100000L * 100000L = " + 100000L * 100000L);
	}
}
