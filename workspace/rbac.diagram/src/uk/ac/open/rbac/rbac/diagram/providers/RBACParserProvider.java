package uk.ac.open.rbac.rbac.diagram.providers;

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

import uk.ac.open.rbac.rbac.RbacPackage;
import uk.ac.open.rbac.rbac.diagram.edit.parts.ObjectNameEditPart;
import uk.ac.open.rbac.rbac.diagram.edit.parts.RoleNameEditPart;
import uk.ac.open.rbac.rbac.diagram.edit.parts.RolePermissionAssignmentTypeEditPart;
import uk.ac.open.rbac.rbac.diagram.edit.parts.SessionNameEditPart;
import uk.ac.open.rbac.rbac.diagram.edit.parts.UserNameEditPart;
import uk.ac.open.rbac.rbac.diagram.parsers.MessageFormatParser;
import uk.ac.open.rbac.rbac.diagram.part.RBACVisualIDRegistry;

/**
 * @generated
 */
public class RBACParserProvider extends AbstractProvider implements
		IParserProvider {

	/**
	 * @generated
	 */
	private IParser roleName_5001Parser;

	/**
	 * @generated
	 */
	private IParser getRoleName_5001Parser() {
		if (roleName_5001Parser == null) {
			EAttribute[] features = new EAttribute[] { RbacPackage.eINSTANCE
					.getRole_Name() };
			MessageFormatParser parser = new MessageFormatParser(features);
			roleName_5001Parser = parser;
		}
		return roleName_5001Parser;
	}

	/**
	 * @generated
	 */
	private IParser userName_5002Parser;

	/**
	 * @generated
	 */
	private IParser getUserName_5002Parser() {
		if (userName_5002Parser == null) {
			EAttribute[] features = new EAttribute[] { RbacPackage.eINSTANCE
					.getUser_Name() };
			MessageFormatParser parser = new MessageFormatParser(features);
			userName_5002Parser = parser;
		}
		return userName_5002Parser;
	}

	/**
	 * @generated
	 */
	private IParser sessionName_5003Parser;

	/**
	 * @generated
	 */
	private IParser getSessionName_5003Parser() {
		if (sessionName_5003Parser == null) {
			EAttribute[] features = new EAttribute[] { RbacPackage.eINSTANCE
					.getSession_Name() };
			MessageFormatParser parser = new MessageFormatParser(features);
			sessionName_5003Parser = parser;
		}
		return sessionName_5003Parser;
	}

	/**
	 * @generated
	 */
	private IParser objectNameType_5004Parser;

	/**
	 * @generated
	 */
	private IParser getObjectNameType_5004Parser() {
		if (objectNameType_5004Parser == null) {
			EAttribute[] features = new EAttribute[] {
					RbacPackage.eINSTANCE.getObject_Name(),
					RbacPackage.eINSTANCE.getObject_Type() };
			MessageFormatParser parser = new MessageFormatParser(features);
			parser.setViewPattern("{0}: {1}"); //$NON-NLS-1$
			parser.setEditorPattern("{0}: {1}"); //$NON-NLS-1$
			parser.setEditPattern("{0}: {1}"); //$NON-NLS-1$
			objectNameType_5004Parser = parser;
		}
		return objectNameType_5004Parser;
	}

	/**
	 * @generated
	 */
	private IParser rolePermissionAssignmentType_6001Parser;

	/**
	 * @generated
	 */
	private IParser getRolePermissionAssignmentType_6001Parser() {
		if (rolePermissionAssignmentType_6001Parser == null) {
			EAttribute[] features = new EAttribute[] { RbacPackage.eINSTANCE
					.getRolePermissionAssignment_Type() };
			MessageFormatParser parser = new MessageFormatParser(features);
			rolePermissionAssignmentType_6001Parser = parser;
		}
		return rolePermissionAssignmentType_6001Parser;
	}

	/**
	 * @generated
	 */
	protected IParser getParser(int visualID) {
		switch (visualID) {
		case RoleNameEditPart.VISUAL_ID:
			return getRoleName_5001Parser();
		case UserNameEditPart.VISUAL_ID:
			return getUserName_5002Parser();
		case SessionNameEditPart.VISUAL_ID:
			return getSessionName_5003Parser();
		case ObjectNameEditPart.VISUAL_ID:
			return getObjectNameType_5004Parser();
		case RolePermissionAssignmentTypeEditPart.VISUAL_ID:
			return getRolePermissionAssignmentType_6001Parser();
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
			return getParser(RBACVisualIDRegistry.getVisualID(vid));
		}
		View view = (View) hint.getAdapter(View.class);
		if (view != null) {
			return getParser(RBACVisualIDRegistry.getVisualID(view));
		}
		return null;
	}

	/**
	 * @generated
	 */
	public boolean provides(IOperation operation) {
		if (operation instanceof GetParserOperation) {
			IAdaptable hint = ((GetParserOperation) operation).getHint();
			if (RBACElementTypes.getElement(hint) == null) {
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
