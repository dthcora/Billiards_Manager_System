package Controller;

import DAO.DoUongDAO;
import Model.DoUongModel;
import View.MenuView;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;
import java.util.List;
import javax.swing.JSpinner;

public class DoUongController {
    private final MenuView view;
    private static List<DoUongModel> drinks;
    
    public DoUongController(MenuView view) {
        this.view = view;
        drinks = new ArrayList<>();
        view.jbtReset.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                resetSpinners();
            }
        });
        
        view.jbtAdd.addActionListener((ActionEvent e) -> {
            for (JSpinner spinner : view.spinners) {
                int quantity = (int) spinner.getValue();
                if (quantity > 0) {
                    DoUongModel drink = DoUongDAO.getDrinkbyID(spinner.getName());
                    drink.setSoluong(quantity);
                    drinks.add(drink);
                }
            }
            System.out.println("Drinks added: " + drinks.size());
            resetSpinners();
        });

    }
    public void resetSpinners() {
        for (JSpinner spinner : view.spinners) {
            spinner.setValue(0);
        }
    }
    public static List<DoUongModel> getDrinks(){
        return drinks;
    }

}
