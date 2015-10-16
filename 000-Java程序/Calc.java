public class Calculator extends WindowAdapter implements ActionListener {
        JFrame list;
        JTextField show;
        JButton bc, c, ce, ab, jia, jian, cheng, chu, equ, point, sqrt, ds, bfh,
                        zf;
        // 按钮 退格，清空，复位，关于，加，减，乘，除，等号，小数点，2次方根，倒数，百分号，正负号
        JButton b[] = new JButton[10];         // 按钮数组，数字键0～9
        double sum = 0, getValue;
        int i = 0, j = 0, p = 0, l, action;
        JDialog about;
        final int slength = 30;                         // 设置结果显示有效长度
        public void disp() {
                list = new JFrame("简易计算器");
                ……                                                        //此处省略的是对JFrame属性进行配置的代码
                list.setResizable(false);
                show = new JTextField(31);
                ……                                                        //此处省略的是对JTextField组件进行设置的代码
                show.setEditable(false);
                list.add(show);
                Panel dispTop = new Panel();
                list.add(dispTop);
                dispTop.setLayout(new GridLayout(1, 4, 3, 3));
                bc = new JButton("  Back    ");
                bc.setForeground(Color.BLUE);
                dispTop.add(bc);
                ……                        //此处省略添加计算器所有的数字键按扭以及为各按扭添加监听事件的代码
        }
        public void actionPerformed(ActionEvent e) {
                getValue = Double.valueOf(show.getText()).doubleValue();
                if (e.getSource() == jia) {         // 加运算，可连加
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
                } else if (e.getSource() == jian) {                 // 减运算，可连减
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
                } else if (e.getSource() == cheng) {                 // 乘运算，可连乘
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
                } else if (e.getSource() == chu) {                 // 除运算，可连除
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
                } else if (e.getSource() == equ) {                 // 等号,运算最后一个操作数
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
                } else if (e.getSource() == point) {                 // 小数点,只能按一个小数点
                        if (p == 0)
                                show.setText(show.getText() + e.getActionCommand());
                        p = 1;
                } else if (e.getSource() == c || e.getSource() == ce) {         // 清空与复位
                        i = 0;
                        j = 0;
                        p = 0;
                        sum = 0;
                        action = 0;
                        show.setText("0");
                ... ...                                                                         //此处省略一部分计算代码
                for (l = 0; l < 10; l++) {                                        // 0~9数字键触发
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
                                i++;                                                                // i用来标记数字键触发的状态
                        }
                }
        }
        public void setSum() {                                                 // 把计算结果显示出来
                show.setText(String.valueOf(sum));
                String s = show.getText();
                char a = s.charAt((s.length() - 1));
                char b = s.charAt((s.length() - 2));
                if (a == '0' && b == '.') {                         // 如果是整数,则去掉后面的小数点和0
                        show.setText(String.valueOf(Math.round(sum)));
                }
        }
        public void windowClosing(WindowEvent e) {        //为窗口上的按扭添加事件
                if (e.getSource() == about)
                        about.setVisible(false);
                else if (e.getSource() == list)
                        System.exit(0);
        }