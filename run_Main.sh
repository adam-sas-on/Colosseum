#! /bin/sh

if [ -f "target/production/Colosseum/com/company/controller/GladiatorsWars.class" ] ; then
	java -classpath target/production/Colosseum/ com.company.controller.GladiatorsWars Main
fi
