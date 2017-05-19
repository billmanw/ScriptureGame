/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package byui.cit260.ScriptureGame.model;

import java.awt.Point;
import java.io.Serializable;

/**
 *
 * @author Whitney VanSteenkiste
 */
public enum Actor implements Serializable {
    
    Mary("She is the mother of Jesus."),
    Nephi("He is the son of Helaman."),
    Moses("He is the prophet who led the Israelites out of Egyptian bondage."),
    Peter("He is from the village of Bethsaida in the province of Galilee.");
   
   

    private final Point coordinates;
    private final String description;
    
    Actor(String description){
        this.description = description;
        coordinates = new Point(1,1);
    }

   public String getDescription(){
          return description;
}

   public Point getCoordinates(){
          return coordinates;
}

    public void setDescription(String you_are_the_main_Actor ) {
        throw new UnsupportedOperationException("Not supported yet."); 
    }

}