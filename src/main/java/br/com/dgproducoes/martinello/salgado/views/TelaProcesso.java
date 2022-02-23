/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package br.com.dgproducoes.martinello.salgado.views;

import java.awt.event.WindowEvent;
import java.awt.event.WindowListener;
import javax.swing.JDialog;
import javax.swing.JOptionPane;
import static javax.swing.WindowConstants.DO_NOTHING_ON_CLOSE;
import org.jdesktop.swingx.JXBusyLabel;

/**
 *
 * @author david
 */
public class TelaProcesso extends JDialog implements WindowListener{

protected JXBusyLabel jxblStatus = new JXBusyLabel();

    protected Thread thread;

    public TelaProcesso(String texto) {
        super();
        setModal(true);
        jxblStatus.setText(texto);
        jxblStatus.setDelay(100);
        jxblStatus.setBusy(true);
        getContentPane().add(jxblStatus);
        setSize(200, 100);
        setLocationRelativeTo(null);
        setUndecorated(true);
        setDefaultCloseOperation(DO_NOTHING_ON_CLOSE);

        addWindowListener(this);
    }

    public Thread getThread() {
        return thread;
    }

    public void setThread(Thread thread) {
        this.thread = thread;
    }

    @Override
    public void windowOpened(WindowEvent e) {
    }

    @Override
    public void windowClosing(WindowEvent e) {
        if (thread != null) {
            if (JOptionPane.showConfirmDialog(rootPane, "Confirma cancelamento do processamento?", "Cancela", JOptionPane.YES_NO_OPTION) == 0) {
                thread.stop();
                this.dispose();
            }
        }
    }

    @Override
    public void windowClosed(WindowEvent e) {

    }

    @Override
    public void windowIconified(WindowEvent e) {
    }

    @Override
    public void windowDeiconified(WindowEvent e) {
    }

    @Override
    public void windowActivated(WindowEvent e) {
    }

    @Override
    public void windowDeactivated(WindowEvent e) {
    }



    
}
