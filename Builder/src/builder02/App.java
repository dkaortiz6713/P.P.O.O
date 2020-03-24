/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package builder02;

import modelo.Paciente;

/**
 *
 * @author wolley
 */
public class App {
    
    public static void main(String[] args) {
        
        Paciente paciente = PacienteBuilder.novoPacienteBuilder()
                .comNome("Yoda dos Santos")
                .comCPF("999.999.999-99")
                .nascidoEm("12/02/1900")
                .comRG("12345678-9")
                .constroi();

        System.out.println(paciente);
        
    }
    
}
