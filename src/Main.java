import java.util.Scanner;

public class Main {
	public static void main(String[] args) {

		System.out.println("== 프로그램 시작 ==");

		Scanner sc = new Scanner(System.in);

		int lasteArticleId = 1;

		while (true) {

			System.out.printf("명령어) ");
			String cmd = sc.nextLine();

			
			if (cmd.equals("article write")) {
				
				System.out.printf("제목 : ");
				sc.nextLine();
				
				System.out.printf("내용 : ");
				sc.nextLine();
				
				System.out.printf("%d번 글이 생성되었습니다.\n", lasteArticleId);
				lasteArticleId++;
			}
			
			if (cmd.equals("article list")) {
				
				System.out.println("게시글이 없습니다.");
			}
			
			if (cmd.equals("")) {
				System.out.println("명령어를 입력해주세요.");
			}

			if (cmd.equals("exit")) {
				break;
			}
		}

		System.out.println("== 프로그램 끝 ==");

		sc.close();
	}
}
