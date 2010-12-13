package it.unitn.disi.sistar.figures.connections;

import it.unitn.disi.sistar.figures.decorations.CustomDecoration;
import it.unitn.disi.sistar.figures.decorations.LabelDecoration;
import it.unitn.disi.sistar.figures.locators.RotatableObjectLocator;
import it.unitn.disi.sistar.modeling.styles.customStyle.EConnectionLineStyle;
import it.unitn.disi.sistar.modeling.styles.customStyle.EEndDecorationType;
import it.unitn.disi.sistar.modeling.styles.customStyle.EMidDecorationType;

import org.eclipse.draw2d.ColorConstants;
import org.eclipse.draw2d.ConnectionLocator;
import org.eclipse.draw2d.Graphics;
import org.eclipse.draw2d.PolygonDecoration;
import org.eclipse.draw2d.geometry.PointList;
import org.eclipse.swt.SWT;
import org.eclipse.swt.graphics.Color;
import org.eclipse.swt.widgets.Display;

public class CustomRelationFigure extends HideableRelationFigure {

	private EEndDecorationType sourceDecorationType = EEndDecorationType.NONE_LITERAL;
	private EEndDecorationType targetDecorationType = EEndDecorationType.NONE_LITERAL;
	private EMidDecorationType midDecorationType = EMidDecorationType.NONE_LITERAL;
	private String decorationMiddleText = "";
	private EConnectionLineStyle connectionLineStyle = EConnectionLineStyle.SOLID_LITERAL;
	
	private String textSource = "";
	private String textMiddle = "";
	private String textTarget = "";
	
	private static PointList SOLID_TEMPLATE = new PointList();
	private static PointList LINE_TEMPLATE = new PointList();
	private static PointList DIAMOND_TEMPLATE = new PointList();
	private static PointList BOX_TEMPLATE = new PointList();
	private PolygonDecoration sourceDecorationFigure;
	private PolygonDecoration targetDecorationFigure;
	private CustomDecoration middleDecorationFigure;
	
	
	private LabelDecoration sourceLabel;
	private LabelDecoration middleLabel;
	private LabelDecoration targetLabel;
	static{
		SOLID_TEMPLATE.addPoint(-1, 2);
		SOLID_TEMPLATE.addPoint(0, 0);
		SOLID_TEMPLATE.addPoint(-1, -2);
		
		LINE_TEMPLATE.addPoint(-1, 2);
		LINE_TEMPLATE.addPoint(0, 0);
		LINE_TEMPLATE.addPoint(-1, -2);
		LINE_TEMPLATE.addPoint(0, 0);
		
		BOX_TEMPLATE.addPoint(-2, 2);
		BOX_TEMPLATE.addPoint(0, 2);
		BOX_TEMPLATE.addPoint(0, -2);
		BOX_TEMPLATE.addPoint(-2, -2);
		
		DIAMOND_TEMPLATE.addPoint(-1, 2);
		DIAMOND_TEMPLATE.addPoint(0, 0);
		DIAMOND_TEMPLATE.addPoint(-1, -2);
		DIAMOND_TEMPLATE.addPoint(-2,0);
	}
	
	
	public CustomRelationFigure() {
		setForegroundColor(ColorConstants.black);
		setBackgroundColor(ColorConstants.black);
		
		sourceLabel = new LabelDecoration("");
		RotatableObjectLocator locator = new RotatableObjectLocator(this,
				ConnectionLocator.SOURCE);
		add(sourceLabel, locator);
		
		middleLabel = new LabelDecoration("");
		locator = new RotatableObjectLocator(this,
				ConnectionLocator.MIDDLE);
		add(middleLabel, locator);
		
		targetLabel = new LabelDecoration("");
		locator = new RotatableObjectLocator(this,
				ConnectionLocator.TARGET);
		add(targetLabel, locator);
	}

	@Override
	protected void outlineShape(Graphics g) {
		g.setForegroundColor(getForegroundColor());
		g.setBackgroundColor(getBackgroundColor());
		if(connectionLineStyle == EConnectionLineStyle.SOLID_LITERAL)
		{
			g.setLineStyle(SWT.LINE_SOLID);
			g.setLineDash(new int[]{});
		}else if (connectionLineStyle == EConnectionLineStyle.DASHED_LITERAL)
		{
			g.setLineStyle(SWT.LINE_DASH);
			g.setLineDash(new int[]{5,5,5,5});
		}else if (connectionLineStyle == EConnectionLineStyle.DOTTED_LITERAL)
		{
			g.setLineStyle(SWT.LINE_CUSTOM);
			g.setLineDash(new int[]{1,3,1,3});
		}
		super.outlineShape(g);
	}
	public EMidDecorationType getMidDecorationType() {
		return midDecorationType;
	}

