/**
 * generated by Xtext 2.20.0
 */
package uk.ac.kcl.inf.iSCL.impl;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import uk.ac.kcl.inf.iSCL.ClaimTerm;
import uk.ac.kcl.inf.iSCL.Customer;
import uk.ac.kcl.inf.iSCL.ISCLPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Claim Term</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link uk.ac.kcl.inf.iSCL.impl.ClaimTermImpl#getClaim <em>Claim</em>}</li>
 *   <li>{@link uk.ac.kcl.inf.iSCL.impl.ClaimTermImpl#getClaimer <em>Claimer</em>}</li>
 * </ul>
 *
 * @generated
 */
public class ClaimTermImpl extends MinimalEObjectImpl.Container implements ClaimTerm
{
  /**
   * The default value of the '{@link #getClaim() <em>Claim</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getClaim()
   * @generated
   * @ordered
   */
  protected static final float CLAIM_EDEFAULT = 0.0F;

  /**
   * The cached value of the '{@link #getClaim() <em>Claim</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getClaim()
   * @generated
   * @ordered
   */
  protected float claim = CLAIM_EDEFAULT;

  /**
   * The cached value of the '{@link #getClaimer() <em>Claimer</em>}' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getClaimer()
   * @generated
   * @ordered
   */
  protected Customer claimer;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected ClaimTermImpl()
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
    return ISCLPackage.Literals.CLAIM_TERM;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public float getClaim()
  {
    return claim;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public void setClaim(float newClaim)
  {
    float oldClaim = claim;
    claim = newClaim;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, ISCLPackage.CLAIM_TERM__CLAIM, oldClaim, claim));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public Customer getClaimer()
  {
    if (claimer != null && claimer.eIsProxy())
    {
      InternalEObject oldClaimer = (InternalEObject)claimer;
      claimer = (Customer)eResolveProxy(oldClaimer);
      if (claimer != oldClaimer)
      {
        if (eNotificationRequired())
          eNotify(new ENotificationImpl(this, Notification.RESOLVE, ISCLPackage.CLAIM_TERM__CLAIMER, oldClaimer, claimer));
      }
    }
    return claimer;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Customer basicGetClaimer()
  {
    return claimer;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public void setClaimer(Customer newClaimer)
  {
    Customer oldClaimer = claimer;
    claimer = newClaimer;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, ISCLPackage.CLAIM_TERM__CLAIMER, oldClaimer, claimer));
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
      case ISCLPackage.CLAIM_TERM__CLAIM:
        return getClaim();
      case ISCLPackage.CLAIM_TERM__CLAIMER:
        if (resolve) return getClaimer();
        return basicGetClaimer();
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
      case ISCLPackage.CLAIM_TERM__CLAIM:
        setClaim((Float)newValue);
        return;
      case ISCLPackage.CLAIM_TERM__CLAIMER:
        setClaimer((Customer)newValue);
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
      case ISCLPackage.CLAIM_TERM__CLAIM:
        setClaim(CLAIM_EDEFAULT);
        return;
      case ISCLPackage.CLAIM_TERM__CLAIMER:
        setClaimer((Customer)null);
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
      case ISCLPackage.CLAIM_TERM__CLAIM:
        return claim != CLAIM_EDEFAULT;
      case ISCLPackage.CLAIM_TERM__CLAIMER:
        return claimer != null;
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
    result.append(" (claim: ");
    result.append(claim);
    result.append(')');
    return result.toString();
  }

} //ClaimTermImpl
