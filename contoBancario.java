package contobanca;



import java.util.Scanner;





public class contoBancario{

int saldo; 

String cognome; 



public contoBancario (int saldo, String cognome) { 



this.saldo=saldo; 

this.cognome=cognome; 

} 



public int preleva (int prelievo) { 



saldo = saldo - prelievo; 

return saldo; 



} 

public int versamento (int vers) { 



saldo = saldo + vers; 

return saldo; 

} 



public String toString () { 



return ("Cognome: " + cognome + " Saldo " + saldo); 

} 



public static void main(String[] args) { 





contoBancario conto1 = new contoBancario (1500, "Seb"); 

contoBancario conto2 = new contoBancario (1200, "Nero"); 

contoBancario conto3 = new contoBancario (2200, "Verde"); 



Scanner sc = new Scanner (System.in); 

System.out.println("Inserisci 1 per prelevare o 2 per versare: "); 

int x = sc.nextInt(); 



if (x==1) { 



Scanner sc1 = new Scanner (System.in); 

System.out.println("Inserisci quanto si vuole prelevare: "); 

int y = sc1.nextInt(); 



conto1.preleva(y); 

conto2.preleva(y); 

conto3.preleva(y); 



System.out.println("Il tuo saldo aggiornato è: " + conto1); 

System.out.println("Il tuo saldo aggiornato è: " + conto2); 

System.out.println("Il tuo saldo aggiornato è: " + conto3); 

} else if ( x==2) { 

Scanner sc1 = new Scanner (System.in); 

System.out.println("Inserisci quanto si vuole versare: "); 

int y = sc1.nextInt(); 



conto1.versamento(y); 

conto2.versamento(y); 

conto3.versamento(y); 



System.out.println("Il tuo saldo aggiornato è: " + conto1); 

System.out.println("Il tuo saldo aggiornato è: " + conto2); 

System.out.println("Il tuo saldo aggiornato è: " + conto3); 

} 

else { 

System.out.println("OPZIONE ERRATA "); 

} 



} 



}