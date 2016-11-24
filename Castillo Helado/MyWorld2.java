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
    private Pinguino pinguino;
    private Counter contadorPuntos;
    private Counter contadorVidas;
    private GreenfootSound musicaDeFondo = new GreenfootSound ("ManlorettePartySong.wav");
    private SimpleTimer reloj;
    //dulce gente
    private mentita menta;
    private senorPanquesito senorP;
    private panDeCanela pan;
    private paleta paletita;
    //inmunidad
    private Marceline marceline;
    private SimpleTimer relojMarceline;
    public Counter tiempoInmune;
    public final int TIEMPO = 30;
    
    /**
     * Constructor for objects of class MyWorld2.
     * 
     */
    
    
    public MyWorld2(ReyHelado rey, int valorContadorAnterior, int valorVidaAnterior)
    {    
        // Create a new world with 600x400 cells with a cell size of 1x1 pixels.
        super(700, 500, 1); 
        contadorPuntos = new Counter("puntos ");
        contadorVidas = new Counter("vidas ");
        tiempoInmune = new Counter("inmunidad ");
        addObject(contadorPuntos,631,27);
        
        contadorPuntos.setValue( valorContadorAnterior );
        contadorVidas.setValue( valorVidaAnterior );
        addObject(contadorVidas,532,27);
        reloj = new SimpleTimer();
        relojMarceline = new SimpleTimer();
        marceline = new Marceline();
        
        tiempoInmune.setValue(TIEMPO);
        addObject(tiempoInmune,420,27);
        
        prepare();
    }
    
    public void act()
    {
            
        lluviaPinguino();   
        dulceMentita();
        dulceSenorP();
        dulcePanDeCanela();
        dulcePaleta();
        inmune();
        juegoPerdido();
        
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
    
    public void dulceMentita()
    {
       menta =new mentita(); 
       if (Greenfoot.getRandomNumber(getWidth()) < 5) 
        {
         addObject(menta,Greenfoot.getRandomNumber(getWidth()),0);
        }
    }
    
    public void dulceSenorP()
    {
       senorP =new senorPanquesito(); 
       if (Greenfoot.getRandomNumber(getWidth()) < 5) 
        {
         addObject(senorP,Greenfoot.getRandomNumber(getWidth()),0);
        }
    }
    
    public void dulcePanDeCanela()
    {
       pan =new panDeCanela(); 
       if (Greenfoot.getRandomNumber(getWidth()) < 5) 
        {
         addObject(pan,Greenfoot.getRandomNumber(getWidth()),0);
        }
    }
    
    public void dulcePaleta()
    {
       paletita =new paleta(); 
       if (Greenfoot.getRandomNumber(getWidth()) < 5) 
        {
         addObject(paletita,Greenfoot.getRandomNumber(getWidth()),0);
        }
    }
    
    public void inmune()
    {
        
         if( (contadorPuntos.getValue()>= 100) &&
             (contadorPuntos.getValue()<=149)
           )
            {
              
               addObject(marceline,500,300);
               
               this.removeObject(menta);
               this.removeObject(senorP);
               this.removeObject(pan);
               this.removeObject(paletita);
               
              inmuneReturn();
              return;
             
         }
         
         if(contadorPuntos.getValue()>= 150)  
         {
             this.removeObject(marceline);
             this.removeObject(tiempoInmune);    
             dulceMentita();
             dulceSenorP();
             dulcePanDeCanela();
             dulcePaleta();
             
         }     
         
    }
    
    public void inmuneReturn(){
        
        if(relojMarceline.millisElapsed() >= 1000){
                 tiempoInmune.add(-1);
                 relojMarceline.mark();
              }
        eliminaMarceline();
    }
    
    public void eliminaMarceline()
    {
        if(tiempoInmune.getValue() == 0)
         {
                    this.removeObject(marceline);
                    this.removeObject(tiempoInmune);
                    dulceMentita();
                    dulceSenorP();
                    dulcePanDeCanela();
                    dulcePaleta();
                    
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

