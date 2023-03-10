package bytebank;

public class testaMetodo {
    public static void main(String[] args) {
        Conta contafds = new Conta();
        contafds.saldo = 100;
        contafds.deposita(50);
        System.out.println(contafds.saldo);

        boolean conseguiuRetirar = contafds.saca(20);
        System.out.println(contafds.saldo);
        System.out.println(conseguiuRetirar);

        Conta contaDaMarcela = new Conta();
        contaDaMarcela.deposita(1000);

        contaDaMarcela.transfere(300, contafds);
        System.out.println(contaDaMarcela.saldo);
        System.out.println(contafds.saldo);
        contaDaMarcela.titular = "Marcela Silva";
        System.out.println(contaDaMarcela.titular);

        Conta contaDoPaulo = new Conta();

    }
}

