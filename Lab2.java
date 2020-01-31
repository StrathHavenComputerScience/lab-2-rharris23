public class Lab2
{
  public static void turnRight()
  {
    //Pre: Robot faces forwards
    //Post: Robot faces right
    Robot.turnLeft();
    Robot.turnLeft();
    Robot.turnLeft();
  }  
 
  public static void moveLight()
  {
    //Pre: Robot is in front of a dark square
    //Post: Robot is on a light square
    Robot.move();
    Robot.makeLight();  
  }
  
  public static void cleanRow()
  {
    //Pre: Robot is in front of an uncleaned row
    //Post: Robot is facing a wall, to the left is another row
    moveLight();
    moveLight();
    moveLight();
    moveLight();
    moveLight();
    Robot.move();
  }  
  
  public static void cleanSquare()
  {
    Robot.load("square.txt");
    Robot.setDelay(0.1);
    
    //INSERT CODE HERE
    cleanRow();
    Robot.turnLeft();
    cleanRow();
    Robot.turnLeft();
    cleanRow();
    Robot.turnLeft();
    cleanRow();
    Robot.turnLeft();
  }
  
  public static void moveDark()
  {
    //Pre: Robot is in front of a light square
    //Post: Robot is on a dark square
    Robot.move();
    Robot.makeDark();  
  }
  
  public static void darkenRow()
  {
    //Pre: To the right of the robot is a light row
    //Post: To the right of the robot is a dark row
    turnRight();
    moveDark();
    moveDark();
    moveDark();
    moveDark();
    moveDark();
    moveDark();
    Robot.turnLeft();
    Robot.turnLeft();
    Robot.move();
    Robot.move();
    Robot.move();
    Robot.move();
    Robot.move();
    moveDark();
    turnRight();
  } 
  
  public static void darkenComb()
  {
    Robot.load("comb.txt");
    Robot.setDelay(0.05);
    
    //INSERT CODE HERE
    darkenRow();
    moveDark();
    Robot.move();
    darkenRow();
    moveDark();
    Robot.move();
    darkenRow();
    moveDark();
    Robot.move();
    darkenRow();
    moveDark();
    Robot.move();
    darkenRow();
  } 
  
  public static void checkerRow()
  {
    //Pre: Start on a light square, facing a row about to be checkered
    //Post: End on a light square, facing a wall
    Robot.makeDark();
    Robot.move();
    moveDark();
    Robot.move();
    moveDark();
    Robot.move();
    moveDark();
    Robot.move();    
  } 
  
  public static void checkerFourth()
  {
    //Pre: Start on a light square, facing a row about to be checkered
    //Post: Start on a light square, facing a row about to be checkered
    checkerRow();
    turnRight();
    Robot.move();
    turnRight();
    checkerRow();
    Robot.turnLeft();
    Robot.move();
    Robot.turnLeft();   
  } 
  
  public static void makeCheckered()
  {
    Robot.load("blank.txt");
    Robot.setDelay(0.05);
    
    //INSERT CODE HERE
    checkerFourth();
    checkerFourth();
    checkerFourth();
    checkerRow();
    turnRight();
    Robot.move();
    turnRight();
    checkerRow();
  }
}
