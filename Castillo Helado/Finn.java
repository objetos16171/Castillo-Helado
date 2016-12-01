import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class here.
 * Esta clase es otro de los enemigos se encarga de 
 * salir y disparar muchos tronquito que si llegan a tocar
 * al rey helado se pondra en diferentes lados.
 * @author Soto Avila Carolina, Jose Emmanuel Escobar Cjhávez  
 * @version 3 de noviembre del 2016 
  */
public class Finn extends Actor
{
    private GifImage finnGif = new GifImage ("finnNuevo.gif");
    private int xVel=3;
    private int xVelBala=5;
    private tronquito Tronquito; 
    /**
     * Act - do whatever the Finn wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public Finn()
    {
        Tronquito = new tronquito();
    }
    
    /**
     * En este metodo movera a esta clase hasta llegar al limite de la anchura
     * establecera una imagen de tipo gif y los metodos atacaFinn y quitaFinn 
     * se mantendrán activos. 
     */
    public void act() 
    {
        World mundo = getWorld();
        setImage(finnGif.getCurrentImage());
        
        setLocation( getX()+xVel , getWorld().getHeight() - ( getImage().getHeight()/2 )  ); 
        atacaFinn();
        quitaFinn();
    }
    
    /**
     * El actor Finn invoca  mediante una dance a un grupo de tronquitos para atacar al rey helado 
     */
    public void atacaFinn()
    {
        World mundo = getWorld();
        if ( this.getX() <= getWorld().getWidth()-100)   
        {   
            getWorld().addObject( Tronquito , this.getX()+xVelBala ,this.getY());   
       }
    }
    
    /**
     * Quita a al actor cuando llega al borde del mundo 
     */
    public void quitaFinn()
    {
        World mundo=getWorld();
        if( this.getX() >= getWorld().getWidth()-10 ){
            getWorld().removeObject(this);
        }
    }
}
