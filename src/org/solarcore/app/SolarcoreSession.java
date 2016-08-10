package org.solarcore.app;

/*
 This file is part of the Solarcore project (https://github.com/sabby7890/Solarcore).

 Solarcore is free software: you can redistribute it and/or modify
 it under the terms of the GNU General Public License as published by
 the Free Software Foundation, either version 3 of the License, or
 (at your option) any later version.

 Solarcore is distributed in the hope that it will be useful,
 but WITHOUT ANY WARRANTY; without even the implied warranty of
 MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
 GNU General Public License for more details.

 You should have received a copy of the GNU General Public License
 along with Solarcore.  If not, see <http://www.gnu.org/licenses/>.
*/

import java.math.BigInteger;
import java.security.SecureRandom;

class SolarcoreSession {
    private String sessionID;
    private DefinedUser user;
    private static SecureRandom r = new SecureRandom();

    SolarcoreSession(String pSessionID, DefinedUser pUser) {
        sessionID = pSessionID;
        user = pUser;
    }

    static String generateSessionID() {
        return String.format("%s-%s", new BigInteger(130, r).toString(32), new BigInteger(130, r).toString(32));
    }

    String getSessionID() {
        return sessionID;
    }
}
