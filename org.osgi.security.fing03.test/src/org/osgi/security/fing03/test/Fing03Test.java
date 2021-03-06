/*
* Licensed under the Apache License, Version 2.0 (the "License");
* you may not use this file except in compliance with the License.
* You may obtain a copy of the License at
*
*      http://www.apache.org/licenses/LICENSE-2.0
*
* Unless required by applicable law or agreed to in writing, software
* distributed under the License is distributed on an "AS IS" BASIS,
* WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
* See the License for the specific language governing permissions and
* limitations under the License.
*/

package org.osgi.security.fing03.test;

import static org.junit.Assert.assertFalse;
import java.io.File;
import org.junit.Test;

public class Fing03Test
{
	@Test
	public void testFing03() 
	{	
		//Access to shadow file
		assertFalse("[FAIL] etc/shadow file are accessible by any bundle.", new File("/etc/shadow").canRead());	

		//Access to passwd file
		assertFalse("[FAIL] etc/passwd file are accessible by any bundle.", new File("/etc/passwd").canRead());
	}

}