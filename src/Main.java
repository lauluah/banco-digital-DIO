public class Main {
    public static void main(String[] args) {
        Cliente Lucas = new Cliente();
        Lucas.setNome("Lucas");

        Conta cc = new ContaCorrente(Lucas);
        Conta poupanca = new ContaPoupanca(Lucas);

        cc.depositar(300);
        cc.transferir(100, poupanca);

        cc.imprimirExtrato();
        poupanca.imprimirExtrato();
    }

}