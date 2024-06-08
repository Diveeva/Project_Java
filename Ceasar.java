import javax.swing.*;
import java.awt.event.ActionEvent;

public class Ceasar {
    //Создание окна
        public static void main(String[] args) {
            JFrame frame = new JFrame ();
            frame.setTitle ("Шифрование цезарем");
            frame.setSize (400,200);
            frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
            
           JTextField inputField = new JTextField(30);
           JTextField outputField = new JTextField(30);
           JButton cipherButton = new JButton("Шифровать!");

        JPanel panel = new JPanel();
        panel.add(new JLabel("Ввод текста: "));
        panel.add(inputField);
        panel.add(cipherButton);
        panel.add(new JLabel("Зашифрованый текст: "));
        panel.add(outputField);
// Код кнопок и панелей 
        cipherButton.addActionListener((ActionEvent e) -> {
            String inputText = inputField.getText();
            //int shift = Integer.parseInt(shiftField.getText());
            String cipherText = cipher(inputText);
            outputField.setText(cipherText);
            });

        frame.add(panel);
        frame.setVisible(true);
        
    }
// функция шифрования
        public  static String cipher(String msg){
            int shift=3;
            StringBuilder s = new StringBuilder();
            int len = msg.length();
            for (int x = 0; x<len; x++){
                char c = (char)(msg.charAt(x)+shift);
                if (c > ((Character.isUpperCase(msg.charAt(x))) ? 'Я':'я'))
                s.append ((char)(msg.charAt(x)-(32-shift)));
                else
                s.append((char)(msg.charAt(x)+shift));
            }
            return s.toString();
        }
}
      
        
        
  
       