package ch18;

import java.io.File;
import java.text.SimpleDateFormat;
import java.util.Date;

public class FileEx {
	public static void main(String[] args) throws Exception {
		// File 객체 생성
		File dir = new File("C:/Temp2/images");
		File file1 = new File("C:/Temp2/file1.txt");
		File file2 = new File("C:/Temp2/file2.txt");
		File file3 = new File("C:/Temp2/file3.txt");
		
		// 존재하지 않으면 디렉토리 또는 파일 생성
		if(dir.exists() == false) {dir.mkdir();}
		if(file1.exists() == false) {file1.createNewFile();}
		if(file2.exists() == false) {file2.createNewFile();}
		if(file3.exists() == false) {file3.createNewFile();}
		
		// Temp2 폴더의 내용을 출력
		File temp2 = new File("C:/Temp2");	// 경로 지정
		File[] contents = temp2.listFiles();	// 경로 안의 파일과 디렉토리 목록을 File 형태로 저장
		SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd a HH:mm"); // 날짜 출력 형식 지정
		
		for(File file : contents) {	// contents에 있는 파일과 디렉토리 목록을 하나씩 file에 대입
			System.out.printf("%-25s", sdf.format(new Date(file.lastModified())));	// file 마지막 수정 날짜 출력
			if(file.isDirectory()) {	// 파일의 내용이 디렉토리인지 확인
				System.out.printf("%-10s%-20s", "<DIR>", file.getName());	// 디렉토리 표기와 디렉토리 이름 출력
			} else {
				System.out.printf("%-10s%-20s", file.length(), file.getName());	// 파일 크기와 파일 이름 출력
			}
			System.out.println();
		}
	}
}
