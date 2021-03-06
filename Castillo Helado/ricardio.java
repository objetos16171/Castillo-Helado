import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)


/**
 * Write a description of class  here.
 * Este objeto aumentara la cantidad de vidas del rey helado  
 * @author Carolina Soto Avila, Jose Emmanuel Escobar Chávez
 * @version 4 de noviembre del 2016
 */
public class ricardio extends Actor
{
    private int velY=8;
    private int posicionX=6;
    /**
     * Act - do whatever the ricardio wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act() 
    {
        setLocation( this.getX()+posicionX , this.getY()- velY  );
        veHaciaElContador();
    }
    
    /**
     * el actor sube hacia el contador y desaparece
     * 
     */
    public void veHaciaElContador()
    {
        World mundo=getWorld();
        
        if(this.getX() >= getWorld().getWidth()-135)
        {
            posicionX = 0 ;
        }
        
        if(this.getY()<=30)
        {
            velY=0;

        }
        
        if(isTouching(Counter.class) )
        {
            mundo.removeObject(this);
            ((MyWorld)(mundo)).aumentaCorazones();
            Greenfoot.playSound("sanando.wav");
        }
    }
}
