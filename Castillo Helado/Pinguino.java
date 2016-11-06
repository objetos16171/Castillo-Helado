import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Pinguino here.
 * 
 * @author Soto Avila Karolina, Escobar Chavez Jose Emmanuel Escobar Chavez 
 * @version 4 de Noviembre del 2016
 */
public class Pinguino extends Actor
{
    private int velocidadCaida=5;
    private GifImage gifPinguino = new GifImage("pinguinoMejorado2.gif");
    
    /**
     * Act - do whatever the Pinguino wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    
    public void act() 
    {
        caida();
    }
    
    /**Se establecio una imagen gif para simular la caida del pinguino
     *se accede a los metodos del mundo usando una variable de tipo World
     *para abrir una concidion en caso de que el objeto llegue a los 
     * limites de la altura quitar el objeto de su mismo tipo.
     * y simular el descenso con la varible de instancia velocidadDeCaida.
     */
    public void caida()
    {
        setImage(gifPinguino.getCurrentImage());
        World mundo = getWorld();

        setLocation(getX(), getY()+velocidadCaida);
        if (getY()>= mundo.getHeight() - 10) 
        {
            mundo.removeObject(this);
        }
    }
}
