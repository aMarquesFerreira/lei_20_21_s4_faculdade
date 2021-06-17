
##**Class Diagram**
![RegisterTicket_CD.svg](RegisterTicket_CD.svg)

##**System Sequence Diagram**   
![RegisterTicket_SSD.svg](RegisterTicket_SSD.svg)

##**Sequence Diagram**
![RegisterTicket_SD.svg](RegisterTicket_SD.svg)


##**Tests**
```java

public class TicketTest {

    public Ticket dummyTicket(final TicketId id) {
        
    }

    public static SystemUser dummyUser(final String username, final Role... roles) { 
        
    }

    private SystemUser getNewDummyUser() {
        
    }

    private Ticket getNewDummyTicket() {
        
    }

    private Ticket getNewDummyTicketTwo() {
        
    }

    @Test
    public void ensureTicketEqualsPassesForTheSameTicketID() {
        
    }

    @Test
    public void ensureTicketEqualsFailsForDifferenteTicketID() {
    }

    @Test
    public void ensureTicketEqualsAreTheSameForTheSameInstance() {
    }

    @Test
    public void ensureTicketEqualsFailsForDifferenteObjectTypes() {
    }

    @Test
    public void ensureTicketIsTheSameAsItsInstance() {
    }

    @Test
    public void ensureTwoTicketWithDifferentTicketIDsAreNotTheSame() {
    }
}

```
