public class Register {
    public static void main(String[] args) {
        JFrame f = new JFrame("Register");
        Container c = f.getContentPane();
        c.setLayout(new BorderLayout());
        JPanel p = new JPanel();
        p.setLayout(new GridLayout(4, 2));
        p.setBorder(BorderFactory.createTitledBorder("请输入注册信息"));

        JLabel l1 = new JLabel("姓名：", JLabel.RIGHT);
        JLabel l2 = new JLabel("性别：", JLabel.RIGHT);
        JLabel l3 = new JLabel("年龄：", JLabel.RIGHT);
        JTextField t1 = new JTextField(10);
        JTextField t2 = new JTextField(10);
        JTextField t3 = new JTextField(10);
        p.add(l1);
        p.add(t1);
        p.add(l2);
        p.add(t2);
        p.add(l3);
        p.add(t3);

        JButton b = new JButton("提交");
        p.add(new Panel());
        p.add(b);

        c.add(p);
        f.setSize(500, 300);
        f.setVisible(true);
        f.addWindowListener(new WindowAdapter() {
            public void windowClosing(WindowEvent e) {
                System.exit(0);
            }
        });
    }
}