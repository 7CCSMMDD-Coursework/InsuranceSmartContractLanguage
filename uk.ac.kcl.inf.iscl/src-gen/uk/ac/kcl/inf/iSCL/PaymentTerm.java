/**
 * generated by Xtext 2.20.0
 */
package uk.ac.kcl.inf.iSCL;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Payment Term</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link uk.ac.kcl.inf.iSCL.PaymentTerm#getPremium <em>Premium</em>}</li>
 *   <li>{@link uk.ac.kcl.inf.iSCL.PaymentTerm#getPeriod <em>Period</em>}</li>
 *   <li>{@link uk.ac.kcl.inf.iSCL.PaymentTerm#getIncrease <em>Increase</em>}</li>
 * </ul>
 *
 * @see uk.ac.kcl.inf.iSCL.ISCLPackage#getPaymentTerm()
 * @model
 * @generated
 */
public interface PaymentTerm extends EObject
{
  /**
   * Returns the value of the '<em><b>Premium</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the value of the '<em>Premium</em>' attribute.
   * @see #setPremium(float)
   * @see uk.ac.kcl.inf.iSCL.ISCLPackage#getPaymentTerm_Premium()
   * @model
   * @generated
   */
  float getPremium();

  /**
   * Sets the value of the '{@link uk.ac.kcl.inf.iSCL.PaymentTerm#getPremium <em>Premium</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Premium</em>' attribute.
   * @see #getPremium()
   * @generated
   */
  void setPremium(float value);

  /**
   * Returns the value of the '<em><b>Period</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the value of the '<em>Period</em>' attribute.
   * @see #setPeriod(int)
   * @see uk.ac.kcl.inf.iSCL.ISCLPackage#getPaymentTerm_Period()
   * @model
   * @generated
   */
  int getPeriod();

  /**
   * Sets the value of the '{@link uk.ac.kcl.inf.iSCL.PaymentTerm#getPeriod <em>Period</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Period</em>' attribute.
   * @see #getPeriod()
   * @generated
   */
  void setPeriod(int value);

  /**
   * Returns the value of the '<em><b>Increase</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the value of the '<em>Increase</em>' attribute.
   * @see #setIncrease(int)
   * @see uk.ac.kcl.inf.iSCL.ISCLPackage#getPaymentTerm_Increase()
   * @model
   * @generated
   */
  int getIncrease();

  /**
   * Sets the value of the '{@link uk.ac.kcl.inf.iSCL.PaymentTerm#getIncrease <em>Increase</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Increase</em>' attribute.
   * @see #getIncrease()
   * @generated
   */
  void setIncrease(int value);

} // PaymentTerm
