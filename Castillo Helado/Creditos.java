import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Esta clase muestra los creditos generales del juego
 * 
 * @Soto Avila Carolina, Escobar Chavez Jose Emmanuel 
 * @3 de Noviembre del 2016 
 */
public class Creditos extends World
{
    private GreenfootSound musicaDeFondo = new GreenfootSound (
    "Everybody Wants To Rule The World Instrumental Version.mp3");
    private botonVolverAyuda botonVolver;
    /**
     * Constructor for objects of class Creditos.
     * 
     */
    public Creditos()
    {    
        // Create a new world with 600x400 cells with a cell size of 1x1 pixels.
        super(600, 400, 1); 
    }
    
    /**
     * El metodo act para esta clase se encargará de poner la musica de fondo
     * y regresar al menu principal mediante el mouse y se quitará el fondo
     * musical.
     */
    public void act()
    {
        musicaDeFondo.play();
       
         if (Greenfoot.mouseClicked(botonVolver))
         {
            Menu menu = new Menu();   
            musicaDeFondo.stop();
            menu.musica();
            Greenfoot.setWorld(menu);
         }
        
         
    }
    
    /**
     * Detiene el sonido si se presiono el boton de pausa en la interfaz de greenfoot
     */
    public void stopped()
    {
        musicaDeFondo.stop();
    }
    
    /**
     * metodo para agregar boton de ayuda
     */
    public void prepare()
    {
        addObject(botonVolver,130, 450);
    }
}
