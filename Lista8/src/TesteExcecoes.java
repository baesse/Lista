
public class TesteExcecoes {
	
	
	
	

	public Double divisao(int A, int B) {
		try {
			return (double) (A / B);
		} catch (ArithmeticException eA) {
			
			System.out.println("Dvivisão por zero: " + eA.getMessage());
		}catch(Exception e ){
			System.out.println("Erro:"+e.getMessage());
		}
		return null;
	}
	
	
	
	

	public static void main(String[] args) {

		TesteDivisao();
	}

	public static void TesteDivisao() {
		TesteExcecoes tx = new TesteExcecoes();
		tx.divisao(10, 0);
	}

}
