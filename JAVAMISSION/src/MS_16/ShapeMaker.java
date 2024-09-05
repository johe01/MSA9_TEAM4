package MS_16;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class ShapeMaker {

	public static void main(String[] args) {
		List<Shape> shapeList = new ArrayList<Shape>();
		Scanner sc = new Scanner(System.in);
		boolean sw = true;
		
		while(sw) {
			System.out.println("1. 삼각형, 2. 사각형, 3. 원형");
			System.out.print("번호를 입력하세요 >> ");
			String n = sc.nextLine();
			switch (n) {
			case "1":
				System.out.print("가로 길이: ");
				double x = sc.nextDouble();
				System.out.print("세로 길이: ");
				double y = sc.nextDouble();
				shapeList.add(new Triangle(x,y));
				sc.nextLine();
				break;
			case "2":
				System.out.print("가로 길이: ");
				double a = sc.nextDouble();
				System.out.print("세로 길이: ");
				double b = sc.nextDouble();
				shapeList.add(new Rectangle(a,b));
				sc.nextLine();
				break;
			case "3":
				System.out.print("반지름 길이: ");
				double r = sc.nextDouble();
				shapeList.add(new Circle(r));
				sc.nextLine();
				break;
			case "그만":
				sw=false;
				break;
			default:
				System.out.println("1~3 중에 입력해주세요.");
				break;
			}
		}
		sc.close();
		
		double areaSum = 0.0;
		double roundSum = 0.0;
		
		for (Shape shape : shapeList) {
			
			double area = shape.area();
			double round = shape.round();
			
			areaSum += area;
			roundSum += round;
			
			if (shape instanceof Triangle)
				System.out.println("삼각형");
			else if (shape instanceof Rectangle)
				System.out.println("사각형");
			else if (shape instanceof Circle)
				System.out.println("원");
			
			System.out.println("둘레 : " + round);
			System.out.println("넓이 : " + area);
			System.out.println();
	
		}
		System.out.println("둘레 총합 : " + roundSum);
		System.out.println("넓이 총합 : " + areaSum);
	}
}
