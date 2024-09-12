public class CartaoCredito {
    private String numero;
    private String nome;
    private String banco;
    private  double balance;
    private int limite;
    private int dia;
    private double juros = 0.03;

    public CartaoCredito(String num, String no, String bc, double bl,int lim, int di){
        numero = num;
        nome = no;
        banco = bc;
        balance = bl;
        limite = lim;
        dia = di;
    }

    public String getNumero(){
        return numero;
    }
    public String getNome(){
        return nome;
    }
    public String getBanco(){
        return  banco;
    }
    public double getBalance(){
        return  balance;
    }
    public int getLimite(){
        return limite;
    }
    public int getDia(){
        return dia;
    }

    public void setBanco(String banco){
        this.banco = banco;
    }
    public void setNome(String nm){
        this.nome = nm;
    }
    public boolean saldoSuficiente(double price){
        if (price + balance > (double) limite){
            return false;//nao ha dinheiro suficiente para debitar
        }
        balance += price;
        return true;
    }

    public double getJuros(){
        return juros;
    }
    public void pagamento(double pag, int diaPag){
        try {

            if (diaPag > 0 && diaPag < 31 && diaPag > dia){
                pag += pag * getJuros();
                balance -= pag;
            }
            balance -= pag;
        } catch (Exception e) {
            throw new RuntimeException(e);
        }


    }
    public static void imprimeCartao(CartaoCredito c){
        System.out.println("Numero: " + c.getNumero());
        System.out.println("Nome: " + c.getNome());
        System.out.println("Banco: " + c.getBanco());
        System.out.println("Balance: " + c.getBalance());
        System.out.println("Limite: " + c.getLimite());
    }


}
