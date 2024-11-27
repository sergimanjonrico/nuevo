/**
 * Copyright (c) 2002-2006 IBM Corporation and others.
 * All rights reserved.   This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v2.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v20.html
 *
 * Contributors:
 *   IBM - Initial API and implementation
 */
package org.eclipse.emf.java;


import org.eclipse.emf.common.util.EList;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>JPackage</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.eclipse.emf.java.JPackage#getJavaPackage <em>Java Package</em>}</li>
 *   <li>{@link org.eclipse.emf.java.JPackage#getTypes <em>Types</em>}</li>
 * </ul>
 *
 * @see org.eclipse.emf.java.JavaPackage#getJPackage()
 * @model
 * @generated
 */
public interface JPackage extends JModelElement
{
  /**
   * Returns the value of the '<em><b>Java Package</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the value of the '<em>Java Package</em>' attribute.
   * @see #setJavaPackage(Package)
   * @see org.eclipse.emf.java.JavaPackage#getJPackage_JavaPackage()
   * @model dataType="org.eclipse.emf.java.JavaPackage"
   * @generated
   */
  Package getJavaPackage();

  /**
   * Sets the value of the '{@link org.eclipse.emf.java.JPackage#getJavaPackage <em>Java Package</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Java Package</em>' attribute.
   * @see #getJavaPackage()
   * @generated
   */
  void setJavaPackage(Package value);

  /**
   * Returns the value of the '<em><b>Types</b></em>' reference list.
   * The list contents are of type {@link org.eclipse.emf.java.JClass}.
   * It is bidirectional and its opposite is '{@link org.eclipse.emf.java.JClass#getPackage <em>Package</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the value of the '<em>Types</em>' reference list.
   * @see org.eclipse.emf.java.JavaPackage#getJPackage_Types()
   * @see org.eclipse.emf.java.JClass#getPackage
   * @model opposite="package"
   * @generated
   */
  EList<JClass> getTypes();

} // JPackage
