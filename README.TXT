-- SAMPLES
-----------
OptionSelectSampleList	-> load list based on openkm user list  

-- Instructions to create jar file:
------------------------------------
1- Select file "OptionSelectSampleList.java" from Project Explorer or Navigator. 
2- Right click ( contextual menu ) and choose "export".
3- Choose Java -> Jar file
4- Select the destination folder, for example /home/openkm/Development/workspace/form-sample/optionSelectSample.jar
5- Click next
6- Click next
7- Choose "OptionSelectSampleList.java" as the class of the entry point
8- Click finish

Do in OpenKM:
1- Go to Administration -> Property group
2- Click edit button
3- Take a look at okg:class group and the okp.class.select field with value className="com.openkm.plugin.form.OptionSelectSampleList"
4- Cancel edition

Register to OpenKM:
1- Go to Administration -> Utilities -> Plugins
2- Click refresh plugins icon