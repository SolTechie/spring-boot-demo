package base.models;

import java.sql.Timestamp;

public class DemoBatis {
    private int id;
    private String name;
    private Timestamp created_at;
    private String createdAt;

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public Timestamp getCreated_at() {
        return created_at;
    }

    public String getCreatedAt() {
        return createdAt;
    }
}
