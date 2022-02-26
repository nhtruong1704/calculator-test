import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Calculator extends JFrame {
    private JPanel myCalculator;
    private JTextField textDisplay;
    private JButton btnSeven;
    private JButton btnFraction;
    private JButton btnEight;
    private JButton btnFour;
    private JButton btnOne;
    private JButton btnNine;
    private JButton btnFive;
    private JButton btnTwo;
    private JButton btnClear;
    private JButton btnSix;
    private JButton btnThree;
    private JButton btnMultiply;
    private JButton btnMinus;
    private JButton btnZero;
    private JButton btnPoint;
    private JButton btnOpposite;
    private JButton btnPlus;
    private JButton btnEquals;
    private JButton btnDivide;
    private JButton btnExponentiation;
    private char mathOperator;

    private double total1 = 0.0;
    private double total2 = 0.0;

    boolean isEqualsPress = false;

    private void getOperator(String btnText){
        mathOperator = btnText.charAt(0);
        total1=total1 + Double.parseDouble(textDisplay.getText());
        textDisplay.setText("");
    }
    public Calculator(String title){
        super(title);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setContentPane(myCalculator);
        this.pack();
        btnZero.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                if(isEqualsPress){
                    isEqualsPress = false;
                    textDisplay.setText("");
                }
                String btnZeroText = textDisplay.getText() + btnZero.getText();
                textDisplay.setText(btnZeroText);
            }
        });

        btnOne.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                if(isEqualsPress){
                    isEqualsPress = false;
                    textDisplay.setText("");
                }
                String btnOneText = textDisplay.getText() + btnOne.getText();
                textDisplay.setText(btnOneText);

            }
        });

        btnTwo.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                if(isEqualsPress){
                    isEqualsPress = false;
                    textDisplay.setText("");
                }
                String btnTwoText = textDisplay.getText() + btnTwo.getText();
                textDisplay.setText(btnTwoText);

            }
        });

        btnThree.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                if(isEqualsPress){
                    isEqualsPress = false;
                    textDisplay.setText("");
                }
                String btnThreeText = textDisplay.getText() + btnThree.getText();
                textDisplay.setText(btnThreeText);

            }
        });

        btnFour.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                if(isEqualsPress){
                    isEqualsPress = false;
                    textDisplay.setText("");
                }
                String btnFourText = textDisplay.getText() + btnFour.getText();
                textDisplay.setText(btnFourText);

            }
        });

        btnFive.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                if(isEqualsPress){
                    isEqualsPress = false;
                    textDisplay.setText("");
                }
                String btnFiveText = textDisplay.getText() + btnFive.getText();
                textDisplay.setText(btnFiveText);

            }
        });

        btnSix.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                if(isEqualsPress){
                    isEqualsPress = false;
                    textDisplay.setText("");
                }
                String btnSixText = textDisplay.getText() + btnSix.getText();
                textDisplay.setText(btnSixText);

            }
        });

        btnSeven.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                if(isEqualsPress){
                    isEqualsPress = false;
                    textDisplay.setText("");
                }
                String btnSevenText = textDisplay.getText() + btnSeven.getText();
                textDisplay.setText(btnSevenText);

            }
        });

        btnEight.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                if(isEqualsPress){
                    isEqualsPress = false;
                    textDisplay.setText("");
                }
                String btnEightText = textDisplay.getText() + btnEight.getText();
                textDisplay.setText(btnEightText);

            }
        });

        btnNine.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                if(isEqualsPress){
                    isEqualsPress = false;
                    textDisplay.setText("");
                }
                String btnNineText = textDisplay.getText() + btnNine.getText();
                textDisplay.setText(btnNineText);

            }
        });

        //button clear
        btnClear.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                total2=0;
                textDisplay.setText("");
                isEqualsPress=false;
            }
        });

        //Button point
        btnPoint.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                    //this will make it neater - "0." instead of "."
                    if(textDisplay.getText().equals("")){
                        textDisplay.setText("0.");
                    }
                    //This will help to avoid a bug, cause ".." as well as "1.." or ".8." is not acceptable
                    else if(textDisplay.getText().contains(".")){
                        btnPoint.setEnabled(false);
                    }
                    else {
                        String btnPointText = textDisplay.getText()+btnPoint.getText();
                        textDisplay.setText(btnPointText);
                    }
                    btnPoint.setEnabled(true);
            }
        });
        //Button plus
        btnPlus.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                if(textDisplay.getText().equals("")){
                    return;
                }
                String buttonText = btnPlus.getText();
                getOperator(buttonText);
            }
        });

        //Button minus
        btnMinus.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                if(textDisplay.getText().equals("")){
                    return;
                }
                String buttonText =btnMinus.getText();
                getOperator(buttonText);
            }
        });

        //Button divide
        btnDivide.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                if(textDisplay.getText().equals("")){
                    return;
                }
                String buttonText =btnDivide.getText();
                getOperator(buttonText);
            }
        });

        //Button multiply
        btnMultiply.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                if(textDisplay.getText().equals("")){
                    return;
                }
                String buttonText=btnMultiply.getText();
                getOperator(buttonText);
            }
        });

        //button equals
        btnEquals.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                if(textDisplay.getText().equals("")){
                   return;
               }
                switch (mathOperator){
                    case '+':
                        total2 = total1 + Double.parseDouble(textDisplay.getText());
                        break;
                    case '-':
                        total2 = total1 - Double.parseDouble(textDisplay.getText());
                        break;
                    case '*':
                        total2 = total1 * Double.parseDouble(textDisplay.getText());
                        break;
                    case '/':
                        total2 = total1 / Double.parseDouble(textDisplay.getText());
                        break;

                }
                textDisplay.setText(Double.toString(total2));
                total1=0;
                isEqualsPress = true;
            }
        });


        btnOpposite.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                if(textDisplay.getText().equals("")){
                    return;
                }
                double value = Double.parseDouble(textDisplay.getText());
                value = - value;
                textDisplay.setText(""+value);
            }
        });
        btnExponentiation.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                if(textDisplay.getText().equals("")){
                    return;
                }
                String cmd = e.getActionCommand();
                double value = Double.parseDouble(textDisplay.getText());
                if(cmd.equals("x^2")){
                    value = value*value;
                }
                textDisplay.setText(""+ value);
            }
        });
        btnFraction.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                if(textDisplay.getText().equals("")){
                    return;
                }
                String cmd = e.getActionCommand();
                double value = Double.parseDouble(textDisplay.getText());
                if(cmd.equals("1/x")){
                    value = 1/value;
                }
                textDisplay.setText(""+ value);
            }
        });
    }
    public static void main(String[] args) {
        JFrame frame = new Calculator("Динь Нят Чыонг Calculator");
        frame.setVisible(true);
    }

}
