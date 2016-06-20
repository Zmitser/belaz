call mvn -B -s settings.xml -DskipTests=true clean install
call java  -DCLEARDB_DATABASE_URL="mysql://root:root@localhost:5432/belaz" -jar target/dependency/webapp-runner.jar target/*.war
