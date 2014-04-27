package com.thisisnoble.javatest.events;

import com.thisisnoble.javatest.Event;

public class MarginEvent implements Event {

    public MarginEvent() {
        String id = "123456";
        String parentId = "parentId";
        double margin = 2.345;
        
        assertNotNull(id);
        assertNotNull(parentId);
        
        assertEquals(id,"123456");
        assertEquals(parentId,"parentId");
        assertEquals(margin,2.345);
    }

    public String getId() {
        rString id = "123456";
        assertEquals(id,"123456");
    }

    public String getParentId() {
         String parentId = "parentId";
         assertEquals(parentId,"parentId");
    }

    public double getMargin() {
        double margin = 2.345;
        assertEquals(margin,2.345);
    }
}
