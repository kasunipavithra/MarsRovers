
package RoverApp;

/**
 *This class is responsible for controlling the rover.
 *Control logic of the rover is separated into this class.
 *Each control signal (L,R,M) changes the state of the rover.
 *Each method in this class will receive a rover object, update its state and return updated object
 */
public class RoverControler {

   /**
   * rotateL method is used to rotate rover to left.
   * It is invoked when L signal is received.
   * @param rover is an object of rover class
   * @return This returns the rover object with rover's heading direction updated
   **/
    public Rover rotateL(Rover rover){
        String letter = rover.getHeading_dir();
        switch (letter) {
            case "N":
                rover.setHeading_dir("W");
                break;
            case "S":
                rover.setHeading_dir("E");
                break;
            case "W":
                rover.setHeading_dir("S");
                break;
            case "E":
                rover.setHeading_dir("N");
                break;
        } 
        return rover;
    }
    
   /**
   * rotateR method is used to rotate rover to right.
   * It is invoked when R signal is received.
   * @param rover is an object of rover class
   * @return This returns the rover object with rover's heading direction updated
   **/
    public Rover rotateR(Rover rover){
        String letter = rover.getHeading_dir();
        switch (letter) {
            case "N":
                rover.setHeading_dir("E");
                break;
            case "S":
                rover.setHeading_dir("W");
                break;
            case "W":
                rover.setHeading_dir("N");
                break;
            case "E":
                rover.setHeading_dir("S");
                break;
        } 
        return rover;
    }
     
   /**
   * move method is used to rotate rover to left.
   * It is invoked when M signal is received.
   * @param rover is an object of rover class
   * @return This returns the rover object with rover's x and y coordinates updated
   **/
    public Rover move(Rover rover){
        String letter = rover.getHeading_dir();
        int y_coordinate = rover.getY_coordinate();
        int x_coordinate = rover.getX_coordinate();
        
        //newly generated coordinates should be within grid. Hence they are compared with grid dimensions before updating
        switch (letter) {
            case "N":
                y_coordinate +=1;
                if(0<=y_coordinate && Grid.y_max>=y_coordinate){
                    rover.setY_coordinate(y_coordinate);
                }
                break;
            case "S":
                y_coordinate -=1;
                if(0<=y_coordinate && Grid.y_max>=y_coordinate){
                    rover.setY_coordinate(y_coordinate);
                }
                break;
            case "W":
                x_coordinate -=1;
                if(0<=x_coordinate && Grid.x_max>=x_coordinate){
                    rover.setX_coordinate(x_coordinate);
                }
                break;
            case "E":
                x_coordinate +=1;
                if(0<=x_coordinate && Grid.x_max>=x_coordinate){
                    rover.setX_coordinate(x_coordinate);
                }
                break;
        } 
        return rover;  
    }
       
}
