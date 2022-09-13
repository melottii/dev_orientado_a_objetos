/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package fabrica.abstrata.botoes;

import java.awt.Image;
import java.awt.image.BufferedImage;
import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.imageio.ImageIO;
import javax.swing.ImageIcon;
import javax.swing.JButton;
/**
 *
 * @author melot
 */
public class FabricaBotaoIcone extends FabricaAbstrataBotoes{

    @Override
    public JButton criaBotaoOK() {
        JButton ok = new ButtonOK();
        ok.setText("OK");
        
        return ok;
    }

    @Override
    public JButton criaBotaoCancel() {
        JButton cancel = new ButtonCancel();
        cancel.setText("OK");
        
        return cancel;
    }
    
}
