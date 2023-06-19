
/** The RightTriangle class extends the Shape2D class and calculates the circumference and area of a right triangle shape.
 * @author Nick Nikolov
 *
 */
public class RightTriangle extends Shape2D{
		
	/**
	 * Default constructor for RightTriangle, set width and height to 1.0 and 2.0 respectively.
	 */
	public RightTriangle() {
		this(1.0, 2.0);
	}
	
	/**
	 * @param w (double) width
	 * @param h (double) height
	 */
	public RightTriangle(double w, double h) {
		super(w, h);
	}
	
	/**
	 * return circumference of a RightTriangle (double)
	 */
	@Override
	public double getCircumference() {
		return (this.getWidth() + this.getHeight() + (Math.sqrt(Math.pow(this.getWidth(), 2)  + Math.pow(this.getHeight(), 2 ))));
	}
	
	/** 
	 *return area of a RightTriangle (dobule)
	 */
	@Override
	public double getArea() {
		return (this.getWidth() * this.getHeight() / 2.0);
		
	}
}
