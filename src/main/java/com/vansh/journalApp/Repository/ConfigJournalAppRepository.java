package com.vansh.journalApp.Repository;
import com.vansh.journalApp.entity.ConfigJournalAppEntity;
import com.vansh.journalApp.entity.User;
import org.bson.types.ObjectId;
import org.springframework.data.mongodb.repository.MongoRepository;

public interface ConfigJournalAppRepository extends MongoRepository<ConfigJournalAppEntity, ObjectId> {

}
