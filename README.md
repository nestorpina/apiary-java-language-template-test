Run with : 

mvn clean compile exec:java -Dexec.mainClass="test"

```
[INFO] Scanning for projects...
[INFO]                                                                         
[INFO] ------------------------------------------------------------------------
[INFO] Building test 0.0.1-SNAPSHOT
[INFO] ------------------------------------------------------------------------
[INFO] 
[INFO] --- maven-clean-plugin:2.5:clean (default-clean) @ test ---
[INFO] Deleting /Users/nestor.pina/workspace/intelygenz/apiary-java-language-test/target
[INFO] 
[INFO] --- maven-resources-plugin:2.6:resources (default-resources) @ test ---
[WARNING] Using platform encoding (UTF-8 actually) to copy filtered resources, i.e. build is platform dependent!
[INFO] Copying 0 resource
[INFO] 
[INFO] --- maven-compiler-plugin:3.2:compile (default-compile) @ test ---
[INFO] Changes detected - recompiling the module!
[INFO] Compiling 1 source file to /Users/nestor.pina/workspace/intelygenz/apiary-java-language-test/target/classes
[INFO] 
[INFO] --- exec-maven-plugin:1.3.2:java (default-cli) @ test ---
[WARNING] Warning: killAfter is now deprecated. Do you need it ? Please comment on MEXEC-6.
status: 200
headers: {Transfer-Encoding=[chunked], X-Apiary-Transaction-Id=[546f77de2637d90200bdaf86], Server=[Cowboy], X-My-Header=[The Value], Connection=[keep-alive], X-Apiary-Ratelimit-Remaining=[118], X-Apiary-Ratelimit-Limit=[120], Date=[Fri, 21 Nov 2014 17:35:26 GMT], Via=[1.1 vegur], Content-Type=[application/json]}
body:{ "id": 2, "title": "Pick-up posters from post-office" }
[INFO] ------------------------------------------------------------------------
[INFO] BUILD SUCCESS
[INFO] ------------------------------------------------------------------------
[INFO] Total time: 3.245 s
[INFO] Finished at: 2014-11-21T18:35:27+01:00
[INFO] Final Memory: 19M/101M
[INFO] ------------------------------------------------------------------------
```
