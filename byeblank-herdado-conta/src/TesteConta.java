
public class TesteConta {

	public static void main(String[] args) {
		ContaCorrente cc = new ContaCorrente(2, 67);
		cc.deposita(1000);
		
		ContaPoupanša cp = new ContaPoupanša(2, 56);
		cp.deposita(2000);
		
		cc.transfere(500, cp);
		System.out.println("CC " + cc.getSaldo());
		System.out.println("CP " + cp.getSaldo());
	}

}
