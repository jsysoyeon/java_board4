import java.util.Scanner; // scanner를 사용하기 위함
import java.util.*; // arraylist를 사용하기 위함

class Test {
  public static void main(String[] args) {
	  // 입력받는 함수
    Scanner sc = new Scanner(System.in);
    ArrayList<String> Titles = new ArrayList<>();
    ArrayList<String> Bodies = new ArrayList<>();
    String title;
    String body;
    String new_title;
    String new_body;
    int cnt = 0;
    // print 클래스 호출
    print2 p = new print2();
    
    while(true) {
    	// print 클래스 안의 menu 메소드 호출
		System.out.println("-------------------------");
    	p.menu();
		System.out.println("-------------------------");
    	String s = sc.nextLine();
    	if(s.equals("exit")) {
			System.out.println("");
    		System.out.println("프로그램을 종료합니다.");
    		break;
    	}
    	else if(s.equals("add")) {
			System.out.println("");
    		System.out.println("제목을 입력하십시오.");
    		title = sc.nextLine();
    		// title에 입력된 값을 Titles에 저장
    		Titles.add(title);
    		System.out.println("내용을 입력하십시오.");
    		body = sc.nextLine();
    		// body에 입력된 값을 Bodies에 저장
    		Bodies.add(body);
    		cnt++;
    	}
    	else if(s.equals("list")) {
    		for(int i = 0; i < cnt; i++) {
    			System.out.println("");
    			System.out.println((i + 1) + "번째");
    			// Titles에 저장된 값을 불러오는 함수(get())
    			System.out.println("제목 : " + Titles.get(i));
    			// Bodies에 저장된 값을 불러오는 함수(get())
    			System.out.println("내용 : " + Bodies.get(i));
    		}
			System.out.println("");
    	}
    	else if(s.equals("read")) {
    		for(int i = 0; i < cnt; i++) {
    			System.out.println("");
    			System.out.println("번호 : " + (i + 1));
        		System.out.println("제목 : " + Titles.get(i));
        		System.out.println("");
    		}
    	}
    	else if(s.equals("search")) {
			System.out.println("");
    		System.out.println("원하는 게시물의 번호를 입력해주십시오.");
    		int i = sc.nextInt();
    		sc.nextLine();
    		if(i > cnt) { 
    			System.out.println("");
    			System.out.println("게시물이 존재하지 않습니다.");
    		}
    		else {
    			System.out.println("");
    			System.out.println("번호 : " + (i));
        		System.out.println("제목 : " + Titles.get(i - 1));
        		System.out.println("내용 : " + Bodies.get(i - 1));
        		System.out.println("");
    		}
    	}
    	else if(s.equals("update")) {
			System.out.println("");
    		System.out.println("수정을 원하는 게시물의 번호를 입력해주십시오.");
    		int i = sc.nextInt();
    		sc.nextLine();
    		if(i > cnt) {
    			System.out.println("");
    			System.out.println("게시물이 존재하지 않습니다.");
    		}
    		else {
    			System.out.println("");
    			System.out.println("새로운 제목을 입력해주십시오.");
    			new_title = sc.nextLine();
    			Titles.set((i - 1), new_title);
    			System.out.println("새로운 내용을 입력해주십시오.");
    			new_body = sc.nextLine();
    			Bodies.set((i - 1), new_body);
    			System.out.println("");
    			System.out.println("수정이 완료되었습니다.");
    			System.out.println("");
    			System.out.println("-----수정 후-----");
        		for(int num = 0; num < cnt; num++) {
        			System.out.println("번호 : " + (num + 1));
            		System.out.println("제목 : " + Titles.get(num));
            		System.out.println("내용 : " + Bodies.get(num));
            		System.out.println("");
        		}
    		}
    	}
    	else if(s.equals("delete")) {
			System.out.println("");
    		System.out.println("삭제를 원하는 게시물의 번호를 입력해주십시오.");
    		int i = sc.nextInt();
    		sc.nextLine();
    		if(i > cnt) {
    			System.out.println("");
    			System.out.println("게시물이 존재하지 않습니다.");
    		}
    		else {
    			Titles.remove(i - 1);
    			Bodies.remove(i - 1);
    			cnt--;
    			System.out.println("");
    			System.out.println("수정이 완료되었습니다.");
    			System.out.println("");
    			System.out.println("-----수정 후-----");
        		for(int num = 0; num < cnt; num++) {
        			System.out.println("번호 : " + (num + 1));
            		System.out.println("제목 : " + Titles.get(num));
            		System.out.println("내용 : " + Bodies.get(num));
            		System.out.println("");
        		}
    		}
    	}
    }
    
  }
}

class print2 {
	void menu() {
		System.out.println("원하는 기능에 맞게 입력해주십시오.");
		System.out.println("게시물 추가 : add");
		System.out.println("게시물 조회 : list");
		System.out.println("게시물 목록 조회 : read");
		System.out.println("게시물 상세보기 : search");
		System.out.println("게시물 수정 : update");
		System.out.println("게시물 삭제 : delete");
		System.out.println("프로그램 종료 : exit");
	}
}