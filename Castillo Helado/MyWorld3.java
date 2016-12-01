import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class MyWorld3 here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class MyWorld3 extends World
{
    
    private ReyHelado3 reyhelado3; 
    private Pinguino pinguino;
    private Counter contadorPuntos;
    private Counter contadorVidas;
    private SimpleTimer reloj;
    //enemigos
    private mentita menta;
    private paleta paletita;
    private Finn finn;
    private Arcoiris arcoiris;
   
    private perdiste Perdiste;
    
    /**
     * Constructor for objects of class MyWorld3.
     * 
     */
    /**
     * Constructor for objects of class MyWorld2.
     * 
     */
    
    
    public MyWorld3(ReyHelado2 rey, int valorContadorAnterior, int valorVidaAnterior)
    {    
        // Create a new world with 600x400 cells with a cell size of 1x1 pixels.
        super(700, 500, 1); 
        contadorPuntos = new Counter("PUNTOS: ");
        contadorVidas = new Counter("VIDAS: ");
        addObject(contadorPuntos,631,27);
        contadorPuntos.setValue( valorContadorAnterior );
        contadorVidas.setValue( valorVidaAnterior );
        addObject(contadorVidas,500,27);
        reloj = new SimpleTimer();
        finn = new Finn();
        arcoiris = new Arcoiris();
        prepare();
    }
    
    public void act()
    {
            
        lluviaPinguino();   
        dulceMentita();
        dulcePaleta();
        ataqueFinn();
        ataqueArcoiris();
        juegoPerdido();
        
    }
    
    public void lluviaPinguino()
    {
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
            Perdiste = new perdiste();
            addObject( Perdiste, getWidth()/2 , getHeight()/2  );
            Greenfoot.stop();
        }
    }
    
    public void dulceMentita()
    {
       menta = new mentita(); 
       if (Greenfoot.getRandomNumber(getWidth()) < 5) 
        {
         addObject(menta,Greenfoot.getRandomNumber(getWidth()),0);
        }
    }
    
    public void dulcePaleta()
    {
       paletita = new paleta(); 
       if (Greenfoot.getRandomNumber(getWidth()) < 5) 
        {
         addObject(paletita,Greenfoot.getRandomNumber(getWidth()),0);
        }
    }
    
      public int regresaPuntuacion()
    {
        int puntos=0;
        return(puntos=contadorPuntos.getValue());
    }
    
    /**
     * Devuelve el valor total de vidas con las que cuenta el jugador 
     */
    public int regresaVida()
    {
        int vidas=0;
        return(vidas=contadorVidas.getValue());
    }
    
    private void prepare()
    {
        reyhelado3 = new ReyHelado3();
        addObject(reyhelado3, getWidth()/2 , getHeight()/2 );
        plataforma2 plataforma2 = new plataforma2();
        addObject(plataforma2,100,350);
        plataforma2 plataforma3 = new plataforma2();
        addObject(plataforma3,600,350);
        plataforma2 plataforma4 = new plataforma2();
        addObject(plataforma4,350,350);
        
    }
   
    public void ataqueFinn()
    {
        if( ( ( reyhelado3.getX()>= 0 ) || ( reyhelado3.getX() <= getWidth()/2 ) )
               &&( ( reyhelado3.getY()>= 450 )  ))
        {
            addObject(finn, 20, 400);   
        }
       
    }
    
     /**
     * El actor arcoiris saldrad volando y rebotara hasta que 
     * consiga pegarle al Rey Helado
     */
    public void ataqueArcoiris()
    {
        if(  (( reyhelado3.getX() >= 0 ) && ( reyhelado3.getX() <= 100 ))  || 
             ((reyhelado3.getY()  >=0) && (reyhelado3.getY()  <=30 ))
             )
        {
        addObject(arcoiris,61,87);
        }
        
    }
   }
   
   
   

