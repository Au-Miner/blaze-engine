mvn package -Pspark333 -Prelease


cp /Users/au_miner/opt/workspace/project/ZXProject/blaze-engine/target/blaze-engine-spark333-release-3.0.0-SNAPSHOT.jar \
/Users/au_miner/opt/module/spark333/jars


#rm -rf /Users/au_miner/opt/workspace/project/ZXProject/blaze-engine/run.log
#/Users/au_miner/opt/module/spark333/bin/spark-sql --master local -f /Users/au_miner/opt/module/spark333/test/sql1.sql \
#>> /Users/au_miner/opt/workspace/project/ZXProject/blaze-engine/run.log