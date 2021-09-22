package com.atguigu.exer;

public class Exer1 {
	public static void main(String[] args) {
		Student[] Stu = new Student[20];  
		for(int i = 0;i<Stu.length;i++) {
			Stu[i] = new Student();
			Stu[i].number = i+1;
			Stu[i].state = (int)(Math.random()*20+1);
			Stu[i].score = (int)(Math.random()*100+1);
		}
		for(int i = 0;i<Stu.length;i++) {
			if(Stu[i].state == 3) {
				System.out.println(Stu[i].number+" "+Stu[i].score+" "+Stu[i].state);
			}
		}
		
		for(int i = 0;i<Stu.length-1;i++) {
			int j= 0;
			Student tmp = new Student();
			for(j = 0;j<Stu.length-1-i;j++) {
				if(Stu[j].score>Stu[j+1].score) {
					tmp = Stu[j];
					Stu[j] = Stu[j+1];
					Stu[j+1] = tmp;
					
				}
			}
			
		}
		
		for(int i = 0;i<Stu.length;i++) {
			System.out.println(Stu[i].number+" "+Stu[i].score+" "+Stu[i].state);
		}
		
		
		
		
	}
	
}
class Student{
	int number;
	int state;
	int score;
	
}