	public void setMidDecorationType(EMidDecorationType midDecoration) {
		this.midDecorationType = midDecoration;
		
		
		if(midDecoration == EMidDecorationType.NONE_LITERAL)
		{
			if(getChildren().contains(middleDecorationFigure))
				remove(middleDecorationFigure);
		}
		else if(midDecoration == EMidDecorationType.ARROW_LITERAL)
		{
			if(!getChildren().contains(middleDecorationFigure))
			{
				middleDecorationFigure = new CustomDecoration(decorationMiddleText);
				middleDecorationFigure.setBackgroundColor(new Color(Display.getCurrent(), 152,251,152));
				middleDecorationFigure.setForegroundColor(ColorConstants.black);
				RotatableObjectLocator locator = new RotatableObjectLocator(this, ConnectionLocator.MIDDLE);
				add(middleDecorationFigure, locator);
			}
			middleDecorationFigure.setTemplate(CustomDecoration.ARROW_TEMPLATE);
		}else if(midDecoration == EMidDecorationType.BOX_LITERAL)
		{
			if(!getChildren().contains(middleDecorationFigure))
			{
				middleDecorationFigure = new CustomDecoration(decorationMiddleText);
				middleDecorationFigure.setBackgroundColor(new Color(Display.getCurrent(), 152,251,152));
				middleDecorationFigure.setForegroundColor(ColorConstants.black);
				RotatableObjectLocator locator = new RotatableObjectLocator(this, ConnectionLocator.MIDDLE);
				add(middleDecorationFigure, locator);
			}
			middleDecorationFigure.setTemplate(CustomDecoration.DEFAULT_TIP);
		}

	}

	public EEndDecorationType getSourceDecorationType() {
		return sourceDecorationType;
	}

	public void setSourceDecorationType(EEndDecorationType sourceDecoration) {
		this.sourceDecorationType = sourceDecoration;
		sourceDecorationFigure = new PolygonDecoration();

		if(sourceDecoration == EEndDecorationType.NONE_LITERAL)
			setSourceDecoration(null);
		else if(sourceDecoration == EEndDecorationType.SOLID_ARROW_LITERAL)
		{
			sourceDecorationFigure.setTemplate(SOLID_TEMPLATE);
			sourceDecorationFigure.setBackgroundColor(ColorConstants.white);
			sourceDecorationFigure.setFill(true);
			setSourceDecoration(sourceDecorationFigure);
		}else if(sourceDecoration == EEndDecorationType.LINE_ARROW_LITERAL)
		{
			sourceDecorationFigure.setTemplate(LINE_TEMPLATE);
			sourceDecorationFigure.setFill(false);
			setSourceDecoration(sourceDecorationFigure);
		}else if(sourceDecoration == EEndDecorationType.BOX_LITERAL)
		{
			sourceDecorationFigure.setTemplate(BOX_TEMPLATE);
			sourceDecorationFigure.setBackgroundColor(ColorConstants.white);
			sourceDecorationFigure.setFill(true);
			setSourceDecoration(sourceDecorationFigure);
		}else if(sourceDecoration == EEndDecorationType.SOLID_ARROW_FILL_LITERAL)
		{
			sourceDecorationFigure.setTemplate(SOLID_TEMPLATE);
			sourceDecorationFigure.setBackgroundColor(ColorConstants.black);
			sourceDecorationFigure.setFill(true);
			setSourceDecoration(sourceDecorationFigure);
		}else if(sourceDecoration == EEndDecorationType.BOX_FILL_LITERAL)
		{
			sourceDecorationFigure.setTemplate(BOX_TEMPLATE);
			sourceDecorationFigure.setFill(true);
			setSourceDecoration(sourceDecorationFigure);
		}else if(sourceDecoration == EEndDecorationType.DIAMOND_LITERAL)
		{
			sourceDecorationFigure.setTemplate(DIAMOND_TEMPLATE);
			sourceDecorationFigure.setBackgroundColor(ColorConstants.white);
			sourceDecorationFigure.setFill(true);
			setSourceDecoration(sourceDecorationFigure);
		}else if(sourceDecoration == EEndDecorationType.DIAMOND_FILL_LITERAL)
		{
			sourceDecorationFigure.setTemplate(DIAMOND_TEMPLATE);
			sourceDecorationFigure.setFill(true);
			setSourceDecoration(sourceDecorationFigure);
		}
		
	}

