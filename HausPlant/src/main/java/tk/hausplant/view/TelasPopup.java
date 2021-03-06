/**
 * HausPlant
 *
 * 2017
 * Equipe desenvolvedora do HausPlant
 */
package tk.hausplant.view;

import java.awt.Color;
import java.io.File;
import javax.swing.JColorChooser;
import javax.swing.JFileChooser;
import javax.swing.JOptionPane;

/**
 * Conjunto de métodos para obtenção de informações do usuário via prompt
 */
public class TelasPopup {

	private TelasPopup() {
	}

	public static File obterArquivoParaSalvar() {
		JFileChooser selecionador = new JFileChooser();
		selecionador.setFileSelectionMode(JFileChooser.FILES_ONLY);

		if (selecionador.showSaveDialog(null) == JFileChooser.APPROVE_OPTION) {
			return selecionador.getSelectedFile();
		}
		return null;
	}

	public static File obterArquivoParaAbrir() {
		JFileChooser selecionador = new JFileChooser();
		selecionador.setFileSelectionMode(JFileChooser.FILES_ONLY);

		if (selecionador.showOpenDialog(null) == JFileChooser.APPROVE_OPTION) {
			return selecionador.getSelectedFile();
		}
		return null;
	}

	public static File[] obterArquivosParaAbrir() {
		JFileChooser selecionador = new JFileChooser();
		selecionador.setMultiSelectionEnabled(true);
		selecionador.setFileSelectionMode(JFileChooser.FILES_ONLY);

		if (selecionador.showOpenDialog(null) == JFileChooser.APPROVE_OPTION) {
			return selecionador.getSelectedFiles();
		}
		return null;
	}

	public static File obterDiretorioParaSalvar() {
		JFileChooser selecionador = new JFileChooser();
		selecionador.setFileSelectionMode(JFileChooser.DIRECTORIES_ONLY);
		selecionador.showSaveDialog(null);

		return selecionador.getSelectedFile();
	}

	private static boolean verificarConfirmacao(final String mensagem, final String titulo) {
		int dialogResult = JOptionPane.showConfirmDialog(null, mensagem, titulo, JOptionPane.YES_NO_OPTION);

		return dialogResult == JOptionPane.YES_OPTION;
	}

	public static boolean verificarConfirmacaoSobrescrita() {
		return TelasPopup.verificarConfirmacao("Você deseja realmente sobrescrever o arquivo existente?", "Atenção");
	}

	public static void mostrarMensagem(final String mensagem) {
		JOptionPane.showMessageDialog(null, mensagem);
	}

	public static Color obterCor() {
		return JColorChooser.showDialog(null, "Escolha uma cor", Color.RED);
	}

}
