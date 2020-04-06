import javax.swing.JOptionPane;

public class ex6 {
	public static void main(String[] agrs) {
		String strNuma11, strNuma12, strNumb1, strNumb2, strNuma21, strNuma22;
		double a11, a12, a21, a22, b1, b2, x1, x2, d, d1, d2;

		JOptionPane.showMessageDialog(null, "Input the first-degree equation");
		strNuma11 = JOptionPane.showInputDialog(null, "Insert a11: ");
		a11 = Double.parseDouble(strNuma11);
		strNuma12 = JOptionPane.showInputDialog(null, "Insert a12: ");
		a12 = Double.parseDouble(strNuma12);
		strNuma21 = JOptionPane.showInputDialog(null, "Insert a21: ");
		a21 = Double.parseDouble(strNuma21);
		strNuma22 = JOptionPane.showInputDialog(null, "Insert a22: ");
		a22 = Double.parseDouble(strNuma22);
		strNumb1 = JOptionPane.showInputDialog(null, "Insert b1: ");
		b1 = Double.parseDouble(strNumb1);
		strNumb2 = JOptionPane.showInputDialog(null, "Insert b2: ");
		b2 = Double.parseDouble(strNumb2);
		JOptionPane.showMessageDialog(null, "Your system:\n" + a11 + "x1" + " + " + a12 + "x2" + "=" + b1 + "\n" + a21
				+ "x1" + " + " + a22 + "x2" + "=" + b2);

		d = a11 * a22 - a21 * a12;
		d1 = b1 * a22 - b2 * a12;
		d2 = a11 * b2 - a21 * b1;
		if (d == 0) {
			if (d1 == 0 && d2 == 0)
				JOptionPane.showMessageDialog(null, "Infiniteve solution\n");
			else
				JOptionPane.showMessageDialog(null, "No Solution\n");
		} else {
			x1 = d1 / d;
			x2 = d2 / d;
			JOptionPane.showMessageDialog(null, "x1 = " + x1 + "\nx2 = " + x2);
		}
		System.exit(0);
	}
}