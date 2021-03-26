/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Proceso;

import Objetos.*;
import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.mockito.Mock;
import static org.mockito.Mockito.*;
import org.mockito.MockitoAnnotations;


public class JesusAlejandroMansillaVillatoro {
    @Mock
    private Asignarschedule schedule;
    private Carrera career;
    private RegistroAcademico identificador;
  
  @BeforeEach
  public void setUp(){
       MockitoAnnotations.initMocks(this);   
      
  }
   @Test
    public void  probarCodigoschedule() throws Exception{
 
       when( schedule.generarHorario(career, identificador)).thenReturn(null);
       assertEquals(null,schedule.generarHorario(career, identificador));
    }   
    
    //prueba unitaria 2
    @Mock
    private AsignarHorario schedule2;
    private Carrera career2;
    private RegistroAcademico identificador2;
  
    @BeforeEach
    public void setUp2(){
         MockitoAnnotations.initMocks(this);   

    }
    @Test
    public void  probar() throws Exception{
       when(schedule2.VerDescripcion()).thenReturn("");
       assertEquals("",schedule2.VerDescripcion());
    } 
    
    
}
   