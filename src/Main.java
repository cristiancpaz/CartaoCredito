//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        //TIP Press <shortcut actionId="ShowIntentionActions"/> with your caret at the highlighted text
        // to see how IntelliJ IDEA suggests fixing it.
        CartaoCredito[] cart = new CartaoCredito[10];
        cart[0] = new CartaoCredito("5391 0375 9387 5309", "Joao Silva","BB", 0.0, 2500, 10);
        cart[1] = new CartaoCredito("3485 0399 3395 1954", "Manoel Carvalho","Santander", 0.0, 3500, 15);
        cart[2] = new CartaoCredito("6011 4902 3294 2994", "Antonio Medeiros","Banrisul", 0.0, 3500, 25);

        for (int i = 1; i < 10; i++){
            cart[0].saldoSuficiente((double)i);
            cart[1].saldoSuficiente(2.0*i);//conversao implicita
            cart[2].saldoSuficiente((double) 3*i);//conversao explicita
        }
        for (int i = 0; i < 3; i++){
            CartaoCredito.imprimeCartao(cart[i]);
            while (cart[i].getBalance()> 100.0){
                cart[i].pagamento(100.0, 1);
                System.out.println("Novo balance: "+ cart[i].getBalance());
            }
        }
        //CartaoCredito.imprimeCartao(cart[0]);
        //CartaoCredito.imprimeCartao(cart[1]);
        //CartaoCredito.imprimeCartao(cart[2]);
    }
}

/**
 * Exercicio do livro Estrutura de dados Godrich
 */