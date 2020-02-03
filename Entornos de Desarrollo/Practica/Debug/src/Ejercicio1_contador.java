
public class Ejercicio1_contador 
{
		private int result=0;
		public int getResult() 
		{
				return result; 
		} 
		public void count() 
		{
			for (int i = 0; i < 100; i++) 
			{
				result += i +1; 
			}
		}
	public static void main(String[] args) 
	{
		Ejercicio1_contador contador = new Ejercicio1_contador();
		contador.count();
		System.out.println("Valor del contador " + contador.getResult());
	}
}
