package day0326;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class Ex17_ExceptionMunje {
	static final String FILENAME="c:/naver0314/score.txt";
	static public void scoreRead() throws IOException {
		int score,sum=0,count=0;
		double avg;
		FileReader fr=null;
		BufferedReader br=null;
		
		try {
			fr=new FileReader(FILENAME);
			br=new BufferedReader(fr);
			while(true) {
				String s=br.readLine();
				if(s==null)//읽을 데이터가 없을때 while종료
					break;
				try {
					score=Integer.parseInt(s);//문자일 경우 바로 catch이동
					count++;
					sum+=score;
				}
				catch(NumberFormatException e) {
					
				}
				avg=(double)sum/count;
				System.out.println("점수갯수:"+count);
				System.out.println("총점:"+sum);
				System.out.println("평균"+avg);
				
				
			}
			
		}catch(FileNotFoundException e) {
			System.out.println("파일이 없어요."+e.getMessage());
		}
		finally {
			br.close();
			fr.close();
		}
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try {
			scoreRead();
		}catch(IOException e) {
			e.printStackTrace();
		}
	}

}
