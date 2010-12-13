package it.unitn.disi.sistar.modeling.tropos.diagram.providers;

import it.unitn.disi.sistar.modeling.tropos.TroposPackage;
import it.unitn.disi.sistar.modeling.tropos.diagram.edit.parts.ActorNameEditPart;
import it.unitn.disi.sistar.modeling.tropos.diagram.edit.parts.AssociationNameEditPart;
import it.unitn.disi.sistar.modeling.tropos.diagram.edit.parts.ContributionNameEditPart;
import it.unitn.disi.sistar.modeling.tropos.diagram.edit.parts.ServiceName2EditPart;
import it.unitn.disi.sistar.modeling.tropos.diagram.edit.parts.ServiceNameEditPart;
import it.unitn.disi.sistar.modeling.tropos.diagram.parsers.MessageFormatParser;
import it.unitn.disi.sistar.modeling.tropos.diagram.part.TroposVisualIDRegistry;

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

/**
 * @generated
 */
public class TroposParserProvider extends AbstractProvider implements
		IParserProvider {

	/**
	 * @generated
	 */
	private IParser actorName_4002Parser;

	/**
	 * @generated
	 */
	private IParser getActorName_4002Parser() {
		if (actorName_4002Parser == null) {
			EAttribute[] features = new EAttribute[] { TroposPackage.eINSTANCE
					.getGraphicalObject_Name() };
			MessageFormatParser parser = new MessageFormatParser(features);
			actorName_4002Parser = parser;
		}
		return actorName_4002Parser;
	}

	/**
	 * @generated
	 */
	private IParser serviceName_4003Parser;

	/**
	 * @generated
	 */
	private IParser getServiceName_4003Parser() {
		if (serviceName_4003Parser == null) {
			EAttribute[] features = new EAttribute[] { TroposPackage.eINSTANCE
					.getGraphicalObject_Name() };
			MessageFormatParser parser = new MessageFormatParser(features);
			serviceName_4003Parser = parser;
		}
		return serviceName_4003Parser;
	}

	/**
	 * @generated
	 */
	private IParser serviceName_4001Parser;

	/**
	 * @generated
	 */
	private IParser getServiceName_4001Parser() {
		if (serviceName_4001Parser == null) {
			EAttribute[] features = new EAttribute[] { TroposPackage.eINSTANCE
					.getGraphicalObject_Name() };
			MessageFormatParser parser = new MessageFormatParser(features);
			serviceName_4001Parser = parser;
		}
		return serviceName_4001Parser;
	}

	/**
	 * @generated
	 */
	private IParser associationName_4004Parser;

	/**
	 * @generated
	 */
	private IParser getAssociationName_4004Parser() {
		if (associationName_4004Parser == null) {
			EAttribute[] features = new EAttribute[] { TroposPackage.eINSTANCE
					.getGraphicalObject_Name() };
			MessageFormatParser parser = new MessageFormatParser(features);
			associationName_4004Parser = parser;
		}
		return associationName_4004Parser;
	}

	/**
	 * @generated
	 */
	private IParser contributionName_4005Parser;

	/**
	 * @generated
	 */
	private IParser getContributionName_4005Parser() {
		if (contributionName_4005Parser == null) {
			EAttribute[] features = new EAttribute[] { TroposPackage.eINSTANCE
					.getGraphicalObject_Name() };
			MessageFormatParser parser = new MessageFormatParser(features);
			contributionName_4005Parser = parser;
		}
		return contributionName_4005Parser;
	}

	/**
	 * @generated
	 */
	protected IParser getParser(int visualID) {
		switch (visualID) {
		case ActorNameEditPart.VISUAL_ID:
			return getActorName_4002Parser();
		case ServiceName2EditPart.VISUAL_ID:
			return getServiceName_4003Parser();
		case ServiceNameEditPart.VISUAL_ID:
			return getServiceName_4001Parser();
		case AssociationNameEditPart.VISUAL_ID:
			return getAssociationName_4004Parser();
		case ContributionNameEditPart.VISUAL_ID:
			return getContributionName_4005Parser();
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
			return getParser(TroposVisualIDRegistry.getVisualID(vid));
		}
		View view = (View) hint.getAdapter(View.class);
		if (view != null) {
			return getParser(TroposVisualIDRegistry.getVisualID(view));
		}
		return null;
	}

	/**
	 * @generated
	 */
	public boolean provides(IOperation operation) {
		if (operation instanceof GetParserOperation) {
			IAdaptable hint = ((GetParserOperation) operation).getHint();
			if (TroposElementTypes.getElement(hint) == null) {
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
