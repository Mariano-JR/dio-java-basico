package edu.mariano.primeirasemana;

public class MinhaClasse {
    public static void main(String[] args) {
    //Public: Indica que nossa função main será visivel para o restante do nosso código;
    //Static:
    //Void: Indica que nossa função será executada mas não nos trará um retorno;
    //Main: Indica que essa nossa função será nossa função principal da nossa classe.

        System.out.println("Olá Mundo!");

        // ------------------------------------------------------//
        //Variaveis
        // As variaveis são declaradas pelo escopo: Tipo nomeBemDefinido = Atribuição;
        String meuNome = "Mariano";
        int anoFabricacao = 2023;
        boolean verdadeira = true;

        // Quando precisamos mudar o valor da variavel, não precisamos passar o tipo da variavel novamente.
        anoFabricacao = 2018;
        //variaveis do tipo final: Por convencão da linguagem, quando vemos uma variavel com todas as letras maiuscurlas, sabemos que essa variavel terá um valor fixo e nunca poderá ser alterado.
        //EX:
        // final String BR = "Brasil";  
        //------------------------------------------------------//

        String primeiroNome = "Mariano";
        String segundoNome = "Júnior";
        String nomeCompleto = nomeCompleto(primeiroNome, segundoNome);
        System.out.println(nomeCompleto);
        //------------------------------------------------------//

        
    }
    //Metodo
    //Os Metodos tem o escopo: TipoRetorno nomeObjetivoNoInfinitivo(Parametros(s)) 
    public static String nomeCompleto(String primeiroNome, String segundoNome) {
        return primeiroNome.concat(" ").concat(segundoNome);
    }
}
