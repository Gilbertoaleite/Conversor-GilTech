package br.com.alura.view;

import javax.swing.*;

public abstract class Window {
    private static JTabbedPane tabs = new JTabbedPane();

    public static void Initials() {
        View Money = new ViewTabMoney();
        ((ViewTabMoney) Money).tabMoney(tabs);

        View Degrees = new ViewTabDegrees();
        ((ViewTabDegrees) Degrees).tabDegrees(tabs);

    
        
        Janela();
    }

    private static void Janela() {
        JFrame window = new JFrame("GilTech - Conversor - by: Gilberto A Leite");
        window.setSize(400, 450);
        window.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        window.setLocationRelativeTo(null);
        window.add(tabs);
        window.setResizable(false);
        window.setVisible(true);
       
    }

}
