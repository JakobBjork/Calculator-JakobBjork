package calculator_jakobbjork.calculator_jakobbjork;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.script.ScriptEngine;
import javax.script.ScriptEngineManager;
import javax.script.ScriptException;
import javax.swing.*;
import java.awt.GridBagLayout;
import java.awt.GridBagConstraints;
import java.awt.Insets;
import java.awt.Color;
import java.awt.Font;

public class BasicCalculator implements ActionListener, CalculatorBasicOperationsInterface{
	JFrame basicCalc;
	private JButton button2;
	private JButton button3;
	private JButton button1;
	private JButton button4;
	private JButton button5;
	private JButton button6;
	private JButton button7;
	private JButton button8;
	private JButton button9;
	private JButton button0;
	private JTextField textField;
	private JButton buttonClear;
	private JButton buttonAdd;
	private JButton buttonSub;
	private JButton buttonMult;
	private JButton buttonDiv;
	private JButton buttonEqual;
	private JButton buttonLeftPar;
	private JButton buttonRightPar;
	private JButton buttonDecimal;
	private JButton buttonAdv;
	private JButton buttonSquared;
	double calcResult;
	
	
	public BasicCalculator(){ //The frame and layout for the calculator
		basicCalc = new JFrame();
		basicCalc.setTitle("Basic Calculator");
		basicCalc.setSize(600, 400);
		GridBagLayout gridBagLayout = new GridBagLayout();
		gridBagLayout.columnWidths = new int[]{116, 116, 116, 116, 116, 0};
		gridBagLayout.rowHeights = new int[]{70, 70, 70, 70, 70, 0};
		gridBagLayout.columnWeights = new double[]{0.0, 0.0, 0.0, 0.0, 0.0, Double.MIN_VALUE};
		gridBagLayout.rowWeights = new double[]{0.0, 0.0, 0.0, 0.0, 0.0, Double.MIN_VALUE};
		basicCalc.getContentPane().setLayout(gridBagLayout);
		
		buttonAdv = new JButton("Adv");
		GridBagConstraints gbc_buttonAdv = new GridBagConstraints();
		gbc_buttonAdv.insets = new Insets(0, 0, 5, 5);
		gbc_buttonAdv.fill = GridBagConstraints.BOTH;
		gbc_buttonAdv.gridx = 0;
		gbc_buttonAdv.gridy = 0;
		basicCalc.getContentPane().add(buttonAdv, gbc_buttonAdv);
		buttonAdv.addActionListener(this);
		
		textField = new JTextField();
		textField.setFont(new Font("Tahoma", Font.PLAIN, 22));
		GridBagConstraints gbc_textField = new GridBagConstraints();
		gbc_textField.gridwidth = 4;
		gbc_textField.fill = GridBagConstraints.BOTH;
		gbc_textField.insets = new Insets(0, 0, 5, 0);
		gbc_textField.gridx = 1;
		gbc_textField.gridy = 0;
		basicCalc.getContentPane().add(textField, gbc_textField);
		textField.setColumns(30);
		
		button1 = new JButton("1");
		button1.setFont(new Font("Tahoma", Font.PLAIN, 18));
		button1.setForeground(Color.BLACK);
		GridBagConstraints gbc_button1 = new GridBagConstraints();
		gbc_button1.fill = GridBagConstraints.BOTH;
		gbc_button1.insets = new Insets(0, 0, 5, 5);
		gbc_button1.gridx = 0;
		gbc_button1.gridy = 1;
		basicCalc.getContentPane().add(button1, gbc_button1);
		button1.addActionListener(this);
		
		button2 = new JButton("2");
		button2.setFont(new Font("Tahoma", Font.PLAIN, 18));
		GridBagConstraints gbc_button2 = new GridBagConstraints();
		gbc_button2.fill = GridBagConstraints.BOTH;
		gbc_button2.insets = new Insets(0, 0, 5, 5);
		gbc_button2.gridx = 1;
		gbc_button2.gridy = 1;
		basicCalc.getContentPane().add(button2, gbc_button2);
		button2.addActionListener(this);
		
		button3 = new JButton("3");
		button3.setFont(new Font("Tahoma", Font.PLAIN, 18));
		GridBagConstraints gbc_button3 = new GridBagConstraints();
		gbc_button3.fill = GridBagConstraints.BOTH;
		gbc_button3.insets = new Insets(0, 0, 5, 5);
		gbc_button3.gridx = 2;
		gbc_button3.gridy = 1;
		basicCalc.getContentPane().add(button3, gbc_button3);
		button3.addActionListener(this);
		
		buttonAdd = new JButton("+");
		buttonAdd.setFont(new Font("Tahoma", Font.PLAIN, 16));
		GridBagConstraints gbc_buttonAdd = new GridBagConstraints();
		gbc_buttonAdd.fill = GridBagConstraints.BOTH;
		gbc_buttonAdd.insets = new Insets(0, 0, 5, 5);
		gbc_buttonAdd.gridx = 3;
		gbc_buttonAdd.gridy = 1;
		basicCalc.getContentPane().add(buttonAdd, gbc_buttonAdd);
		buttonAdd.addActionListener(this);
		
		buttonClear = new JButton("C");
		GridBagConstraints gbc_buttonClear = new GridBagConstraints();
		gbc_buttonClear.fill = GridBagConstraints.BOTH;
		gbc_buttonClear.insets = new Insets(0, 0, 5, 0);
		gbc_buttonClear.gridx = 4;
		gbc_buttonClear.gridy = 1;
		basicCalc.getContentPane().add(buttonClear, gbc_buttonClear);
		buttonClear.addActionListener(this);
		
		button4 = new JButton("4");
		button4.setFont(new Font("Tahoma", Font.PLAIN, 18));
		GridBagConstraints gbc_button4 = new GridBagConstraints();
		gbc_button4.fill = GridBagConstraints.BOTH;
		gbc_button4.insets = new Insets(0, 0, 5, 5);
		gbc_button4.gridx = 0;
		gbc_button4.gridy = 2;
		basicCalc.getContentPane().add(button4, gbc_button4);
		button4.addActionListener(this);
		
		button5 = new JButton("5");
		button5.setFont(new Font("Tahoma", Font.PLAIN, 18));
		GridBagConstraints gbc_button5 = new GridBagConstraints();
		gbc_button5.fill = GridBagConstraints.BOTH;
		gbc_button5.insets = new Insets(0, 0, 5, 5);
		gbc_button5.gridx = 1;
		gbc_button5.gridy = 2;
		basicCalc.getContentPane().add(button5, gbc_button5);
		button5.addActionListener(this);
		
		button6 = new JButton("6");
		button6.setFont(new Font("Tahoma", Font.PLAIN, 18));
		GridBagConstraints gbc_button6 = new GridBagConstraints();
		gbc_button6.fill = GridBagConstraints.BOTH;
		gbc_button6.insets = new Insets(0, 0, 5, 5);
		gbc_button6.gridx = 2;
		gbc_button6.gridy = 2;
		basicCalc.getContentPane().add(button6, gbc_button6);
		button6.addActionListener(this);
		
		buttonSub = new JButton("-");
		buttonSub.setFont(new Font("Tahoma", Font.PLAIN, 16));
		GridBagConstraints gbc_buttonSub = new GridBagConstraints();
		gbc_buttonSub.fill = GridBagConstraints.BOTH;
		gbc_buttonSub.insets = new Insets(0, 0, 5, 5);
		gbc_buttonSub.gridx = 3;
		gbc_buttonSub.gridy = 2;
		basicCalc.getContentPane().add(buttonSub, gbc_buttonSub);
		buttonSub.addActionListener(this);
		
		buttonLeftPar = new JButton("(");
		GridBagConstraints gbc_buttonLeftPar = new GridBagConstraints();
		gbc_buttonLeftPar.insets = new Insets(0, 0, 5, 0);
		gbc_buttonLeftPar.fill = GridBagConstraints.BOTH;
		gbc_buttonLeftPar.gridx = 4;
		gbc_buttonLeftPar.gridy = 2;
		basicCalc.getContentPane().add(buttonLeftPar, gbc_buttonLeftPar);
		buttonLeftPar.addActionListener(this);
		
		button7 = new JButton("7");
		button7.setFont(new Font("Tahoma", Font.PLAIN, 18));
		GridBagConstraints gbc_button7 = new GridBagConstraints();
		gbc_button7.fill = GridBagConstraints.BOTH;
		gbc_button7.insets = new Insets(0, 0, 5, 5);
		gbc_button7.gridx = 0;
		gbc_button7.gridy = 3;
		basicCalc.getContentPane().add(button7, gbc_button7);
		button7.addActionListener(this);
		
		button8 = new JButton("8");
		button8.setFont(new Font("Tahoma", Font.PLAIN, 18));
		GridBagConstraints gbc_button8 = new GridBagConstraints();
		gbc_button8.fill = GridBagConstraints.BOTH;
		gbc_button8.insets = new Insets(0, 0, 5, 5);
		gbc_button8.gridx = 1;
		gbc_button8.gridy = 3;
		basicCalc.getContentPane().add(button8, gbc_button8);
		button8.addActionListener(this);
		
		button9 = new JButton("9");
		button9.setFont(new Font("Tahoma", Font.PLAIN, 18));
		GridBagConstraints gbc_button9 = new GridBagConstraints();
		gbc_button9.fill = GridBagConstraints.BOTH;
		gbc_button9.insets = new Insets(0, 0, 5, 5);
		gbc_button9.gridx = 2;
		gbc_button9.gridy = 3;
		basicCalc.getContentPane().add(button9, gbc_button9);
		button9.addActionListener(this);
		
		buttonMult = new JButton("*");
		buttonMult.setFont(new Font("Tahoma", Font.PLAIN, 16));
		GridBagConstraints gbc_buttonMult = new GridBagConstraints();
		gbc_buttonMult.fill = GridBagConstraints.BOTH;
		gbc_buttonMult.insets = new Insets(0, 0, 5, 5);
		gbc_buttonMult.gridx = 3;
		gbc_buttonMult.gridy = 3;
		basicCalc.getContentPane().add(buttonMult, gbc_buttonMult);
		buttonMult.addActionListener(this);
		
		buttonRightPar = new JButton(")");
		GridBagConstraints gbc_buttonRightPar = new GridBagConstraints();
		gbc_buttonRightPar.insets = new Insets(0, 0, 5, 0);
		gbc_buttonRightPar.fill = GridBagConstraints.BOTH;
		gbc_buttonRightPar.gridx = 4;
		gbc_buttonRightPar.gridy = 3;
		basicCalc.getContentPane().add(buttonRightPar, gbc_buttonRightPar);
		buttonRightPar.addActionListener(this);
		
		button0 = new JButton("0");
		button0.setFont(new Font("Tahoma", Font.PLAIN, 18));
		GridBagConstraints gbc_button0 = new GridBagConstraints();
		gbc_button0.fill = GridBagConstraints.BOTH;
		gbc_button0.insets = new Insets(0, 0, 0, 5);
		gbc_button0.gridx = 0;
		gbc_button0.gridy = 4;
		basicCalc.getContentPane().add(button0, gbc_button0);
		button0.addActionListener(this);
		
		buttonDecimal = new JButton(".");
		buttonDecimal.setFont(new Font("Tahoma", Font.PLAIN, 18));
		GridBagConstraints gbc_buttonDecimal = new GridBagConstraints();
		gbc_buttonDecimal.fill = GridBagConstraints.BOTH;
		gbc_buttonDecimal.insets = new Insets(0, 0, 0, 5);
		gbc_buttonDecimal.gridx = 1;
		gbc_buttonDecimal.gridy = 4;
		basicCalc.getContentPane().add(buttonDecimal, gbc_buttonDecimal);
		buttonDecimal.addActionListener(this);
		
		buttonEqual = new JButton("=");
		buttonEqual.setFont(new Font("Tahoma", Font.PLAIN, 16));
		GridBagConstraints gbc_buttonEqual = new GridBagConstraints();
		gbc_buttonEqual.fill = GridBagConstraints.BOTH;
		gbc_buttonEqual.insets = new Insets(0, 0, 0, 5);
		gbc_buttonEqual.gridx = 2;
		gbc_buttonEqual.gridy = 4;
		basicCalc.getContentPane().add(buttonEqual, gbc_buttonEqual);
		buttonEqual.addActionListener(this);
		
		buttonDiv = new JButton("/");
		buttonDiv.setFont(new Font("Tahoma", Font.PLAIN, 16));
		GridBagConstraints gbc_buttonDiv = new GridBagConstraints();
		gbc_buttonDiv.fill = GridBagConstraints.BOTH;
		gbc_buttonDiv.insets = new Insets(0, 0, 0, 5);
		gbc_buttonDiv.gridx = 3;
		gbc_buttonDiv.gridy = 4;
		basicCalc.getContentPane().add(buttonDiv, gbc_buttonDiv);
		buttonDiv.addActionListener(this);
		
		buttonSquared = new JButton("X^2");
		GridBagConstraints gbc_buttonSquared = new GridBagConstraints();
		gbc_buttonSquared.fill = GridBagConstraints.BOTH;
		gbc_buttonSquared.gridx = 4;
		gbc_buttonSquared.gridy = 4;
		basicCalc.getContentPane().add(buttonSquared, gbc_buttonSquared);
		buttonSquared.addActionListener(this);
		basicCalc.setVisible(true);
		basicCalc.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
		
		
		
	}
	
