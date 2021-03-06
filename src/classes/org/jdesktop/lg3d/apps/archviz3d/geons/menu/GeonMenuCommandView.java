package org.jdesktop.lg3d.apps.archviz3d.geons.menu;


import org.jdesktop.lg3d.apps.archviz3d.geons.frames.GeonFrameManager;
import org.jdesktop.lg3d.apps.archviz3d.geons.menu.GeonMenu;
import org.jdesktop.lg3d.apps.archviz3d.geons.menu.GeonMenuCommand;
import org.jdesktop.lg3d.apps.archviz3d.geons.menu.GeonMenuStateInitial;

/**
 * Esta clase encapsula la funcionalidad del boton View del Menu. 
 * 
 * @author Juan Feldman
 *
 */
public class GeonMenuCommandView extends GeonMenuCommand {

	/**
	 * Inicializa el comando.
	 * @param invoker Invocador del commando.
	 * @param receiver Receptor del commando.
	 */
	public GeonMenuCommandView(GeonMenu invoker, GeonFrameManager receiver) {
		super(invoker, receiver);
	}

	/** 
	 * Ejecuta el comando.
	 */
	public void execute() {
		// Le aviso al menu
		invoker.clearButton_click();

		// Llamo al frame manager
		((GeonFrameManager)receiver).viewButton_click();
		
		// Se inicializa el menu
		invoker.changeState(new GeonMenuStateInitial(invoker));
	}

}
