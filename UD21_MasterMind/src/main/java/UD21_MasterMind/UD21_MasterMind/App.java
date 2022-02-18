package UD21_MasterMind.UD21_MasterMind;

import java.awt.EventQueue;

import InterfazGrafica.InterfazDificultad;
import InterfazGrafica.Juego;
import InterfazGrafica.MasterMind;

public class App 
{
    public static void main( String[] args )
    {

    	//Ejecutamos la interfaz de dificultad
    	InterfazDificultad iD = new InterfazDificultad();
    	
    	int dificultad = iD.getDificultad();
    	
    }
}
