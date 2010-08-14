package uk.ac.open.problem.diagram.providers;

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

import uk.ac.open.problem.ProblemPackage;
import uk.ac.open.problem.diagram.edit.parts.LinkDescription2EditPart;
import uk.ac.open.problem.diagram.edit.parts.LinkDescription3EditPart;
import uk.ac.open.problem.diagram.edit.parts.LinkDescriptionEditPart;
import uk.ac.open.problem.diagram.edit.parts.NodeDescription2EditPart;
import uk.ac.open.problem.diagram.edit.parts.NodeDescription3EditPart;
import uk.ac.open.problem.diagram.edit.parts.NodeDescription4EditPart;
import uk.ac.open.problem.diagram.edit.parts.NodeDescription5EditPart;
import uk.ac.open.problem.diagram.edit.parts.NodeDescription6EditPart;
import uk.ac.open.problem.diagram.edit.parts.NodeDescription7EditPart;
import uk.ac.open.problem.diagram.edit.parts.NodeDescriptionEditPart;
import uk.ac.open.problem.diagram.edit.parts.NodeName2EditPart;
import uk.ac.open.problem.diagram.edit.parts.NodeName3EditPart;
import uk.ac.open.problem.diagram.edit.parts.NodeName4EditPart;
import uk.ac.open.problem.diagram.edit.parts.NodeName5EditPart;
import uk.ac.open.problem.diagram.edit.parts.NodeName6EditPart;
import uk.ac.open.problem.diagram.edit.parts.NodeNameDescriptionEditPart;
import uk.ac.open.problem.diagram.edit.parts.NodeNameEditPart;
import uk.ac.open.problem.diagram.parsers.MessageFormatParser;
import uk.ac.open.problem.diagram.part.ProblemVisualIDRegistry;

/**
 * @generated
 */
