package lang.ui;

import org.eclipse.swt.SWT;
import org.eclipse.swt.graphics.RGB;
import org.eclipse.xtext.ui.editor.syntaxcoloring.DefaultHighlightingConfiguration;
import org.eclipse.xtext.ui.editor.syntaxcoloring.IHighlightingConfigurationAcceptor;
import org.eclipse.xtext.ui.editor.utils.TextStyle;

public class IotlangextendsHighlighting extends DefaultHighlightingConfiguration {
	public static final String DEFAULT_TEXT_ID = "DEFAULT_TEXT_ID";
	public static final String DEFINED_ID = "DEFINED_ID";
	@Override
	public void configure(IHighlightingConfigurationAcceptor acceptor) {
		acceptor.acceptDefaultHighlighting(DEFAULT_TEXT_ID, "DEFAULT_TEXT", defaultText());
		acceptor.acceptDefaultHighlighting(DEFINED_ID, "DEFINED", definedHighlight());
		
	}
	protected TextStyle defaultText() {
        TextStyle textStyle = defaultTextStyle().copy();
        textStyle.setColor(new RGB(34, 34, 34));
        textStyle.setStyle(SWT.NORMAL);
        return textStyle;
}
	protected TextStyle definedHighlight() {
        TextStyle textStyle = defaultTextStyle().copy();
        textStyle.setColor(new RGB(102, 102, 102));
        textStyle.setStyle(SWT.NORMAL);
        return textStyle;
}
}
