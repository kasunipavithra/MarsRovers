
package RoverApp;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.LinkedList;
import java.util.ListIterator;

/**
* <p>The RoverProgram is a solution provided for the Mars Rovers Problem.
* It generates the output locations of rovers for a given input signal.</p>
*
* @author  Kasuni Samarasekara
* @version 1.0
* @since   2019-03-14 
*/
public class RoverProgram {

    /**
     *
     * @param args
     */
    public static void main(String[] args) throws IOException {

        System.out.println("Welcome to Mars Rover Program!!!\nWe are ready to accept signals.\nAdd input here: (Press Enter again to end input)");
        //Each rover is processed sequently. currentRover holds the rover that being processed.
        Rover currentRover = new Rover();
        //roverControler object is used to control the rover according to control signals
        RoverControler roverControler = new RoverControler();
        //bufferedReader is used to read a multiline input
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        //line holds the each line read by bufferedReader
        String line;
        //input lines are stored ininputList
        LinkedList<String> inputList = new LinkedList<>();

        while ((line = bufferedReader.readLine()) != null) {
            if (line.isEmpty()) {
                break; // if an input is empty, break
            }
            //each line is appended to inputlist
            inputList.add(line);
        }
        bufferedReader.close();
        
        //inputListIterator used to iterate alone the inputList
        ListIterator inputListIterator = inputList.listIterator(0);
        //Each line needs to split into a array of letters. letterArray holds letters of each line.
        String[] letterArray;
        
        while (inputListIterator.hasNext()) {
            String inputLine = inputListIterator.next().toString();
            
            //First line of input gives grid's dimensions. 
            if (inputListIterator.nextIndex() == 1) {
                letterArray = inputLine.trim().split(" ");
                Grid.x_max = Integer.parseInt(letterArray[0]);
                Grid.y_max = Integer.parseInt(letterArray[1]);
                
            //Line indexes 2,4,.. holds information to initiate rover
            } else if (inputListIterator.nextIndex() != 0 && inputListIterator.nextIndex() % 2 == 0) {
                letterArray = inputLine.trim().split(" ");
                currentRover.setX_coordinate(Integer.parseInt(letterArray[0]));
                currentRover.setY_coordinate(Integer.parseInt(letterArray[1]));
                currentRover.setHeading_dir(letterArray[2]);
                
            //Line indexes 3,5,.. holds control signals    
            } else if (inputListIterator.nextIndex() != 0 && inputListIterator.nextIndex() % 2 == 1) {
                letterArray = inputLine.trim().split("(?!^)");
                for (int i = 0; i < letterArray.length; i++) {
                    String letter = letterArray[i];
                    
                    //There are three different types of control signals M,L,R. Relavent control method is called for relavant letter.
                    switch (letter) {
                    case "M":
                        currentRover = roverControler.move(currentRover);
                        break;
                    case "L":
                        currentRover = roverControler.rotateL(currentRover);
                        break;
                    case "R":
                        currentRover = roverControler.rotateR(currentRover);
                        break;     
                    }
                    
                }
                //In the end of control signal, current location and position of the processed rover would be:
                System.out.println(currentRover.getX_coordinate() + " " + currentRover.getY_coordinate() + " " + currentRover.getHeading_dir());
            }

        }

    }

}