public class ProblemParserProvider extends AbstractProvider implements
		IParserProvider {

	/**
	 * @generated
	 */
	private IParser nodeName_5001Parser;

	/**
	 * @generated
	 */
	private IParser getNodeName_5001Parser() {
		if (nodeName_5001Parser == null) {
			EAttribute[] features = new EAttribute[] { ProblemPackage.eINSTANCE
					.getNode_Name() };
			EAttribute[] editableFeatures = new EAttribute[] { ProblemPackage.eINSTANCE
					.getNode_Name() };
			MessageFormatParser parser = new MessageFormatParser(features,
					editableFeatures);
			nodeName_5001Parser = parser;
		}
		return nodeName_5001Parser;
	}

	/**
	 * @generated
	 */
	private IParser nodeDescription_5002Parser;

	/**
	 * @generated
	 */
	private IParser getNodeDescription_5002Parser() {
		if (nodeDescription_5002Parser == null) {
			EAttribute[] features = new EAttribute[] { ProblemPackage.eINSTANCE
					.getNode_Description() };
			EAttribute[] editableFeatures = new EAttribute[] { ProblemPackage.eINSTANCE
					.getNode_Description() };
			MessageFormatParser parser = new MessageFormatParser(features,
					editableFeatures);
			nodeDescription_5002Parser = parser;
		}
		return nodeDescription_5002Parser;
	}

	/**
	 * @generated
	 */
	private IParser nodeDescription_5008Parser;

	/**
	 * @generated
	 */
	private IParser getNodeDescription_5008Parser() {
		if (nodeDescription_5008Parser == null) {
			EAttribute[] features = new EAttribute[] { ProblemPackage.eINSTANCE
					.getNode_Description() };
			EAttribute[] editableFeatures = new EAttribute[] { ProblemPackage.eINSTANCE
					.getNode_Description() };
			MessageFormatParser parser = new MessageFormatParser(features,
					editableFeatures);
			nodeDescription_5008Parser = parser;
		}
		return nodeDescription_5008Parser;
	}

	/**
	 * @generated
	 */
	private IParser nodeName_5009Parser;

	/**
	 * @generated
	 */
	private IParser getNodeName_5009Parser() {
		if (nodeName_5009Parser == null) {
			EAttribute[] features = new EAttribute[] { ProblemPackage.eINSTANCE
					.getNode_Name() };
			EAttribute[] editableFeatures = new EAttribute[] { ProblemPackage.eINSTANCE
					.getNode_Name() };
			MessageFormatParser parser = new MessageFormatParser(features,
					editableFeatures);
			nodeName_5009Parser = parser;
		}
		return nodeName_5009Parser;
	}

	/**
	 * @generated
	 */
	private IParser nodeName_5003Parser;

	/**
	 * @generated
	 */
	private IParser getNodeName_5003Parser() {
		if (nodeName_5003Parser == null) {
			EAttribute[] features = new EAttribute[] { ProblemPackage.eINSTANCE
					.getNode_Name() };
			EAttribute[] editableFeatures = new EAttribute[] { ProblemPackage.eINSTANCE
					.getNode_Name() };
			MessageFormatParser parser = new MessageFormatParser(features,
					editableFeatures);
			nodeName_5003Parser = parser;
		}
		return nodeName_5003Parser;
	}

	/**
	 * @generated
	 */
	private IParser nodeDescription_5004Parser;

	/**
	 * @generated
	 */
	private IParser getNodeDescription_5004Parser() {
		if (nodeDescription_5004Parser == null) {
			EAttribute[] features = new EAttribute[] { ProblemPackage.eINSTANCE
					.getNode_Description() };
			EAttribute[] editableFeatures = new EAttribute[] { ProblemPackage.eINSTANCE
					.getNode_Description() };
			MessageFormatParser parser = new MessageFormatParser(features,
					editableFeatures);
			nodeDescription_5004Parser = parser;
		}
		return nodeDescription_5004Parser;
	}

	/**
	 * @generated
	 */
	private IParser nodeDescription_5010Parser;

	/**
	 * @generated
	 */
	private IParser getNodeDescription_5010Parser() {
		if (nodeDescription_5010Parser == null) {
			EAttribute[] features = new EAttribute[] { ProblemPackage.eINSTANCE
					.getNode_Description() };
			EAttribute[] editableFeatures = new EAttribute[] { ProblemPackage.eINSTANCE
					.getNode_Description() };
			MessageFormatParser parser = new MessageFormatParser(features,
					editableFeatures);
			nodeDescription_5010Parser = parser;
		}
		return nodeDescription_5010Parser;
	}

	/**
	 * @generated
	 */
	private IParser nodeName_5011Parser;

	/**
	 * @generated
	 */
	private IParser getNodeName_5011Parser() {
		if (nodeName_5011Parser == null) {
			EAttribute[] features = new EAttribute[] { ProblemPackage.eINSTANCE
					.getNode_Name() };
			EAttribute[] editableFeatures = new EAttribute[] { ProblemPackage.eINSTANCE
					.getNode_Name() };
			MessageFormatParser parser = new MessageFormatParser(features,
					editableFeatures);
			nodeName_5011Parser = parser;
		}
		return nodeName_5011Parser;
	}

	/**
	 * @generated
	 */
	private IParser nodeName_5005Parser;

	/**
	 * @generated
	 */
	private IParser getNodeName_5005Parser() {
		if (nodeName_5005Parser == null) {
			EAttribute[] features = new EAttribute[] { ProblemPackage.eINSTANCE
					.getNode_Name() };
			EAttribute[] editableFeatures = new EAttribute[] { ProblemPackage.eINSTANCE
					.getNode_Name() };
			MessageFormatParser parser = new MessageFormatParser(features,
					editableFeatures);
			nodeName_5005Parser = parser;
		}
		return nodeName_5005Parser;
	}

	/**
	 * @generated
	 */
	private IParser nodeDescription_5006Parser;

	/**
	 * @generated
	 */
	private IParser getNodeDescription_5006Parser() {
		if (nodeDescription_5006Parser == null) {
			EAttribute[] features = new EAttribute[] { ProblemPackage.eINSTANCE
					.getNode_Description() };
			EAttribute[] editableFeatures = new EAttribute[] { ProblemPackage.eINSTANCE
					.getNode_Description() };
			MessageFormatParser parser = new MessageFormatParser(features,
					editableFeatures);
			nodeDescription_5006Parser = parser;
		}
		return nodeDescription_5006Parser;
	}

	/**
	 * @generated
	 */
	private IParser nodeName_5007Parser;

	/**
	 * @generated
	 */
	private IParser getNodeName_5007Parser() {
		if (nodeName_5007Parser == null) {
			EAttribute[] features = new EAttribute[] { ProblemPackage.eINSTANCE
					.getNode_Name() };
			EAttribute[] editableFeatures = new EAttribute[] { ProblemPackage.eINSTANCE
					.getNode_Name() };
			MessageFormatParser parser = new MessageFormatParser(features,
					editableFeatures);
			nodeName_5007Parser = parser;
		}
		return nodeName_5007Parser;
	}

	/**
	 * @generated
	 */
	private IParser nodeDescription_5012Parser;

	/**
	 * @generated
	 */
	private IParser getNodeDescription_5012Parser() {
		if (nodeDescription_5012Parser == null) {
			EAttribute[] features = new EAttribute[] { ProblemPackage.eINSTANCE
					.getNode_Description() };
			EAttribute[] editableFeatures = new EAttribute[] { ProblemPackage.eINSTANCE
					.getNode_Description() };
			MessageFormatParser parser = new MessageFormatParser(features,
					editableFeatures);
			nodeDescription_5012Parser = parser;
		}
		return nodeDescription_5012Parser;
	}

	/**
	 * @generated
	 */
	private IParser nodeName_5013Parser;

	/**
	 * @generated
	 */
	private IParser getNodeName_5013Parser() {
		if (nodeName_5013Parser == null) {
			EAttribute[] features = new EAttribute[] { ProblemPackage.eINSTANCE
					.getNode_Name() };
			EAttribute[] editableFeatures = new EAttribute[] { ProblemPackage.eINSTANCE
					.getNode_Name() };
			MessageFormatParser parser = new MessageFormatParser(features,
					editableFeatures);
			nodeName_5013Parser = parser;
		}
		return nodeName_5013Parser;
	}

	/**
	 * @generated
	 */
	private IParser nodeDescription_5014Parser;

	/**
	 * @generated
	 */
	private IParser getNodeDescription_5014Parser() {
		if (nodeDescription_5014Parser == null) {
			EAttribute[] features = new EAttribute[] { ProblemPackage.eINSTANCE
					.getNode_Description() };
			EAttribute[] editableFeatures = new EAttribute[] { ProblemPackage.eINSTANCE
					.getNode_Description() };
			MessageFormatParser parser = new MessageFormatParser(features,
					editableFeatures);
			nodeDescription_5014Parser = parser;
		}
		return nodeDescription_5014Parser;
	}

	/**
	 * @generated
	 */
	private IParser linkDescription_6001Parser;

	/**
	 * @generated
	 */
	private IParser getLinkDescription_6001Parser() {
		if (linkDescription_6001Parser == null) {
			EAttribute[] features = new EAttribute[] { ProblemPackage.eINSTANCE
					.getLink_Description() };
			EAttribute[] editableFeatures = new EAttribute[] { ProblemPackage.eINSTANCE
					.getLink_Description() };
			MessageFormatParser parser = new MessageFormatParser(features,
					editableFeatures);
			linkDescription_6001Parser = parser;
		}
		return linkDescription_6001Parser;
	}

	/**
	 * @generated
	 */
	private IParser linkDescription_6002Parser;

	/**
	 * @generated
	 */
	private IParser getLinkDescription_6002Parser() {
		if (linkDescription_6002Parser == null) {
			EAttribute[] features = new EAttribute[] { ProblemPackage.eINSTANCE
					.getLink_Description() };
			EAttribute[] editableFeatures = new EAttribute[] { ProblemPackage.eINSTANCE
					.getLink_Description() };
			MessageFormatParser parser = new MessageFormatParser(features,
					editableFeatures);
			linkDescription_6002Parser = parser;
		}
		return linkDescription_6002Parser;
	}

	/**
	 * @generated
	 */
	private IParser linkDescription_6003Parser;

	/**
	 * @generated
	 */
	private IParser getLinkDescription_6003Parser() {
		if (linkDescription_6003Parser == null) {
			EAttribute[] features = new EAttribute[] { ProblemPackage.eINSTANCE
					.getLink_Description() };
			EAttribute[] editableFeatures = new EAttribute[] { ProblemPackage.eINSTANCE
					.getLink_Description() };
			MessageFormatParser parser = new MessageFormatParser(features,
					editableFeatures);
			linkDescription_6003Parser = parser;
		}
		return linkDescription_6003Parser;
	}

	/**
	 * @generated
	 */
	protected IParser getParser(int visualID) {
		switch (visualID) {
		case NodeNameDescriptionEditPart.VISUAL_ID:
			return getNodeName_5001Parser();
		case NodeDescriptionEditPart.VISUAL_ID:
			return getNodeDescription_5002Parser();
		case NodeNameEditPart.VISUAL_ID:
			return getNodeName_5003Parser();
		case NodeDescription2EditPart.VISUAL_ID:
			return getNodeDescription_5004Parser();
		case NodeName2EditPart.VISUAL_ID:
			return getNodeName_5005Parser();
		case NodeDescription3EditPart.VISUAL_ID:
			return getNodeDescription_5006Parser();
		case NodeName3EditPart.VISUAL_ID:
			return getNodeName_5007Parser();
		case NodeDescription4EditPart.VISUAL_ID:
			return getNodeDescription_5008Parser();
		case NodeName4EditPart.VISUAL_ID:
			return getNodeName_5009Parser();
		case NodeDescription5EditPart.VISUAL_ID:
			return getNodeDescription_5010Parser();
		case NodeName5EditPart.VISUAL_ID:
			return getNodeName_5011Parser();
		case NodeDescription6EditPart.VISUAL_ID:
			return getNodeDescription_5012Parser();
		case NodeName6EditPart.VISUAL_ID:
			return getNodeName_5013Parser();
		case NodeDescription7EditPart.VISUAL_ID:
			return getNodeDescription_5014Parser();
		case LinkDescriptionEditPart.VISUAL_ID:
			return getLinkDescription_6001Parser();
		case LinkDescription2EditPart.VISUAL_ID:
			return getLinkDescription_6002Parser();
		case LinkDescription3EditPart.VISUAL_ID:
			return getLinkDescription_6003Parser();
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
			return getParser(ProblemVisualIDRegistry.getVisualID(vid));
		}
		View view = (View) hint.getAdapter(View.class);
		if (view != null) {
			return getParser(ProblemVisualIDRegistry.getVisualID(view));
		}
		return null;
	}

	/**
	 * @generated
	 */
	public boolean provides(IOperation operation) {
		if (operation instanceof GetParserOperation) {
			IAdaptable hint = ((GetParserOperation) operation).getHint();
			if (ProblemElementTypes.getElement(hint) == null) {
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
