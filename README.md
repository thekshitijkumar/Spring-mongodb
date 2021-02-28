# Mongo Basic Intro

In mongodb db->Collections->Document->key/values
In RDBMS database->table->row->column


## Mongo Basic cmds
- show dbs
- use <user_specified_name_of_db>
- show collections
- db.createCollection("<custome_name">)
  - db.createCollection"test")
    
- db.test.insert({"name":"Kshitij","city":"Ambala","title":"Software Developer"})
- db.test.find().pretty()
- _id is unique identifier created by mongo on its own by which we can find the time of record creation
- mongo uses BSON(Binary JSON)
- custom queries
  - db.test.find({"name":"Jack"},{"name":1})
    // called projection in mongodb similar to select name from test where name="John"
  - db.test.find({"$or":["name":"Jim"},{"name":"Jack"}]}).pretty()
  - db.test.find({"name":{"$in":["John","Jack"]}})
  - db.test.find //it will show documentation in nodeJS
  - db.test.getIndexes()
  - db.test.createIndex({"name":1})//accepts boolean 1 means consider 0 means don't consider
