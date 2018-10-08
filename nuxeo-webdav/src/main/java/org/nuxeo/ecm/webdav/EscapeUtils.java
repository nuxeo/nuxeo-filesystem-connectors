/*
 * (C) Copyright 2018 Nuxeo (http://nuxeo.com/) and others.
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *     http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 *
 * Contributors:
 *     Florent Guillaume
 */
package org.nuxeo.ecm.webdav;

import java.net.URI;
import java.net.URISyntaxException;

/**
 * Escaping-related utilities.
 *
 * @since 10.3
 */
public class EscapeUtils {

    private EscapeUtils() {
        // utility class
    }

    /**
     * Encodes a document's name into a format suitable for WebDAV.
     */
    public static String encodePath(String path) {
        try {
            return new URI(null, null, path, null).toASCIIString();
        } catch (URISyntaxException e) {
            return path;
        }
    }

}
