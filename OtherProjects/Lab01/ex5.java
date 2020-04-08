import javax.swing.JOptionPane;
public class ex5
{
    public static void main(String [] agrs)
    {
        String strNum1, strNum2;
        double num1, num2, s, d, p, di;
        strNum1 = JOptionPane.showInputDialog(null,"Input 1st number","Input 1st number: ",JOptionPane.INFORMATION_MESSAGE);
        num1 = Double.parseDouble(strNum1);
        strNum2 = JOptionPane.showInputDialog(null,"Input 2nd number","Input 2nd number: ",JOptionPane.INFORMATION_MESSAGE);
        num2 = Double.parseDouble(strNum2);
        s = num1 + num2;
        d = num1 - num2;
        p = num1 * num2;
        di = num1 / num2;
        // JOptionPane.showMessageDialog(null,strNotification,"Show two numbers",JOptionPane.INFORMATION_MESSAGE);
        JOptionPane.showMessageDialog(null,"Sum: "+s + "\nDifference: "+ d +"\nProduct: "+p+"\nDivision: "+di);

    }
}