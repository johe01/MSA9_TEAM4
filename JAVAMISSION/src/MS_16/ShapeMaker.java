package MS_16;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class ShapeMaker {

	public static void main(String[] args) {
		List<Shape> shapeList = new ArrayList<Shape>();
		System.out.println("1. 삼각형, 2. 사각형, 3. 원형");
		System.out.print("번호를 입력하세요 >>");
		Scanner sc = new Scanner(System.in);
		String n = sc.nextLine();
		switch (n) {
		case "1":
			System.out.print("가로 길이: ");
			double x = sc.nextDouble();
			System.out.print("세로 길이: ");
			double y = sc.nextDouble();
			shapeList.add(new Triangle(x,y));
			break;
		case "2":
			System.out.print("가로 길이: ");
			double x = sc.nextDouble();
			System.out.print("세로 길이: ");
			double y = sc.nextDouble();
			shapeList.add(new Rectangle(x,y));
			break;
		case "3":
			System.out.print("반지름 길이: ");
			double x = sc.nextDouble();
			shapeList.add(new Circle(x));
			break;
		

		default:
			break;
		}
		for (Shape shape : shapeList) {
			System.out.println(shape);
		}
	}
}
