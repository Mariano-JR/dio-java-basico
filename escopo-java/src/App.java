public class App {
    public static void main(String[] args) throws Exception {
        // Escopo: Ambiente onde uma variavel pode ser acessada, onde em java, vai de acordo com o bloco a qual foi declarada
        // Dependendo de onde a nossa variavel for declarada, poderá mudar o tipo de visibilidade dessa variavel dentro do nosso codigo
        // Dentro de um metodo, a variavel esta limitada apenas ao corpo desse metodo
    }

    public class Conta {
            //variavel da classe conta
            double saldo=10.0;
            
            public void sacar(Double valor) {
                //variavel local de método
                double novoSaldo = saldo - valor;
            }
            public void imprimirSaldo(){
                //disponível em toda classe
                System.out.println(saldo);
                //somente o método sacar conhece esta variavel
                // System.out.println(novoSaldo);
            
            }
            public double calcularDividaExponencial(){
                //variável local de método
                double valorParcela = 50.0;
                double valorMontante = 0.0; // começando a variável com valor zero
                for(int x=1; x<=5; x++) {//x variável de escopo de fluxo
                    //esta variável será reiniciada a cada execução for
                    double valorCalculado = valorParcela * x;
                    valorMontante = valorMontante + valorCalculado;
                }
                //escopo de fluxo
                //x e valorCalculado nunca estarão disponíveis fora do for
                
                return valorMontante;
            }

        }
}