	public EEndDecorationType getTargetDecorationType() {
		return targetDecorationType;
	}

	public void setTargetDecorationType(EEndDecorationType targetDecoration) {
		this.targetDecorationType = targetDecoration;
		targetDecorationFigure = new PolygonDecoration();

		if(targetDecoration == EEndDecorationType.NONE_LITERAL)
			setTargetDecoration(null);
		else if(targetDecoration == EEndDecorationType.SOLID_ARROW_LITERAL)
		{
			targetDecorationFigure.setTemplate(SOLID_TEMPLATE);
			targetDecorationFigure.setBackgroundColor(ColorConstants.white);
			targetDecorationFigure.setFill(true);
			setTargetDecoration(targetDecorationFigure);
		}else if(targetDecoration == EEndDecorationType.LINE_ARROW_LITERAL)
		{
			targetDecorationFigure.setTemplate(LINE_TEMPLATE);
			targetDecorationFigure.setFill(false);
			setTargetDecoration(targetDecorationFigure);
		}else if(targetDecoration == EEndDecorationType.BOX_LITERAL)
		{
			targetDecorationFigure.setTemplate(BOX_TEMPLATE);
			targetDecorationFigure.setBackgroundColor(ColorConstants.white);
			targetDecorationFigure.setFill(true);
			setTargetDecoration(targetDecorationFigure);
		}else if(targetDecoration == EEndDecorationType.SOLID_ARROW_FILL_LITERAL)
		{
			targetDecorationFigure.setTemplate(SOLID_TEMPLATE);
			targetDecorationFigure.setBackgroundColor(ColorConstants.black);
			targetDecorationFigure.setFill(true);
			setTargetDecoration(targetDecorationFigure);
		}else if(targetDecoration == EEndDecorationType.BOX_FILL_LITERAL)
		{
			targetDecorationFigure.setTemplate(BOX_TEMPLATE);
			targetDecorationFigure.setFill(true);
			setTargetDecoration(targetDecorationFigure);
		}else if(targetDecoration == EEndDecorationType.DIAMOND_LITERAL)
		{
			targetDecorationFigure.setTemplate(DIAMOND_TEMPLATE);
			targetDecorationFigure.setBackgroundColor(ColorConstants.white);
			targetDecorationFigure.setFill(true);
			setTargetDecoration(targetDecorationFigure);
		}else if(targetDecoration == EEndDecorationType.DIAMOND_FILL_LITERAL)
		{
			targetDecorationFigure.setTemplate(DIAMOND_TEMPLATE);
			targetDecorationFigure.setFill(true);
			setTargetDecoration(targetDecorationFigure);
		}
	}

	public String getDecorationMiddleText() {
		return decorationMiddleText;
	}

	public void setDecorationMiddleText(String decorationMiddleText) {
		this.decorationMiddleText = decorationMiddleText;
		if(middleDecorationFigure!= null)
			middleDecorationFigure.setLabel(decorationMiddleText);
	}

	public EConnectionLineStyle getConnectionLineStyle() {
		return connectionLineStyle;
	}

	public void setConnectionLineStyle(EConnectionLineStyle connectionLineStyle) {
		this.connectionLineStyle = connectionLineStyle;
		
	}

	public String getTextMiddle() {
		return textMiddle;
	}

	public void setTextMiddle(String textMiddle) {
		this.textMiddle = textMiddle;
		middleLabel.setLabel(textMiddle);
		middleLabel.repaint();
	}

	public String getTextSource() {
		return textSource;
	}

	public void setTextSource(String textSource) {
		this.textSource = textSource;
		sourceLabel.setLabel(textSource);
		sourceLabel.repaint();
	}

	public String getTextTarget() {
		return textTarget;
	}

	public void setTextTarget(String textTarget) {
		this.textTarget = textTarget;
		targetLabel.setLabel(textTarget);
		targetLabel.repaint();
	}
	
}
