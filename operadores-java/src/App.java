public class App {
    public static void main(String[] args) throws Exception {
        //Atribuição: utilizamos o "=" para a declaração de atribuição, como na declaração de uma variavel
        int idade = 22;

        //Aritméticos: São utilizados para calculos matematicos( +, -, *, /, % )
        int soma = idade + 1;
        int subtracao = soma - 1;
        int multiplicacao = subtracao * 1;
        int divisao = multiplicacao / 1;
        int restoDivisao = divisao % 1;
        //Nota: Quando estamos falando de dados String, o " + " é utilizado para concatnar as Strings
        String nomeCompleto = "Mariano" + " " + "Júnior"; // output: "Mariano Júnior"

        //Unário: Utilizado junto com outro operador para incremento, decremento e inversão de valores númericos e booleanos
        int numero = 5;
        int positivo = numero;
        int negativo = -numero;
        negativo++;    //Incremento 1 ao valor da variavel,    Output: -5
        negativo += 2; //Incremento de 2 ao valor da variavel, Output: -2
        positivo--;    //Decrementa 1 ao valor da variavel,    Output:  5
        positivo -= 2; //Decrementa 2 ao valor da variavel,    Output:  2
        // Nota: Quando utilizado o " ++ " e o " -- ", temos que ter cuidado ao lado que vamos utilizar, pois se vir antes do numero/variavel, ele irá incrementar/decrementar antes de ser usado, se for usado após, ele irá incrementar/decrementar após ser utilizado.
        boolean falso = !true;

        //Ternário: Utilizados como o IF condicional, onde a expressão é simplicada em uma linha com o "?" e ":"
        int a, b;

        a = 5;
        b = 6;
        boolean resultado;

        // if(a == b)
        //     resultado = true;
        // else
        //     resultado = false;

        resultado = a == b ? true : false;
        //Resumindo  o if em apenas uma linha

        System.out.println(resultado);

        //Relacionais: Utilizado para avaliar relações entre duas variaveis,ou seja, comparar dois tipos de dados ( <, >, ==, !=, >=, <= )

        int numero1 = 1;
        int numero2 = 2;

        boolean simNao = numero1 == numero2;

        System.out.println("Número 1 é igual a Número 2? " + simNao);

        //Lógico: Permite criar expressões logicas a partir da junção de duas ou mais expressões, geralmente são utilizados em If condicional.
        // São utilizados && e || onde && se refere a "and" (e), e || se refere a "or" (ou).
        boolean condicao1 = true;
        boolean condicao2 = false;

        if (condicao1 && condicao2) {
            System.out.println("As duas condições são verdadeiras");
        }

        if (condicao1 || condicao2) {
            System.out.println("Uma das condições é verdadeira");
        }

        System.out.println("Fim");
        // Output: "Uma das condições é verdadeira"
        //         "Fim"

    }
}
