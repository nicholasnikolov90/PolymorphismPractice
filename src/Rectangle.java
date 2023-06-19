
/**The Rectangle class extends the Shape 2D class and implements the IShapePoints interface
 * 
 * Functionality:
 * -  find coordinates of all points on the rectangle, given a reference point
 * - calculate circumference of a rectangle
 * - calculate area of a rectangle
 * 
 * 
 * @author Nick Nikolov
 *
 */
public class Rectangle extends Shape2D implements IShapePoints{
	
	Point2D referencePoint;
	
	Shape2D shape = new Rectangle();
	
	
	public Rectangle() {
		this(1.0,  2.0);
		referencePoint = new Point2D();
	}

	public Rectangle(double w, double h) {
		super(w, h);
		referencePoint = new Point2D(0.0, 0.0);
	}

	/**
	 * return circumference of a rectangle (double)
	 */
	@Override
	public double getCircumference() {
		return 2 * (this.getHeight() + this.getWidth());
	}

	/**
	 *return area of a rectangle (double)
	 */
	@Override
	public double getArea() {
		return this.getHeight() * this.getWidth();
	}

	/**
	 * getter for the reference point on the rectangle
	 */
	@Override
	public Point2D getReferencePoint() {
		Point2D localReferencePoint = new Point2D(referencePoint);
		return localReferencePoint;
	}

	/**
	 * set the reference point of the rectangle
	 */
	@Override
	public void setReferencePoint(Point2D p) {
		referencePoint.x = p.x;
		referencePoint.y = p.y;
	}

	/**
	 * return coordinates of all points on the rectangle (Point2D)
	 */
	@Override
	public Point2D[] getAllShapePoints() {
		Point2D p1 = new Point2D(referencePoint);
		Point2D p2 = new Point2D(referencePoint);
		Point2D p3 = new Point2D(referencePoint);
		Point2D p4 = new Point2D(referencePoint);
		
		p2.x = referencePoint.x + getWidth();
		p3.y = referencePoint.y + getHeight();
		p3.x = referencePoint.x + getWidth();
		p4.y = referencePoint.y + getHeight();
		
		Point2D[] points = {p1, p2, p3, p4};
		
		return points;
	}
}
