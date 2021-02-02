package main;

import java.util.Scanner;

import entities.ISalutatore;
import entities.SalutatoreFormale;
import entities.SalutatoreInformale;

public class Main 
{

	public static void main(String[] args) 
	{
		Scanner tastiera = new Scanner(System.in);
		String nome = "";
		String risposta = "";
		int ora = 0;
		
		System.out.println("Inserisci il tuo nome");
		nome = tastiera.nextLine();
		
		do
		{
			System.out.println("Vuoi un saluto formale o no?\nY/N");
			risposta = tastiera.nextLine();
		}
		while(!risposta.equalsIgnoreCase("Y") && !risposta.equalsIgnoreCase("N"));
		
		do
		{
			System.out.println("Che ore sono? (inserisci solo le ore)");
			ora = Integer.parseInt(tastiera.nextLine());
		}
		while(ora < 0 || ora > 24);
		
		ISalutatore saluto;
		switch(risposta.toLowerCase())
		{
		case "y" :
			saluto = new SalutatoreFormale();
			if(ora >= 6 && ora <= 13)
				System.out.println(saluto.salutaMattino(nome));
			if(ora >= 14 && ora <= 22)
				System.out.println(saluto.salutaSera(nome));
			if(ora >= 23 && ora <= 5)
				System.out.println(saluto.salutaNotte(nome));
			break;
		case "n" :
			saluto = new SalutatoreInformale();
			if(ora >= 6 && ora <= 13)
				System.out.println(saluto.salutaMattino(nome));
			if(ora >= 14 && ora <= 22)
				System.out.println(saluto.salutaSera(nome));
			if(ora >= 23 && ora <= 5)
				System.out.println(saluto.salutaNotte(nome));
			break;
		}
		tastiera.close();
	}

}
