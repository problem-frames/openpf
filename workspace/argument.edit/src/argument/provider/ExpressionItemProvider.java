/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package argument.provider;



import java.util.Collection;
import java.util.List;

import org.eclipse.emf.common.notify.AdapterFactory;
import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EStructuralFeature;

import org.eclipse.emf.edit.provider.IEditingDomainItemProvider;
import org.eclipse.emf.edit.provider.IItemLabelProvider;
import org.eclipse.emf.edit.provider.IItemPropertyDescriptor;
import org.eclipse.emf.edit.provider.IItemPropertySource;
import org.eclipse.emf.edit.provider.IStructuredItemContentProvider;
import org.eclipse.emf.edit.provider.ITreeItemContentProvider;
import org.eclipse.emf.edit.provider.ViewerNotification;

import argument.argument.ArgumentFactory;
import argument.argument.ArgumentPackage;
import argument.argument.Expression;


/**
 * This is the item provider adapter for a {@link argument.argument.Expression} object.
 * <!-- begin-user-doc -->
 * <!-- end-user-doc -->
 * @generated
 */
public class ExpressionItemProvider
  extends PrePrimaryExprItemProvider
  implements
    IEditingDomainItemProvider,
    IStructuredItemContentProvider,
    ITreeItemContentProvider,
    IItemLabelProvider,
    IItemPropertySource
{
  /**
   * This constructs an instance from a factory and a notifier.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public ExpressionItemProvider(AdapterFactory adapterFactory)
  {
    super(adapterFactory);
  }

  /**
   * This returns the property descriptors for the adapted class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public List<IItemPropertyDescriptor> getPropertyDescriptors(Object object)
  {
    if (itemPropertyDescriptors == null)
    {
      super.getPropertyDescriptors(object);

    }
    return itemPropertyDescriptors;
  }

  /**
   * This specifies how to implement {@link #getChildren} and is used to deduce an appropriate feature for an
   * {@link org.eclipse.emf.edit.command.AddCommand}, {@link org.eclipse.emf.edit.command.RemoveCommand} or
   * {@link org.eclipse.emf.edit.command.MoveCommand} in {@link #createCommand}.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public Collection<? extends EStructuralFeature> getChildrenFeatures(Object object)
  {
    if (childrenFeatures == null)
    {
      super.getChildrenFeatures(object);
      childrenFeatures.add(ArgumentPackage.Literals.EXPRESSION__ASSIGN);
    }
    return childrenFeatures;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  protected EStructuralFeature getChildFeature(Object object, Object child)
  {
    // Check the type of the specified child object and return the proper feature to use for
    // adding (see {@link AddCommand}) it as a child.

    return super.getChildFeature(object, child);
  }

  /**
   * This returns Expression.gif.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public Object getImage(Object object)
  {
    return overlayImage(object, getResourceLocator().getImage("full/obj16/Expression"));
  }

  /**
   * This returns the label text for the adapted class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public String getText(Object object)
  {
    Expression expression = (Expression)object;
    return getString("_UI_Expression_type") + " " + expression.getN();
  }

  /**
   * This handles model notifications by calling {@link #updateChildren} to update any cached
   * children and by creating a viewer notification, which it passes to {@link #fireNotifyChanged}.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public void notifyChanged(Notification notification)
  {
    updateChildren(notification);

    switch (notification.getFeatureID(Expression.class))
    {
      case ArgumentPackage.EXPRESSION__ASSIGN:
        fireNotifyChanged(new ViewerNotification(notification, notification.getNotifier(), true, false));
        return;
    }
    super.notifyChanged(notification);
  }

  /**
   * This adds {@link org.eclipse.emf.edit.command.CommandParameter}s describing the children
   * that can be created under this object.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  protected void collectNewChildDescriptors(Collection<Object> newChildDescriptors, Object object)
  {
    super.collectNewChildDescriptors(newChildDescriptors, object);

    newChildDescriptors.add
      (createChildParameter
        (ArgumentPackage.Literals.EXPRESSION__ASSIGN,
         ArgumentFactory.eINSTANCE.createAssignmentOp()));

    newChildDescriptors.add
      (createChildParameter
        (ArgumentPackage.Literals.EXPRESSION__ASSIGN,
         ArgumentFactory.eINSTANCE.createOrExp()));

    newChildDescriptors.add
      (createChildParameter
        (ArgumentPackage.Literals.EXPRESSION__ASSIGN,
         ArgumentFactory.eINSTANCE.createAndExp()));

    newChildDescriptors.add
      (createChildParameter
        (ArgumentPackage.Literals.EXPRESSION__ASSIGN,
         ArgumentFactory.eINSTANCE.createRelational()));

    newChildDescriptors.add
      (createChildParameter
        (ArgumentPackage.Literals.EXPRESSION__ASSIGN,
         ArgumentFactory.eINSTANCE.createAddition()));

    newChildDescriptors.add
      (createChildParameter
        (ArgumentPackage.Literals.EXPRESSION__ASSIGN,
         ArgumentFactory.eINSTANCE.createMultiplication()));

    newChildDescriptors.add
      (createChildParameter
        (ArgumentPackage.Literals.EXPRESSION__ASSIGN,
         ArgumentFactory.eINSTANCE.createPower()));

    newChildDescriptors.add
      (createChildParameter
        (ArgumentPackage.Literals.EXPRESSION__ASSIGN,
         ArgumentFactory.eINSTANCE.createUnaryExpr()));

    newChildDescriptors.add
      (createChildParameter
        (ArgumentPackage.Literals.EXPRESSION__ASSIGN,
         ArgumentFactory.eINSTANCE.createAssignPlus()));

    newChildDescriptors.add
      (createChildParameter
        (ArgumentPackage.Literals.EXPRESSION__ASSIGN,
         ArgumentFactory.eINSTANCE.createAssignMin()));

    newChildDescriptors.add
      (createChildParameter
        (ArgumentPackage.Literals.EXPRESSION__ASSIGN,
         ArgumentFactory.eINSTANCE.createOr()));

    newChildDescriptors.add
      (createChildParameter
        (ArgumentPackage.Literals.EXPRESSION__ASSIGN,
         ArgumentFactory.eINSTANCE.createAnd()));

    newChildDescriptors.add
      (createChildParameter
        (ArgumentPackage.Literals.EXPRESSION__ASSIGN,
         ArgumentFactory.eINSTANCE.createRelNotEq()));

    newChildDescriptors.add
      (createChildParameter
        (ArgumentPackage.Literals.EXPRESSION__ASSIGN,
         ArgumentFactory.eINSTANCE.createRelEqEq()));

    newChildDescriptors.add
      (createChildParameter
        (ArgumentPackage.Literals.EXPRESSION__ASSIGN,
         ArgumentFactory.eINSTANCE.createRelLtEq()));

    newChildDescriptors.add
      (createChildParameter
        (ArgumentPackage.Literals.EXPRESSION__ASSIGN,
         ArgumentFactory.eINSTANCE.createRelGtEq()));

    newChildDescriptors.add
      (createChildParameter
        (ArgumentPackage.Literals.EXPRESSION__ASSIGN,
         ArgumentFactory.eINSTANCE.createRelEq()));

    newChildDescriptors.add
      (createChildParameter
        (ArgumentPackage.Literals.EXPRESSION__ASSIGN,
         ArgumentFactory.eINSTANCE.createRelLt()));

    newChildDescriptors.add
      (createChildParameter
        (ArgumentPackage.Literals.EXPRESSION__ASSIGN,
         ArgumentFactory.eINSTANCE.createRelGt()));

    newChildDescriptors.add
      (createChildParameter
        (ArgumentPackage.Literals.EXPRESSION__ASSIGN,
         ArgumentFactory.eINSTANCE.createPlus()));

    newChildDescriptors.add
      (createChildParameter
        (ArgumentPackage.Literals.EXPRESSION__ASSIGN,
         ArgumentFactory.eINSTANCE.createMinus()));

    newChildDescriptors.add
      (createChildParameter
        (ArgumentPackage.Literals.EXPRESSION__ASSIGN,
         ArgumentFactory.eINSTANCE.createMulti()));

    newChildDescriptors.add
      (createChildParameter
        (ArgumentPackage.Literals.EXPRESSION__ASSIGN,
         ArgumentFactory.eINSTANCE.createDiv()));

    newChildDescriptors.add
      (createChildParameter
        (ArgumentPackage.Literals.EXPRESSION__ASSIGN,
         ArgumentFactory.eINSTANCE.createPow()));
  }

}
