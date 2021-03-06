/*
 * Copyright 2012 Red Hat, Inc. and/or its affiliates.
 *
 * Licensed under the Eclipse Public License version 1.0, available at
 * http://www.eclipse.org/legal/epl-v10.html
 */
package org.jboss.forge.test.roaster.model;

import java.io.IOException;
import java.net.URL;

import org.jboss.forge.roaster.Roaster;
import org.jboss.forge.roaster.model.source.JavaClassSource;
import org.jboss.forge.roaster.model.source.MethodSource;
import org.jboss.forge.test.roaster.model.common.VisibilityTest;

/**
 * @author <a href="mailto:lincolnbaxter@gmail.com">Lincoln Baxter, III</a>
 */
public class MethodVisibilityTest extends VisibilityTest
{
   @Override
   public void resetTests() throws IOException
   {
      URL url = MethodVisibilityTest.class
               .getResource("/org/jboss/forge/grammar/java/MockAnnotatedMethod.java");
      MethodSource<JavaClassSource> method = Roaster.parse(JavaClassSource.class, url).getMethods().get(0);
      setTarget(method);
   }
}
