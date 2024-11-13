package task1;

import java.util.Arrays;
import java.util.Scanner;

public class Task2 {// class start

    public static void main(String[] args) {//main start

        Scanner sc = new Scanner(System.in);
        // boardService1 에서 변수를 사용했는데 배열변수를 사용하는 이유
        // - 여러개의 변수에 있는 데이터를 배열로 사용하면 관리가 편하다.
        //배열이란 ? 여러개의 동일한 타입의 데이터들을 *하나의 변수*에 저장할 수 있는 타입 ( 참조 )타입
        //인덱스란 ? 배열내 저장된 데이터들의 저장 순서 번호 , 0 ~ 최대길이
        // 반복문 활용 : 시작값부터 끝값까지 반복
        String[] content = new String[100];
        String[] writer = new String[100];
        // 배열 선언 방법 :타입[] 변수명 = new 타입[개수];
        // String 데이터 100개를 저장할 수 있는 배열 선언

        // 만약에 게시물이 비어있으면, 게시물이 100개이면 if 100개 검사??? XX
        while (true) {
            System.out.println("1.게시물 입력  2.게시물 출력");
            int choose = sc.nextInt();
            if (choose == 1 ){
                System.out.println("게시물 입력 :");String cont = sc.next();
                System.out.println("작성자 입력 :");String writ = sc.next();
                boolean save = false;
                for (int index = 0; index < content.length; index++ ){
                    if (content[index] == null){//만약에 index번째 게시물이 비어 있으면
                        content[index] = cont; writer[index] = writ;//비어있는 게시물의 입력받은 내용을 저장
                        save = true;
                        break;
                    }
                }
                //만약에 저장을 했으면 1개 저장해야 하므로 break 해서 반복문 종료
                if (save) {
                    System.out.println("저장 완료");
                }else {
                    System.out.println("빈공간이 없습니다.");
                }
            }
            else if(choose == 2) {

                for (int index = 0; index <= content.length - 1; index++) {
                    if (content[index] != null) {
                        System.out.printf("작성자 : %s , 게시물 : %s \n", writer[index], content[index]);
                    }
                }
            }
            // 만약에 저장 성공 했으면 save 변수에 true 값으로 변경
            //for 종료후에 save 변수값이 false 이면 출력
            //0부터 99까지
            // 만약에 index번째 게시물이 존재하면
        }
    }
}