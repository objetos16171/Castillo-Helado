import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Arcoiris here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Arcoiris extends Actor
{
    private int velocidad=5;
    private int altura=1;

    /**
     * Act - do whatever the Arcoiris wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act() 
    {
        turn(+3);
        setLocation( getX()+velocidad , getY() + altura );
        ataca();
        // Add your action code here.
    }
    
    /**
     * Se encargara de quitarle puntos de vida al rey helado volando por los aires a lo ancho del mundo y bajando y subiendo en el eje de las y 
     */
    public void ataca()
    {
        World mundo=getWorld();
       if(this.getX()>=getWorld().getWidth()-getImage().getWidth()/2){
            velocidad=velocidad*-1;
            altura=altura*-1;
       }
       if(this.getX()<=getImage().getWidth()/2){
           velocidad=velocidad*-1;
           altura=altura*-1;
        }
       
        if(this.getX()<=getImage().getWidth()/2){
            mundo.removeObject(this);
        }
        
       
    }
}