	public void oneButton(){ //Prints "1" to the textfield
		String displayText = textField.getText();
		textField.setText(displayText + "1");
	}

	public void twoButton(){ //Prints "2" to the textfield
		String displayText = textField.getText();
		textField.setText(displayText + "2");
	}

	public void threeButton(){ //Prints "3" to the textfield
		String displayText = textField.getText();
		textField.setText(displayText + "3");
	}

	public void fourButton(){ //Prints "4" to the textfield
		String displayText = textField.getText();
		textField.setText(displayText + "4");
	}

	public void fiveButton(){ //Prints "5" to the textfield
		String displayText = textField.getText();
		textField.setText(displayText + "5");
	}

	public void sixButton(){ //Prints "6" to the textfield
		String displayText = textField.getText();
		textField.setText(displayText + "6");
	}

	public void sevenButton(){ //Prints "7" to the textfield
		String displayText = textField.getText();
		textField.setText(displayText + "7");
	}

	public void eightButton(){ //Prints "8" to the textfield
		String displayText = textField.getText();
		textField.setText(displayText + "8");
	}

	public void nineButton(){ //Prints "9" to the textfield
		String displayText = textField.getText();
		textField.setText(displayText + "9");
	}

	public void zeroButton(){ //Prints "0" to the textfield
		String displayText = textField.getText();
		textField.setText(displayText + "0");
	}

