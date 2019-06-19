package com.rugemo.data.db.model;

import androidx.room.ColumnInfo;
import androidx.room.Entity;
import androidx.room.PrimaryKey;
import androidx.room.TypeConverters;

import com.rugemo.data.utils.DateConverter;

import java.util.Date;

@Entity(tableName =  "favourites")
@TypeConverters({DateConverter.class})
public class FavouriteCharacter {

    @PrimaryKey(autoGenerate = true)
    private int uid;

    @ColumnInfo(name = "name")
    private String name;

    @ColumnInfo(name = "last_update")
    private Date lastUpdate;

    @ColumnInfo(name = "created_at")
    private Date createdAt;

    FavouriteCharacter(String name, Date lastUpdate, Date createdAt) {
        this.setName(name);
        this.setLastUpdate(lastUpdate);
        this.setCreatedAt(createdAt);
    }

    int getUid() {
        return uid;
    }

    void setUid(int uid) {
        this.uid = uid;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    Date getLastUpdate() {
        return lastUpdate;
    }

    private void setLastUpdate(Date lastUpdate) {
        this.lastUpdate = lastUpdate;
    }

    Date getCreatedAt() {
        return createdAt;
    }

    private void setCreatedAt(Date createdAt) {
        this.createdAt = createdAt;
    }
}
