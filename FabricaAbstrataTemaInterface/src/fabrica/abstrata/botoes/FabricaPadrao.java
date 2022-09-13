/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package fabrica.abstrata.botoes;

import javax.swing.JButton;

/**
 *
 * @author melot
 */
public class FabricaPadrao extends FabricaAbstrataBotoes {

   
    @Override
    public JButton criaBotaoOK(){
        JButton ok = new JButton("OK");
        
    return ok;
    }
    @Override
    public JButton criaBotaoCancel(){
        JButton cancel = new JButton("Cancel");
        return cancel;
    }
    
    
}
