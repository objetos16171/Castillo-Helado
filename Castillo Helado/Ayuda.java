import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Esta clase sirve para dar un breve explicación de lo que los elementos que conforman el juego.
 * 
 * @Soto Avila Carolina, Escobar Chavez Jose Emmanuel 
 * @3 de Noviembre del 2016 
 */
public class Ayuda extends World
{
    private GreenfootSound musicaDeFondo = new GreenfootSound ("Everybody Wants To Rule The World Instrumental Version.mp3");
    botonVolverAyuda botonayuda;
      /**
     * Constructor for objects of class Ayuda.
     * 
     */
    public Ayuda()
    {    
        // Create a new world with 600x400 cells with a cell size of 1x1 pixels.
        super(700, 500, 1);
        botonayuda = new botonVolverAyuda();
        prepare();
    }
    
    /**
     * El metodo act para esta clase se encargará de poner la musica de fondo
     * y regresar al menu principal mediante el mouse y se quitará el fondo
     * musical.
     */
    public void act()
    {
        musicaDeFondo.play();
       
         if (Greenfoot.mouseClicked(botonayuda))
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
        addObject(botonayuda,130, 450);
    }
    
}
