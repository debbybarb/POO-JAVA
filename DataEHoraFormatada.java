package meuPacote;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class Ex1 {
	public static void main (String[] args) {
		LocalDateTime meuObjData = LocalDateTime.now();
		System.out.println("Antes de formatar: " + meuObjData);
		DateTimeFormatter meuObjFormat = DateTimeFormatter.ofPattern("dd-MM-yyyy HH:mm:ss");
		String horaFormatada = meuObjData.format(meuObjFormat);
		System.out.println("Depois de formatado: " + horaFormatada);
	}
}
//yyyy-MM-dd     -> "1988-09-29"	
//dd/MM/yyyy     -> "29/09/1988"	
//dd-MMM-yyyy    -> "29-Sep-1988"	
//E, MMM dd yyyy -> "Thu, Sep 29 1988"
