import vista.inicio;
import javax.swing.JOptionPane;

public class principal {
    private static final java.util.logging.Logger logger = java.util.logging.Logger.getLogger(principal.class.getName());

    public static void main(String[] args) {
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ReflectiveOperationException | javax.swing.UnsupportedLookAndFeelException ex) {
            logger.log(java.util.logging.Level.SEVERE, "Error", ex);
        }

        try {
            modelo.basededatos bd = new modelo.basededatos();
            
            java.awt.EventQueue.invokeLater(() -> {
                inicio loginWindow = new inicio(bd);
                loginWindow.setVisible(true);
                loginWindow.setLocationRelativeTo(null);
            });
            
        } catch (Exception ex) {
            logger.log(java.util.logging.Level.SEVERE, "Error", ex);
            JOptionPane.showMessageDialog(null, 
                "Error: " + ex.getMessage(), 
                "Error", 
                JOptionPane.ERROR_MESSAGE);
            System.exit(1);
        }
    }
}

