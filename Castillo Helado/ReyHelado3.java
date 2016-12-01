import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class ReyHelado3 here.
 * 
 * @author Soto Avila Carolina, Jose Emmanuel Escobar Chavez
 * @version 4 de Noviembre del 2016
 */
public class ReyHelado3 extends Actor
{
    
    private int velocidad=5;
    private int nivel;
     
    private GifImage gifReyHelado = new GifImage("gifReyNuevo.gif");
    
    private GreenfootImage reyHeladoIzquierda = new GreenfootImage("sprite2Izquierda.png");
    private GreenfootImage reyHeladoDerecha = new GreenfootImage("sprite3Derecha.png");
    private GreenfootImage reyHeladoEspacio = new GreenfootImage("spriteSalto.png");
    
     private boolean bajaConPlataforma2 = true;
    /**constructor */
    /**
      * metodo que pasa al rey helado al siguiente mundo
      */
    public ReyHelado3()
    {
        nivel = 3;
    }
    
    /**
     * Act - do whatever the ReyHelado3 wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act() 
    {
   
        
        setImage(gifReyHelado.getCurrentImage());
        controlIzqDer();
        bajaConPlataforma();
        saltoConGravedad();
        agarraPinguino();
        ataqueMentita();
        ataquePaleta();
        golpeAlReyHelado();
        tocaDisparoTronquitos();
        Ganaste();
        agarraPrincesa();
        
       
    }    
    
    /**
     * Este metodo se encarga de subir al rey helado en la plataformas que se elevan y bajan mediante una variable boleeana y al tocar la plataforma  
     */
    public void bajaConPlataforma(){    
        if (isTouching(plataforma2.class)) 
        {
            if(this.getY() >= getWorld().getHeight()) {
                bajaConPlataforma2 = true;
            }
            else if(this.getY() <= 0)
            {
                bajaConPlataforma2 = false;
            }
            if(bajaConPlataforma2) 
            {
                setLocation( this.getX() , this.getY()-10 );
            }
            else 
            {
                setLocation ( this.getX() , this.getY()+10 ); 
            }
        }
    }
    
    /**
     * Este método nos ayudara para poder 
     * agarrar pinguinos que van cayendo del cielo 
     * usa el metodo getOneObjectAtOffset usando como de referencia la
     * posicion de este mismo objeto accediendo al mundo para eliminarlo.
     */
    public void agarraPinguino()
    {
        MyWorld3 mundo = (MyWorld3)getWorld();
       
        Actor Pinguino;
        Pinguino = getOneObjectAtOffset(0,0,Pinguino.class);
        if(Pinguino != null)
        {
            mundo.incrementaPinguinos();
            mundo.removeObject(Pinguino);
            if(Greenfoot.getRandomNumber(5)<2){
                Greenfoot.playSound("quien te dijo que puedes Volar.wav");
            }
            else if(Greenfoot.getRandomNumber(8)<2)
            {
                        Greenfoot.playSound("que.wav"); 
            
            }
            
        }
        
    }
    
    
    /**
     *Se utiliza para mover de izquierda y derecha al Rey Helado 
     */
     public void controlIzqDer()
    {
        if (Greenfoot.isKeyDown("right"))
        {
            setLocation(getX()+5, getY());
            setImage(reyHeladoDerecha);
        }
        if (Greenfoot.isKeyDown("left"))
        {
            setLocation(getX()-5, getY());
            setImage(reyHeladoIzquierda);
        }
        
          
    }
    
    /**
     * Se encarga de simular un salto mediante nuestro mundo utilizando
     * el metodo setLocation y utilizando una variable de instancia para 
     * desplazarse decrementando el valor de Y del objeto rey Helado
     */
    public void salta()
    {
        setLocation(getX(),getY()-velocidad);
    }
    
