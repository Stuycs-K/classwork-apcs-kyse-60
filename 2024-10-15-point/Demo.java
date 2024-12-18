public class Demo{

  /*
  Write this method third. Test it then move on
  to the others.
  */
  public static double distance(Point a, Point b){
    return Math.sqrt(Math.pow((a.getX() - b.getX()), 2) + Math.pow((a.getY() - b.getY()), 2));
  }

  public static void main(String[]args){
    Point p1 = new Point(1,1);
    Point p2 = new Point(-1,-1);
    Point p3 = new Point(3,4);
    System.out.println( p3);
    //cases for Point calling a point
    Point p4 = new Point(p1);
    Point p5 = new Point(p2);
    Point p6 = new Point(p3);
    System.out.println("is p4 equal to p1 " + p1.toString().equals(p4.toString())+ " different addresses? " + !(p1 == p4));
    System.out.println("is p5 equal to p2 " + p2.toString().equals(p5.toString())+ " different addresses? " + !(p2 == p5));
    System.out.println("is p6 equal to p3 " + p3.toString().equals(p6.toString())+ " different addresses? " + !(p3 == p6));

    System.out.println( distance(p1,p2));//expect roughly 2.828
    System.out.println( Point.distance(p1,p2));
    System.out.println( p1.distanceTo(p2));
    
    System.out.println( distance(p1,p3)); //expect roughly 3.6055
    System.out.println( Point.distance(p1,p3));
    System.out.println( p1.distanceTo(p3));

    Point p7 = new Point(4,1);
    Point p8 = new Point(1,5);
    System.out.println( distance(p7,p8)); //expect 5.0
    System.out.println( Point.distance(p7,p8));
    System.out.println( p7.distanceTo(p8));

    Point eqp1 = new Point(0,0);
    Point eqp2 = new Point(0.5, Math.sqrt(3)/2);
    Point eqp3 = new Point(1,0);

    System.out.println("first side: " + distance(eqp1,eqp2));
    System.out.println("first side: " + Point.distance(eqp1,eqp3));
    System.out.println("first side: " + eqp2.distanceTo(eqp3));
  }
}
