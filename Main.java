class ContaBancaria {
    protected double saldo;

    public void depositar(double valor) {
        saldo += valor;
        System.out.println("Depósito realizado. Saldo: R$ " + saldo);
    }
}

class ContaPoupanca extends ContaBancaria {
}

class ContaCorrente extends ContaBancaria {

    @Override
    public void depositar(double valor) {
        super.depositar(valor - 1.00);
        System.out.println("Foi descontada uma taxa de R$ 1,00.");
    }
}

public class Main {
    public static void main(String[] args) {

        ContaPoupanca poupanca = new ContaPoupanca();
        poupanca.depositar(100.00);

        ContaCorrente corrente = new ContaCorrente();
        corrente.depositar(100.00);
    }
}