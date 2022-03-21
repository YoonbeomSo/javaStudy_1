package collection.list.student;

import java.util.*;

public class Point {

	public static Scanner sc = new Scanner(System.in);

	public static void showPointUI() {
		System.out.println("성적표");
		System.out.println("===================================================");
		System.out.println("===================================================");
		System.out.println("학번     이름    국어   영어   수학   총점     평균     등급");
		System.out.println("===================================================");
	}

	// 학생의 성적정보를 입력할 메서드
	public static void inputPoints(List<Student> students) {
		/*
	    1. 학생의 객체를 1개 생성합니다.
	    2. 학생의 객체에 속성값을 설정하는 메서드들을 호출!
	    3. 정보저장이 완료된 객체를 리스트에 추가!
	    4. 저장완료 메세지를 출력하세요.
	      ex) XXX님의 성적 정보가 정상적으로 입력되었습니다.
		 */
		Student stu = new Student();
		stu.inputStuInfo();
		stu.calcTotAvgGrade();
		students.add(stu);
		System.out.printf("%s님의 성적 정보가 "
				+ "정상적으로 입력되었습니다.\n", stu.getName());
		
	}

	// 전체 학생들의 성적정보를 출력할 메서드
	public static void showAllPoints(List<Student> students) {
		/*
	    1. 리스트 안에 들어있는 학생객체들의 정보를 
	       반복문을 통해 전체 출력하세요.
	    2. 우리반의 전체평균을 가장 아랫부분에 출력하세요.
		 */
		double totalAvg = 0.0;
		showPointUI();
		for(Student stu : students) {
			totalAvg += stu.getAvg();
			stu.outputStuInfo();
		}
		System.out.println("=================================");
		System.out.printf("\t\t\t우리반 전체 평균: %.2f점",
				(totalAvg/students.size()));
	}

	// 개별 학생의 성적정보를 출력할 메서드
	public static void searchPoints(List<Student> students) {
		/*
	    1. 해당 학번과 일치하는 학생객체를 리스트에서 찾아내서
	     그 학생의 정보만 출력하세요.
	    2. 찾는 학번이 없을시 검색하지 못했다는 메시지를 출력
	     하세요.
	    */
		System.out.println("성적을 조회할 학생의 학번을 입력하세요.");
		System.out.print("=> ");
		String stuNum = sc.next();
		boolean check = true;
		for(Student s : students) {
			if (stuNum.equals(s.getStuId())) {
				Point.showPointUI();
				s.outputStuInfo();
				check = false;
				break;
			}
			if(check) {
				System.out.println("조회하신 학번정보는 등록되지 않은 학번입니다.");
			}
		}
	}
	
	// 학생의 성적정보를 수정할 메서드
	public static void modifyPoints(List<Student> students) {
		System.out.println("성적을 조회할 학생의 학번을 입력하세요.");
		System.out.print("=> ");
		String stuNum = sc.next();
		Boolean check = true;
		
		for(int i=0; i<students.size(); i++) {
			Student stu = students.get(i);
			if(stuNum.equals(stu.getStuId())) {
				System.out.printf("%s님의 성적정보를 수정합니다.\n",
						stu.getName());
				System.out.print("국어: ");
				stu.setKor(sc.nextInt());
				System.out.print("영어: ");
				stu.setEng(sc.nextInt());
				System.out.print("수학: ");
				stu.setMath(sc.nextInt());
				
				stu.calcTotAvgGrade();
				System.out.println("성적 수정이 정상 처리되었습니다.");
				check = false;
				break;
			}
			if(check) {
				System.out.println("조회하신 학번정보는 등록되지 않은 학번입니다.");
			}
		}
		
	}

	// 학생의 성적정보를 삭제할 메서드
	public static void deletePoints(List<Student> students) {
		/*
		 1. 해당 학번과 일치하는 학생객체를 리스트에서 찾아내서
		 그 학생의 모든 정보를 삭제하세요.
		 2. 찾는 학번이 없을 시 검색하지 못했다는 메시지를 출력하세요.
		 */
		System.out.println("성적을 조회할 학생의 학번을 입력하세요.");
		System.out.print("=> ");
		String stuNum = sc.next();
		Boolean check = true;
	
		for (int i = 0; i<students.size(); i++) {
			Student stu = students.get(i);
			if (stuNum.equals(stu.getStuId())) {
				System.out.printf("%s님의 성적을 삭제합니다.[Y/N]\n", 
						stu.getName());
				System.out.print("=> ");
				String answer = sc.next();
				if (answer.toLowerCase().equals("y")) {
					students.remove(i);
					System.out.println("삭제가 정상처리되었습니다.");
				}else {
					System.out.println("삭제를 취소합니다.");
					return;
				}
				check = false;
				break;
			}
			if (check) {
				System.out.println("조회하신 학번은 등록되지 않은 학번입니다.");
			}
		}
	
	}
	
	

	//프로그램 메뉴정보를 보여줄 메서드
	public static void menuInfo() {
		System.out.println("\n*** 성적관리 프로그램 ***");
		System.out.println(" 1. 성적정보 입력");
		System.out.println(" 2. 전체성적 조회");
		System.out.println(" 3. 개별성적 조회");
		System.out.println(" 4. 성적정보 수정");
		System.out.println(" 5. 성적정보 삭제");
		System.out.println(" 6. 프로그램 종료");
		System.out.println("*******************");
		
	}


}//end class
