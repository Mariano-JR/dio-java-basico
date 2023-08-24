public class TiposVariaveis {
    public static void main(String[] args) throws Exception {
        // Tipos númericos
        //Em Java, temos 8 tipos númericos que variam de acordo com o tamanho do número que será armazenado dentro da nossa variavel. (Consultar tabela no Notion)
        byte idade = 123;
        short ano = 2023;
        int cep = 21070333;
        long cpf = 98765432109L; //Necessario por o L ao final do número
        float pi = 3.14F;        //Necessario por o F ao final do número
        double salario = 1275.33;
        // ----------------------------------------------------- //

        //Variavel x Constante
        //Diferentemente das variaveis, as constantes não podem ser alteradas após elas serem declaradas
        //Para que possamos declarar constantes, utilizaremos a palavra reservada "final" antes do tipo da variavel, por convenção, todas as constantes são escritas em UpperCase
        final double VALOR_DE_PI = 3.14;

    }
}
