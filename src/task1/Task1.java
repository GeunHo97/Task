package task1;

import java.util.Scanner;

/*
    boardService1
        - 내용과 작성자로 구성된 게시물 최대 3개 까지 저장하는 서비스 구축
        - 조건 : main 1개 와 변수 6개와 반복문 사용
        - 구축 : 게시물 쓰기 와 게시물 출력 기능구현
*/
public class Task1 {

    public static void main(String[] args) { // main start 번역된 코드들을 실행하는 기능

        // - 입력 객체
        Scanner sc = new Scanner(System.in);

        // 저장소 설게 , 게시물1개당 내용과 작성자 ( 내용 2개 ), 게시물 3개면 내용 6개
        // 변수란? 하나의 데이터| 주소값 을 저장하는 공간|메모리
        // 타입이란? 변수에 저장될 데이터 | 주소의 타입 , 데이터 분류 , 기본타입[7:int~double VS 참조타입 ( 클래스, 인터페이스, 배열)

        String content1 = null; String writer1 = null; //첫번째 게시물 내용
        String content2 = null; String writer2 = null;// 두번째 게시물 내용
        String content3 = null; String writer3 = null;// 세번째 게시물 내용

        // if 다중 if는 다중 조건의 다중 결과를 출력할수 있다
        // vs
        //if - else if : 다중 조건의 무조건 1개 결과를 출력
        while (true) {//무한루프
            System.out.println("1.게시물쓰기 2.게시물출력 : ");//출력

            int choose = 0;
            try {
                choose = sc.nextInt();
            } catch (Exception e) {
                System.out.println("Error 숫자를 입력하세요");
                sc.nextLine();
            }
            if (choose == 1) { // 만약에 입력한 값이 1이면 '게시물 쓰기' 구현
                System.out.println("게시물 입력 :");String content = sc.next();
                System.out.println("작성자 입력 :");String writer = sc.next();

                if (content1 == null){ //게시물 작성할 공간이 있는지 체크 , 임의로 게시물이 존재하지 않는 뜻 , null 또는 **
                    content1 = content; writer1 = writer;
                }else if (content2 == null){ //게시물 작성할 공간이 있는지 체크 , 임의로 게시물이 존재하지 않는 뜻 , null 또는 **
                    content2 = content; writer2 = writer;
                }else if (content3 == null){ //게시물 작성할 공간이 있는지 체크 , 임의로 게시물이 존재하지 않는 뜻 , null 또는 **
                    content3 = content; writer3 = writer;
                }else {
                    System.out.println("게시물 공간이 없습니다.");
                }

            }
             else if (choose == 2) {//만약에 입력한 값이 2이면 '게시물 출력' 구현
                 if (content1 != null){
                     System.out.printf("작성자 %s , 게시물 %s \n",writer1,content1);
                 }
                if (content2 != null){
                    System.out.printf("작성자 %s , 게시물 %s \n",writer2,content2);
                }
                if (content3 != null){
                    System.out.printf("작성자 %s , 게시물 %s \n",writer3,content3);
                }
            }





                //만약에 첫번째 게시물이 존재하면

                //만약에 두번째 게시물이 존재하면

                //만약에 세번째 게시물이 존재하면

        }//while end
    }
}