public class Calculator extends WindowAdapter implements ActionListener {
        JFrame list;
        JTextField show;
        JButton bc, c, ce, ab, jia, jian, cheng, chu, equ, point, sqrt, ds, bfh,
                        zf;
        // ��ť �˸���գ���λ�����ڣ��ӣ������ˣ������Ⱥţ�С���㣬2�η������������ٷֺţ�������
        JButton b[] = new JButton[10];         // ��ť���飬���ּ�0��9
        double sum = 0, getValue;
        int i = 0, j = 0, p = 0, l, action;
        JDialog about;
        final int slength = 30;                         // ���ý����ʾ��Ч����
        public void disp() {
                list = new JFrame("���׼�����");
                ����                                                        //�˴�ʡ�Ե��Ƕ�JFrame���Խ������õĴ���
                list.setResizable(false);
                show = new JTextField(31);
                ����                                                        //�˴�ʡ�Ե��Ƕ�JTextField����������õĴ���
                show.setEditable(false);
                list.add(show);
                Panel dispTop = new Panel();
                list.add(dispTop);
                dispTop.setLayout(new GridLayout(1, 4, 3, 3));
                bc = new JButton("  Back    ");
                bc.setForeground(Color.BLUE);
                dispTop.add(bc);
                ����                        //�˴�ʡ����Ӽ��������е����ּ���Ť�Լ�Ϊ����Ť��Ӽ����¼��Ĵ���
        }
        public void actionPerformed(ActionEvent e) {
                getValue = Double.valueOf(show.getText()).doubleValue();
                if (e.getSource() == jia) {         // �����㣬������
                        if (j == 0) {
                                sum = getValue;
                        } else if (action == 1) {
                                sum += getValue;
                        }
                        setSum();
                        j++;
                        p = 0;
                        i = 0;
                        action = 1;
                } else if (e.getSource() == jian) {                 // �����㣬������
                        if (j == 0) {
                                sum = getValue;
                        } else if (action == 2) {
                                sum -= getValue;
                        }
                        setSum();
                        j++;
                        p = 0;
                        i = 0;
                        action = 2;
                } else if (e.getSource() == cheng) {                 // �����㣬������
                        if (j == 0) {
                                sum = getValue;
                        } else if (action == 3) {
                                sum *= getValue;
                        }
                        setSum();
                        j++;
                        p = 0;
                        i = 0;
                        action = 3;
                } else if (e.getSource() == chu) {                 // �����㣬������
                        if (j == 0)
                                sum = getValue;
                        else if (action == 4) {
                                sum /= getValue;
                        }
                        setSum();
                        j++;
                        p = 0;
                        i = 0;
                        action = 4;
                } else if (e.getSource() == equ) {                 // �Ⱥ�,�������һ��������
                        switch (action) {
                        case 1:
                                show.setText(String.valueOf(sum += getValue));
                                break;
                        case 2:
                                show.setText(String.valueOf(sum -= getValue));
                                break;
                        case 3:
                                show.setText(String.valueOf(sum *= getValue));
                                break;
                        case 4:
                                show.setText(String.valueOf(sum /= getValue));
                                break;
                        }
                        setSum();
                        i = 0;
                        j = 0;
                        action = 0;
                } else if (e.getSource() == point) {                 // С����,ֻ�ܰ�һ��С����
                        if (p == 0)
                                show.setText(show.getText() + e.getActionCommand());
                        p = 1;
                } else if (e.getSource() == c || e.getSource() == ce) {         // ����븴λ
                        i = 0;
                        j = 0;
                        p = 0;
                        sum = 0;
                        action = 0;
                        show.setText("0");
                ... ...                                                                         //�˴�ʡ��һ���ּ������
                for (l = 0; l < 10; l++) {                                        // 0~9���ּ�����
                        if (e.getSource() == b[l]) {
                                if (i == 0)
                                        show.setText("");
                                String s = show.getText();
                                if (s.length() < slength)
                                        show.setText(show.getText() + e.getActionCommand());
                                if (e.getSource() == b[0] && getValue == 0 && p == 0)
                                        show.setText("0");
                                if (e.getSource() != b[0] && getValue == 0 && p == 0)
                                        show.setText(e.getActionCommand());
                                i++;                                                                // i����������ּ�������״̬
                        }
                }
        }
        public void setSum() {                                                 // �Ѽ�������ʾ����
                show.setText(String.valueOf(sum));
                String s = show.getText();
                char a = s.charAt((s.length() - 1));
                char b = s.charAt((s.length() - 2));
                if (a == '0' && b == '.') {                         // ���������,��ȥ�������С�����0
                        show.setText(String.valueOf(Math.round(sum)));
                }
        }
        public void windowClosing(WindowEvent e) {        //Ϊ�����ϵİ�Ť����¼�
                if (e.getSource() == about)
                        about.setVisible(false);
                else if (e.getSource() == list)
                        System.exit(0);
        }