import java.util.GregorianCalendar;
import java.util.Scanner;

public class relogio2{
	public long retornaAnguloRelogio(GregorianCalendar horario){
	return 0;
	}
	public static void main(String[] args){
	{
   Scanner ler = new Scanner(System.in);
   try{
         int a = 360; //circunfer�ncia do rel�gio
         int b = 12; //total de horas
         int c = 60; //minutos que equivalem a 1 hora
         System.out.printf("Informe o valor da horas:");
         int horas = ler.nextInt();
         System.out.printf("Digite o valor do minuto:");
         int minutos = ler.nextInt();
         int graus = 0;
         int ponteiroHora = 0;
         int ponteiroMinuto = 0;
         
         ponteiroHora =(int)((horas * a) / b + (minutos * 0.5)); //faz o calculo da movimenta��o em graus do ponteiro das horas
         ponteiroMinuto = (minutos * a) /c; // faz o c�lculo da movimenta��o em graus do ponteiro dos minutos
             
            if(ponteiroHora > ponteiroMinuto){ //para obter o resultado correto, subtra�mos o maior valor pelo menor
                  graus = ponteiroHora - ponteiroMinuto;
             }else{
                  graus = ponteiroMinuto - ponteiroHora;
             }
             
               System.out.println(graus + " graus");
               
   }finally{
      ler.close();
   }
  }
}
}