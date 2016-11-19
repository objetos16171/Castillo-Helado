import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)
import java.util.ArrayList;
import java.util.List;
import java.awt.Color;
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
    //private Counter tiempoAyuda;
    //private Marceline marceline;
    private GreenfootSound musicaDeFondo = new GreenfootSound ("ManlorettePartySong.wav");
    private SimpleTimer reloj;
    private Arcoiris arcoiris;
    private ReyHelado reyHelado;
     
    private ricardio vida;
   
    private GreenfootImage imagenDeFondo1 = new GreenfootImage("Ice_Kingdom.png");
    private GreenfootImage imagenDeFondo2 = new GreenfootImage("Ice_Kingdom.png");
    

    /**
     * Constructor for objects of class MyWorld.
     * 
     */
    public MyWorld()
    {
        this(new ReyHelado());
    }
    
    public MyWorld(ReyHelado rey)
    {    
        // Create a new world with 600x400 cells with a cell size of 1x1 pixels.
        super(700, 500, 1); 
        contadorPuntos = new Counter("puntos ");
        addObject(contadorPuntos,631,27);
        contadorVidas = new Counter("vidas ");
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
     * Cuando la dulce princesa aparezca incrementara las vidas al Rey Helado
     */
    public void aumentaCorazones()
    {
        contadorVidas.add(+1);

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
    
    /**
     * El actor arcoiris saldrad volando y rebotara hasta que 
     * consiga pegarle al Rey Helado
     */
    public void ataqueArcoiris()
    {
        if(reyHelado.getY()==30 && reyHelado.getX()==30 )
        {
        arcoiris = new Arcoiris();
        addObject(arcoiris,61,87);
        }
        
        if(reyHelado.getY()==0 && reyHelado.getX()==150 )
        {
        arcoiris = new Arcoiris();
        addObject(arcoiris,61,87);
        }
    }
    
   
    
    public void act()
    {
        setBackground(imagenDeFondo1);    
        lluviaPinguino();   
        aparecePrincesa();
        ataqueArcoiris();
        enemigojake();
    }
    
   public void enemigojake()
    {
        if(reloj.millisElapsed()> 20000){
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
    
    /**
     * Prepare the world for the start of the program.
     * That is: create the initial objects and add them to the world.
     */
    private void prepare()
    {
        reyHelado = new ReyHelado();
        addObject(reyHelado, getWidth()/2 , getHeight()/2 );
        plataforma plataforma = new plataforma();

        addObject(plataforma,120,340);

        plataforma plataforma2 = new plataforma();
        addObject(plataforma2,551,185);

        plataforma.setLocation(114,385);
        plataforma2.setLocation(563,265);

        plataforma plataforma3 = new plataforma();
        addObject(plataforma3,232,145);

        plataforma2 plataforma22 = new plataforma2();
        addObject(plataforma22,609,395);

        dulcePrincesa dulceprincesa = new dulcePrincesa();
        addObject(dulceprincesa,652,454);
        Finn finn = new Finn();
        addObject(finn,66,476);
        etiquetaVida etiquetavida = new etiquetaVida();
        addObject(etiquetavida,542,35);
        etiquetavida.setLocation(550,28);
        etiquetaPuntos etiquetapuntos = new etiquetaPuntos();
        addObject(etiquetapuntos,648,33);

        etiquetavida.setLocation(554,31);

        etiquetapuntos.setLocation(647,32);
        etiquetavida.setLocation(517,28);
        etiquetapuntos.setLocation(618,28);
        etiquetapuntos.setLocation(614,28);

    }
}
