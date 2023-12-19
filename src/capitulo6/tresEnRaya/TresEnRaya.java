package capitulo6.tresEnRaya;

import java.awt.Font;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.SwingUtilities;

public class TresEnRaya extends JFrame implements ActionListener {

    private JButton[][] botones;
    private char turnoActual;

    public TresEnRaya() {
        // Configurar la ventana
        setTitle("Tres en Raya");
        setSize(300, 300);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLocationRelativeTo(null);

        // Inicializar la matriz de botones y configurar el diseño
        botones = new JButton[3][3];
        setLayout(new GridLayout(3, 3));

        // Inicializar los botones y agregarlos al panel
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                botones[i][j] = new JButton("");
                botones[i][j].setFont(new Font(Font.SANS_SERIF, Font.PLAIN, 40));
                botones[i][j].addActionListener(this);
                add(botones[i][j]);
            }
        }

        // Inicializar el turno
        turnoActual = 'X';
    }

    public void actionPerformed(ActionEvent e) {
        JButton boton = (JButton) e.getSource();

        // Verificar si el botón ya ha sido marcado
        if (boton.getText().equals("")) {
            // Marcar el botón con el turno actual
            boton.setText(Character.toString(turnoActual));

            // Verificar si alguien ha ganado o hay un empate
            if (hayGanador() || hayEmpate()) {
                mostrarResultado();
            } else {
                // Cambiar al siguiente turno
                cambiarTurno();
            }
        }
    }

    private void cambiarTurno() {
        turnoActual = (turnoActual == 'X') ? 'O' : 'X';
    }

    private boolean hayGanador() {
        // Verificar filas y columnas
        for (int i = 0; i < 3; i++) {
            if ((botones[i][0].getText().equals(Character.toString(turnoActual)) &&
                    botones[i][1].getText().equals(Character.toString(turnoActual)) &&
                    botones[i][2].getText().equals(Character.toString(turnoActual))) ||
                    (botones[0][i].getText().equals(Character.toString(turnoActual)) &&
                            botones[1][i].getText().equals(Character.toString(turnoActual)) &&
                            botones[2][i].getText().equals(Character.toString(turnoActual)))) {
                return true;
            }
        }

        // Verificar diagonales
        if ((botones[0][0].getText().equals(Character.toString(turnoActual)) &&
                botones[1][1].getText().equals(Character.toString(turnoActual)) &&
                botones[2][2].getText().equals(Character.toString(turnoActual))) ||
                (botones[0][2].getText().equals(Character.toString(turnoActual)) &&
                        botones[1][1].getText().equals(Character.toString(turnoActual)) &&
                        botones[2][0].getText().equals(Character.toString(turnoActual)))) {
            return true;
        }

        return false;
    }

    private boolean hayEmpate() {
        // Verificar si todos los botones están marcados
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                if (botones[i][j].getText().equals("")) {
                    return false; // Todavía hay al menos un botón sin marcar
                }
            }
        }
        return true; // Todos los botones están marcados (empate)
    }

    private void mostrarResultado() {
        JOptionPane.showMessageDialog(this, (hayGanador() ? "¡Jugador " + turnoActual + " ha ganado!" : "¡Empate!"),
                "Fin del juego", JOptionPane.INFORMATION_MESSAGE);
        reiniciarJuego();
    }

    private void reiniciarJuego() {
        // Reiniciar el texto de todos los botones
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                botones[i][j].setText("");
            }
        }

        // Reiniciar el turno
        turnoActual = 'X';
    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(() -> {
            TresEnRaya juego = new TresEnRaya();
            juego.setVisible(true);
        });
    }
}