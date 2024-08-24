package mongo;

import com.mongodb.MongoClient;
import com.mongodb.client.MongoCollection;
import com.mongodb.client.MongoCursor;
import com.mongodb.client.MongoDatabase;
import org.bson.Document;

public class MongoDb {

    public static void main(String[] args) {
        //1 // Creating a Mongo client


        MongoClient mongoClient = new MongoClient("localhost", 27017);
        System.out.println("Created Mongo Connection successfully");


        System.out.println("Below are list of databases present in MongoDB");
        // 2 To get all database names
        MongoCursor<String> dbsCursor = mongoClient.listDatabaseNames().iterator();
        while (dbsCursor.hasNext()) {
            System.out.println(dbsCursor.next());
        }
        //3

        MongoDatabase db = mongoClient.getDatabase("youtube");
        System.out.println("Get database is successful");


        //Inserting sample record by creating collection and document.
        MongoCollection<Document> collection = db.getCollection("channels");
        Document doc = new Document("name", "SimplifyingTech");
        collection.insertOne(doc);
        System.out.println("########### Insert is completed  ###############");
        MongoCursor<String> dbsCursord = mongoClient.listDatabaseNames().iterator();
        while (dbsCursord.hasNext()) {
            System.out.println(dbsCursord.next());

            //Drop Database
            mongoClient.dropDatabase("youtube");
            System.out.println("################## Database dropped successfully ##################");

            System.out.println("After Database getting dropped, present list of Database's...");
            //list all databases
            MongoCursor<String> dbsCursor2 = mongoClient.listDatabaseNames().iterator();
            while (dbsCursor2.hasNext()) {
                System.out.println(dbsCursor2.next());
            }

        }
    }}
