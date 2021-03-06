/*
 * Copyright 2012 the original author or authors.
 *
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

package com.nokia.dempsy;

/**
 *  Checked Exception used by the Dispatch interface and also internal to 
 *  the Dempsy framework.
 */
public class DempsyException extends Exception
{
   private static final long serialVersionUID = 1L;

   public DempsyException(String message, Throwable cause)
   {
      super(message, cause);
   }

   public DempsyException(String message)
   {
      super(message);
   }

   public DempsyException(Throwable cause)
   {
      super(cause);
   }
}
