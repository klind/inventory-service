// This file is only being executed when there is no data in ~/mongodb/data/db

db = db.getSiblingDB('inventory');

db.getCollection('bicycle').insertOne({size:"SMALL", brand: "Trek", color: "blue", outOfService: false, rented: false});
db.getCollection('bicycle').insertOne({size:"SMALL", brand: "Cannondale", color: "red", outOfService: false, rented: false});
db.getCollection('bicycle').insertOne({size:"MEDIUM", brand: "Giant", color: "yellow", outOfService: false, rented: false});
db.getCollection('bicycle').insertOne({size:"MEDIUM", brand: "Specialized", color: "black",woutOfService: false, rented: false});
db.getCollection('bicycle').insertOne({size:"LARGE", brand: "Giant", color: "black", outOfService: false, rented: false});
db.getCollection('bicycle').insertOne({size:"LARGE", brand: "Trek", color: "white", outOfService: false, rented: false});

db.getCollection('gasScooter').insertOne({engineSize:"CC_125", brand: "Honda", color: "blue", outOfService: false, rented: false});
db.getCollection('gasScooter').insertOne({engineSize:"CC_125", brand: "Yamaha", color: "blue", outOfService: false, rented: false});
db.getCollection('gasScooter').insertOne({engineSize:"CC_250", brand: "Yamaha", color: "blue", outOfService: false, rented: false});
db.getCollection('gasScooter').insertOne({engineSize:"CC_250", brand: "Honda", color: "blue", outOfService: false, rented: false});
db.getCollection('gasScooter').insertOne({engineSize:"CC_350", brand: "Yamaha", color: "blue", outOfService: false, rented: false});
db.getCollection('gasScooter').insertOne({engineSize:"CC_350", brand: "Kawasaki", color: "blue", outOfService: false, rented: false});

db.getCollection('electricScooter').insertOne({range:"LOW", brand: "Honda", color: "yellow", outOfService: false, rented: false});
db.getCollection('electricScooter').insertOne({range:"LOW", brand: "Yamaha", color: "black", outOfService: false, rented: false});
db.getCollection('electricScooter').insertOne({range:"MED", brand: "Honda", color: "blue", outOfService: false, rented: false});
db.getCollection('electricScooter').insertOne({range:"MED", brand: "KTM", color: "orange", outOfService: false, rented: false});
db.getCollection('electricScooter').insertOne({range:"LONG", brand: "Yamaha", color: "blue", outOfService: false, rented: false});
db.getCollection('electricScooter').insertOne({range:"LONG", brand: "Kawasaki", color: "white", outOfService: false, rented: false});


db.createUser({
  user: 'inventory_user',
  pwd: 'inventory_pass',
  roles: [
    {
      role: 'dbOwner',
      db: 'inventory',
    },
  ],
});

