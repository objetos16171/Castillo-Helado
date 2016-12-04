import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Esta clase es el nivel 3 tiene 3 obstaculos, los contadores de vida  y sus respectivos pinguinos
 * princesas y obstaculos.
 * 
 * @Soto Avila Carolina, Escobar Chavez Jose Emmanuel 
 * @3 de Noviembre del 2016 
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
    
     private princesaTostada princesatostada ;
     private princesaMusculos princesamusculos ;
     private princesaMora princesamora;
     private princesaFantasma princesafantasma;
     private GreenfootSound musicaDeFondo = new GreenfootSound ("What am I to you - Adventure Time Finn the human Instrumental Song Arrangement.mp3");
    
    /**
     * Constructor for objects of class MyWorld3.
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
        princesatostada = new princesaTostada();
        princesamusculos = new princesaMusculos();
        princesamora = new princesaMora();
        princesafantasma = new princesaFantasma();
        prepare();
    }
    
    /**
     * acciones que se realizan en el mundo 3
     */
    public void act()
    {
        musicaDeFondo.playLoop();    
        lluviaPinguino();   
        dulceMentita();
        dulcePaleta();
        ataqueFinn();
        ataqueArcoiris();
        juegoPerdido();
        aparecePrincesa();
        
    }
    
    /**
     * Este metodo aparecera princesas aleatoriamente en el mundo
     */
    public void aparecePrincesa()
    {
        if (Greenfoot.getRandomNumber(10000) < 5) 
        {
            addObject(princesatostada,0 ,300);
        }
        else
        if (Greenfoot.getRandomNumber(2000) < 5)
        {
            addObject(princesamusculos,0 ,100);
        }
        else
        if (Greenfoot.getRandomNumber(3000) < 5) 
        {
            addObject(princesafantasma, 0 ,400);
        }
        else
        if (Greenfoot.getRandomNumber(4000) < 5)
        {
            addObject(princesamora, 0 ,200);
        }
        
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
            quitaMusica();
            Greenfoot.stop();
        }
    }
    
    /**
     * Actor enemigo que cae quitando vidas al rey helado
     */
    public void dulceMentita()
    {
       menta = new mentita(); 
       if (Greenfoot.getRandomNumber(getWidth()) < 5) 
        {
         addObject(menta,Greenfoot.getRandomNumber(getWidth()),0);
        }
    }
    
   /**
     * Actor enemigo que cae quitando vidas al rey helado
     */
    public void dulcePaleta()
    {
       paletita = new paleta(); 
       if (Greenfoot.getRandomNumber(getWidth()) < 5) 
        {
         addObject(paletita,Greenfoot.getRandomNumber(getWidth()),0);
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
     * Prepare the world for the start of the program.
     * That is: create the initial objects and add them to the world.
     */
    private void prepare()
    {
        reyhelado3 = new ReyHelado3();
        addObject(reyhelado3, getWidth()-450 , getHeight()/2 );
        plataforma2 plataforma2 = new plataforma2();
        addObject(plataforma2,100,350);
        plataforma2 plataforma3 = new plataforma2();
        addObject(plataforma3,600,350);
        plataforma2 plataforma4 = new plataforma2();
        addObject(plataforma4,350,100);
        
    }
   
    /**
     * Actor enemigo que aparecera cuando el rey helado 
     * este en la primer plataforma
     */
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
    
    /**
     * Este método se encarga quitar la musica cuando se presiona el boton
     * detener de la interfaz de greenfoot
     */
    public void stopped()
    {
        musicaDeFondo.stop();
    }
    
     /**
     * Este método detiene el fondo musical  
     */
    public void quitaMusica()
    {
        musicaDeFondo.stop();
    }
   }
