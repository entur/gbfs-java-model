package org.entur.gbfs.v2_3.system_information;

import org.entur.gbfs.TestBase;
import org.junit.jupiter.api.Test;

import java.io.IOException;

public class SystemInformationTest extends TestBase {
    @Test
    public void testUnmarshal() throws IOException {
        assertUnmarshalDoesNotThrow("v2_X/system_information.json", GBFSSystemInformation.class);
    }
}
