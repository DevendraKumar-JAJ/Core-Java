import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.io.*;

public class TextEditorApp extends JFrame {

    private JTextArea textArea;
    private File currentFile = null;

    public TextEditorApp() {
        setTitle("Simple Text Editor");
        setSize(800, 600);
        setDefaultCloseOperation(EXIT_ON_CLOSE);

        textArea = new JTextArea();
        JScrollPane scrollPane = new JScrollPane(textArea);
        add(scrollPane, BorderLayout.CENTER);

        createMenuBar();

        setLocationRelativeTo(null); // center the window
        setVisible(true);
    }

    private void createMenuBar() {
        JMenuBar menuBar = new JMenuBar();

        JMenu fileMenu = new JMenu("File");

        JMenuItem openItem = new JMenuItem("Open");
        openItem.addActionListener(e -> openFile());

        JMenuItem saveItem = new JMenuItem("Save");
        saveItem.addActionListener(e -> saveFile());

        JMenuItem saveAsItem = new JMenuItem("Save As...");
        saveAsItem.addActionListener(e -> saveFileAs());

        JMenuItem exitItem = new JMenuItem("Exit");
        exitItem.addActionListener(e -> System.exit(0));

        fileMenu.add(openItem);
        fileMenu.add(saveItem);
        fileMenu.add(saveAsItem);
        fileMenu.addSeparator();
        fileMenu.add(exitItem);

        menuBar.add(fileMenu);
        setJMenuBar(menuBar);
    }

    private void openFile() {
        JFileChooser fileChooser = new JFileChooser();
        int result = fileChooser.showOpenDialog(this);

        if (result == JFileChooser.APPROVE_OPTION) {
            currentFile = fileChooser.getSelectedFile();

            try (BufferedReader reader = new BufferedReader(new FileReader(currentFile))) {
                textArea.read(reader, null);
                setTitle("Text Editor - " + currentFile.getName());
            } catch (IOException ex) {
                showError("Failed to open file:\n" + ex.getMessage());
            }
        }
    }

    private void saveFile() {
        if (currentFile != null) {
            try (BufferedWriter writer = new BufferedWriter(new FileWriter(currentFile))) {
                textArea.write(writer);
                showMessage("File saved successfully.");
            } catch (IOException ex) {
                showError("Failed to save file:\n" + ex.getMessage());
            }
        } else {
            saveFileAs();
        }
    }

    private void saveFileAs() {
        JFileChooser fileChooser = new JFileChooser();
        int result = fileChooser.showSaveDialog(this);

        if (result == JFileChooser.APPROVE_OPTION) {
            currentFile = fileChooser.getSelectedFile();

            try (BufferedWriter writer = new BufferedWriter(new FileWriter(currentFile))) {
                textArea.write(writer);
                setTitle("Text Editor - " + currentFile.getName());
                showMessage("File saved successfully.");
            } catch (IOException ex) {
                showError("Failed to save file:\n" + ex.getMessage());
            }
        }
    }

    private void showError(String message) {
        JOptionPane.showMessageDialog(this, message, "Error", JOptionPane.ERROR_MESSAGE);
    }

    private void showMessage(String message) {
        JOptionPane.showMessageDialog(this, message, "Success", JOptionPane.INFORMATION_MESSAGE);
    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(TextEditorApp::new);
    }
}
