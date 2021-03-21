package com.insurance.demo.pojo;


import org.bson.types.ObjectId;
import org.springframework.data.mongodb.core.mapping.Document;

@Document(collection = "projectName")
public class projectName {
    public void set_id(ObjectId _id) {
        this._id = _id;
    }

    private ObjectId _id;
    private String name;

    public void setName(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public ObjectId get_id() {
        return _id;
    }
}
