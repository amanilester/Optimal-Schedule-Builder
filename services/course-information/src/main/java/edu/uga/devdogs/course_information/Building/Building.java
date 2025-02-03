package edu.uga.devdogs.course_information.Building;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

import java.io.Serializable;

/*
 * Java JPA entity represention for Building
 */
@Entity
public class Building implements Serializable {
    
    /*
     * Variables
     */

    // serves as the id.
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private long buildingId;

    /* This can't serve as the id, because many 
    classes show the building number as NCRR or TBA/
    */
    private String buildingNumber;

    private String name;

    private String grid;

    /*
     * Relationships
     * To-Do: add relationships (one-to-one, one-to-many, many-to-one, many-to-many) here
     */

    /*
     * Constructors
     */

    // Default constructor
    public Building() {
    }

    // Constructor w/o buildingNumber
    public Building(String name, String grid) {
        this.name = name;
        this.grid = grid;
    }

    // Constructor w/ buildingNumber
    public Building(String buildingNumber, String name, String grid) {
        this.buildingNumber = buildingNumber;
        this.name = name;
        this.grid = grid;
    }

    
    /*
     * Getters and Setters
     */

    public String getBuildingNumber() {
        return buildingNumber;
    }

    public long getBuildingId() {
        return buildingId;
    }

    public void setBuildingNumber(String buildingNumber) {
        this.buildingNumber = buildingNumber;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getGrid() {
        return grid;
    }

    public void setGrid(String grid) {
        this.grid = grid;
    }


    /*
     * toString
     */
    @Override
    public String toString() {
        return "Building [ buildingNumber=" + buildingNumber 
                + ", name='" + name 
                + ", grid='" + grid 
                + ']';
    }

    
}
