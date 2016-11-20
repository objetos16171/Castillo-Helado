import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class ReyHelado2 here.
 * 
 * @author Soto Avila Carolina, Jose Emmanuel Escobar Chavez
 * @version 4 de Noviembre del 2016
 */
public class ReyHelado2 extends Actor
{
    
    private int velocidad=5;
    private int nivel;
     
    private GifImage gifReyHelado = new GifImage("gifReyNuevo.gif");
    
    private GreenfootImage reyHeladoIzquierda = new GreenfootImage("sprite2Izquierda.png");
    private GreenfootImage reyHeladoDerecha = new GreenfootImage("sprite3Derecha.png");
    private GreenfootImage reyHeladoEspacio = new GreenfootImage("spriteSalto.png");
    
     private boolean bajaConPlataforma2 = true;
    /**constructor */
    
    public ReyHelado2()
    {
        nivel = 2;
    }
    
    /**
     * Act - do whatever the ReyHelado2 wants to do. This method is called whenever
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
        ataqueSenorP();
        ataquePanDeCanela();
        ataquePaleta();
        
        //siguienteNivel();
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
        MyWorld2 mundo = (MyWorld2)getWorld();
       
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
        Actor actor = getOneObjectAtOffset (0, getImage().getHeight()/2,plataforma.class);    
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
            MyWorld2 mundo=(MyWorld2)getWorld();
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
    
    public void ataqueMentita(){
        MyWorld2 mundo = (MyWorld2)getWorld();
        Actor mentita;
        mentita = getOneObjectAtOffset(0,0,mentita.class);
        if(mentita != null)
        {
            mundo. decrementaVidas();
            mundo.removeObject(mentita);
            
        }
    }
    
    public void ataqueSenorP(){
        MyWorld2 mundo = (MyWorld2)getWorld();
        Actor senorPanquesito;
        senorPanquesito = getOneObjectAtOffset(0,0,senorPanquesito.class);
        if(senorPanquesito != null)
        {
            mundo. decrementaVidas();
            mundo.removeObject(senorPanquesito);
            
        }
    }
    
    public void ataquePanDeCanela(){
        MyWorld2 mundo = (MyWorld2)getWorld();
        Actor panDeCanela;
        panDeCanela = getOneObjectAtOffset(0,0,panDeCanela.class);
        if(panDeCanela != null)
        {
            mundo. decrementaVidas();
            mundo.removeObject(panDeCanela);
            
        }
    }
    
    public void ataquePaleta(){
        MyWorld2 mundo = (MyWorld2)getWorld();
        Actor paleta;
        paleta = getOneObjectAtOffset(0,0,paleta.class);
        if(paleta != null)
        {
            mundo. decrementaVidas();
            mundo.removeObject(paleta);
            
        }
     }
   
    /*private void siguienteNivel()
    {
        MyWorld2 mundo=(MyWorld2)getWorld();
        
        if (getY() < getWorld().getHeight()-450) {
            if (nivel == 2) {
                nivel = 3;
                Greenfoot.setWorld(new MyWorld3(this));
                
            }
            
        }
    }*/
}
