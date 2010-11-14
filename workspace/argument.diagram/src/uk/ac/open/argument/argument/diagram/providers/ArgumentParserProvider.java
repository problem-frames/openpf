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
import uk.ac.open.argument.argument.diagram.edit.parts.ArgumentDescriptionRound2EditPart;
import uk.ac.open.argument.argument.diagram.edit.parts.ArgumentDescriptionRoundEditPart;
import uk.ac.open.argument.argument.diagram.edit.parts.FactName2EditPart;
import uk.ac.open.argument.argument.diagram.edit.parts.FactNameEditPart;
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
	private IParser argumentNameDescriptionRound_5003Parser;

	/**
	 * @generated
	 */
	private IParser getArgumentNameDescriptionRound_5003Parser() {
		if (argumentNameDescriptionRound_5003Parser == null) {
			EAttribute[] features = new EAttribute[] {
					ArgumentPackage.eINSTANCE.getNode_Name(),
					ArgumentPackage.eINSTANCE.getNode_Description(),
					ArgumentPackage.eINSTANCE.getArgument_Round() };
			MessageFormatParser parser = new MessageFormatParser(features);
			parser.setViewPattern("{0}: {1} #{2}"); //$NON-NLS-1$
			parser.setEditorPattern("{0}: {1} #{2}"); //$NON-NLS-1$
			parser.setEditPattern("{0}: {1} #{2}"); //$NON-NLS-1$
			argumentNameDescriptionRound_5003Parser = parser;
		}
		return argumentNameDescriptionRound_5003Parser;
	}

	/**
	 * @generated
	 */
	private IParser factNameDescriptionExpr_5004Parser;

	/**
	 * @generated
	 */
	private IParser getFactNameDescriptionExpr_5004Parser() {
		if (factNameDescriptionExpr_5004Parser == null) {
			EAttribute[] features = new EAttribute[] {
					ArgumentPackage.eINSTANCE.getNode_Name(),
					ArgumentPackage.eINSTANCE.getNode_Description(),
					ArgumentPackage.eINSTANCE.getFact_Expr() };
			MessageFormatParser parser = new MessageFormatParser(features);
			parser.setViewPattern("{0}: {1}: {2}"); //$NON-NLS-1$
			parser.setEditorPattern("{0}: {1}: {2}"); //$NON-NLS-1$
			parser.setEditPattern("{0}: {1}: {2}"); //$NON-NLS-1$
			factNameDescriptionExpr_5004Parser = parser;
		}
		return factNameDescriptionExpr_5004Parser;
	}

	/**
	 * @generated
	 */
	private IParser factNameDescriptionExpr_5001Parser;

	/**
	 * @generated
	 */
	private IParser getFactNameDescriptionExpr_5001Parser() {
		if (factNameDescriptionExpr_5001Parser == null) {
			EAttribute[] features = new EAttribute[] {
					ArgumentPackage.eINSTANCE.getNode_Name(),
					ArgumentPackage.eINSTANCE.getNode_Description(),
					ArgumentPackage.eINSTANCE.getFact_Expr() };
			MessageFormatParser parser = new MessageFormatParser(features);
			parser.setViewPattern("{0}: {1}: {2}"); //$NON-NLS-1$
			parser.setEditorPattern("{0}: {1}: {2}"); //$NON-NLS-1$
			parser.setEditPattern("{0}: {1}: {2}"); //$NON-NLS-1$
			factNameDescriptionExpr_5001Parser = parser;
		}
		return factNameDescriptionExpr_5001Parser;
	}

	/**
	 * @generated
	 */
	private IParser argumentNameDescriptionRound_5002Parser;

	/**
	 * @generated
	 */
	private IParser getArgumentNameDescriptionRound_5002Parser() {
		if (argumentNameDescriptionRound_5002Parser == null) {
			EAttribute[] features = new EAttribute[] {
					ArgumentPackage.eINSTANCE.getNode_Name(),
					ArgumentPackage.eINSTANCE.getNode_Description(),
					ArgumentPackage.eINSTANCE.getArgument_Round() };
			MessageFormatParser parser = new MessageFormatParser(features);
			parser.setViewPattern("{0}: {1} #{2}"); //$NON-NLS-1$
			parser.setEditorPattern("{0}: {1} #{2}"); //$NON-NLS-1$
			parser.setEditPattern("{0}: {1} #{2}"); //$NON-NLS-1$
			argumentNameDescriptionRound_5002Parser = parser;
		}
		return argumentNameDescriptionRound_5002Parser;
	}

	/**
	 * @generated
	 */
	protected IParser getParser(int visualID) {
		switch (visualID) {
		case ArgumentDescriptionRoundEditPart.VISUAL_ID:
			return getArgumentNameDescriptionRound_5003Parser();
		case FactNameEditPart.VISUAL_ID:
			return getFactNameDescriptionExpr_5004Parser();
		case FactName2EditPart.VISUAL_ID:
			return getFactNameDescriptionExpr_5001Parser();
		case ArgumentDescriptionRound2EditPart.VISUAL_ID:
			return getArgumentNameDescriptionRound_5002Parser();
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
