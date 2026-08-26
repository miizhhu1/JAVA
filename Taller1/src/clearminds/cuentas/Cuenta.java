package clearminds.cuentas;

public class Cuenta {
	
	private String id;
    private String tipo ;
    private double saldo;
    
    // Constructor de ID
    public Cuenta(String id) {
        this.id = id;
        this.tipo = "A";
    }

    // Constructor completo
    public Cuenta(String id, String tipo, double saldo) {
        this.id = id;
        this.tipo = tipo;
        this.saldo = saldo;
    }
    
    
	public String getId() {
		return id;
	}	
	public String getTipo() {
		return tipo;
	}
	public void setTipo(String tipo) {
		this.tipo = tipo;
	}
	public double getSaldo() {
		return saldo;
	}
	public void setSaldo(double saldo) {
		this.saldo = saldo;
	}

	
	public void imprimir() {
	    System.out.println("\u001B[32m************************");
	    System.out.println("        CUENTA");
	    System.out.println("************************");
	    System.out.println("Número de Cuenta: " + id);
	    System.out.println("Tipo: " + tipo);
	    System.out.println("Saldo: USD " + saldo);
	    System.out.println("************************\u001B[0m");
	}
	
	//con mi estilo
	
	public void 	imprimirConMiEstilo() {
		System.out.println("\u001B[36m================================\u001B[0m");
	    System.out.println("\u001B[33m          💰 MI CUENTA 💰\u001B[0m");
	    System.out.println("\u001B[36m================================\u001B[0m");

	    System.out.println("\u001B[32mNúmero : \u001B[0m" + id);
	    System.out.println("\u001B[35mTipo   : \u001B[0m" + tipo);
	    System.out.println("\u001B[32mSaldo  : USD \u001B[0m" + saldo);

	    System.out.println("\u001B[36m================================\u001B[0m");
	}
    
	

}
