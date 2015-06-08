call mvn clean
call mvn compile assembly:single
call cd target
call java -jar derbyweblaf_boilerplate-1.0-SNAPSHOT-jar-with-dependencies.jar