package org.entur.gbfs.v3_0_RC.system_pricing_plans;

import org.entur.gbfs.TestBase;
import org.junit.jupiter.api.Test;

class SystemPricingPlansTest extends TestBase {
    @Test
    void testUnmarshal() {
        assertUnmarshalDoesNotThrow("v3_0_RC/system_pricing_plans.json", GBFSSystemPricingPlans.class);
    }
}
