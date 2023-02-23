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


            model.connect("10.80.45.207",1234);
            model.PrintWriter(socket.getOutputStream(),



        }


        public controller setView(view view) {
            this.view = view;
            return this;
        }
 // button1 ska skicka text från textfild till textarea
        // button2 ska skicka ip adressen och porten till clienten

        public static void main(String[] args) {
            Model m = new Model();
            view v = new view();
            controller c = new controller(m, v);


    }
}
