package uk.ac.open.argument.argument.diagram.providers;

import org.eclipse.core.runtime.IAdaptable;
import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.gmf.runtime.common.core.service.AbstractProvider;
import org.eclipse.gmf.runtime.common.core.service.IOperation;
import org.eclipse.gmf.runtime.common.ui.services.parser.GetParserOperation;
import org.eclipse.gmf.runtime.common.ui.services.parser.IParser;
import org.eclipse.gmf.runtime.common.ui.services.parser.IParserProvider;
import org.eclipse.gmf.runtime.common.ui.services.parser.ParserService;
import org.eclipse.gmf.runtime.emf.type.core.IElementType;
import org.eclipse.gmf.runtime.emf.ui.services.parser.ParserHintAdapter;
import org.eclipse.gmf.runtime.notation.View;

import uk.ac.open.argument.argument.ArgumentPackage;
import uk.ac.open.argument.argument.diagram.edit.parts.ArgumentNameDescriptionRoundExp2EditPart;
import uk.ac.open.argument.argument.diagram.edit.parts.ArgumentNameDescriptionRoundExp3EditPart;
import uk.ac.open.argument.argument.diagram.edit.parts.ArgumentNameDescriptionRoundExpEditPart;
import uk.ac.open.argument.argument.diagram.edit.parts.MitigatesNameEditPart;
import uk.ac.open.argument.argument.diagram.parsers.MessageFormatParser;
import uk.ac.open.argument.argument.diagram.part.ArgumentVisualIDRegistry;

/**
 * @generated
 */
public class ArgumentParserProvider extends AbstractProvider implements
		IParserProvider {

	/**
	 * @generated
	 */
	private IParser argumentNameDescriptionRoundExpr_5003Parser;

	/**
	 * @generated
	 */
	private IParser getArgumentNameDescriptionRoundExpr_5003Parser() {
		if (argumentNameDescriptionRoundExpr_5003Parser == null) {
			EAttribute[] features = new EAttribute[] {
					ArgumentPackage.eINSTANCE.getArgument_Name(),
					ArgumentPackage.eINSTANCE.getArgument_Description(),
					ArgumentPackage.eINSTANCE.getArgument_Round(),
					ArgumentPackage.eINSTANCE.getArgument_Expr() };
			MessageFormatParser parser = new MessageFormatParser(features);
			parser.setViewPattern("{0}: {1}\n {2} #{3}"); //$NON-NLS-1$
			parser.setEditorPattern("{0}: {1}\n {2} #{3}"); //$NON-NLS-1$
			parser.setEditPattern("{0}: {1}\n {2} #{3}"); //$NON-NLS-1$
			argumentNameDescriptionRoundExpr_5003Parser = parser;
		}
		return argumentNameDescriptionRoundExpr_5003Parser;
	}

	/**
	 * @generated
	 */
	private IParser argumentNameDescriptionRoundExpr_5002Parser;

	/**
	 * @generated
	 */
	private IParser getArgumentNameDescriptionRoundExpr_5002Parser() {
		if (argumentNameDescriptionRoundExpr_5002Parser == null) {
			EAttribute[] features = new EAttribute[] {
					ArgumentPackage.eINSTANCE.getArgument_Name(),
					ArgumentPackage.eINSTANCE.getArgument_Description(),
					ArgumentPackage.eINSTANCE.getArgument_Round(),
					ArgumentPackage.eINSTANCE.getArgument_Expr() };
			MessageFormatParser parser = new MessageFormatParser(features);
			parser.setViewPattern("{0}: {1}\n {2} #{3}"); //$NON-NLS-1$
			parser.setEditorPattern("{0}: {1}\n {2} #{3}"); //$NON-NLS-1$
			parser.setEditPattern("{0}: {1}\n {2} #{3}"); //$NON-NLS-1$
			argumentNameDescriptionRoundExpr_5002Parser = parser;
		}
		return argumentNameDescriptionRoundExpr_5002Parser;
	}

	/**
	 * @generated
	 */
	private IParser argumentNameDescriptionRoundExpr_5001Parser;

	/**
	 * @generated
	 */
	private IParser getArgumentNameDescriptionRoundExpr_5001Parser() {
		if (argumentNameDescriptionRoundExpr_5001Parser == null) {
			EAttribute[] features = new EAttribute[] {
					ArgumentPackage.eINSTANCE.getArgument_Name(),
					ArgumentPackage.eINSTANCE.getArgument_Description(),
					ArgumentPackage.eINSTANCE.getArgument_Round(),
					ArgumentPackage.eINSTANCE.getArgument_Expr() };
			MessageFormatParser parser = new MessageFormatParser(features);
			parser.setViewPattern("{0}: {1}\n {2} #{3}"); //$NON-NLS-1$
			parser.setEditorPattern("{0}: {1}\n {2} #{3}"); //$NON-NLS-1$
			parser.setEditPattern("{0}: {1}\n {2} #{3}"); //$NON-NLS-1$
			argumentNameDescriptionRoundExpr_5001Parser = parser;
		}
		return argumentNameDescriptionRoundExpr_5001Parser;
	}

	/**
	 * @generated
	 */
	protected IParser getParser(int visualID) {
		switch (visualID) {
		case ArgumentNameDescriptionRoundExpEditPart.VISUAL_ID:
			return getArgumentNameDescriptionRoundExpr_5003Parser();
		case ArgumentNameDescriptionRoundExp2EditPart.VISUAL_ID:
			return getArgumentNameDescriptionRoundExpr_5002Parser();
		case ArgumentNameDescriptionRoundExp3EditPart.VISUAL_ID:
			return getArgumentNameDescriptionRoundExpr_5001Parser();
		}
		return null;
	}

	/**
	 * Utility method that consults ParserService
	 * @generated
	 */
	public static IParser getParser(IElementType type, EObject object,
			String parserHint) {
		return ParserService.getInstance().getParser(
				new HintAdapter(type, object, parserHint));
	}

	/**
	 * @generated
	 */
	public IParser getParser(IAdaptable hint) {
		String vid = (String) hint.getAdapter(String.class);
		if (vid != null) {
			return getParser(ArgumentVisualIDRegistry.getVisualID(vid));
		}
		View view = (View) hint.getAdapter(View.class);
		if (view != null) {
			return getParser(ArgumentVisualIDRegistry.getVisualID(view));
		}
		return null;
	}

	/**
	 * @generated
	 */
	public boolean provides(IOperation operation) {
		if (operation instanceof GetParserOperation) {
			IAdaptable hint = ((GetParserOperation) operation).getHint();
			if (ArgumentElementTypes.getElement(hint) == null) {
				return false;
			}
			return getParser(hint) != null;
		}
		return false;
	}

	/**
	 * @generated
	 */
	private static class HintAdapter extends ParserHintAdapter {

		/**
		 * @generated
		 */
		private final IElementType elementType;

		/**
		 * @generated
		 */
		public HintAdapter(IElementType type, EObject object, String parserHint) {
			super(object, parserHint);
			assert type != null;
			elementType = type;
		}

		/**
		 * @generated
		 */
		public Object getAdapter(Class adapter) {
			if (IElementType.class.equals(adapter)) {
				return elementType;
			}
			return super.getAdapter(adapter);
		}
	}

}
