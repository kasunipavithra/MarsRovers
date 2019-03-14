/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package RoverApp;

/**
 *This class represents the rover entity.
 *Rover has three attributes.
 *heading_dir represents the rover's orientation.
 *x_coordinate represents the rover's position alone x_axis.
 *y_coordinate represents the rover's position alone y_axis.
 *Getters and setters are provided to access the attributes.
 */
public class Rover {
    
    private String heading_dir;
    private int x_coordinate;
    private int y_coordinate;

    /**
     *
     * @param heading_dir
     */
    public void setHeading_dir(String heading_dir) {
        this.heading_dir = heading_dir;
    }

    /**
     *
     * @param x_coordinate
     */
    public void setX_coordinate(int x_coordinate) {
        this.x_coordinate = x_coordinate;
    }

    /**
     *
     * @param y_coordinate
     */
    public void setY_coordinate(int y_coordinate) {
        this.y_coordinate = y_coordinate;
    }
    
    /**
     *
     * @return heading_dir of the rover
     */
    public String getHeading_dir() {
        return heading_dir;
    }

    /**
     *
     * @return x_coordinate of the rover
     */
    public int getX_coordinate() {
        return x_coordinate;
    }

    /**
     *
     * @return y_coordinate of the rover
     */
    public int getY_coordinate() {
        return y_coordinate;
    }
}
