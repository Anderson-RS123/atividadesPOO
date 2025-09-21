// 										Exercício: 7
//             			Resumo do programa
// O código deve criar uma conta no banco, precisando ter o numero da conta e o valor em conta.
//   As contas podem ser de poupança (pode render juros) ou conta corrente (possuir uma taxa de saque)
// O sistema precisa criar as contas, possibilitar realizar saques e depósitos nos dois tipos de contas.


// 				Planejamento das classes
// classe mãe: Conta; Atributos: n_conta; Metodos: criar;
// subclasse : Corrente; Atributos: saldo_corrente e taxa_saque; Metodos: depositar_corrente e saquar_corrente;
// subclasse : Poupanca; Atributos: saldo_poupanca e rendimentos; Metodos: depositar_poupanca e saquar_poupanca;



package atividades;

class Conta {
    int n_conta;

    Conta(int n_conta) {
        this.n_conta = n_conta;
    }

    void criar() {
        System.out.print("Numero de conta " + n_conta + " criada.");
    }
}

class Corrente extends Conta {
    double saldo_corrente;
    double taxa_saque;

    Corrente(int n_conta, double saldo_corrente, double taxa_saque) {
        super(n_conta);
        this.saldo_corrente = saldo_corrente;
        this.taxa_saque = taxa_saque;
    }

    void depositar_corrente(double valor) {
        saldo_corrente += valor;
        System.out.println("Valor de R$" + valor + " depositado com sucesso. Saldo Atual: R$ " + saldo_corrente + ".");
    }

    void sacar_corrente(double valor_sacar) {
        if ((saldo_corrente - valor_sacar - taxa_saque) < 0) {
            System.out.println("Valor a ser sacado é menor do que o valor em conta.");
        } else {
            saldo_corrente -= (valor_sacar + taxa_saque);
            System.out.println("Valor de R$" + valor_sacar + " sacado. Taxa de R$" + taxa_saque
                               + " cobrada. Saldo Atual: R$" + saldo_corrente + ".");
        }
    }
}

class Poupanca extends Conta {
    double saldo_poupanca;
    double rendimentos;

    Poupanca(int n_conta, double saldo_poupanca, double rendimentos) {
        super(n_conta);
        this.saldo_poupanca = saldo_poupanca;
        this.rendimentos = rendimentos;
    }

    void depositar_poupanca(double valor) {
        saldo_poupanca += valor;
        saldo_poupanca *= rendimentos;
        System.out.println("Valor de R$" + valor + " depositado com sucesso, com rendimento de " + (valor * rendimentos)
                + ". Saldo Atual: R$ " + saldo_poupanca + ".");
    }

    void sacar_poupanca(double valor_sacar) {
        if ((saldo_poupanca - valor_sacar) < 0) {
            System.out.println("Valor a ser sacado é menor do que o valor em conta.");
        } else {
            saldo_poupanca -= valor_sacar;
            System.out.println("Valor de " + valor_sacar + " sacado. Saldo da conta poupanca atual: R$" + saldo_poupanca + ".");
        }
    }
}

public class banco2 {
    public static void main(String[] args) {
        Corrente conta1 = new Corrente(1, 1000.00, 1.00);
        Poupanca conta2 = new Poupanca(2, 200, 1.5);

        conta1.depositar_corrente(100);
        conta1.sacar_corrente(30);

        conta2.depositar_poupanca(100);
        conta2.sacar_poupanca(300);
    }
}