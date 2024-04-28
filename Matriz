import java.util.Scanner;

public class Main12 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int M, N, i, j;
		
		System.out.print("Quantas linhas vai ter a matriz? ");
		M = sc.nextInt();
		System.out.print("Quantas colunas vai ter a matriz? ");
		N = sc.nextInt();
		
		int[][] mat = new int[M][N];
		
		for (i = 0; i <M; i++) {
			for (j = 0; j < N; j++) {
				System.out.print("Elemento [" + i + "," + j + "]: ");
				mat[i][j] = sc.nextInt();
			}
		}
		
		System.out.println("\nMATRIZ DIGITADA: ");
		for (i = 0; i < M; i++) {
			for (j = 0; j < N; j++) {
				System.out.printf("%5d", mat[i][j]); //%5d é uma string de formatação que especifica que os elementos devem ser exibidos como inteiros (d) com uma largura de campo de 5 caracteres. Isso alinhará os elementos em colunas, tornando a exibição mais parecida com uma tabela.
			}
			System.out.println();
		}
		
		sc.close();
	}

}
