import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class MyWorld here.
 * 
 * @Soto Avila Karolina, Escobar Chavez Jose Emmanuel 
 * @3 de Noviembre del 2016
 */
public class MyWorld extends World
{
    public final int INMUNIDAD = 30;
    private Pinguino pinguino;
    private Counter contadorPuntos;
    private Counter contadorVidas;
    private Counter tiempoAyuda;
    private Marceline marceline;
    private GreenfootSound musicaDeFondo = new GreenfootSound ("ManlorettePartySong.wav");
    private SimpleTimer reloj;
    /**
     * Constructor for objects of class MyWorld.
     * 
     */
    public MyWorld()
    {    
        // Create a new world with 600x400 cells with a cell size of 1x1 pixels.
        super(700, 500, 1); 
        contadorPuntos = new Counter("puntos: ");
        addObject(contadorPuntos,631,27);
        contadorVidas = new Counter("vidas: ");
        contadorVidas.setValue(3);
        addObject(contadorVidas,532,27);
        reloj = new SimpleTimer();
        
        //inmune();
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
     * Metodo que controla el inicio de la música y el inicio del tiempo
     */
    public void started()
    {
        reloj.mark();
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
        enemigojake();
        
        
    }
    
    public void enemigojake()
    {
        if(reloj.millisElapsed()>120000){
            Jake jake=new Jake();
            addObject(jake,650,450);
            reloj.mark();
        }
    }
    
    /*public void inmune()
    {
        if(contadorPuntos.getValue() >100)
        {
            tiempoAyuda = new Counter("inmunidad: ");
            addObject(tiempoAyuda,420,27);
            tiempoAyuda.setValue(INMUNIDAD);
            marceline = new Marceline();
            addObject(marceline,640,200);
            
            
         }
        
    }
    public void tiempoinmunidad()
    {
       if(reloj.millisElapsed() > 1000){
            tiempoAyuda.add(-1);
            reloj.mark();
            if(tiempoAyuda.getValue()==0){
                this.removeObject(marceline);
                this.removeObject(tiempoAyuda);
            }
       }
    }*/
    
    public void incrementaPinguinos()
    {
        contadorPuntos.add(10);
    }
    
    public void decrementaVidas()
    {
        contadorVidas.add(-1);
    }
    
    public void juegoPerdido()
    {
        if(contadorVidas.getValue()==0){
            Greenfoot.stop();
        }
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
        
        plataforma plataforma2 = new plataforma();
        addObject(plataforma2,551,185);
        plataforma.setLocation(114,385);
        plataforma2.setLocation(563,265);
        plataforma2.setLocation(563,269);
        plataforma2.setLocation(563,265);
        plataforma plataforma3 = new plataforma();
        addObject(plataforma3,232,145);
        
    }
}