    /**
     * Devuelve las coordenadas del objeto tipo plataforma utilizando como
     * valor valor central en y y todo el ancho de x estor siempre y cuando
     * no sea 
     */ 
    public boolean enPlataforma()
    {
        Actor actor = getOneObjectAtOffset (0, getImage().getHeight()/2,plataforma2.class);    
        return actor != null;
        
    } 
    
    /**
     * Si el metodo enPlataforma no nos devuelve nada entonces el reyHelado caera hacia
     * la parte inferior de nuestro mundo 
     */    
    public void fall()
    {
        if (!enPlataforma())
        {
            MyWorld3 mundo=(MyWorld3)getWorld();
            if(getY()<=mundo.getHeight()-getImage().getWidth()/2)
            setLocation(getX(), getY()+ velocidad);
        }
        
    }
    
    /**
     * Este metdodo devuelve el metodo gravedad si no se ha presionado
     * la tecla espacio por el contrario el rey helado saltara y
     * se establecera su imagen al momento de presionar la imagen
     */
    public boolean saltoConGravedad(){
        boolean TeclaPresionada = false;
        
        if (Greenfoot.isKeyDown("space")) 
        {
            if (!TeclaPresionada) 
            {
              TeclaPresionada = true;
              salta();
              setImage(reyHeladoEspacio);
            }
        }
        else{
        TeclaPresionada = false;
        fall();
       
        }
        return TeclaPresionada ;
    }
    
    /**
     * el rey helado pierde vidas al tocar al enemigo
     */
    public void ataqueMentita(){
        MyWorld3 mundo = (MyWorld3)getWorld();
        Actor mentita;
        mentita = getOneObjectAtOffset(0,0,mentita.class);
        if(mentita != null)
        {
            mundo. decrementaVidas();
            mundo.removeObject(mentita);
            
        }
    }
    
   /**
     * el rey helado pierde vidas al tocar al enemigo
     */
    public void ataquePaleta(){
        MyWorld3 mundo = (MyWorld3)getWorld();
        Actor paleta;
        paleta = getOneObjectAtOffset(0,0,paleta.class);
        if(paleta != null)
        {
            mundo. decrementaVidas();
            mundo.removeObject(paleta);
            
        }
     }
   
     /**
     * el rey helado pierde vidas al tocar al enemigo
     */
     public void golpeAlReyHelado(){
        MyWorld3 mundo=(MyWorld3)getWorld();
        if(isTouching(Arcoiris.class))
        {
            mundo.decrementaVidas();
            this.setLocation( this.getX()+200 , this.getY() );
            Greenfoot.playSound("si yo no hice nada.wav");
        }
        
        if(isTouching(Finn.class))
        {
            mundo.decrementaVidas();
            this.setLocation( this.getX() , getWorld().getHeight()/2 );
        }
    }
    
   /**
     * ataque del enemigo fin que quita vidas al rey helado
     */
    public void tocaDisparoTronquitos()
    {
        if(isTouching(tronquito.class))
        {
            World mundo = getWorld();
            setLocation( this.getX()-50  , this.getY()-50 );
        }
    }
    
    /**
     * el jugador gana
     * 
     */
     public void Ganaste()
    {
        MyWorld3 mundo=(MyWorld3)getWorld();
        if (getY() < getWorld().getHeight()-490) {
                
                Greenfoot.setWorld(new Ganador()); 
                                                
                Greenfoot.playSound("que me da que me da.wav");      
            }
            
    }
    
    /**
     * Cuando el rey helado coincide con las coordenadas de un objeto tipo princesa
     * es eliminado del mundo y se incrementa el contador de princesas
     */
    public void agarraPrincesa()
    {   
        
        MyWorld3 mundo =(MyWorld3)getWorld();
        Actor Princesa;
        Princesa = getOneObjectAtOffset(0,0,Princesa.class);
        
        if(Princesa!=null)
        {
           mundo.removeObject(Princesa);
           mundo.incrementaPrincesas();
           Greenfoot.playSound("amoAlasprincesas.wav");
           ((MyWorld3)mundo).incrementaPrincesas();
        }
    }
}
