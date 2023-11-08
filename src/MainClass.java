public class MainClass {

	public static void main(String[] args) {
		CircleArea c = new CircleArea();
		CuboidArea cu = new CuboidArea();
		RectangleArea r = new RectangleArea();
		c.calCircle(3);
		cu.calCuboid(2, 3, 5);
		r.calRect(4, 6);
	}

}
