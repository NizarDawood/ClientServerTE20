import javax.swing.*;


    public class controller extends JFrame {

        Model model;
        view view;
        public controller(Model m, view v) {
            this.model = m;
            this.view = v;

            JFrame frame = new JFrame("view");
            frame.setContentPane(view.getPanel());
            frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
            frame.pack();
            frame.setVisible(true);


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
