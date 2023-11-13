
public class calculos_conmath {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//double raiz=Math.sqrt(9);
		//System.out.println(raiz);
		//double num1=5.85F;
		//int resultado=(int)Math.round(num1);
		double base=5;
		double exponente=3;
		
		int resultado=(int)Math.pow(base, exponente);
		
		System.out.println("El resultado de " + base + " elevado a " + exponente + " es " + resultado);
	}

}
