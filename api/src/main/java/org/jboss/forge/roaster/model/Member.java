/*
 * Copyright 2012 Red Hat, Inc. and/or its affiliates.
 *
 * Licensed under the Eclipse Public License version 1.0, available at
 * http://www.eclipse.org/legal/epl-v10.html
 */

package org.jboss.forge.roaster.model;

import org.jboss.forge.roaster.Origin;

/**
 * Represents a {@link JavaType} member. (I.e.: a {@link Field} or {@link Method})
 * 
 * @author <a href="mailto:lincolnbaxter@gmail.com">Lincoln Baxter, III</a>
 * 
 */
public interface Member<O extends JavaType<O>> extends VisibilityScoped, AnnotationTarget<O>,
         Origin<O>, Named
{
   public boolean isFinal();

   public boolean isStatic();
}
