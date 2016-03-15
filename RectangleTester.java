import java.util.Scanner;

class RectangleTesterr {

	double Height, Width, X, Y;

	RectangleTesterr() {
		this(-1, -1, -1, -1);
	}// important-

	RectangleTesterr(double _Height, double _Width, double _X, double _Y) {
		this.Height = _Height;
		this.Width = _Width;
		this.X = _X;
		this.Y = _Y;
	}

	double getHeight() {
		return this.Height;
	}

	double getWidth() {
		return this.Width;
	}

	double getX() {
		return this.X;

	}

	double getY() {
		return this.Y;
	}

	public String toString() {
		return "java.Rectangle[x=" + this.X + ",y=" + this.Y + ",width=" + this.Width + ",height=" + this.Height + "]";

	}
}

public class RectangleTester {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		double h, w, x, y;

		System.out.print("input height=");
		h = scanner.nextDouble();

		System.out.print("input width=");
		w = scanner.nextDouble();

		System.out.print("input x=");
		x = scanner.nextDouble();

		System.out.print("input Y=");
		y = scanner.nextDouble();

		RectangleTesterr r1 = new RectangleTesterr(h, w, x, y);
		System.out.println(r1.toString());
		System.out.println("Area =" + r1.Height * r1.Width);
		System.out.println("Perimeter =" + (r1.Height + r1.Width) * 2);

		System.out.print("input height=");
		h = scanner.nextDouble();

		System.out.print("input width=");
		w = scanner.nextDouble();

		System.out.print("input x=");
		x = scanner.nextDouble();

		System.out.print("input Y=");
		y = scanner.nextDouble();

		RectangleTesterr r2 = new RectangleTesterr(h, w, x, y);
		System.out.println(r2.toString());

		System.out.println("Area =" + r2.Height * r2.Width);
		System.out.println("Perimeter =" + (r2.Height + r2.Width) * 2);
		System.out.println("End of Output!");

	}
}
