/******************************************************
* Car.java
* Jason Nelson
******************************************************
* This class sets the attributes for a "Car" object.
******************************************************
* September 10, 2018
*******************************************************/

package nelson_advjproject2;
import java.awt.Color;

public class Car 
{
    private String make,
                model;
    private Color color;
    private int speed = 0;

/******************************************************
* Car
* Jason Nelson
******************************************************
* This method is the constructor for a "Car" object.
* Method Inputs:
* carMake - string
* carModel - string
* carColor - color
* Return value:
* none
******************************************************
* September 10, 2018
******************************************************/
    
    public Car(String carMake, String carModel, Color carColor)
    {
        make = carMake;
        model = carModel;
        color = carColor;
    }

/******************************************************
* setMake
* Jason Nelson
******************************************************
* This method sets the make of the "Car" object.
* Method Inputs:
* carMake - string
* Return value:
* none
******************************************************
* September 10, 2018
******************************************************/
      
    public void setMake(String carMake)
    {
        make = carMake;
    }
 
/******************************************************
* getMake
* Jason Nelson
******************************************************
* This method gets the make of the "Car" object.
* Method Inputs:
* none
* Return value:
* make - string
******************************************************
* September 10, 2018
******************************************************/
     
    public String getMake()
    {
        return make;
    }
 
/******************************************************
* setModel
* Jason Nelson
******************************************************
* This method sets the model of the "Car" object.
* Method Inputs:
* carModel - string
* Return value:
* none
******************************************************
* September 10, 2018
******************************************************/
     
    public void setModel(String carModel)
    {
        model = carModel;
    }
 
/******************************************************
* getModel
* Jason Nelson
******************************************************
* This method gets the model of the "Car" object.
* Method Inputs:
* none
* Return value:
* model - string
******************************************************
* September 10, 2018
******************************************************/
     
    public String getModel()
    {
        return model;
    }
 
/******************************************************
* setColor
* Jason Nelson
******************************************************
* This method sets the color of the "Car" object.
* Method Inputs:
* carColor - color
* Return value:
* none
******************************************************
* September 10, 2018
******************************************************/
     
    public void setColor(Color myColor)
    {
        color = myColor;
    }

/******************************************************
* getColor
* Jason Nelson
******************************************************
* This method gets the color of the "Car" object.
* Method Inputs:
* none
* Return value:
* color - color
******************************************************
* September 10, 2018
******************************************************/
      
    public Color getColor()
    {
        return color;
    }

/******************************************************
* getSpeed
* Jason Nelson
******************************************************
* This method gets the speed of the "Car" object.
* Method Inputs:
* none
* Return value:
* speed - int
******************************************************
* September 10, 2018
******************************************************/
      
    public int getSpeed()
    {
        return speed;
    }
 
/******************************************************
* accelerate
* Jason Nelson
******************************************************
* This method increases the speed of the car by 5.
* Method Inputs:
* speed - int
* Return value:
* none
******************************************************
* September 10, 2018
******************************************************/
     
    public void accelerate()
    {
        speed += 5;
    }
 
/******************************************************
* brake
* Jason Nelson
******************************************************
* This method increases the speed of the car by 5.
* Method Inputs:
* speed - int
* Return value:
* none
******************************************************
* September 10, 2018
******************************************************/
     
    public void brake()
    {
        if(speed > 0)
            speed -= 5; 
    }
}


/******************************************************
* Method Name
* Method Author (i.e. Your name)
******************************************************
* Purpose of the Method (Why did you write this Method?)
* Method Inputs:
* List all the method parameters with their expected value ranges
* Return value:
* If this is a function list the return data type and the expected range of 
* values to be returned.
******************************************************
* Date
******************************************************/