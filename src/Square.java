
/** The Square class extends the Shape2D class and can be used to set the shape dimensions,
 * calculate area and calculate circumference
 * 
 * @author Nick Nikolov
 *
 */
public class Square extends Shape2D {
	
	Point2D referencePoint = new Point2D();
	
	/** Default constructor to set the length of all square sides to 1.0
	 * 
	 */
	public Square() {
		this(1.0);
	}
	
	/** constructor accepting any side measurement of the square
	 * @param l (double) length of any side
	 */
	public Square(double l){
		super(l, l);
	}
	
	/**
	 * setter for square height (forces height and width to be equal to maintain square properties)
	 */
	@Override
	public void setHeight(double l) {	
		super.setHeight(l);
		super.setWidth(l);
	}
	
	/**
	 * setter for square width (forces height and width to be equal to maintain square properties)
	 */
	@Override
	public void setWidth(double l) {
		super.setHeight(l);
		super.setWidth(l);
	}
	
	/**
	 *return circumference of a square (double)
	 */
	@Override
	public double getCircumference() {
		return 2.0 * (this.getHeight() + this.getWidth());
	}
	
	/**return area of a square (double)
	 *
	 */
	@Override
	public double getArea() {
		return (this.getHeight() * this.getWidth());
	}
}
