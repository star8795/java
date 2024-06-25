package practice_07.member;

import java.util.Scanner;

public class MemberManagement {
    private Scanner sc = new Scanner(System.in); // 사용자 입력을 위한 Scanner 객체
    private Member[] members = new Member[100]; // 회원 정보를 저장할 배열
    private Member master = new Member(100, "master", "root", "root"); // 관리자 계정 추가
    private Member loginMember = null; // 현재 로그인한 회원
    private boolean isRun = true; // 프로그램 실행 여부
    private int selectNo; // 사용자가 선택한 메뉴 번호

    // 생성자
    public MemberManagement() {
        members[members.length - 1] = master; // 마지막 인덱스에 관리자 계정 추가
    }

    // 프로그램 실행 메서드
    public void isRun() {
        System.out.println("프로그램 시작!");
        while (isRun) {
            // 메뉴 출력
            System.out.println("============================================================");
            System.out.println("1.회원가입 | 2.로그인 | 3.회원목록 | 4.회원정보수정 | 5.회원탈퇴 | 6.프로그램종료");
            System.out.println("============================================================");
            System.out.print("메뉴 선택 > ");

            // 사용자 입력 처리
            if (!sc.hasNextInt()) {
                System.out.println("번호를 입력해주세요. ");
                sc.next();
                continue;
            }
            selectNo = sc.nextInt();

            // 선택된 메뉴에 따라 해당 기능 실행
            switch (selectNo) {
                case 1:
                    System.out.println("== 회원가입 == ");
                    join();
                    break;
                case 2:
                    System.out.println("== 로그인 == ");
                    login();
                    break;
                case 3:
                    System.out.println("== 회원목록 == ");
                    select();
                    break;
                case 4:
                    System.out.println("== 회원정보수정 == ");
                    update();
                    break;
                case 5:
                    System.out.println("== 회원탈퇴 == ");
                    delete();
                    break;
                case 6:
                    System.out.println("== 종료 == ");
                    terminate();
                    break;
                default:
                    System.out.println("선택할 수 없는 번호입니다.");
            }
        }
    }

    // 프로그램 종료 메서드
    private void terminate() {
        isRun = false;
    }

    // 회원가입 메서드
    private void join() {
        System.out.print("아이디를 입력해주세요 > ");
        String mId = sc.next();

        // 아이디 중복 확인
        if (memberIdCheck(mId)) {
            System.out.println("이미 존재하는 아이디입니다.");
            return;
        }

        // 비밀번호 입력
        System.out.print("비밀번호를 입력해주세요 > ");
        String mPw = sc.next();
        System.out.print("비밀번호를 한번 더 입력해주세요 > ");
        String rePw = sc.next();

        // 비밀번호 확인
        if (!mPw.equals(rePw)) {
            System.out.println("비밀번호가 일치하지 않습니다.");
            return;
        }

        // 이름 입력
        System.out.print("이름을 입력해주세요 > ");
        String name = sc.next();

        // 회원 객체 생성 및 배열에 추가
        Member member = new Member(getNextMemberNum(), name, mId, mPw);
        members[member.getNum() - 1] = member;
        System.out.println("회원가입이 완료되었습니다.");
    }

    // 로그인 메서드
    private void login() {
        System.out.print("아이디를 입력해주세요 > ");
        String mId = sc.next();
        System.out.print("비밀번호를 입력해주세요 > ");
        String mPw = sc.next();

        // 회원 배열을 순회하며 로그인 정보 확인
        for (Member member : members) {
            if (member != null && member.getId().equals(mId) && member.getPw().equals(mPw)) {
                loginMember = member;
                System.out.println("로그인 성공!");
                return;
            }
        }
        System.out.println("아이디 또는 비밀번호가 올바르지 않습니다.");
    }

    // 회원 목록 출력 메서드
    private void select() {
        for (Member member : members) {
            if (member != null) {
                System.out.println(member);
            }
        }
    }

    // 회원 정보 수정 메서드
    private void update() {
        if (loginMember == null) {
            System.err.println("로그인 후 사용가능 한 메뉴입니다.");
            return;
        }

        System.out.print("수정할 이름을 입력해 주세요 > ");
        String newName = sc.next();
        loginMember.setName(newName);
        System.out.println("회원 정보가 수정되었습니다.");
    }

    // 회원 탈퇴 메서드
    private void delete() {
        if (loginMember == null) {
            System.err.println("로그인 후 사용가능 한 메뉴입니다.");
            return;
        }

        members[loginMember.getNum() - 1] = null;
        loginMember = null;
        System.out.println("회원 탈퇴가 완료되었습니다.");
    }

    // 아이디 중복 확인 메서드
    private boolean memberIdCheck(String mId) {
        for (Member member : members) {
            if (member != null && member.getId().equals(mId)) {
                return true;
            }
        }
        return false;
    }

    // 다음 회원 번호 반환 메서드
    private int getNextMemberNum() {
        for (int i = 0; i < members.length; i++) {
            if (members[i] == null) {
                return i + 1;
            }
        }
        return -1; // 오류 처리
    }
}
