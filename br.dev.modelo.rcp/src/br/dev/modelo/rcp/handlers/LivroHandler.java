package br.dev.modelo.rcp.handlers;

import org.eclipse.e4.core.di.annotations.Execute;
import org.eclipse.jface.dialogs.MessageDialog;
import org.eclipse.swt.widgets.Shell;

public class LivroHandler {
	@Execute
	public void execute(Shell shell) {
		MessageDialog.openInformation(shell, "Livro", "Eclipse RCP Application");
	}
}
