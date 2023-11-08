import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class CalculoIVAGUI {
    public static void main(String[] args) {
        SwingUtilities.invokeLater(() -> {
            JFrame frame = new JFrame("Calculo de IVA");
            frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
            frame.setSize(300, 200);
            frame.setLayout(null);

            JLabel label = new JLabel("Ingrese el monto de la compra:");
            label.setBounds(20, 20, 200, 20);
            frame.add(label);

            JTextField montoTextField = new JTextField();
            montoTextField.setBounds(200, 20, 70, 20);
            frame.add(montoTextField);

            JButton calcularButton = new JButton("Calcular IVA");
            calcularButton.setBounds(100, 60, 120, 30);
            frame.add(calcularButton);

            JTextArea resultadoTextArea = new JTextArea();
            resultadoTextArea.setBounds(20, 100, 260, 60);
            resultadoTextArea.setEditable(false);
            frame.add(resultadoTextArea);

            calcularButton.addActionListener(new ActionListener() {
                public void actionPerformed(ActionEvent e) {
                    try {
                        double montoCompra = Double.parseDouble(montoTextField.getText());
                        double iva = montoCompra * 0.16;
                        double totalAPagar = montoCompra + iva;

                        String resultado = "Monto del IVA (16%): $" + iva + "\nTotal a pagar: $" + totalAPagar;
                        resultadoTextArea.setText(resultado);
                    } catch (NumberFormatException ex) {
                        resultadoTextArea.setText("Error: Ingrese un monto válido.");
                    }
                }
            });

            frame.setVisible(true);
        });
    }

    @Override
    public String toString() {
        return "CalculoIvaGUI []";
    }
}