	public void decimalButton(){ //Prints "." to the textfield for a decimal
		String displayText = textField.getText();
		textField.setText(displayText + ".");
	}
	
	public void addition(){ //Prints "+" to the textfield for addition
		String displayText = textField.getText();
		textField.setText(displayText + "+");
	}
	
	public void subtraction(){ //Prints "-" to the textfield for subtraction
		String displayText = textField.getText();
		textField.setText(displayText + "-");
	}

	public void multiplication(){ //Prints "*" to the textfield for multiplication
		String displayText = textField.getText();
		textField.setText(displayText + "*");
	}

	public void division(){ //Prints "/" to the textfield for division
		String displayText = textField.getText();
		textField.setText(displayText + "/");
	}

	public void advancedButton(){ //Closes the current calculator and opens the advanced calculator in its stead
		new AdvancedCalculator();
		basicCalc.dispose();
	}

	public void clearButton(){ //Clears the textfield
		textField.setText("");
	}

	public void paranthesisLeft(){ //Prints "(" to the textfield for enclosing
		String displayText = textField.getText();
		textField.setText(displayText + "(");
	}

	public void paranthesisRight(){ //Prints ")" to the textfield for enclosing
		String displayText = textField.getText();
		textField.setText(displayText + ")");
	}

	public void xSquared(){ //Squares the value of the textfield and replaces it with the result
		String displayText = textField.getText();
		double toSquare = Double.valueOf(displayText);
		double squared = toSquare * toSquare;
        textField.setText(""+Double.valueOf(squared));
	}

