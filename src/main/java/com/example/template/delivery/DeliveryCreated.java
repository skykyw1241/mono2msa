
package delivery.delivery;

import delivery.AbstractEvent;

public class BookDelvCreated extends AbstractEvent {

    private Long id;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }
}