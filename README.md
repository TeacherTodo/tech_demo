# Getting Staerted (Setting Up the Development Environment)

## Step 1: Download & Install Java JDK 19
Download the apropriate version of the JDK for your operating system [from Oracle](https://www.oracle.com/java/technologies/downloads/). Open the installer and follow the automated prompts.

## Step 2: Verify System Environment Variables
Ensure that the system's PATH variable has been updated to include the path of the JDK install and that the JAVA_HOME variable has been set the the path of the JDK install.

[Update Windows Environment Variables](https://www.howtogeek.com/787217/how-to-edit-environment-variables-on-windows-10-or-11/)

[Update Linux Environemnt Variables](https://www.cyberciti.biz/faq/set-environment-variable-linux/)

## Step 3: Install Apache Maven
Foloow the [insstructions from Apache](https://maven.apache.org/install.html) on how to install Maven. This tool is used to integrate packages into the project including the needed Spring Boot packages. 

## Step 4: Access Test Controller
Open the project in your preferred IDE and run the TechDemoApplication class. This will start the application and make it accessible via http://localhost:8080. Navigate to http://localhost:8080/test, you should see the text "Hello, World!". Now try adding "?name=" and your name to the end of the URL. 