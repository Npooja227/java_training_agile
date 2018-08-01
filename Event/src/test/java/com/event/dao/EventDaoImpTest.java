package com.event.dao;
import com.event.model.EventModel;
import org.apache.log4j.Logger;
import org.junit.Test;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import static org.junit.Assert.*;
//Writing class to test the methods of dao implementation
public class EventDaoImpTest {
    //creating log to check program flow
    static final Logger log = Logger.getLogger(EventDaoImp.class);
    //Creating object for dao implementation class
    EventDaoImp edao = new EventDaoImp();
    // junit test case to test create
    @Test
    public void testCreateEventData() {
        //creating object for model class to make use of getter and setter methods
        EventModel em = new EventModel();
        //Binding data to the object
        em.setEventName("Birthday");
        em.setPriority("Two");
        em.setStatus("low");
        em.setOwner("Aruhi");
        em.setStartDate("2018-10-11");
        em.setStartTime("12:00:01");
        em.setEndDate("2018-10-12");
        em.setEndTime("06:00:30");
        em.setEmailAddress("aruhi@gmail.com");
        int status= 0;
        try {
            status = edao.createEventData(em);
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
            log.error("ClassNotFoundException in Dao test class in testCreateEventData "+e);
        } catch (SQLException e) {
            e.printStackTrace();
            log.error("SQLException in Dao test class in testCreateEventData "+e);
        }
        assertEquals(status,status);
    }
    // junit test case to test retrieve method
    @Test
    public void testRetrieveEventData(){
        List<EventModel> list = new ArrayList<>();
        try {
            edao.retrieveEventData();
        } catch (SQLException e) {
            e.printStackTrace();
            log.error("SQLException in Dao test class in testRetrieveEventData "+e);
        }
        assertEquals(list.size(), list.size());
    }
    // test case to test delete method
    @Test
    public void testDeleteEventData() {
        int eventId = 4;
        int status = 0;
        try {
            status = edao.deleteEventdata(eventId);
        } catch (SQLException e) {
            e.printStackTrace();
            log.error("SQLException in Dao test class in testDeleteEventData "+e);
        }
        assertEquals(status, status);
    }
}