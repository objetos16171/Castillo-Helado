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
    
    /**
     * Constructor for objects of class MyWorld.
     * 
     */
    public MyWorld()
    {    
        // Create a new world with 600x400 cells with a cell size of 1x1 pixels.
        super(700, 500, 1); 
        contadorPinguinos = new Counter("pingüinos: ");
        addObject(contadorPinguinos,631,27);
        prepare();
    }
        
    /** Hace una lluvia de pinguino añadiento un objeto de tipo pinguino
    * usando como ubicacion en su coordenada x el metodo getRandomNumber
    * y estableciendo un rango para generarlos a partir del ancho del mundo
    * y bajando a partir  del inicio del alto del mundo 
    */
    public void LluviaPinguino()
    {
        int x;
        pinguino = new Pinguino();
        if (Greenfoot.getRandomNumber(getWidth()) < 10) 
        {
            
            addObject(pinguino,Greenfoot.getRandomNumber(getWidth()),0);        
        }
    }
    
    public void act()
    {
        LluviaPinguino();           
    }
    
    public void incrementaPinguinos()
    {
        contadorPinguinos.add(1);
    }
    
    /**
     * Prepare the world for the start of the program.
     * That is: create the initial objects and add them to the world.
     */
    private void prepare()
    {
        ReyHelado reyhelado = new ReyHelado();
        addObject(reyhelado,352,460);
        Marceline marceline = new Marceline();
        addObject(marceline,655,231);
        plataforma plataforma = new plataforma();
        addObject(plataforma,120,340);
        Arcoiris arcoiris = new Arcoiris();
        addObject(arcoiris,191,99);
        arcoiris.setLocation(180,100);
        Arcoiris arcoiris2 = new Arcoiris();
        addObject(arcoiris2,190,77);
        arcoiris2.setLocation(181,80);
        arcoiris2.setLocation(183,92);
        removeObject(arcoiris2);
        arcoiris.setLocation(184,102);
        
    }
}
