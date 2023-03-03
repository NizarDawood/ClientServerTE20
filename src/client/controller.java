package client;

import javax.swing.*;


    public class controller extends JFrame {

        Model model;
        view view;
        public controller(Model m, view v) {
            this.model = m;
            this.view = v;

            JFrame frame = new JFrame("view");
            JButton button1 = new JButton("skicka");
            JButton button2 = new JButton("->");
            frame.setContentPane(view.getPanel());
            frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
            frame.pack();
            frame.setVisible(true);
            frame.setSize(400,400);
            m.Client("10.80.45.207", 1234);
            m.connect("10.80.45.207",1234);
            m.getStreams();
            ListenerThread l = new ListenerThread(model.in, System.out);
            Thread listener = new Thread(l);
            listener.start();
            //model.runProtocol();
           // listener.join();
            model.shutDown();

//


        }

        public controller setView(view view) {
            this.view = view;
            return this;
        }

        public static void main(String[] args) {
            Model m = new Model();
            view v = new view();
            controller c = new controller(m, v);



    }
}
