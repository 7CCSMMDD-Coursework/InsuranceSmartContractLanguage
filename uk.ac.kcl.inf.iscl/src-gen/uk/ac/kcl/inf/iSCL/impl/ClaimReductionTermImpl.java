/**
 * generated by Xtext 2.20.0
 */
package uk.ac.kcl.inf.iSCL.impl;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import uk.ac.kcl.inf.iSCL.ClaimReductionTerm;
import uk.ac.kcl.inf.iSCL.ISCLPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Claim Reduction Term</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link uk.ac.kcl.inf.iSCL.impl.ClaimReductionTermImpl#getClaimReduction <em>Claim Reduction</em>}</li>
 * </ul>
 *
 * @generated
 */
public class ClaimReductionTermImpl extends ViolationTermImpl implements ClaimReductionTerm
{
  /**
   * The default value of the '{@link #getClaimReduction() <em>Claim Reduction</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getClaimReduction()
   * @generated
   * @ordered
   */
  protected static final int CLAIM_REDUCTION_EDEFAULT = 0;

  /**
   * The cached value of the '{@link #getClaimReduction() <em>Claim Reduction</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getClaimReduction()
   * @generated
   * @ordered
   */
  protected int claimReduction = CLAIM_REDUCTION_EDEFAULT;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected ClaimReductionTermImpl()
  {
    super();
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  protected EClass eStaticClass()
  {
    return ISCLPackage.Literals.CLAIM_REDUCTION_TERM;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public int getClaimReduction()
  {
    return claimReduction;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public void setClaimReduction(int newClaimReduction)
  {
    int oldClaimReduction = claimReduction;
    claimReduction = newClaimReduction;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, ISCLPackage.CLAIM_REDUCTION_TERM__CLAIM_REDUCTION, oldClaimReduction, claimReduction));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public Object eGet(int featureID, boolean resolve, boolean coreType)
  {
    switch (featureID)
    {
      case ISCLPackage.CLAIM_REDUCTION_TERM__CLAIM_REDUCTION:
        return getClaimReduction();
    }
    return super.eGet(featureID, resolve, coreType);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public void eSet(int featureID, Object newValue)
  {
    switch (featureID)
    {
      case ISCLPackage.CLAIM_REDUCTION_TERM__CLAIM_REDUCTION:
        setClaimReduction((Integer)newValue);
        return;
    }
    super.eSet(featureID, newValue);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public void eUnset(int featureID)
  {
    switch (featureID)
    {
      case ISCLPackage.CLAIM_REDUCTION_TERM__CLAIM_REDUCTION:
        setClaimReduction(CLAIM_REDUCTION_EDEFAULT);
        return;
    }
    super.eUnset(featureID);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public boolean eIsSet(int featureID)
  {
    switch (featureID)
    {
      case ISCLPackage.CLAIM_REDUCTION_TERM__CLAIM_REDUCTION:
        return claimReduction != CLAIM_REDUCTION_EDEFAULT;
    }
    return super.eIsSet(featureID);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public String toString()
  {
    if (eIsProxy()) return super.toString();

    StringBuilder result = new StringBuilder(super.toString());
    result.append(" (claimReduction: ");
    result.append(claimReduction);
    result.append(')');
    return result.toString();
  }

} //ClaimReductionTermImpl