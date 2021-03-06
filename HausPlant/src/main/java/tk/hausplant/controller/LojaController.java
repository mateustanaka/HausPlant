/**
 * HausPlant
 *
 * 2017
 * Equipe desenvolvedora do HausPlant
 */
package tk.hausplant.controller;

import java.net.URISyntaxException;
import java.nio.file.Paths;
import tk.hausplant.model.Planta;
import tk.hausplant.view.Loja;

public class LojaController {

	private LojaController() {
	}

	private static final String ARQUIVO_INDICE_LOJA = "/indiceMoveisLoja.csv";

	public static void adicionarMovel(final Planta planta) {
		try {
			Loja loja = new Loja(Paths.get(LojaController.class.getResource(ARQUIVO_INDICE_LOJA).toURI()), planta);
			loja.setVisible(true);
		} catch (URISyntaxException e) {
			e.printStackTrace();
		}
	}

}
