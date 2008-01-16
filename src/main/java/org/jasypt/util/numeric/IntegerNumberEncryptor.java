/*
 * =============================================================================
 * 
 *   Copyright (c) 2007-2008, The JASYPT team (http://www.jasypt.org)
 * 
 *   Licensed under the Apache License, Version 2.0 (the "License");
 *   you may not use this file except in compliance with the License.
 *   You may obtain a copy of the License at
 * 
 *       http://www.apache.org/licenses/LICENSE-2.0
 * 
 *   Unless required by applicable law or agreed to in writing, software
 *   distributed under the License is distributed on an "AS IS" BASIS,
 *   WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 *   See the License for the specific language governing permissions and
 *   limitations under the License.
 * 
 * =============================================================================
 */
package org.jasypt.util.numeric;

import java.math.BigInteger;

/**
 * <p>
 * Common interface for all util classes aimed at integer number encryption.
 * </p>
 * 
 * @since 1.2
 * 
 * @author Daniel Fern&aacute;ndez Garrido
 * 
 */
public interface IntegerNumberEncryptor {

    
    /**
     * Encrypts a BigInteger
     * 
     * @param number the number to be encrypted.
     */
    public BigInteger encrypt(BigInteger number);

    
    /**
     * Decrypts a BigInteger.
     * 
     * @param encryptedNumber the number to be decrypted.
     */
    public BigInteger decrypt(BigInteger encryptedNumber);
    
}
