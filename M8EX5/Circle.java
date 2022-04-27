
public class Circle  {

  private int radius;
  private Point center;

public Circle(int radius, int x, int y) {
	center = new Point(x, y);
	this.radius = radius;
}
//getters & Setters
public int getRadius() {
	return radius;
}
public void setRadius(int radius) {
	this.radius = radius;
}
public Point getPoint() {
	return center;
}

  // Other Circle methods
  public double distanceBetweenCenters(Circle tested){
	  double x1 = center.getX();
	  double y1 = center.getY();
	  double x2 = tested.getPoint().getX();
	  double y2 = tested.getPoint().getY();
	  double distanceBC = (Math.sqrt((Math.pow((x2 - x1), 2.0) + Math.pow((y2 - y1), 2))));
	  return distanceBC;
  }
  public boolean isEqual(Circle tested){
	  boolean equals = false;
	  if (this.radius == tested.radius && isConcentric(tested)) {
		  equals = true;
	  }
	  return equals;
  }
  public boolean isConcentric(Circle tested){
	  boolean concentric = false;
	  if(center.getX() == tested.getPoint().getX() && center.getY() == tested.getPoint().getY()) {
		  concentric = true;
	  }
	  return concentric;
  }
  public boolean isRadiusEqual(Circle tested){
	  boolean radiusEqual = false;
	  if(this.radius == tested.getRadius()) {
		  radiusEqual = true;
	  }
	  return radiusEqual;
  }
  public boolean isTangent(Circle tested){
	  boolean tangent = false;
	  if(distanceBetweenCenters(tested) == this.radius + tested.getRadius() || distanceBetweenCenters(tested) == this.radius - tested.getRadius()){
		  tangent = true;
	  }
	  return tangent;
  }
  public boolean isSecant(Circle tested){
	  boolean secant = false;
	  if(distanceBetweenCenters(tested) < this.radius + tested.getRadius() || distanceBetweenCenters(tested) < this.radius - tested.getRadius()){
		  secant = true;
	  }
	  return secant;
  }
  public boolean notTouch(Circle tested){
	  boolean touchNot = false;
	  if(distanceBetweenCenters(tested) > this.radius + tested.getRadius()){
		  touchNot = true;
	  }
	  return touchNot;
  }
  
}
