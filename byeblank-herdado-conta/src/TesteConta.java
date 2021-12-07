
public class TesteConta {

	public static void main(String[] args) {
		ContaCorrente cc = new ContaCorrente(2, 67);
		cc.deposita(1000);
		
		ContaPoupança cp = new ContaPoupança(2, 56);
		cp.deposita(2000);
		
		cc.transfere(500, cp);
		System.out.println("CC " + cc.getSaldo());
		System.out.println("CP " + cp.getSaldo());
	}

}
