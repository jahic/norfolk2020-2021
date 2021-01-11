package part.swing.intro;

/**
 * Common actions of button clicks.
 * @author jahic
 *
 */

public enum ButtonActions
{
	// Boolean type
	BUTTON_ACTION_ZOOM_IN("zoomIn"), BUTTON_ACTION_ZOOM_OUT("zoomIn");
	
	@SuppressWarnings("unused")
	private String value;
	
	public String getValue()
    {
    	return value;
    }
	
	private ButtonActions(String v) {
		this.value = v;
	}
}
