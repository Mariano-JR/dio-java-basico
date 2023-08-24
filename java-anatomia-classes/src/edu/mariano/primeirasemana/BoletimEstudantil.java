package edu.mariano.primeirasemana;

public class BoletimEstudantil {
    public static void main(String[] args) {
        //Identação se relaciona ao metodo de formatação de código para que ele fique de forma mais legivel, um codigo Identado nos ajuda a ver nossos erros e facilita o entendimento de outras pessoas a respeito do que nosso código realmente quer mostrar.

        // Sem Identação
        // int mediaFinal = 6;
        // if(mediaFinal<6)	
        // System.out.println("REPROVADO"); 
        // else if(mediaFinal==6)
        // System.out.println("PROVA MINERVA"); 
        // else
        // System.out.println("APROVADO");

        // Com Identação
        int mediaFinal = 6;

		if (mediaFinal < 6)
			System.out.println("REPROVADO");
		else if (mediaFinal == 6)
			System.out.println("PROVA MINERVA");
		else
			System.out.println("APROVADO");
    }
}
