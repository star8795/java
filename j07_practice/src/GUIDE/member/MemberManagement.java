package GUIDE.member;

import java.util.Scanner;

public class MemberManagement{

    // 사용자 입력
    Scanner sc = new Scanner(System.in);
    
    // 회원정보 저장
    Member[] members = new Member[100];
    
    // 관리자 계정
    Member master = new Member(100,"master","root","root");
    
    // 로그인한 회원
    Member loginMember = null;
    
    // 프로그램 flag (true : 진행 , false : 종료) 
    boolean isRun = true;
    
    // 메뉴 번호 선택
    int selectNo;

    // 프로그램 실행용 생성자
    MemberManagement() {
        // 회원목록 배열 마지막 인덱스에 관리자 계정 저장
        members[members.length-1] = master;
        // 회원관리 메소드 호출
        isRun();
    }
    
    /*
     * 기능 관리 
     */
    
    // 프로그램 실행
    void isRun() {
        while (isRun) {
            System.out.println("=====================================================================");
            System.out.println("1. 회원가입| 2. 로그인| 3. 회원목록| 4. 회원정보수정| 5. 회원탈퇴| 6. 프로그램종료");
            System.out.println("=====================================================================");
            selectNo = getSelectNum("번호를 선택하세요 > ");

            switch (selectNo) {
                case 1:
                    join();
                    break;
                case 2:
                    login();
                    break;
                case 3:
                    select();
                    break;
                case 4:
                    update();
                    break;
                case 5:
                    delete();
                    break;
                case 6:
                    terminate();
                    break;
                default:
                    System.out.println("잘못된 입력입니다. 다시 입력해주세요.");
            }
        }
    }
    
    // 프로그램 종료
    void terminate() {
        System.out.println("프로그램을 종료합니다.");
        isRun = false;
    }

    // 회원 가입
    void join() {
        System.out.println("회원 가입을 진행합니다.");

        // 사용자 입력 받기
        int mNum = members.length; // 일단 회원 관리 번호를 배열 길이로 설정
        String mName = getData("이름을 입력하세요: ");
        String mId;
        do {
            mId = getData("아이디를 입력하세요: ");
            if (!memberIdCheck(mId)) {
                System.out.println("이미 사용 중인 아이디입니다. 다른 아이디를 입력하세요.");
            }
        } while (!memberIdCheck(mId));
        String mPw = getData("비밀번호를 입력하세요: ");

        // 회원 객체 생성 및 배열에 추가
        Member newMember = new Member(mNum, mName, mId, mPw);
        for (int i = 0; i < members.length; i++) {
            if (members[i] == null) {
                members[i] = newMember;
                break;
            }
        }

        System.out.println("회원 가입이 완료되었습니다.");
    }

    // 로그인
    void login() {
        System.out.println("로그인을 진행합니다.");
        String mId = getData("아이디를 입력하세요: ");
        String mPw = getData("비밀번호를 입력하세요: ");
        Member loginInfo = new Member(mId, mPw);
        loginMember = findMember(loginInfo);

        if (loginMember != null) {
            System.out.println("로그인 성공! " + loginMember.mName + "님, 환영합니다.");
        } else {
            System.out.println("로그인 실패. 아이디 또는 비밀번호를 확인해주세요.");
        }
    }

    // 회원목록 출력
    void select() {
        System.out.println("회원 목록을 출력합니다.");
        for (Member member : members) {
            if (member != null) {
                System.out.println(member.toString());
            }
        }
    }

    // 회원 정보 수정
    void update() {
        if (loginMember == null) {
            System.out.println("로그인 후 이용해주세요.");
            return;
        }
        if (loginMember.equals(master) || loginMember.equals(loginMember)) {
            String newName = getData("변경할 이름을 입력하세요: ");
            loginMember.mName = newName;
            System.out.println("회원 정보가 수정되었습니다.");
        } else {
            System.out.println("관리자 또는 본인만 정보를 수정할 수 있습니다.");
        }
    }

    // 회원 탈퇴
    void delete() {
        if (loginMember == null) {
            System.out.println("로그인 후 이용해주세요.");
            return;
        }
        if (loginMember.equals(master)) {
            System.out.println("관리자 계정은 삭제할 수 없습니다.");
            return;
        }
        deleteMember();
    }

    // 사용자에게 메시지를 전달 받아 출력하고 문자열 값 받아 반환
    String getData(String message) {
        System.out.println(message);
        return sc.nextLine();
    }

    // 번호 선택 받기
    int getSelectNum(String message) {
        System.out.println(message);
        return Integer.parseInt(sc.nextLine());
    }

    // 사용자 아이디 중복 체크
    boolean memberIdCheck(String mId) {
        for(Member m : members) {
            if(m != null && m.mId.equals(mId)) {
                return false;
            }
        }       
        return true;
    }

    // 회원 아이디와 비밀번호로 회원 찾기
    Member findMember(Member m) {
        for(Member member : members) {
            if(member != null && member.equals(m)) {
                return member;
            }
        }
        return null;
    }

    // 회원 정보 삭제
    void deleteMember() {
        for(int i=0; i<members.length; i++) {
            if(members[i].equals(loginMember)) {
                members[i] = null;
                loginMember = null;
                System.out.println("회원탈퇴 완료");
                return;
            }
        }
    }
}
