package openome_model.figures;

import org.eclipse.draw2d.PositionConstants;

public class GoalSVGFigure extends NodeSVGFigure {
	
	public GoalSVGFigure() {
		super("goal");
		setLayoutManager(new OpenOmeElementLayoutManager());
	}
}
