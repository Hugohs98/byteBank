package bytebank;

import bytebank.Conta;

public class criaConta {
    public static void main(String[] args) {
        Conta primeiraConta = new Conta();
        primeiraConta.saldo = 200;

        Conta segundaConta = new Conta();
        segundaConta.saldo = 50;
        System.out.println(primeiraConta.saldo);

        primeiraConta.saldo += 100;
        System.out.println(primeiraConta.saldo);
    }
}
