import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class MyWorld2 here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class MyWorld2 extends World
{
    
    private ReyHelado2 reyhelado2; 
    public final int INMUNIDAD = 30;
    private Pinguino pinguino;
    private Counter contadorPuntos;
    private Counter contadorVidas;
    private Marceline marceline;
    private GreenfootSound musicaDeFondo = new GreenfootSound ("ManlorettePartySong.wav");
    private SimpleTimer reloj;
    
    /**
     * Constructor for objects of class MyWorld2.
     * 
     */
    
    
    public MyWorld2(ReyHelado rey)
    {    
        // Create a new world with 600x400 cells with a cell size of 1x1 pixels.
        super(700, 500, 1); 
        contadorPuntos = new Counter("puntos ");
        addObject(contadorPuntos,631,27);
        contadorVidas = new Counter("vidas ");
        contadorVidas.setValue(3);
        addObject(contadorVidas,532,27);
        reloj = new SimpleTimer();
        prepare();
    }
    
    public void act()
    {
            
        lluviaPinguino();   
       
        
    }
    
    public void lluviaPinguino()
    {
        int x;
        pinguino = new Pinguino();
        if (Greenfoot.getRandomNumber(getWidth()) < 10) 
        {
            addObject(pinguino,Greenfoot.getRandomNumber(getWidth()),0);        
        }
    }
    
    /**
     * Incrementa el contador al agarrar los pinguinos que caen del cielo
     */
    public void incrementaPinguinos()
    {
        contadorPuntos.add(10);
    }
    
    /**
     * Incrementa el contador de puntos a agarrar las princesas que salen
     * volando por los aires 
     */
    public void incrementaPrincesas()
    {
        contadorPuntos.add(20);
    }
    
    /**
     * Disminuye las vidas al encontrarse con un enemigo 
     */
    public void decrementaVidas()
    {
        contadorVidas.add(-1);
    }
    
    /**
     * Si las vidas llegan a cero el juego se termina y el juego se detiene 
     */
    public void juegoPerdido()
    {
        if(contadorVidas.getValue()==0){
            Greenfoot.stop();
        }
    }
    
    private void prepare()
    {
        reyhelado2 = new ReyHelado2();
        addObject(reyhelado2, getWidth()/2 , getHeight()/2 );
        plataforma plataforma = new plataforma();
        addObject(plataforma,120,150);
        plataforma2 plataforma2 = new plataforma2();
        addObject(plataforma2,100,350);
        plataforma2 plataforma3 = new plataforma2();
        addObject(plataforma3,600,350);
        etiquetaVida etiquetavida = new etiquetaVida();
        addObject(etiquetavida,517,28);
        etiquetaPuntos etiquetapuntos = new etiquetaPuntos();
        addObject(etiquetapuntos,614,28);
        
        
        
        
    }
   
}
