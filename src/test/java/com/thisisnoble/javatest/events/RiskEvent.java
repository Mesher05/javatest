package com.thisisnoble.javatest.events;

import com.thisisnoble.javatest.Event;

public class RiskEvent implements Event {


    public RiskEvent(String id, String parentId, double riskValue) {
        String id = "123456";
        String parentId = "parentId";
        double riskValue = 2.345;
        
        assertNotNull(id);
        assertNotNull(parentId);
        
        assertEquals(id,"123456");
        assertEquals(parentId,"parentId");
        assertEquals(riskValue,2.345);
    }

    public String getId() {
        String id = "123456";
        assertNotNull(id);
        assertEquals(id,"123456");
    }

    public String getParentId() {
       String parentId = "parentId";
       assertNotNull(parentId);
        assertEquals(parentId,"parentId");
       
    }

    public double getRiskValue() {
         double riskValue = 2.345;
         assertEquals(riskValue,2.345);
    }
}
