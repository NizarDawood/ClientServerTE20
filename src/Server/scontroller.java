package Server;

import com.sun.corba.se.pept.transport.ListenerThread;
import com.sun.corba.se.spi.activation.Server;

import javax.swing.*;

public class scontroller extends JFrame {

        Smodel Smodel;
        Sview Sview;

        public scontroller(Smodel m, Sview v) {
            this.Smodel = m;
            this.Sview = v;

            JFrame frame = new JFrame("Sview");
            JButton button1 = new JButton("skicka");
            JButton button2 = new JButton("->");
            frame.setContentPane(Sview.getPanel());
            frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
            frame.pack();
            frame.setVisible(true);
            frame.setSize(400,400);
            //Smodel = new Smodel(1234);
            m.acceptClient();
            m.getStreams();
            SlistenerThread l = new SlistenerThread(Smodel.in, System.out);
            Thread listener = new Thread((Runnable) l);
            listener.start();
            //listener.join();
            Smodel.shutdown();
            }




        public scontroller setView(Sview Sview) {
            this.Sview = Sview;
            return this;
        }

        public static void main(String[] args) {
            Smodel m = new Smodel(1234);
            Sview v = new Sview();
            scontroller c = new scontroller(m, v);



        }
    }



