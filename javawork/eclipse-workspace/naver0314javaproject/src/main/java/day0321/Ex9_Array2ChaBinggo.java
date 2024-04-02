package day0321;

import java.text.SimpleDateFormat;
import java.util.Date;

public class Ex9_Array2ChaBinggo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String []members= {
				"강하윤","공병현","김도훈","김우형","김정호",
				"김창인","민경진","박민지","박보민","박주용",
				"박한경","배동우","서정현","손가원","시바타유니",
				"신완철","우태형","유상곤","이가현","이병현",
				"이장우","이현성","정민석","정상혁","정진욱",
				"정환용","최시현","허승필","황재웅","꽝"
		};
		int []rnd=new int [30];
		String [][]team=new String[6][5];
		//0~29까지 서로 중복되지 않게 배열에 임의로 발생시켜 넣기
		loop:
			for(int i=0;i<members.length;i++) {
				rnd[i]=(int)(Math.random()*30);
				for(int j=0;j<i;j++) {
					if(rnd[i]==rnd[j]) {
						i--;
						continue loop;
					}
				}
			}
		int idx=0;
		for(int i=0;i<team.length;i++) {
			for(int j=0;j<team[i].length;j++) {
				team[i][j]=members[rnd[idx++]];
				
			}
			
		}
		Date date=new Date();
		SimpleDateFormat sdf=new SimpleDateFormat("yyyy년 MM월 dd일");
		System.out.println("\t"+sdf.format(date)+"\t\n");
		
		System.out.println("스터디팀");
		for(int i=0;i<team.length;i++) {
			System.out.printf("%d팀\t",i+1);
			System.out.println();
			for(int j=0;j<team[i].length;j++) {
				System.out.println(team[i][j]+"\t");
				
			}
			System.out.println();
		}
	}

}
