/**
 * Licensed to The Apereo Foundation under one or more contributor license
 * agreements. See the NOTICE file distributed with this work for additional
 * information regarding copyright ownership.
 *
 *
 * The Apereo Foundation licenses this file to you under the Educational
 * Community License, Version 2.0 (the "License"); you may not use this file
 * except in compliance with the License. You may obtain a copy of the License
 * at:
 *
 *   http://opensource.org/licenses/ecl2.txt
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS, WITHOUT
 * WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.  See the
 * License for the specific language governing permissions and limitations under
 * the License.
 *
 */

package org.opencastproject.composer.api;

/**
 * Provides new {@link EncoderEngine} instances for use in encoding media.
 */
public interface EncoderEngineFactory {
  /**
   * Constructs a new {@link EncoderEngine} instance for use with this encoding profile.
   * @param profile The encoding profile
   * @return A new encoder engine
   */
  EncoderEngine newEncoderEngine(EncodingProfile profile);

  /**
   * Track a given encoder engine to ensure it is cleaned up if the factory is closed.
   * @param encoderEngine encoder engine to track
   */
  void track(EncoderEngine encoderEngine);

  /**
   * Stop tracking a given encoder engine.
   * @param encoderEngine Encoder engine to stop tracking
   */
  void untrack(EncoderEngine encoderEngine);

  /**
   * Close the encoder engine factory, ensuring that in the process all tracked engines are properly shut down.
   */
  void close();
}
