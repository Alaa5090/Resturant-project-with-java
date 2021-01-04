
package OOResturant;

import javax.swing.JFrame;
import javax.swing.JOptionPane;

public class SuperClass_Parent {
    
    public double filet_O_Fish = 29.5,chickenBurger = 25.5,chickenLegent = 32.25,chickenBurgerM = 35,baconChesseBurger = 25.25,
            milkShake = 20,vanilleCone = 22.5,clasVanilla = 31.75,vanMilkShake = 33.25,chocMilkShake = 15.5,
            meals,drink
            ,totalOfMD;
    
    public double pFilet_O_Fish = 29.5,pChickenBurger = 25.5,pChickenLegent = 32.25,pChickenBurgerM = 35,pbaconChesseBurger = 25.25,
            pMilkShake = 20,pVanilleCone = 22.5,pClasVanilla = 31.75,pVanMilkShake = 33.25,pChocMilkShake = 15.5,
            mcTax = 0.14;
    
    public double cFindTax(double cAmount){
        return cAmount - (cAmount * mcTax);
    }
    
    public double getAmount() {
        meals = filet_O_Fish+ chickenBurger+chickenBurgerM+chickenLegent+baconChesseBurger;
        drink = milkShake+ vanMilkShake+ vanilleCone+ clasVanilla+ chocMilkShake;
        totalOfMD = meals+ drink;
        return totalOfMD;
    }
    
    private JFrame frame;
    
    public void iExitSystem(){
        frame = new JFrame("Exit");
        if(JOptionPane.showConfirmDialog(frame, "Confirm If You Want To Exit","Resturant Managment System",
                JOptionPane.YES_NO_OPTION) == JOptionPane.YES_NO_OPTION){
            System.exit(0);
        }
    }
    
}
