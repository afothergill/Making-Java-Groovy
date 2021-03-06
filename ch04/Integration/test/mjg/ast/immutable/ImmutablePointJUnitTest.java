/* ===================================================
 * Copyright 2012 Kousen IT, Inc.
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 * http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 * ========================================================== */
package mjg.ast.immutable;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class ImmutablePointJUnitTest {
    private ImmutablePoint p;

    @Test
    public void testImmutablePoint() {
        p = new ImmutablePoint(3,4);
        assertEquals(3.0, p.getX(), 0.0001);
        assertEquals(4.0, p.getY(), 0.0001);
    }
}
