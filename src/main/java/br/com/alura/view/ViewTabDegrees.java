package br.com.alura.view;

import java.awt.event.ActionListener;
import java.math.BigDecimal;
import java.math.RoundingMode;

import javax.swing.JPanel;
import javax.swing.JTabbedPane;

import br.com.alura.control.ConverterTemp;

public class ViewTabDegrees extends View {
    private JPanel panelDegrees = new JPanel();
    private String[] from = { "Celsius", "Fahrenheit" };
    private String[] to = { "Fahrenheit", "Celsius" };

    public void tabDegrees(JTabbedPane tabs) {
        panelDegrees.setLayout(null);
        Logo("img/degrees.png", panelDegrees);
        Label(panelDegrees);
        ComboBox(panelDegrees, from, to);
        Input(panelDegrees);
        Button(panelDegrees);
        tabs.addTab("Temperatura", panelDegrees);
   
        ButtonDegrees();
    }

    private void ButtonDegrees() {
        btnConvert.addActionListener(new ActionListener() {

            public void actionPerformed(java.awt.event.ActionEvent e) {
                String fromDegrees = getComFromSelect();
                String toDegrees = getComToSelect();
                String fromValue = getFromInputConvert();
                ConverterTemp convertDegreesValue = new ConverterTemp();
                double valorFinal = convertDegreesValue.getConverterDegrees(fromDegrees, toDegrees,
                        Double.parseDouble(fromValue));

                BigDecimal result = new BigDecimal(Double.toString(valorFinal));
                result = result.setScale(2, RoundingMode.CEILING);

                setToInputConvert(Double.toString(result.doubleValue()));
            }
        });
    }
}
