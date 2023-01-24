package db;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.nio.charset.Charset;
import java.util.ArrayList;
import java.util.List;

import com.opencsv.*;
import com.opencsv.exceptions.CsvException;
import com.opencsv.exceptions.CsvValidationException;

import dto.CallBookUserDTO;
import util.Constant;

public class CallBookDB {
	public static boolean insertUser(CallBookUserDTO callBookUserDTO) {
		
		//이렇게 사용할 일이 거의 없음
		 CSVWriter writer;
		 boolean result = false;
		 try {
			 writer = new CSVWriter(new FileWriter(Constant.CALLBOOK_FILE_PATH, true));
			 String lineArr[] = {callBookUserDTO.getName(), callBookUserDTO.getPhoneNumber()};
			 writer.writeNext(lineArr);
			 writer.close();
			 result = true;
			 } catch (IOException e) {
			 // TODO Auto-generated catch block
			 e.printStackTrace();
			 }
		 	return result;
	}
	
	public static ArrayList<CallBookUserDTO> selectAllUser(){
		ArrayList<CallBookUserDTO> callBookUserList = new ArrayList<>();
		
		try {
			CSVReader reader = new CSVReader(new FileReader(Constant.CALLBOOK_FILE_PATH));
			String[] nextLine;
			
			while((nextLine = reader.readNext()) != null) {
				CallBookUserDTO tempCallBookUser = new CallBookUserDTO();
				tempCallBookUser.setName(nextLine[0]);
				tempCallBookUser.setPhoneNumber(nextLine[1]);
				callBookUserList.add(tempCallBookUser);
			}
		} catch(FileNotFoundException e){
			//TODO Auto-generated catch block
			e.printStackTrace();
		}//1
		catch(CsvValidationException e) {
			//TODO Auto-generated catch block
			e.printStackTrace();
		}catch(IOException e) {
			//TODO Auto-generated catch block
			e.printStackTrace();
		}
		return callBookUserList;
	}
	
	public static CallBookUserDTO selectUser(String findUserName) {
		CallBookUserDTO callBookUser = new CallBookUserDTO();
		try {
			CSVReader reader = new CSVReader(new FileReader(Constant.CALLBOOK_FILE_PATH));
			String[] nextLine;
			
			while((nextLine = reader.readNext()) != null) {
				if(nextLine[0].equals(findUserName)) {
					callBookUser.setName(nextLine[0]);
					callBookUser.setPhoneNumber(nextLine[1]);
					break;
				}
			}
		} catch(FileNotFoundException e){
			//TODO Auto-generated catch block
			e.printStackTrace();
		}//1
		catch(CsvValidationException e) {
			//TODO Auto-generated catch block
			e.printStackTrace();
		}catch(IOException e) {
			//TODO Auto-generated catch block
			e.printStackTrace();
		}
		return callBookUser;
		
	}
	
	public static CallBookUserDTO updateUser(String findUserName, CallBookUserDTO updateInfo) {
		
		CallBookUserDTO result = new CallBookUserDTO();
		
		try {
			CSVReader reader = new CSVReader(new FileReader(Constant.CALLBOOK_FILE_PATH));
			
			List<String[]> csvBody = reader.readAll();
			for(int i = 0; i < csvBody.size(); i++) {
				if(csvBody.get(i)[0].compareTo(findUserName) == 0) {
					csvBody.get(i)[0] = updateInfo.getName();
					csvBody.get(i)[1] = updateInfo.getPhoneNumber();
					
					result.setName(updateInfo.getName());
					result.setPhoneNumber(updateInfo.getPhoneNumber());
					break;
				}
			}
			
			CSVWriter writer = new CSVWriter(new FileWriter(Constant.CALLBOOK_FILE_PATH));
			writer.writeAll(csvBody);
			writer.flush();
			writer.close();
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} // 1
		catch(CsvValidationException e) {
			//TODO Auto-generated catch block
			e.printStackTrace();
		}catch(IOException e) {
			//TODO Auto-generated catch block
			e.printStackTrace();
		}catch(CsvException e) {
			//TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		return result;
		
	}
	
	public static CallBookUserDTO deleteUser(String findUserName) {
		CallBookUserDTO result = new CallBookUserDTO();
		
		try {
			CSVReader reader = new CSVReader(new FileReader(Constant.CALLBOOK_FILE_PATH));
			
			List<String[]> csvBody = reader.readAll();
			for(int i = 0; i < csvBody.size(); i++) {
				if(csvBody.get(i)[0].compareTo(findUserName) == 0) {
					result.setName(csvBody.get(i)[0]);
					result.setPhoneNumber(csvBody.get(i)[1]);
					
					csvBody.remove(i);
					break;
				}
			}
			CSVWriter writer = new CSVWriter(new FileWriter(Constant.CALLBOOK_FILE_PATH));
			writer.writeAll(csvBody);
			writer.flush();
			writer.close();
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} // 1
		catch(CsvValidationException e) {
			//TODO Auto-generated catch block
			e.printStackTrace();
		}catch(IOException e) {
			//TODO Auto-generated catch block
			e.printStackTrace();
		}catch(CsvException e) {
			//TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		return result;
		
	}
	
}
