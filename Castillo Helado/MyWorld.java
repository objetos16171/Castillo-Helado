import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class MyWorld here.
 * 
 * @Soto Avila Karolina, Escobar Chavez Jose Emmanuel 
 * @3 de Noviembre del 2016
 */
public class MyWorld extends World
{
    private Pinguino pinguino;
    private Counter contadorPinguinos;
    private Counter contadorVidas;
    private GreenfootSound musicaDeFondo = new GreenfootSound ("ManlorettePartySong.wav");
    
    /**
     * Constructor for objects of class MyWorld.
     * 
     */
    public MyWorld()
    {    
        // Create a new world with 600x400 cells with a cell size of 1x1 pixels.
        super(700, 500, 1); 
        contadorPinguinos = new Counter("puntos: ");
        addObject(contadorPinguinos,631,27);
        contadorVidas = new Counter("vidas: ");
        contadorVidas.setValue(3);
        addObject(contadorVidas,532,27);
        prepare();
    }
        
    /** Hace una lluvia de pinguino añadiento un objeto de tipo pinguino
    * usando como ubicacion en su coordenada x el metodo getRandomNumber
    * y estableciendo un rango para generarlos a partir del ancho del mundo
    * y bajando a partir  del inicio del alto del mundo 
    */
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
     * Este metodo aparecera princesas aleatoriamente en el mundo
     */
    public void aparecePrincesa()
    {
        if (Greenfoot.getRandomNumber(10000) < 5) 
        {
            addObject(new PrincesaDeFuego(),0 ,300);
        }
        
        if (Greenfoot.getRandomNumber(20000) < 5)
        {
            addObject(new princesaEsqueleto(),0 ,100);
        }
        
        if (Greenfoot.getRandomNumber(30000) < 5) 
        {
            addObject(new princesaDeTrapo(), 0 ,400);
        }
        
        if (Greenfoot.getRandomNumber(40000) < 5)
        {
            addObject(new princesaAngel(), 0 ,200);
        }
        
    }
    
    /** 
     * Metodo que controla el inicio de la música 
     */
    public void started()
    {
       
        musicaDeFondo.playLoop();
        
    }
    
    /**
     * Metodo que detiene el fondo musical
     */
    public void stopped()
    {
        musicaDeFondo.stop();
    }
    
    public void act()
    {
        lluviaPinguino();   
        aparecePrincesa();
        
    }
    
    public void incrementaPinguinos()
    {
        contadorPinguinos.add(10);
    }
    
    public void decrementaVidas()
    {
        contadorVidas.add(-1);
    }
    
    /**
     * Prepare the world for the start of the program.
     * That is: create the initial objects and add them to the world.
     */
    private void prepare()
    {
        ReyHelado reyhelado = new ReyHelado();
        addObject(reyhelado,352,450);
        plataforma plataforma = new plataforma();
        addObject(plataforma,120,340);
        
        
    }
}
