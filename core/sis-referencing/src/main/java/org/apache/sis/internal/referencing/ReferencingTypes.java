/*
 * Licensed to the Apache Software Foundation (ASF) under one or more
 * contributor license agreements.  See the NOTICE file distributed with
 * this work for additional information regarding copyright ownership.
 * The ASF licenses this file to You under the Apache License, Version 2.0
 * (the "License"); you may not use this file except in compliance with
 * the License.  You may obtain a copy of the License at
 *
 *     http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package org.apache.sis.internal.referencing;

import java.util.Collection;
import org.apache.sis.internal.jaxb.TypeRegistration;
import org.apache.sis.parameter.DefaultParameterValue;
import org.apache.sis.parameter.DefaultParameterValueGroup;
import org.apache.sis.referencing.AbstractIdentifiedObject;


/**
 * Declares the classes of objects to be marshalled using a default {@code MarshallerPool}.
 * This class is declared in the {@code META-INF/services/org.apache.sis.internal.jaxb.TypeRegistration} file.
 *
 * @author  Martin Desruisseaux (Geomatys)
 * @since   0.4
 * @version 0.4
 * @module
 */
public final class ReferencingTypes extends TypeRegistration {
    /**
     * Adds to the given collection the referencing types that should be given to the initial JAXB context.
     */
    @Override
    public void getTypes(final Collection<Class<?>> addTo) {
        addTo.add(AbstractIdentifiedObject.class);
        addTo.add(DefaultParameterValue.class);
        addTo.add(DefaultParameterValueGroup.class);
    }
}
