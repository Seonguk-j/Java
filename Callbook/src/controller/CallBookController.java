package controller;

import java.util.ArrayList;

import db.CallBookDB;
import dto.CallBookUserDTO;

public class CallBookController {
	
	public static boolean insertUser(CallBookUserDTO callBookUserDTO) {
		return CallBookDB.insertUser(callBookUserDTO);
	}
	
	public static ArrayList<CallBookUserDTO> selectAllUser(){
		return CallBookDB.selectAllUser();
	}
	
	public static CallBookUserDTO selectUser(String findUserName) {
		return CallBookDB.selectUser(findUserName);
	}
	
	public static CallBookUserDTO updateUser(String findUserName, CallBookUserDTO updateInfo) {
		return CallBookDB.updateUser(findUserName, updateInfo);
	}
	
	public static CallBookUserDTO deleteUser(String findUserName) {
		return CallBookDB.deleteUser(findUserName);
	}
}