	public void equals(){ //Calculates the value of the textfield
		String displayText = textField.getText();
		ScriptEngine engine = new ScriptEngineManager().getEngineByExtension("js");
		 
        try {
            // Evaluate the expression
            Object result = engine.eval(displayText);
            String resultString = result.toString();
            calcResult = Double.parseDouble(resultString);
 
            System.out.println(displayText + " = " + result);
            textField.setText(""+result);
        }
        catch (ScriptException f) {
            // Something went wrong
            f.printStackTrace();
        }
	}
	
	public double getCalcResult(){
		return calcResult;
	}
	
	public void actionPerformed(ActionEvent e) {
		JButton pressed = (JButton) e.getSource();
		if (pressed == buttonAdv)
        {
			advancedButton();
        }
		if (pressed == button1)
        {
            oneButton();
            
        }
		if (pressed == button2)
        {
            twoButton();
            
        }
		if (pressed == button3)
        {
            threeButton();
            
        }
		if (pressed == button4)
        {
            fourButton();
            
        }
		if (pressed == button5)
        {
            fiveButton();
            
        }
		if (pressed == button6)
        {
            sixButton();
            
        }
		if (pressed == button7)
        {
            sevenButton();
            
        }
		if (pressed == button8)
        {
            eightButton();
            
        }
		if (pressed == button9)
        {
            nineButton();
            
        }
		if (pressed == button0)
        {
            zeroButton();
            
        }
		if (pressed == buttonAdd)
        {
            addition();
            
        }
		if (pressed == buttonSub)
        {
            subtraction();
            
        }
		if (pressed == buttonMult)
        {
            multiplication();
            
        }
		if (pressed == buttonDiv)
        {
            division();
            
        }
		if (pressed == buttonLeftPar)
        {
            paranthesisLeft();
            
        }
		if (pressed == buttonRightPar)
        {
            paranthesisRight();
            
        }
		if (pressed == buttonDecimal)
        {
            decimalButton();
            
        }
		if (pressed == buttonSquared)
        {
			xSquared();
            
        }
		if (pressed == buttonClear)
        {
            clearButton();
            
        }
		if (pressed == buttonEqual)
        {
			equals();
        }
		
	}
	public static void main(String[] args) {
		new BasicCalculator();

	}

	

}
