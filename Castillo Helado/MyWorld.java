
import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)
import java.util.ArrayList;
import java.util.List;
import java.awt.Color;
/**
 * Esta clase se esta diseñada para el nivel cuenta con contador de vidas y puntos tres enemigos, plataformas.
 * 
 * @Soto Avila Carolina, Escobar Chavez Jose Emmanuel 
 * @3 de Noviembre del 2016
 */
public class MyWorld extends World
{
    public final int INMUNIDAD = 30;
    private Pinguino pinguino;
    private Counter contadorPuntos;
    private Counter contadorVidas;
    private GreenfootSound musicaDeFondo = new GreenfootSound ("Adventure Time - Manlorette Party Song.mp3");
    private SimpleTimer reloj;
    private Arcoiris arcoiris;
    private ReyHelado reyHelado;
    private Finn finn;
    private ricardio vida;
    private dulcePrincesa dulceprincesa;
    private perdiste Perdiste; 
    

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
        Greenfoot.setWorld(new Menu());
        contadorPuntos = new Counter("PUNTOS:");
        addObject(contadorPuntos,625,40);        
        contadorVidas = new Counter("VIDAS:");
        addObject(contadorVidas,480,40);
        contadorVidas.setValue(5);

        reloj = new SimpleTimer();
        arcoiris = new Arcoiris();
        finn = new Finn();
        prepare();
    }
    
    /** Hace una lluvia de pinguino añadiento un objeto de tipo pinguino
    * usando como ubicacion en su coordenada x el metodo getRandomNumber
    * y estableciendo un rango para generarlos a partir del ancho del mundo
    * y bajando a partir  del inicio del alto del mundo 
    */
    public void lluviaPinguino()
    {
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
     * Aparace la dulce princesa en el mundo cuando se junta cierta cantidad de puntuación
     * 
     */
    public void ayudaAlRey()
    {   
        if(contadorPuntos.getValue() >= 90 && contadorPuntos.getValue() <= 99    )
        {
            dulceprincesa = new dulcePrincesa();
            addObject(dulceprincesa, getWidth()-20 , getHeight()-30 );
            Greenfoot.playSound("risaPrincesa.wav");
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
        
        if (Greenfoot.getRandomNumber(2000) < 5)
        {
            addObject(new princesaEsqueleto(),0 ,100);
        }
        
        if (Greenfoot.getRandomNumber(30000) < 5) 
        {
            addObject(new princesaDeTrapo(), 0 ,400);
        }
        
        if (Greenfoot.getRandomNumber(4000) < 5)
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
        if(  (( reyHelado.getX() >= 0 ) && ( reyHelado.getX() <= 100 ))  || 
             ((reyHelado.getY()  >=0) && (reyHelado.getY()  <=30 ))
             )
        {
        addObject(arcoiris,61,87);
        }
        
    }
    
    /**
     * Actor enemigo que aparecera cuando el rey helado 
     * este en la primer plataforma
     */
    public void ataqueFinn()
    {
        if( ( ( reyHelado.getX()>= 0 ) || ( reyHelado.getX() <= getWidth()/2 ) )
               &&( ( reyHelado.getY()>= 450 )  ))
        {
            addObject(finn, 20, 400);   
        }
       
    }
   
    /**
     * metodo que llama todas las acciones de el primer mundo
     */
    public void act()
    {
        musicaDeFondo.playLoop();
        lluviaPinguino();   
        aparecePrincesa();
        ataqueArcoiris();
        enemigojake();
        ataqueFinn();    
        juegoPerdido();
    }
    
    /**
     * Actor enemigo que aparece despues de dos minutos en la 
     * plataforma inicial
     */
   public void enemigojake()
    {
        if(reloj.millisElapsed()> 20000){
            Jake jake=new Jake();
            addObject(jake,650,450);
            reloj.mark();
        }
    }
    
    /**
     * Incrementa el contador al agarrar los pinguinos que caen del cielo
     */
    public void incrementaPinguinos()
    {
        contadorPuntos.add(10);
        ayudaAlRey();
    }
    
    /**
     * Incrementa el contador de puntos a agarrar las princesas que salen
     * volando por los aires 
     */
    public void incrementaPrincesas()
    {
        contadorPuntos.add(20);
        ayudaAlRey();
    }
    
    /**
     * Disminuye las vidas al encontrarse con un enemigo 
     */
    public void decrementaVidas()
    {
        if(contadorVidas.getValue() != -1)
        {
        contadorVidas.add(-1);
        }
    }
    
    /**
     * Devuelve el valor total de los puntos conseguidos por el jugador 
     */
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
    
    /**
     * Este método detiene el fondo musical  
     */
    public void quitaMusica()
    {
        musicaDeFondo.stop();
    }
    
    /**
     * Si las vidas llegan a cero el juego se termina y el juego se detiene 
     */
    public void juegoPerdido()
    {
        if(contadorVidas.getValue()==0)
        {
   
            Perdiste = new perdiste();
            addObject( Perdiste, getWidth()/2 , getHeight()/2  );
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
        
        paredDeHielo paredDeHielo = new  paredDeHielo();
        addObject(paredDeHielo,545,40);

    }
}
