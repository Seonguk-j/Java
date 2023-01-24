package view;

import java.util.ArrayList;
import java.util.Scanner;

import controller.CallBookController;
import dto.CallBookUserDTO;
import util.Constant;

public class CallBookView implements View{

	@Override
	public void showView() {
		Scanner scanner = new Scanner(System.in);
		while(true){
			System.out.println("**********************************");
			System.out.println("************1. 전체 조회************");
			System.out.println("************2. 친구 검색************");
			System.out.println("************3. 번호 추가************");
			System.out.println("************4. 번호 수정************");
			System.out.println("************5. 번호 삭제************");
			System.out.println("************6. 뒤로 가기************");
			System.out.println("**********************************");
			System.out.print("메뉴 선택 : ");
			int userChoice = scanner.nextInt();
			
			if(menuHandling(userChoice)) {
				break;
			}
		}
	}

	@Override
	public boolean menuHandling(int menuNumber) {
		boolean isMenuExit = false;
		switch(menuNumber) {
			case Constant.SELECT_ALL_USER:
				selectAllUser();
				break;
			case Constant.SEARCH_USER:
				selectUser();
				break;
			case Constant.INSERT_USER:
				insertUser();
				break;
			case Constant.UPDATE_USER:
				updateUser();
				break;
			case Constant.DELETE_USER:
				deleteUser();
				break;
			case Constant.CALLBOOK_MENU_EXIT:
				isMenuExit = true;
				break;
			default :
				wrongMenuSelected();
				break;
		}
		return isMenuExit;
	}
	
	public static void insertUser() {
		System.out.println("--------------번호 추가--------------");
		Scanner scanner = new Scanner(System.in);
		CallBookUserDTO callBookUserDTO = new CallBookUserDTO();
		
		System.out.print("이름 입력 : ");
		String userName = scanner.next();
		callBookUserDTO.setName(userName);
		
		System.out.print("번호 입력 : ");
		String phoneNumber = scanner.next();
		callBookUserDTO.setPhoneNumber(phoneNumber);
	
		callBookUserDTO.printUserInfo();
		boolean result = CallBookController.insertUser(callBookUserDTO);
		if(result == true) {
			System.out.println("저장 성공!");
		}
		else {
			System.out.println("저장 실패!");
		}
	}
	
	public static void selectAllUser() {
		System.out.println("------------전체 조회 화면------------");
		ArrayList<CallBookUserDTO> callBookUserList = CallBookController.selectAllUser();
		
		for(int i = 0; i < callBookUserList.size(); i++) {
			CallBookUserDTO tempUser = callBookUserList.get(i);
			tempUser.printUserInfo();
		}
	}
	
	public static void selectUser() {
		System.out.println("--------------친구 검색--------------");
		Scanner scanner = new Scanner(System.in);
		System.out.print("조회할 친구 입력 : ");
		String findUserName = scanner.next();
		
		CallBookUserDTO callBookUser = CallBookController.selectUser(findUserName);
		
		if(callBookUser.getName() != null) {
			callBookUser.printUserInfo();
		}
		else {
			System.out.println("찾고자 하는 대상이 없습니다");
		}
	}
	
	public static void updateUser() {
		Scanner scanner = new Scanner(System.in);
		CallBookUserDTO updateInfo = new CallBookUserDTO();
		System.out.println("--------------유저 수정--------------");
		System.out.print("찾고자 하는 사람 이름 입력 : ");
		String findUserName = scanner.next();
		System.out.print("수정할 이름 입력 : ");
		updateInfo.setName(scanner.next());
		System.out.print("수정할 번호 입력 : ");
		updateInfo.setPhoneNumber(scanner.next());
		
		CallBookUserDTO callBookUser = CallBookController.updateUser(findUserName, updateInfo);
		
		if(callBookUser.getName() != null) {
			callBookUser.printUserInfo();
		}
		else {
			System.out.println("일치하는 유저는 없습니다.");
		}
		
	}
	
	public static void deleteUser() {
		Scanner scanner = new Scanner(System.in);
		CallBookUserDTO deleteInfo = new CallBookUserDTO();
		System.out.println("--------------번호 삭제--------------");
		System.out.print("삭제할 사람 이름 입력 : ");
		String findUserName = scanner.next();
		
		CallBookUserDTO callBookUser = CallBookController.deleteUser(findUserName);
		
		if(callBookUser.getName() != null) {
			System.out.println("정상적으로 삭제되었습니다.");
		}
		else {
			System.out.println("일치하는 유저는 없습니다.");
		}
	}

}
