import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Es una paqueña representacion para simular una nevada
 * 
 * @Soto Avila Csf+fnolins, Jose Emmanuel Escobar Chavez  
 * @3 de noviembre el 2026
 */
public class CopoDeNieveMenu extends Actor
{
    private int velCaida=2;
    /**
     * El método act se encarga de girar el copo de nieve y si llega a la parter
     * inferior del mundo para así repetidamente .
     */
    public void act()
    {
        turn(-2);
        setLocation( getX() , getY()+ velCaida );
        World mundo=getWorld();
        if(getY()>=getWorld().getHeight()-10){
            mundo.removeObject(this);
        }
        // Add your action code here.
    }    
}
