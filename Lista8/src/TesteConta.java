
public class TesteConta {
		
	public static void main (String[] args){
		
		Conta contanovateste= new Conta();
		
		
		
		try{
			
		
		contanovateste.depositar(-10);
		}catch(IllegalArgumentException e){
			
			System.out.println("Erro:"+e.getMessage());
			
		}
		
	}
}
