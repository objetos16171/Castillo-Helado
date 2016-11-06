import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class ReyHelado here.
 * 
 * @author Soto Avila Karolina, Jose Emmanuel Escobar Chavez
 * @version 4 de Noviembre del 2016
 */
public class ReyHelado extends Actor
{
    /**
     * Act - do whatever the ReyHelado wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act() 
    {
        // Add your action code here.
        mueve();
        agarraPinguino();
    }    
    
   /**
    * Mueve al ReyHelado con las teclas izquierda y derecha
    */
    public void mueve()
    {
         if(Greenfoot.isKeyDown("left")){
           move(-3);
       } 
        if(Greenfoot.isKeyDown("right")){
           move(3);
       } 
    }
    
    /**
     * Este método nos ayudara para poder 
     * agarrar pinguinos que van cayendo del cielo 
     * usa el metodo getOneObjectAtOffset usando como de referencia la
     * posicion de este mismo objeto accediendo al mundo para eliminarlo.
     */
    public void agarraPinguino()
    {

        Actor Pinguino;
        Pinguino = getOneObjectAtOffset(0,0,Pinguino.class);
        if(Pinguino != null)
        {
            World mundo;
            mundo = getWorld();
            mundo.removeObject(Pinguino);
        }
        
    }
}
