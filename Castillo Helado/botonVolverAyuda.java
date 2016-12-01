import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class botonVolerMenu here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class botonVolverAyuda extends Actor
{
    int posX=1;
    /**
     * Act - do whatever the botonVolerMenu wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act() 
    {
        animacionBoton();
        mouse();
        
        // Add your action code here.
    }
    
    /**
     * Realiza un desplazamiento de izquierda a derecha con un rango establecido
     * multiplicando el valor de la variable posX
     */
    public void animacionBoton()
    {
        setLocation( getX()+posX , getY() );
        if(this.getX()>=160)
        {
            posX= posX * -1 ;
        }
        
        if(this.getX()<=120)
        {
            posX= posX * -1 ;
        }
        
    }
    
    /**
     * Se encarga de volver al menú principal del juego mediante el clic de derecho del mouse
     */
    public void mouse()
    {
         if (Greenfoot.mouseClicked(this))
         {
             
             Greenfoot.setWorld(new Menu());   
                                      
         }
        
    }
}
