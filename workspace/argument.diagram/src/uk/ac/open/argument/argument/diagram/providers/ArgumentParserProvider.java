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
import uk.ac.open.argument.argument.diagram.edit.parts.ArgumentName2EditPart;
import uk.ac.open.argument.argument.diagram.edit.parts.ArgumentNameEditPart;
import uk.ac.open.argument.argument.diagram.edit.parts.ClaimName2EditPart;
import uk.ac.open.argument.argument.diagram.edit.parts.ClaimName3EditPart;
import uk.ac.open.argument.argument.diagram.edit.parts.ClaimNameEditPart;
import uk.ac.open.argument.argument.diagram.edit.parts.FactName2EditPart;
import uk.ac.open.argument.argument.diagram.edit.parts.FactName3EditPart;
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
	private IParser argumentName_5006Parser;

	/**
	 * @generated
	 */
	private IParser getArgumentName_5006Parser() {
		if (argumentName_5006Parser == null) {
			EAttribute[] features = new EAttribute[] { ArgumentPackage.eINSTANCE
					.getNode_Name() };
			MessageFormatParser parser = new MessageFormatParser(features);
			argumentName_5006Parser = parser;
		}
		return argumentName_5006Parser;
	}

	/**
	 * @generated
	 */
	private IParser factName_5007Parser;

	/**
	 * @generated
	 */
	private IParser getFactName_5007Parser() {
		if (factName_5007Parser == null) {
			EAttribute[] features = new EAttribute[] { ArgumentPackage.eINSTANCE
					.getNode_Name() };
			MessageFormatParser parser = new MessageFormatParser(features);
			factName_5007Parser = parser;
		}
		return factName_5007Parser;
	}

	/**
	 * @generated
	 */
	private IParser claimName_5008Parser;

	/**
	 * @generated
	 */
	private IParser getClaimName_5008Parser() {
		if (claimName_5008Parser == null) {
			EAttribute[] features = new EAttribute[] { ArgumentPackage.eINSTANCE
					.getNode_Name() };
			MessageFormatParser parser = new MessageFormatParser(features);
			claimName_5008Parser = parser;
		}
		return claimName_5008Parser;
	}

	/**
	 * @generated
	 */
	private IParser claimName_5001Parser;

	/**
	 * @generated
	 */
	private IParser getClaimName_5001Parser() {
		if (claimName_5001Parser == null) {
			EAttribute[] features = new EAttribute[] { ArgumentPackage.eINSTANCE
					.getNode_Name() };
			MessageFormatParser parser = new MessageFormatParser(features);
			claimName_5001Parser = parser;
		}
		return claimName_5001Parser;
	}

	/**
	 * @generated
	 */
	private IParser factName_5002Parser;

	/**
	 * @generated
	 */
	private IParser getFactName_5002Parser() {
		if (factName_5002Parser == null) {
			EAttribute[] features = new EAttribute[] { ArgumentPackage.eINSTANCE
					.getNode_Name() };
			MessageFormatParser parser = new MessageFormatParser(features);
			factName_5002Parser = parser;
		}
		return factName_5002Parser;
	}

	/**
	 * @generated
	 */
	private IParser argumentName_5005Parser;

	/**
	 * @generated
	 */
	private IParser getArgumentName_5005Parser() {
		if (argumentName_5005Parser == null) {
			EAttribute[] features = new EAttribute[] { ArgumentPackage.eINSTANCE
					.getNode_Name() };
			MessageFormatParser parser = new MessageFormatParser(features);
			argumentName_5005Parser = parser;
		}
		return argumentName_5005Parser;
	}

	/**
	 * @generated
	 */
	private IParser factName_5003Parser;

	/**
	 * @generated
	 */
	private IParser getFactName_5003Parser() {
		if (factName_5003Parser == null) {
			EAttribute[] features = new EAttribute[] { ArgumentPackage.eINSTANCE
					.getNode_Name() };
			MessageFormatParser parser = new MessageFormatParser(features);
			factName_5003Parser = parser;
		}
		return factName_5003Parser;
	}

	/**
	 * @generated
	 */
	private IParser claimName_5004Parser;

	/**
	 * @generated
	 */
	private IParser getClaimName_5004Parser() {
		if (claimName_5004Parser == null) {
			EAttribute[] features = new EAttribute[] { ArgumentPackage.eINSTANCE
					.getNode_Name() };
			MessageFormatParser parser = new MessageFormatParser(features);
			claimName_5004Parser = parser;
		}
		return claimName_5004Parser;
	}

	/**
	 * @generated
	 */
	protected IParser getParser(int visualID) {
		switch (visualID) {
		case ArgumentNameEditPart.VISUAL_ID:
			return getArgumentName_5006Parser();
		case FactNameEditPart.VISUAL_ID:
			return getFactName_5007Parser();
		case ClaimNameEditPart.VISUAL_ID:
			return getClaimName_5008Parser();
		case ClaimName2EditPart.VISUAL_ID:
			return getClaimName_5001Parser();
		case FactName2EditPart.VISUAL_ID:
			return getFactName_5002Parser();
		case ArgumentName2EditPart.VISUAL_ID:
			return getArgumentName_5005Parser();
		case FactName3EditPart.VISUAL_ID:
			return getFactName_5003Parser();
		case ClaimName3EditPart.VISUAL_ID:
			return getClaimName_5004Parser();
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
