package openome_model.figures;

import org.eclipse.draw2d.ColorConstants;
import org.eclipse.draw2d.StackLayout;

public class SoftGoalSVGFigure extends NodeSVGFigure {
	
	public SoftGoalSVGFigure() {
		super("softgoal");
		setLayoutManager(new OpenOmeElementLayoutManager());
		setBackgroundColor(ColorConstants.red);
	}

}
